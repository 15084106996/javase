package org.neuedu.ch大练习_jdbc;

import java.sql.*;
import java.util.Date;

public class UserMapperImpl implements UserMapper{
    @Override
    public User userLogin(User user) {
        Connection conn=null;
        PreparedStatement ps=null;
        ResultSet rs=null;
        User findUser=null;
        try {
            conn=DBUtils.getInstance().getConnection();
            String sql="select * from user where username=? and password=?";
            ps=conn.prepareStatement(sql);
            ps.setString(1,user.getUsername());
            ps.setString(2,user.getPassword());
            rs= ps.executeQuery();
            if(rs.next()) {
                findUser=new User();
                findUser.setId(rs.getLong("id"));
                findUser.setName(rs.getString("name"));
                findUser.setUsername(rs.getString("username"));
                findUser.setPassword(rs.getString("password"));
                findUser.setGender(rs.getBoolean("gender"));
                findUser.setAge(rs.getInt("age"));
                findUser.setBirthday(rs.getDate("birthday"));
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }finally {
            DBUtils.getInstance().close(rs);
            DBUtils.getInstance().close(ps);
            DBUtils.getInstance().close(conn);
        }

        return findUser;
    }
    @Override
    public int findSignInfoByIdAndDate(Long uid,String signIn) {
        Connection conn=null;
        PreparedStatement ps=null;
        ResultSet rs=null;
        int count=0;
        try {
            conn=DBUtils.getInstance().getConnection();
            String sql="select count(*) as counts from signinfo where uid=? and date_format(signin,'%Y-%m-%d')=?";
            ps=conn.prepareStatement(sql);
            ps.setLong(1,uid);
            ps.setString(2,signIn);
            rs= ps.executeQuery();
            if(rs.next()) {
               count=rs.getInt("counts");
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }finally {
            DBUtils.getInstance().close(rs);
            DBUtils.getInstance().close(ps);
            DBUtils.getInstance().close(conn);
        }
        System.out.println(signIn);
        return count;
    }
    @Override
    public int insertSignInfo(Long uid, Date signIn) {
        Connection conn=null;
        PreparedStatement ps=null;
        int count=0;
        try {
            conn=DBUtils.getInstance().getConnection();
            conn.setAutoCommit(false);
            String sql="insert into signinfo value (default,?,?,default)";
            ps=conn.prepareStatement(sql);
            ps.setLong(1,uid);
            ps.setTimestamp(2,new Timestamp(signIn.getTime()));
            count=ps.executeUpdate();
            conn.commit();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }finally {
            DBUtils.getInstance().close(ps);
            DBUtils.getInstance().close(conn);
        }
        return count;
    }
}

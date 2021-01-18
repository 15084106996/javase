package org.neuedu.ch大练习_jdbc;

import java.util.Date;

public interface UserMapper {
    //根据用户名和密码查询用户
    User userLogin(User user);
    //根据id和签到日期查询
   public int findSignInfoByIdAndDate(Long uid,String signIn);

   public  int insertSignInfo(Long uid, Date signIn);
}
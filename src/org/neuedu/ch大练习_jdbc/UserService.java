package org.neuedu.ch大练习_jdbc;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class UserService {
    public User userLogin() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入用户名");
        String username = scanner.nextLine();
        System.out.println("请输入密码");
        String password = scanner.nextLine();
        User user = new User();
        user.setUsername(username);
        user.setPassword(password);
        UserMapper userMapper = new UserMapperImpl();
        return userMapper.userLogin(user);
    }

    public int signIn() {
        if (Test.user == null) {
            return -1;
        } else {
            //根据uid和签到日期查询记录
            UserMapper userMapper = new UserMapperImpl();
            Date date = new Date();
            SimpleDateFormat sdf = new SimpleDateFormat("yyy-MM-dd");
            int counts = userMapper.findSignInfoByIdAndDate(Test.user.getId(), sdf.format(date));
            //查到
            if (counts != 0) {
                return 500;
            } else {
                userMapper.insertSignInfo(Test.user.getId(),date);
                return 200;
            }
        }
    }
}

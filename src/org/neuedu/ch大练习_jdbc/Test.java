package org.neuedu.ch大练习_jdbc;

import java.sql.*;
import java.util.Scanner;

public class Test {
    public  static User user=null;
    UserService service=null;
    public static void main(String[] args) {
        while (true) {
            UserService service=new UserService();
            System.out.println("欢迎使用java20签到系统");
            System.out.println("-------------------");
            System.out.println("1用户登录");
            System.out.println("2用户签到");
            System.out.println("3用户签退");
            System.out.println("4查看个人信息");
            System.out.println("5查看个人签到记录");
            System.out.println("6用户退出");
            System.out.println("-------------------");
            Scanner scanner = new Scanner(System.in);
            System.out.println("请选择:");
            String option = scanner.nextLine();
            switch (option) {
                case "1":
                    User user=service.userLogin();
                    if(user==null){
                        System.out.println("用户名密码错误");
                    }
                    else {
                        System.out.println("登录成功");
                        Test.user=user;
                        System.out.println(Test.user);

                    }
                    break;
                case "2":
                    int num=service.signIn();
                    if(num==-1){
                        System.out.println("未登录");
                    }else if (num==500){
                        System.out.println("今天已经签到了");
                    }
                   else{
                       System.out.println("签到成功");
                    }
                    break;
                case "3":
                    System.out.println("签退");
                    break;
                case "4":
                    if (Test.user!=null){
                    System.out.println(Test.user);
                    }
                    else {
                    System.out.println("用户未登录");
                    }
                    break;
                case "5":
                    System.out.println("查看个人签到记录");
                    break;
                case "6":
                    System.out.println("用户已退出");
                    break;
                default:
                    System.out.println("请重新选择");
            }
        }
    }
}
package org.neuedu.ch面向对象.抽象.practice02;

public class Person {
    String name;//姓名
    String addr;//家庭住址
    String tel; //电话号码

    public Person(String name, String addr, String tel) {
        this.name = name;
        this.addr = addr;
        this.tel = tel;
    }

    public Person() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public void show() {
        System.out.println("class Person"); }
}

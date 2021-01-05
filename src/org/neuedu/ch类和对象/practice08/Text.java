package org.neuedu.ch类和对象.practice08;

public class Text {
    public static void main(String[] args) {
        PersonCreate p1=new PersonCreate("zhangsan",33,1.73);
        PersonCreate p2=new PersonCreate("lishi",44,1.74);
        p1.sayhello();
        p2.sayhello();
    }
}

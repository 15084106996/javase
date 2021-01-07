package org.neuedu.ch面向对象.抽象.practice02;

public class Employee extends Person{
    int age;
    double sal;

    public Employee(String name, String addr, String tel, int age, double sal) {
        super(name, addr, tel);
        this.age = age;
        this.sal = sal;
    }

    public Employee() {
        super();
    }
    public void show() {
        System.out.println("class Person");
        System.out.println(this.name);
    }

    public void addSal() {
        if(this.age>1){
        this.sal=this.sal*1.1;
        }
    }

    public void addSal(int n){
        if(this.age>1){
            if(n<this.sal*0.5) {
                this.sal=this.sal+n ;
            }
            else {
                this.sal=this.sal*1.5;
            }
        }
    }
}


package org.neuedu.ch类和对象.practice08;

public class PersonCreate {
    String name;
    int age;
    double height;

    public PersonCreate(String name, int age, double height) {
        this.name = name;
        this.age = age;
        this.height = height;
    }

    public PersonCreate() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void sayhello() {
        System.out.println("my name is "+name);
    }
}

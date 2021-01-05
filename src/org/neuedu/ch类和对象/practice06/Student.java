package org.neuedu.ch类和对象.practice06;

public class Student {
    String  name;
    int num;
    int grade;

    public Student(String name, int num, int grade) {
        this.name = name;
        this.num = num;
        this.grade = grade;
    }

    public Student() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

}

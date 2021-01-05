package org.neuedu.ch类和对象.practice06;

public class Test {
    public void fun(Student[] s) {
        Student s1;
        for (int i=0;i<s.length-1;i++){
            for (int j=i+1;j<s.length;j++) {
            if(s[i].getGrade()<s[j].getGrade())
            {
                s1=s[i];
                s[i]=s[j];
                s[j]=s1;
            }
            }
        }
        for(Student student:s) {
            System.out.println("名字:"+student.getName()+" 学号:"+student.getNum()+" 成绩:"+student.getGrade());
        }
    }
    public static void main(String[] args) {
        Student s1 = new Student("tom", 12,85);
        Student s2 = new Student("bob", 13,82);
        Student s3 = new Student("lucy", 11,87);
        Student s4 = new Student("ella", 16,36);
        Student s5 = new Student("mike", 9,14);
        Student[] s = {s1, s2, s3, s4, s5};
        Test t=new Test();
        t.fun(s);
    }
}

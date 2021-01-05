package org.neuedu.ch类和对象.demo05;

public class Test {
    public static void main(String[] args) {
        Weapon weapon1=new Weapon();
        weapon1.setName("大宝剑");
        weapon1.setDps(100);

        Warrior w1=new Warrior();
        w1.setName("盖伦");
        w1.setWeapon(weapon1);

        Weapon weapon2=w1.getWeapon();
        System.out.println(weapon2.getName());
    }
}

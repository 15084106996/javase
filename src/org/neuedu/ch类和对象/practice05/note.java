package org.neuedu.ch类和对象.practice05;

public class note {
    char color;
    int  cpu;

    public note(char color, int cpu) {
        this.color = color;
        this.cpu = cpu;
    }

    public note() {
    }

    public char getColor() {
        return color;
    }

    public void setColor(char color) {
        this.color = color;
    }

    public int getCpu() {
        return cpu;
    }

    public void setCpu(int cpu) {
        this.cpu = cpu;
    }
    public void fun()
    {
        System.out.println("颜色:"+getColor());
        System.out.println("cpu型号"+getCpu());
    }
}

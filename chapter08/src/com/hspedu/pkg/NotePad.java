package com.hspedu.pkg;

public class NotePad extends Computer{

    private String color;

    public NotePad(String CPU, int memory, int disk, String color) {
        super(CPU, memory, disk);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void printInfo() {
        System.out.println("=====NotePad信息=====");
        System.out.println(getDetails() + " Color = " + color);
    }
}




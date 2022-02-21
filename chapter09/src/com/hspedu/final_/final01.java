package com.hspedu.final_;

public class final01 {
    public static void main(String[] args) {
//        Circle circle = new Circle();
//        System.out.println(circle.calArea(100));
        Circle circle = new Circle(10);
        System.out.println(circle.calArea());


    }
}

class Circle{
    private double radius;
    private final double PI;

    public Circle(double radius) {
        this.radius = radius;
//        PI = 3.14;
    }
    {
        PI = 3.14;
    }

    public double calArea(){
        return PI * radius * radius;
    }
}

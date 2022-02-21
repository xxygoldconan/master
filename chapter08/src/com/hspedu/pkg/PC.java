package com.hspedu.pkg;

public class PC extends Computer {

    private String brand;

    public PC(String CPU, int memory, int disk, String brand) {
        super(CPU, memory, disk);
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }


    public void printInfo() {

        System.out.println("=====PC信息=====");
        System.out.println(getDetails() + " brand = " + brand);
    }
}

package com.hspedu.encap;

import java.util.Scanner;

public class Encapsulation {
    public static void main(String[] args) {
        Person person = new Person();
        person.setName("Jack");
        person.setAge(20);
        person.setSalary(3000000);
        System.out.println(person.info());

        Person smith = new Person("Smith", 21, 15000);
        System.out.println(smith.info());
    }
}

class Person {
    public String name;
    private int age;
    private double salary;


    public Person() {
    }

    public Person(String name, int age, double salary) {
//        this.name = name;
//        this.age = age;
//        this.salary = salary;
        this.setName(name);
        setAge(age);
        setSalary(salary);

    }

    //快捷键 Alt + Insert

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.length() > 1 && name.length() < 6) {
            this.name = name;
        } else {
            System.out.println("Wrong name!");
            this.name = "No name";
        }
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age > 1 && age < 120) {
            this.age = age;
        } else {
            System.out.println("Wrong age!");
            this.age = 18;
        }

    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String info() {
        return "name = " + name + " age = " + age + " salary = " + salary;
    }
}
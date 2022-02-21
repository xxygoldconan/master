package com.hspedu.toString_;

public class toString_ {
    public static void main(String[] args) {
        Monster monster = new Monster("小旋风", "巡山", 1000);
        System.out.println(monster.hashCode());
        System.out.println(monster.toString());
        System.out.println(monster);
    }
}

class Monster {
    private String name;
    private String job;
    private double sal;

    public Monster(String name, String job, double sal) {
        this.name = name;
        this.job = job;
        this.sal = sal;
    }

    @Override
    public String toString() {
        return "Monster{" +
                "name='" + name + '\'' +
                ", job='" + job + '\'' +
                ", sal=" + sal +
                '}';
    }
}

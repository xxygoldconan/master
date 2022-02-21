package com.hspedu.poly_.polyarr_;

public class PolyArray {
    public static void main(String[] args) {

        Person[] persons = new Person[5]; //new数组

        persons[0] = new Person("Jack", 18); //new每个元素
        persons[1] = new Student("AK", 20,99.9);
        persons[2] = new Student("daming", 25, 90);
        persons[3] = new Teacher("Li",35,100000);
        persons[4] = new Teacher("Wang",27,100);

        for (int i = 0; i < persons.length; i++) {
            System.out.println(persons[i].say());

            if(persons[i] instanceof Student) {
                ((Student)persons[i]).study();
            } else if (persons[i] instanceof Teacher) {
                ((Teacher)persons[i]).teach();
            }
        }

    }
}

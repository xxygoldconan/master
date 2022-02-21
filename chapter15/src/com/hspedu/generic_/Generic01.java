package com.hspedu.generic_;

import java.util.ArrayList;
import java.util.Comparator;

/**
 * @author Xu
 * @version 1.0
 */
public class Generic01 {
    public static void main(String[] args) {
        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(new Employee("jack",10000,new MyDate(2000,11,11)));
        employees.add(new Employee("tom",2000,new MyDate(2009,12,16)));
        employees.add(new Employee("AK",50000,new MyDate(1990,3,3)));

        System.out.println(employees);

        System.out.println("=====排序后=====");

        employees.sort(new Comparator<Employee>() {
            @Override
            public int compare(Employee emp1, Employee emp2) {
                //先按照name排序，如果name相同，则按生日日期的先后排序。【即：定制排序】
                //先对传入的参数进行验证
                if(!(emp1 instanceof  Employee && emp2 instanceof Employee)) {
                    System.out.println("类型不正确..");
                    return 0;
                }
                //比较name
                int i = emp1.getName().compareTo(emp2.getName());
                if(i != 0) {
                    return i;
                }

                //下面是对birthday的比较，因此，我们最好把这个比较，放在MyDate类完成
                //封装后，将来可维护性和复用性，就大大增强.
                return emp1.getBirthday().compareTo(emp2.getBirthday());
            }
        });

        System.out.println(employees);
    }

}

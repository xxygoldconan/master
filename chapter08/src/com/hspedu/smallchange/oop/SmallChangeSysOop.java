package com.hspedu.smallchange.oop;


import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 * 该类是完成零钱通各项功能的类
 * 使用OOP（面向对象编程）
 * 将各个功能对应一个方法
 */
public class SmallChangeSysOop {

    boolean loop = true;
    Scanner scanner = new Scanner(System.in);
    String key = "";
    double money = 0;
    double balance = 0;
    Date date = null;
    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm");
    String note = "";
    String details = "\n-----------零钱通明细----------\n";


    public void mainMenu(){
        do {
            System.out.println("\n===========零钱通菜单OOP==========");
            System.out.println("\t\t 1 零钱通明细");
            System.out.println("\t\t 2 收益明细");
            System.out.println("\t\t 3 消费");
            System.out.println("\t\t 4 退出");

            System.out.print("请选择（1-4）：");
            key = scanner.next();

            switch (key) {
                case "1":
                    details();
                    break;
                case "2":
                    income();
                    break;
                case "3":
                    pay();
                    break;
                case "4":
                    exit();
                    break;
                default:
                    System.out.println("输入有误，请重新输入");
            }

        } while (loop);
    }

    public void details(){
        System.out.println(details);
    }

    public void income(){
        System.out.println("收益入账金额：");
        money = scanner.nextDouble();
        if (money <= 0) {
            System.out.println("输入金额应该大于0");
            return;
        }
        balance += money;
        date = new Date();
        details += "\n收益入账\t" + money + "\t\t" + sdf.format(date) + "\t余额" + balance;

    }

    public void pay(){
        System.out.println("请输入消费金额： ");
        money = scanner.nextDouble();
        if (money <= 0 || money > balance) {
            System.out.println("消费金额应该大于0元且小于" + balance + "元");
            return;
        }
        balance -= money;
        System.out.println("请输入消费用途： ");
        note = scanner.next();
        date = new Date();
        details += "\n" + note + "\t\t-" + money + "\t\t" + sdf.format(date) + "\t余额" + balance;

    }

    public void exit(){
        String chioce = "";
        while (true) {
            System.out.println("确认是否退出？y|n");
            chioce = scanner.next();
            if (chioce.equals("y") || chioce.equals("n")) {
                break;
            }
        }
        if (chioce.equals("y")) {
            loop = false;
            System.out.println("退出了零钱通项目---");
        }
    }
}

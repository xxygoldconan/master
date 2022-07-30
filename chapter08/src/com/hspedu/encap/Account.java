package com.hspedu.encap;

public class Account {
    private String name;
    private double balance;
    private String pwd;

    public Account() {
    }

    public Account(String name, double balance, String pwd) {
        this.setName(name);
        this.setBalance(balance);
        this.setPwd(pwd);
    }

    //    public String getName() {
//        return name;
//    }

    public void setName(String name) {
        if (name.length() > 1 && name.length() < 6) {
            this.name = name;
        } else {
            System.out.println("Wrong name!");
            this.name = "No name";
        }
    }

//    public double getBalance() {
//        return balance;
//    }

    public void setBalance(double balance) {
        if (balance > 1) {
            this.balance = balance;
        } else {
            System.out.println("Wrong balance!");
            this.balance = 0;
        }
    }


//    public String getPwd() {
//        return pwd;
//    }

    public void setPwd(String pwd) {
        if (pwd.length() == 6) {
            this.pwd = pwd;
        } else {
            System.out.println("Wrong password!");
            this.pwd = "000000";
        }
    }

    public String info() {
        return "name = " + name + " balance = " + balance + " pwd = " + pwd;
    }


}


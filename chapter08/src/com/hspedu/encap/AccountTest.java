package com.hspedu.encap;

public class AccountTest {
    public static void main(String[] args) {
        Account account = new Account();

        account.setName("Jack");
        account.setBalance(2000);
        account.setPwd("123456");

        System.out.println(account.info());


    }
}



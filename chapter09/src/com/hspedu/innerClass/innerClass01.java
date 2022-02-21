package com.hspedu.innerClass;

public class innerClass01 {
    public static void main(String[] args) {
        Cellphone cellphone = new Cellphone();

        cellphone.alarmClock(new Bell() {
            @Override
            public void ring() {
                System.out.println("懒猪起床了");
            }
        });

        cellphone.alarmClock(new Bell() {
            @Override
            public void ring() {
                System.out.println("小明起床了");
            }
        });





    }



}

interface Bell{
    void ring();
}

class Cellphone {
    public static void alarmClock(Bell bell){
        bell.ring();
    }
}



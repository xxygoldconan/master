package com.hspedu.SingleTon_;

import java.util.GregorianCalendar;

public class SingleTon01 {
    public static void main(String[] args) {
        GirlFriend gf = GirlFriend.getGf();
        System.out.println(gf);

    }
}

class GirlFriend{
    private String name;
    private static GirlFriend gf = new GirlFriend("桜");
    private GirlFriend(String name){
        this.name=name;
    }
    public static GirlFriend getGf(){
        return gf;
    }

    @Override
    public String toString() {
        return "GirlFriend{" +
                "name='" + name + '\'' +
                '}';
    }
}

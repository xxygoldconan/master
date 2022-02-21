package com.hspedu.SingleTon_;

public class SingleTon02 {
    public static void main(String[] args) {
        GirlFriend01 gf01 = GirlFriend01.getGf01();
        System.out.println(gf01);
    }
}

class GirlFriend01{
    private String name;
    private static GirlFriend01 gf01;
    private GirlFriend01(String name){
        this.name=name;
    }
    public static GirlFriend01 getGf01(){
        if(gf01==null){
            gf01 = new GirlFriend01("宮脇");
        }
        return gf01;
    }

    @Override
    public String toString() {
        return "GirlFriend01{" +
                "name='" + name + '\'' +
                '}';
    }
}

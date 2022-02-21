package com.hspedu.houserent.service;

import com.hspedu.houserent.domain.House;
import com.hspedu.houserent.utils.Utility;

public class HouseService {

    private House[] houses;
    private int houseNum = 1;
    private int idCounter = 1;

    public HouseService(int size) {
        houses = new House[size];

        //为了配合测试列表信息，老韩这里初始化一个House对象
        houses[0] = new House(1, "jack", "112", "海淀区", 2000, "未出租");
    }

    public boolean findById(int findId){
        int index = -1;
        for (int i = 0; i < houseNum; i++) {
            if (findId == houses[i].getId()) {
                index = i;
            }
        }
        if (index == -1) {
            return false;
        }
        System.out.println(houses[index]);
        return true;
    }

    public boolean del(int delId) {
        int index = -1;
        for (int i = 0; i < houseNum; i++) {
            if (delId == houses[i].getId()) {
                index = i;
            }
        }
        if (index == -1) {
            return false;
        }
        for (int i = index; i < houseNum - 1; i++) {
            houses[i] = houses[i+1];
        }
        houses[houseNum-1] = null;
        houseNum--;
        return true;

    }

    public boolean add(House newHouse) {
        if (houseNum == houses.length) {
            System.out.println("数据已达上限，无法添加...");
            return false;
        } else {
            houses[houseNum++] = newHouse;

            newHouse.setId(++idCounter);
            return true;
        }

    }

    public House[] list() {
        return houses;
    }
}

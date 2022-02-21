package com.hspedu.pkg;

import java.util.Arrays;


public class import01 {
    public static void main(String[] args) {
        int[] arr = {-1, 100, 23, 15, -9, 0};
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }

    }
}

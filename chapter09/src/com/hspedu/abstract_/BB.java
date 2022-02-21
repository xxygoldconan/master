package com.hspedu.abstract_;

public class BB extends Templete {

    @Override
    public void job() {

        int sum = 0;
        for (int i = 1; i < 1000000000; i++) {
            sum *= i;
        }

    }
}

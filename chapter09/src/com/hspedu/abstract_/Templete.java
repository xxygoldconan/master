package com.hspedu.abstract_;

public abstract class Templete {
    public abstract void job();

    public void countTime() {
        long start = System.currentTimeMillis();
        job();
        long end = System.currentTimeMillis();
        System.out.println("任务时间是" + (end - start));
    }

}

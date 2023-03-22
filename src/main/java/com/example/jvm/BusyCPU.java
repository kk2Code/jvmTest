package com.example.jvm;

public class BusyCPU {

    public int compute() {  //一个方法对应一块栈帧内存区域
        int a = 1;
        int b = 2;
        int c = (a + b) * 10;
        return c;
    }

    public static void main(String[] args) {
        BusyCPU busyCPU = new BusyCPU();
        while (true){
            int x = 1;
            busyCPU.compute();
            System.out.println("v2分支 second commit 但是提交到v1");
        }
    }

}

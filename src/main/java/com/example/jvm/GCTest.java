package com.example.jvm;

//添加运行JVM参数： -XX:+PrintGCDetails
public class GCTest {

    public static void main(String[] args) throws InterruptedException {
        byte[] allocation1, allocation2, allocation3, allocation4, allocation5, allocation6;
        allocation1 = new byte[55000 * 1024]; //1.只创建allocation1，allocation1被分配在Eden区，Eden区几乎被分配满

        /**
         * 在1的基础上再为allocation2分配内存，此时eden已被allocation1占满，导致触发minor gc，尝试将allocation1方法放到from区，
         * 但allocation1过大直接被丢到老年代，然后allocation2再被分配到已经minor gc后的eden区；
         */
        allocation2 = new byte[8000*1024]; //

//        allocation3 = new byte[10000 * 1024];
//        allocation4 = new byte[10000 * 1024];
//        allocation5 = new byte[10000 * 1024];
//        allocation6 = new byte[20000 * 1024];
    }

}
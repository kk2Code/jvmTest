package com.example.jvm;

import java.util.ArrayList;
import java.util.List;

public class HeapTest {

    byte[] a = new byte[1024 * 100]; //100kb

    public static void main(String[] args) {
        /**
         * 局部变量heapTests为GC ROOT，heapTests引用了ArrayList，ArrayList又引用了大量的HeapTest，while(true)导致main方法无法结束,
         * GC ROOT（heapTests）一直都在，导致大量的对象无法被minor gc回收，最终老年代堆积大量对象，导致堆溢出；
         */
        List<HeapTest> heapTests = new ArrayList<>();
        while (true){
            heapTests.add(new HeapTest());
        }
    }

}
package com.example.jvm;

/**
 * javap -v Math查看class信息
 */
public class Math {

    public static int initData = 789;
    public static User user = new User();

    public int compute(){
        int a = 1;
        int b = 2;
        int c = (a + b) * 10;
        return c;
    }

    public static void main(String[] args) {
        Math math = new Math();
        /**
         * main(),compute()等这些方法名称，以及user、a等字面量，在编译后（class文件）放在静态的常量池中，这些称为符号引用；
         * 运行时class文件被加载到内存（方法区）,主要包含运行时常量池（加载前是静态常量池）、类型信息、字段信息、方法信息、类加载器引用、
         * 对应class实例的引用等信息；
         * 运行时.compute()被替换为该方法在内存中地址，这称为动态链接；
         */
        math.compute();
    }

}

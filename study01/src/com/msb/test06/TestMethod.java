package com.msb.test06;

public class TestMethod {
    public static int add(int num1, int num2) {
        int num = num1 + num2;
        return num;
    }
    public static int add(int num1, int num2, int num3) {
        int num = num1 + num2 + num3;
        return num;
    }
    public static void main(String[] args) {
        int a = add(1,2);
        int b = add(1,2,3);
        System.out.println("a:"+a);
        System.out.println("b:"+b);
    }
}

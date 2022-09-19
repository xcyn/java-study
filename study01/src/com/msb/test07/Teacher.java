package com.msb.test07;

public class Teacher {
    String name;
    int age;

    public void say() {
        System.out.println("我是" + name + "现在" + age +"岁");
    }

    public Teacher(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

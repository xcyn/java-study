package com.msb.test08;

public class Annimal {
    String name;

    public Annimal(String name) {
        this.name = name;
    }

    public Annimal() {
    }

    public void say() {
        System.out.println(this.name);
        System.out.println("我是"+this.name);
    }
}

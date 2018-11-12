package com.cmy.loadwhen;

/**
 * Created by cmy on 2018/2/24
 */
public class A {

    private B b;

    static {
        System.out.println("Aº”‘ÿ:" + A.class.getClassLoader());
    }

    public A() {
        b = new B();
    }
}

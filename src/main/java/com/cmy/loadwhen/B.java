package com.cmy.loadwhen;

/**
 * Created by cmy on 2018/2/24
 */
public class B {

    static {
        System.out.println("B����:" + A.class.getClassLoader());
    }

}

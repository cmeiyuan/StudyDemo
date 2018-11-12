package com.cmy.loadwhen;

/**
 * Created by cmy on 2018/2/24
 */
public class Main {

    static {
        System.out.println("Mainº”‘ÿ");
    }

    public static void main(String[] args) {
        System.out.println("hello");
        try {
            Class<?> cls1 = new MyClassLoader1().loadClass("com.cmy.loadwhen.A");
            System.out.println(cls1.getClassLoader());
            cls1.getConstructor(null).newInstance(null);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}

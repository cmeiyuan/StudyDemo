package com.cmy.java8;

/**
 * Created by cmy on 2017/5/27
 */
public class User {

    public static User user = new User("test");

    public void test(CharSequence a){

    }

    private String name;

    public User(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

package com.cmy.processortest;

import java.util.Random;

/**
 * Created by cmy on 2017/9/19
 */
public class User implements Comparable {

    private String name;
    private int id;

    public String getName() {
        return name;
    }

    public User(String name) {
        this.name = name;
        this.id = new Random().nextInt(10000) + 10000;
    }

    @Override
    public int compareTo(Object o) {
        return id - ((User) o).id;
    }
}

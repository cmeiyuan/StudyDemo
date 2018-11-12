package com.factory;

/**
 * Created by cmy on 2018/11/10
 */
public class Shoes {

    private String name;

    public Shoes(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public void chuan(){
        System.out.println("穿："+name);
    }
}

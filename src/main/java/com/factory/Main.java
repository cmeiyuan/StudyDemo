package com.factory;

/**
 * Created by cmy on 2018/11/10
 */
public class Main {

    public static void main(String[] args) {
        ShoesFactory shoesFactory = new ShoesFactory();

        String name = "皮鞋";

        Shoes shoes = shoesFactory.createShoes(name);

        if (shoes != null) {
            System.out.println("生产出了:" + shoes.getName());
            shoes.chuan();
        } else {
            System.out.println("不能生产：" + name);
        }


    }

}

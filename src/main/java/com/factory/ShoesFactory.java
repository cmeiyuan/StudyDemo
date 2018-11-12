package com.factory;

/**
 * Created by cmy on 2018/11/10
 */
public class ShoesFactory {

    public Shoes createShoes(String name) {
        if (name.equals("皮鞋")) {
            return new LeatherShoes();
        } else if (name.equals("运动鞋")) {
            return new SportShoes();
        } else if (name.equals("拖鞋")) {
            return new SlipperShoes();
        } else {
            return null;
        }
    }


}

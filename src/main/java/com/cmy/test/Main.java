package com.cmy.test;

/**
 * Created by cmy on 2017/10/20
 */
public class Main {


    public static void main(String[] args){

        // 调用无参构造方法，没有姓名的用户
        User user1 = new User();

        // 调用有参构造方法创建一个用户，用户的姓名是通过构造方法的参数传入的
        User user2 = new User("陈美圆");

    }

}

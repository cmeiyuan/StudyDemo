package com.observerdemo;

/**
 * Created by cmy on 2018/11/10
 */
public class Test21 {

    public static void main(String[] args) {
        // 创建公众号
        PublicAccount account = new PublicAccount("Java后端");

        WeixinUser weixinUser1 = new WeixinUser("高立展");
        WeixinUser weixinUser2 = new WeixinUser("陈美足");
        WeixinUser weixinUser3 = new WeixinUser("陈美圆");

        // 关注
        account.follow(weixinUser1);
        account.follow(weixinUser2);
        account.follow(weixinUser3);

        account.push("什么是观察者模式?");

        account.cancel(weixinUser3);

        account.push("线程池功能讲解");

    }

}

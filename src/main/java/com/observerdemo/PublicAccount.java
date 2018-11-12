package com.observerdemo;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by cmy on 2018/11/10
 */
public class PublicAccount {

    // 关注我的人员列表
    private List<WeixinUser> list = new ArrayList<>();

    private String name;

    public PublicAccount(String name) {
        this.name = name;
    }

    // 关注
    public void follow(WeixinUser weixinUser) {
        System.out.println(weixinUser.getName() + "关注了公众号");
        list.add(weixinUser);
    }

    // 取消关注
    public void cancel(WeixinUser weixinUser) {
        System.out.println(weixinUser.getName() + "取消了关注");
        list.remove(weixinUser);
    }

    // 推送文章
    public void push(String text) {
        System.out.println("开始推送文章：" + text);
        Message message = new Message(text, name);
        for (int i = 0; i < list.size(); i++) {
            list.get(i).pushMessage(message);
        }
    }

}

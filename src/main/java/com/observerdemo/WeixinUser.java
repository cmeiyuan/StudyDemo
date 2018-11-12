package com.observerdemo;

/**
 * Created by cmy on 2018/11/10
 */
public class WeixinUser {

    private String name;

    public WeixinUser(String name) {
        this.name = name;
    }

    public void pushMessage(Message msg) {
        System.out.println(name + "接收到消息:" + msg.getContent() + "，来自于:" + msg.getPublisher());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

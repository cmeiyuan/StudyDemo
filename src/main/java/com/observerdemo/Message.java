package com.observerdemo;

/**
 * Created by cmy on 2018/11/10
 */
public class Message {

    private String content;//消息内容
    private String publisher;//发布者

    public Message(String content, String publisher) {
        this.content = content;
        this.publisher = publisher;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

}

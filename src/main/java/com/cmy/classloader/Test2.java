package com.cmy.classloader;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by cmy on 2017/9/16
 */
public class Test2 {


    public static void main(String[] args) {
        // 链表
        // 缺点：索引慢
        // 优点：插入、删除元素快


        // 数组线性表
        List<Integer> list1 = new ArrayList<>();

        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(4);
        list1.add(5);
        list1.add(6);
        list1.add(7);
        list1.add(8);
        list1.add(9);
        list1.add(10);

        list1.add(1, 1000);

        list1.remove(8);

        for (int i = 0; i < list1.size(); i++) {
            System.out.print(list1.get(i));
            System.out.print(" ");
        }


//        // 链表
//        List<Integer> list2 = new LinkedList<>();
//
//        list2.add(1);
//        list2.add(2);
//        list2.add(3);
//        list2.add(4);
//        list2.add(5);
//        list2.add(6);
//        list2.add(7);
//        list2.add(8);
//        list2.add(9);
//        list2.add(10);
//
//        list2.add(0, 11);
//
//        for (int i = 0; i < list2.size(); i++) {
//            System.out.print(list2.get(i));
//            System.out.print(" ");
//        }


    }


}

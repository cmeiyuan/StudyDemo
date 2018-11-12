package com.cmy.classloader;

/**
 * Created by cmy on 2017/9/16
 */
public class Test1 {


    public static void main(String[] args) {

        // 线性表  (数组、链表)

        // 数组特点：在内存是顺序存放的，地址是连续的，所以它索引快


        int[] array = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            System.out.print(" ");
        }

        // 插入操作

        //新建一个数组
        int[] newArray = new int[11];
        for (int i = 0; i < array.length; i++) {
            newArray[i] = array[i];
        }
        System.out.println("");

        for (int i = 0; i < newArray.length; i++) {
            System.out.print(newArray[i]);
            System.out.print(" ");
        }
        System.out.println("");


        int value = 100000;
        int insertIndex = 1;

        // 元素后移
        for (int i = 9; i >= insertIndex; i--) {
            newArray[i + 1] = newArray[i];
        }
        // 插入要插入的元素
        newArray[insertIndex] = value;

        for (int i = 0; i < newArray.length; i++) {
            System.out.print(newArray[i]);
            System.out.print(" ");
        }
        System.out.println("");

    }


}

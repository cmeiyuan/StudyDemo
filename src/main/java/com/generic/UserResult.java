package com.generic;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by cmy on 2018/9/7
 */
public class UserResult extends Result<List<String>> {

    public static void printClassType(Object object) {
        System.out.println(object.getClass().getName());
    }


    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>();
        List<String> list2 = new ArrayList<>();

        printClassType(list1);
        printClassType(list2);

        UserResult userResult = new UserResult();

        System.out.println(userResult.getClass().getSuperclass());
        System.out.println(userResult.getClass().getGenericSuperclass());
    }

}

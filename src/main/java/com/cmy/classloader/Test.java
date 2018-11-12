package com.cmy.classloader;

/**
 * Created by cmy on 2017/9/1
 */
public class Test {

    public static void main(String[] args) {
//        String str = "A6:33:4B:8F:F3:8E:4A:F5:4F:25:36:68:F5:6A:F7:AC";
//        str = "47:D5:FB:EC:0F:3C:21:D0:60:72:D1:81:3C:2D:78:3A";
//        System.out.println(str.replace(":", "").toLowerCase());

        String path = "/module/common";
        String moduleName = path.substring(path.lastIndexOf("/") + 1);
        System.out.println(moduleName);
    }

}

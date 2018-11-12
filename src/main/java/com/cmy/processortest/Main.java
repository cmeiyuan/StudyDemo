package com.cmy.processortest;

/**
 * Created by cmy on 2017/9/19
 */
public class Main {

    private static String test(String value) {
        if (value != null && value.startsWith("\"")
                && value.endsWith("\"")) {
            value = value.substring(1, value.length() - 1)
                    .replaceAll("\\\\", "");
        }
        return value;
    }

    public static void main(String[] args) {
//        String str = "[\\\"test\\\":\"haah\\\",\\\"message\\\":{\\\"data\\\":\\\"中国人民\\\\n解放军\\\"}]";
//        str = str.replaceAll("\\\\", "");
//        System.out.println(str);
    }

}

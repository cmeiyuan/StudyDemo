package com.generic;

import java.util.HashMap;

/**
 * Created by cmy on 2018/9/12
 */
public class Licy {


    public static void main(String[] args) {


        String str1 = "brand=unknown&model=Android%20SDK%20built%20for%20x86&uuid=6CC64BA4F59A2DAC9DC2962C6178E1E4&mac=02%3A00%3A00%3A00%3A00%3A00&imei=&network=WIFI&osversion=Android-25&romversion=sdk_google_phone_x86-userdebug%207.1.1%20NYC%204310591%20test-keys&language=en&isroot=1&appkey=acb5d98092a5&versioncode=1&version=1.0.0&appchannel=guanwang&supportcompress=zip&supportdiff=bsdiff&partyid=121&appmdfive=F5475CEF7969E7E26FB041CB2D938479&app_stoken=916563ce293849abba7987c1f327cad1&usercheck=1";
        String str2 = "partyid=121&app_stoken=916563ce293849abba7987c1f327cad1&appkey=acb5d98092a5&mac=02%3A00%3A00%3A00%3A00%3A00&uuid=6CC64BA4F59A2DAC9DC2962C6178E1E4&versioncode=1.0.0&isroot=1&romversion=sdk_google_phone_x86-userdebug%207.1.1%20NYC%204310591%20test-keys&supportcompress=zip&network=WIFI&supportdiff=bsdiff&appmdfive=F5475CEF7969E7E26FB041CB2D938479&osversion=Android-25&appchannel=guanwang&imei=&brand=unknown&version=1&language=en&usercheck=1&model=Android%20SDK%20built%20for%20x86";

        HashMap<String, String> map1 = parse(str1);
        HashMap<String, String> map2 = parse(str2);

        System.out.println("map1:" + map1.size());
        System.out.println("map2:" + map2.size());


        for (String key : map1.keySet()) {
            String value1 = map1.get(key);
            String value2 = map2.get(key);
            if (!value1.equals(value2)) {
                System.out.println("key:" + key);
                System.out.println("value1:" + value1);
                System.out.println("value2:" + value2);
            }
        }

    }

    private static HashMap<String, String> parse(String str) {
        HashMap<String, String> map = new HashMap<>();
        String[] arr = str.split("&");
        for (String a : arr) {
            int index = a.indexOf('=');
            map.put(a.substring(0, index), a.substring(index + 1, a.length()));
        }
        return map;
    }


}

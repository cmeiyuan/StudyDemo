package com.cmy.image;

import java.io.File;
import java.io.IOException;

/**
 * Created by cmy on 2017/10/17
 */
public class WebPConverterTest {

    public static void main(String[] args) {
//        String path = "/Users/cmeiyuan/AndroidStudioProjects/repo/ehuodiOwnerAndroid/trunk/app/src/main/res";
//        WebPConverter.convert(new File(path), false);


        File file1 = new File("/Users/cmeiyuan/AndroidStudioProjects/repo/ehuodiOwnerAndroid/trunk/app/src/main/res/drawable-hdpi/ka_bg.png");
        File file2 = new File("/Users/cmeiyuan/AndroidStudioProjects/repo/ehuodiOwnerAndroid/trunk/app/src/main/res/drawable-hdpi/ka_bg1.webp");

        try {
            WebPUtils.convert(file1, file2);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}

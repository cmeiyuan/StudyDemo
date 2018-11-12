package com.cmy.classloader;

import java.io.IOException;

/**
 * Created by cmy on 2017/8/30
 */
public class ClassLoaderTree {

    public static void main(String[] args) throws IOException {

        System.out.println("SystemClassLoader:" + ClassLoader.getSystemClassLoader().toString());

        ClassLoader loader = ClassLoaderTree.class.getClassLoader();
        while (loader != null) {
            System.out.println(loader.toString());
            loader = loader.getParent();
        }

    }

}

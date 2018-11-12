package com.cmy.image;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by cmy on 2017/10/17
 */
public class WebPConverter {

    public static void convert(File dir, boolean deleteOriginal) {
        List<File> cache = new ArrayList<>();
        searchFile(dir, cache);
        convert(cache, deleteOriginal);
    }

    public static void convert(List<File> files, boolean deleteOriginal) {
        System.out.println("total size:" + files.size());
        for (File file : files) {
            File webpFile = new File(file.getAbsolutePath().replace(".png", ".webp"));

            System.out.println(webpFile.getName());

            try {
                if (webpFile.exists()) {
                    webpFile.delete();
                }
                WebPUtils.convert(file, webpFile);
            } catch (IOException e) {
                e.printStackTrace();
                System.out.print(" Failed");
            }

            System.out.print(" Success");

            if (deleteOriginal) {
                file.deleteOnExit();
            }
        }
    }

    private static void searchFile(File dir, List<File> cache) {
        File[] files = dir.listFiles();
        if (files == null) {
            return;
        }
        for (File file : files) {
            if (file.isDirectory()) {
                searchFile(file, cache);
            } else {
                String fileName = file.getName();
                if (fileName.endsWith(".png") && !fileName.endsWith(".9.png")) {
                    try {
                        if (!WebPUtils.hasAlpha(file)) {
                            cache.add(file);
                        }
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }

            }
        }
    }

}

package com.cmy.image;

import com.luciad.imageio.webp.WebPWriteParam;

import javax.imageio.IIOImage;
import javax.imageio.ImageIO;
import javax.imageio.ImageWriter;
import javax.imageio.stream.FileImageOutputStream;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

/**
 * Created by cmy on 2017/10/17
 */
public class WebPUtils {

    public static boolean hasAlpha(File file) throws IOException {
        BufferedImage bi = ImageIO.read(file);
        // 获取图像的宽度和高度
        int width = bi.getWidth();
        int height = bi.getHeight();
        // 扫描图片
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                int alpha = bi.getColorModel().getAlpha(bi.getRaster().getDataElements(j, i, null));
                if (alpha != 0xff) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void convert(File input, File output) throws IOException {
        // Obtain an image to encode from somewhere
        BufferedImage image = ImageIO.read(input);

        System.out.print("start");

        // Encode it as output using default settings
        ImageIO.write(image, "output", output);

        System.out.print(" finish");

    }

}

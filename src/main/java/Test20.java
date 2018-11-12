import com.google.gson.Gson;

import java.io.*;
import java.net.URL;
import java.net.URLConnection;

/**
 * Created by cmy on 2018/11/9
 */
public class Test20 {

    public static void main(String[] args) {

        Test20 test20 = new Test20();

//        String path = "/Users/cmeiyuan/Desktop/log.txt";
//
//        try {
//            String result = test20.readFromFile1(path);
//            System.out.println(result);
//        } catch (Exception e) {
//
//            System.out.println("文件不存在");
//
//            // e.printStackTrace();
//        }


//        String url = "https://ss0.bdstatic.com/94oJfD_bAAcT8t7mm9GUKT-xh_/timg?image&quality=100&size=b4000_4000&sec=1541780397&di=5d8657d53beaebeefa8ef00cc1c7acb3&src=http://imgsrc.baidu.com/imgad/pic/item/060828381f30e92483987f3746086e061d95f7fc.jpg";
//        String target = "/Users/cmeiyuan/Desktop/meinu.jpg";
//
//        try {
//            test20.downloadFile(url, target);
//        } catch (Exception e) {
//            e.printStackTrace();
//        }


//        String url = "http://127.0.0.1:8080/buyer/product/list";
//
//        try {
//            test20.get(url);
//        } catch (Exception e) {
//            e.printStackTrace();
//        }

        String url = "https://ss0.bdstatic.com/94oJfD_bAAcT8t7mm9GUKT-xh_/timg?image&quality=100&size=b4000_4000&sec=1541780397&di=5d8657d53beaebeefa8ef00cc1c7acb3&src=http://imgsrc.baidu.com/imgad/pic/item/060828381f30e92483987f3746086e061d95f7fc1.jpg";
        String target = "/Users/cmeiyuan/Desktop/meinu.jpg";

        test20.downloadFile(url, target, new DownloadListener() {
            @Override
            public void onSuccess(String path) {
                System.out.println("下载成功");
            }

            @Override
            public void onFailure(Exception e) {
                System.out.println("下载失败:" + e.getMessage());
                e.printStackTrace();
            }
        });

    }


    public String readFromFile(String path) throws Exception {
        // IO 字节流、字符流
        InputStream inputStream = new FileInputStream(new File(path));

//        int result = inputStream.read();
//
//        System.out.println(result);
//
//        byte[] b = new byte[1];
//        b[0] = (byte) result;
//
//        System.out.println(new String(b));

        // 4 * 1024b = 4kb
        byte[] b = new byte[4 * 1024];

        int len = inputStream.read(b);


        String result = new String(b);


        System.out.println(result);


        System.out.println(len);


        return null;
    }


    public String readFromFile1(String path) throws Exception {
        InputStream inputStream = new FileInputStream(new File(path));
        byte[] b = new byte[3];

        int len;

        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();

        while ((len = inputStream.read(b)) != -1) {
            outputStream.write(b, 0, len);
            // outputStream.write(b);
        }

        byte[] nb = outputStream.toByteArray();

        return new String(nb);
    }


    public void downloadFile(String url, String target) throws Exception {
        // http  短连接
        // tcp udp 长连接
        URL uRL = new URL(url);
        URLConnection conn = uRL.openConnection();
        InputStream inputStream = conn.getInputStream();

        FileOutputStream fileOutputStream = new FileOutputStream(target);


        byte[] b = new byte[1024];

        int len;

        while ((len = inputStream.read(b)) != -1) {
            fileOutputStream.write(b, 0, len);
        }

    }

    public void downloadFile(String url, String target, DownloadListener downloadListener) {
        try {
            downloadFile(url, target);
            if (downloadListener != null) {
                downloadListener.onSuccess(target);
            }
        } catch (Exception e) {
            // e.printStackTrace();
            if (downloadListener != null) {
                downloadListener.onFailure(e);
            }
        }
    }

    public void get(String url) throws Exception {
        URL uRL = new URL(url);
        URLConnection conn = uRL.openConnection();
        InputStream inputStream = conn.getInputStream();

        byte[] b = new byte[1024];

        int len;

        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();

        // FileOutputStream outputStream = new FileOutputStream("/Users/cmeiyuan/Desktop/product.txt");

        while ((len = inputStream.read(b)) != -1) {
            outputStream.write(b, 0, len);
            // outputStream.write(b);
        }

        byte[] nb = outputStream.toByteArray();

        String result = new String(nb);

        System.out.println(result);

        Gson gson = new Gson();

        ProductList productList = gson.fromJson(result, ProductList.class);

        System.out.println(productList.getMsg());

    }


}

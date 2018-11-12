import com.google.gson.Gson;

import java.io.*;
import java.net.URL;
import java.net.URLConnection;

/**
 * Created by cmy on 2018/10/31
 */
public class Test17 {

    public static void main(String[] args) throws Exception {
        Test17 test17 = new Test17();
        // test17.readFromFile();

//        String url = "https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1541009780083&di=71c289685242b67f43abc1a062d873f4&imgtype=0&src=http%3A%2F%2Fimgsrc.baidu.com%2Fimgad%2Fpic%2Fitem%2F7acb0a46f21fbe09334115c061600c338644adc3.jpg";
//        String downloadPath = "/Users/cmeiyuan/Desktop/test.jpg";
//        test17.downloadFile(url, downloadPath);


//        test17.readFromFile1();

        test17.get("http://127.0.0.1:8080/buyer/product/list");
    }

    private void readFromFile() throws Exception {
        String path = "/Users/cmeiyuan/Desktop/test.txt"; // 10kb

        File file = new File(path);

        InputStream inputStream = new FileInputStream(file); //输入流

        byte[] b = new byte[10 * 1024];

        inputStream.read(b);

        String str = new String(b);

        System.out.println(str);
    }

    private void readFromFile1() throws Exception {
        String path = "/Users/cmeiyuan/Desktop/test.txt"; // 10kb

        File file = new File(path);

        InputStream inputStream = new FileInputStream(file); //输入流

        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();

        byte[] b = new byte[4 * 1024];

        int count;
        while ((count = inputStream.read(b)) != -1) {
            outputStream.write(b, 0, count);
        }

        String str = new String(outputStream.toByteArray());

        System.out.println(str);
    }

    private void downloadFile(String path, String savePath) throws Exception {
        URL url = new URL(path);
        URLConnection conn = url.openConnection();
        InputStream input = conn.getInputStream(); // 10kb

        OutputStream out = new FileOutputStream(new File(savePath)); // 文件输出流

        byte[] b = new byte[4 * 1024];
        int count;
        while ((count = input.read(b)) != -1) {
            out.write(b, 0, count);
        }

        try {
            input.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            out.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    private void get(String urlPath) throws IOException{
        URL url = new URL(urlPath);
        URLConnection conn = url.openConnection();
        InputStream input = conn.getInputStream();

        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();

        byte[] b = new byte[4 * 1024];

        int count;
        while ((count = input.read(b)) != -1) {
            outputStream.write(b, 0, count);
        }

        String str = new String(outputStream.toByteArray());


        Gson gson = new Gson();

        ProductList productList = gson.fromJson(str, ProductList.class);

        System.out.println(productList.getMsg());

    }

}

import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;

/**
 * Created by cmy on 2018/4/4
 */
public class Test8 {

    private static Object object = new Object();

    public static void main(String[] args) {


        String urlPath = "http://127.0.0.1:8080/minor_client.apk";

        try {
            URL url = new URL(urlPath);
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            InputStream in = conn.getInputStream();

            byte[] b = new byte[1024];

            int count = in.read(b);

            System.out.println(count);


        } catch (Exception e) {
            e.printStackTrace();
        }


    }

}

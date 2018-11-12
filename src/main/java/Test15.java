import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;

/**
 * Created by cmy on 2018/8/29
 */
public class Test15 {


    public static void main(String[] args) {

        System.setProperty("http.proxyHost", "127.0.0.1");
        System.setProperty("https.proxyHost", "127.0.0.1");
        System.setProperty("http.proxyPort", "8888");
        System.setProperty("https.proxyPort", "8888");

        try {
            URL url = new URL("http://127.0.0.1:8080/test");
            HttpURLConnection urlConnection = (HttpURLConnection)url.openConnection();
            urlConnection.setDoInput(true);
            urlConnection.setDoOutput(true);
            String str = "abcd";

            urlConnection.getOutputStream().write(str.getBytes());

            byte[] b = new byte[1024];

            urlConnection.getInputStream().read(b);

            System.out.println(new String(b));

        } catch (Exception e) {
            e.printStackTrace();
        }


    }

}

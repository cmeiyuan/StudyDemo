import java.text.SimpleDateFormat;
import java.util.Locale;

/**
 * Created by cmy on 2017/12/27
 */
public class Test4 {

    public static void main(String[] args) throws Exception {
        SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd", Locale.CHINA);
        SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-M-d", Locale.CHINA);
        System.out.println(sdf1.format(sdf2.parse("2018-1-01")));
    }

}

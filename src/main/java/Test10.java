import java.text.DecimalFormat;

/**
 * Created by cmy on 2018/6/25
 */
public class Test10 {

    public static void main(String[] args) {

//
//        String s = "    <item\n" +
//                "        android:drawable=\"@drawable/loader_000%s\"\n" +
//                "        android:duration=\"50\" />";
//
//
//        for (int i = 0; i < 60; i++) {
//
//            if (i < 10) {
//                System.out.println(String.format(s, "0" + i));
//            } else {
//                System.out.println(String.format(s, i));
//            }
//
//
//        }


        System.out.println(new DecimalFormat("#.##").format(1.134322));


    }

}

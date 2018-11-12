import java.lang.reflect.Field;

/**
 * Created by cmy on 2017/11/13
 */
public class Test1 {

    private View view;

    public Test1() {
        onCreate();
    }

    private void onCreate() {
        view = new View();
        Callback callback = new Callback() {
            @Override
            public void onCall() {
                // System.out.println("onCall():" + getClass().getName());
            }
        };
        view.setCallback(callback);
        Field[] fields = callback.getClass().getDeclaredFields();
        for (Field field : fields) {
            System.out.println(field.getName());
        }



    }

    public void test() {
        view.perform();
    }

    public static void main(String[] args) {
        Test1 t = new Test1();
        t.test();
    }

}

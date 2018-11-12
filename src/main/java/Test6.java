import java.util.concurrent.atomic.AtomicInteger;

/**
 * Created by cmy on 2018/4/4
 */
public class Test6 {

    private static AtomicInteger a = new AtomicInteger();
    private static Object object = new Object();


    public static void main(String[] args) {


        for (int i = 0; i < 5; i++) {
            new Thread(new Runnable() {
                @Override
                public void run() {

                    for (int i = 0; i < 1000; i++) {
                        synchronized (object) {
                            a.addAndGet(1);
                        }
                    }

                }
            }).start();
        }

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(a);

    }

}

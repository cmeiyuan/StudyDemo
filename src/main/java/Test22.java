
import java.util.concurrent.*;

/**
 * Created by cmy on 2018/11/12
 */
public class Test22 {

    private static ExecutorService executor1 = Executors.newSingleThreadExecutor();
    private static ExecutorService executor2 = Executors.newCachedThreadPool();
    private static ExecutorService executor3 = Executors.newFixedThreadPool(5);
    private static ScheduledExecutorService executor4 = Executors.newScheduledThreadPool(10);


    public static void main(String[] args) throws Exception {

        for (int i = 0; i < 10; i++) {
            executor1.execute(getTask(i + 1));
        }

    }


    public static Runnable getTask(final int index) {
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println(String.format("【任务%s】正在(%s)执行", index, Thread.currentThread().getName()));
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };
        return runnable;
    }

}

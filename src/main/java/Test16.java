import java.util.concurrent.ArrayBlockingQueue;

/**
 * Created by cmy on 2018/10/26
 */
public class Test16 {

    private static ArrayBlockingQueue<String> arrayBlockingQueue = new ArrayBlockingQueue<>(10);

    public static void main(String[] args) {

        for (int i = 0; i < 15; i++) {
            new Thread(() -> {
                String str = String.valueOf(System.currentTimeMillis());
                try {
                    arrayBlockingQueue.put(str);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("成功");
            }).start();
        }

    }

}

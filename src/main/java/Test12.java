/**
 * Created by cmy on 2018/8/16
 */
public class Test12 {

    private static final Object object = new Object();

    public static void main(String[] args) {

        new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (object) {
                    System.out.println("线程1执行 1");
                    try {
                        object.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println("线程1执行 2");
                }
            }
        }).start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (object) {
                    System.out.println("线程2执行 1");
                    System.out.println("线程2执行 2");
                    object.notifyAll();
                    // 当前线程依然持有锁，直到释放锁后，线程1才有机会得到锁
                    System.out.println("线程2执行 3");
                }
            }
        }).start();

    }

}

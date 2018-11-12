/**
 * Created by cmy on 2018/11/8
 */
public class Test18 {

    private static final Object object = new Object();


    public static void main(String[] args) throws Exception {

        // 主线程

        Thread thread = Thread.currentThread();

        System.out.println(thread.getName());


        // 创建一个线程

        Thread subThread = new Thread() {

            @Override
            public void run() {

                System.out.println("子线程0正在开始执行:" + Thread.currentThread().getName());

                synchronized (object) {
                    try {
                        System.out.println("子线程0正在等待:" + Thread.currentThread().getName());
                        object.wait();
                        System.out.println("子线程0结束等待:" + Thread.currentThread().getName());
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }


                System.out.println("子线程0正在结束执行:" + Thread.currentThread().getName());

            }
        };

        subThread.start();


        // 创建一个线程

        Thread subThread1 = new Thread() {

            @Override
            public void run() {

                System.out.println("子线程1正在开始执行:" + Thread.currentThread().getName());

                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                synchronized (object) {
                    System.out.println("子线程1正在唤醒:" + Thread.currentThread().getName());
                    object.notify();
                    System.out.println("子线程1结束唤醒:" + Thread.currentThread().getName());
                }

                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                System.out.println("子线程1正在结束执行:" + Thread.currentThread().getName());

            }
        };

        subThread1.start();

    }
}

/**
 * Created by cmy on 2018/11/8
 */
public class Test19 {


    private static int a = 0;

    public static void main(String[] args) throws Exception {

        for (int i = 0; i < 10; i++) {
            new Thread(new Runnable() {
                @Override
                public void run() {
                    System.out.println("准备要调用add()方法：" + Thread.currentThread().getName());
                    add();
                }
            }).start();
        }

        Thread.sleep(31 * 1000);
        System.out.println("" + a);

    }


    public static synchronized void add() {
        System.out.println("开始执行++操作:" + Thread.currentThread().getName());
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        a++;
        System.out.println("结束执行++操作:" + Thread.currentThread().getName());
    }


}

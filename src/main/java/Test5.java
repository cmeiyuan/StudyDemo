/**
 * Created by cmy on 2018/3/23
 */
public class Test5 {

    private static Object book = new Object();
    private static Object picture = new Object();

    public static void main(String[] args) {

        new Thread(new ZsRunnable()).start();

        new Thread(new LsRunnable()).start();
    }

    private static class ZsRunnable implements Runnable {

        @Override
        public void run() {

            synchronized (book) {
                System.out.println("张三说我拿到书了，我还要画");
                try {
                    Thread.sleep(500);
                } catch (Exception e) {
                    e.printStackTrace();
                }

                synchronized (picture){
                    System.out.println("张三拿到书和画了");
                }

            }

        }
    }

    private static class LsRunnable implements Runnable {

        @Override
        public void run() {
            synchronized (picture) {
                System.out.println("李四说我拿到画了，我还要书");
                try {
                    Thread.sleep(500);
                } catch (Exception e) {
                    e.printStackTrace();
                }

                synchronized (book){
                    System.out.println("李四拿到书和画了");
                }

            }
        }
    }

}

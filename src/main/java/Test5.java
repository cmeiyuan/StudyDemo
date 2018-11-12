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
                System.out.println("����˵���õ����ˣ��һ�Ҫ��");
                try {
                    Thread.sleep(500);
                } catch (Exception e) {
                    e.printStackTrace();
                }

                synchronized (picture){
                    System.out.println("�����õ���ͻ���");
                }

            }

        }
    }

    private static class LsRunnable implements Runnable {

        @Override
        public void run() {
            synchronized (picture) {
                System.out.println("����˵���õ����ˣ��һ�Ҫ��");
                try {
                    Thread.sleep(500);
                } catch (Exception e) {
                    e.printStackTrace();
                }

                synchronized (book){
                    System.out.println("�����õ���ͻ���");
                }

            }
        }
    }

}

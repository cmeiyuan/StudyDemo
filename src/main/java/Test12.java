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
                    System.out.println("�߳�1ִ�� 1");
                    try {
                        object.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println("�߳�1ִ�� 2");
                }
            }
        }).start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (object) {
                    System.out.println("�߳�2ִ�� 1");
                    System.out.println("�߳�2ִ�� 2");
                    object.notifyAll();
                    // ��ǰ�߳���Ȼ��������ֱ���ͷ������߳�1���л���õ���
                    System.out.println("�߳�2ִ�� 3");
                }
            }
        }).start();

    }

}

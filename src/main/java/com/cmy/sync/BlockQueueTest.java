package com.cmy.sync;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingDeque;

/**
 * Created by cmy on 2018/5/8
 */
public class BlockQueueTest {

    public static void main(String[] args) {
        // 默认容量为Integer.MAX_VALUE
        BlockingQueue<String> blockingQueue1 = new LinkedBlockingDeque<>();
        // 容量为10的阻塞队列
        BlockingQueue<String> blockingQueue2 = new ArrayBlockingQueue<>(10);

        testBlockingDeque(blockingQueue1);
    }


    private static void testBlockingDeque(BlockingQueue<String> blockingQueue) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 15; i++) {
                    String value = String.valueOf(i + 1);
                    System.out.println("生产=>" + value);
                    blockingQueue.offer(value);
                    try {
                        Thread.sleep(50);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }).start();


        new Thread(new Runnable() {
            @Override
            public void run() {
                while (true) {
                    String value = blockingQueue.poll();
                    System.out.println("消费=>" + value);
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }).start();
    }

}

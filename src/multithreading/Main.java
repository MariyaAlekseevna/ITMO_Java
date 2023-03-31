package multithreading;

import java.util.concurrent.CountDownLatch;

public class Main {
    public static void main(String[] args) throws InterruptedException {
/*
        System.out.println("==================  Задание 1 ==================");
        for (int i = 1; i <= 10; i++) {
            new ThreadHundred().start();
        }

        System.out.println("==================  Задание 2 ==================");
        ThreadState threadState = new ThreadState();
        System.out.println("Состояние потока перед его запуском: " + threadState.getState());
        threadState.start();
        System.out.println("Состояние потока после его запуска: " + threadState.getState());
*/
        System.out.println("==================  Задание 3 ==================");
        Counter counter = new Counter();
        CountDownLatch countDownLatch = new CountDownLatch(100);
        Thread[] countThreads = new Thread[100];

        for (int i = 0; i < 100; i++) {
            countThreads[i] = new Thread(new CountThread(counter, countDownLatch));
            countThreads[i].start();
        }
        try {
            countDownLatch.await();
        } catch (InterruptedException e) {
            System.out.println("Ошибка: " + e);
        }
        System.out.println("Count= " + counter.getCount());
/*
        System.out.println("==================  Задание 4 ==================");
        Object object = new Object();
        ThreadName threadName1 = new ThreadName(object);
        ThreadName threadName2 = new ThreadName(object);
        threadName1.start();
        threadName2.start();
*/
    }
}
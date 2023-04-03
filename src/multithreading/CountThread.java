package multithreading;

import java.util.concurrent.CountDownLatch;

public class CountThread extends Thread {
    private Counter counter;
    private CountDownLatch countDownLatch;


    public CountThread(Counter counter, CountDownLatch countDownLatch) {
        this.counter = counter;
        this.countDownLatch = countDownLatch;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 1000; i++) {

            counter.increment();
        }
        countDownLatch.countDown();
    }
}
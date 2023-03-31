package multithreading;

import java.util.concurrent.CountDownLatch;

public class Counter {
    int count = 0;

    public synchronized void increment() {
        count = count + 1;
    }

    public int getCount() {
        return count;
    }
}
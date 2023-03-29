package multithreading;

public class ThreadHundred extends Thread {
    @Override
    public void run() {
        for (int i = 0; i <= 100; i++) {
            System.out.printf("Поток %s. Число - %d\n", getName(), i);
        }
    }
}

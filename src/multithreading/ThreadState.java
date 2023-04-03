package multithreading;

public class ThreadState extends Thread {
    @Override
    public void run() {
        System.out.println("Состояние потока во время выполнения: " + getState());
    }
}

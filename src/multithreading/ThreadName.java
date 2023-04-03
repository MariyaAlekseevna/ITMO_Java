package multithreading;

public class ThreadName extends Thread {
    private Object object;

    ThreadName(Object object) {
        this.object = object;
    }

    @Override
    public void run() {
        synchronized (object) {
            int i;
            for (i = 0; i < 20; i++) {
                try {
                    System.out.println("Имя потока: " + getName());
                    object.notify();
                    object.wait();
                } catch (InterruptedException e) {
                    System.out.println("Ошибка: " + e.getMessage());
                }
            }
        }
    }
}

package multithreading;

public class Main {
    public static void main(String[] args) {

        System.out.println("==================  Задание 1 ==================");
        for (int i = 1; i <= 10; i++) {
            new ThreadHundred().start();
        }

        System.out.println("==================  Задание 2 ==================");
        ThreadState threadState = new ThreadState();
        System.out.println("Состояние потока перед его запуском: " + threadState.getState());
        threadState.start();
        System.out.println("Состояние потока после его запуска: " + threadState.getState());

        System.out.println("==================  Задание 3 ==================");
        Counter counter = new Counter();
        for (int i = 1; i <= 100; i++) {
            CountThread countThread = new CountThread(counter);
            countThread.start();
            try {
                countThread.join();
                System.out.println("Counter " + i + " = " + +counter.getCount());
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
        }

        System.out.println("==================  Задание 4 ==================");
        Object object = new Object();
        ThreadName threadName1 = new ThreadName(object);
        ThreadName threadName2 = new ThreadName(object);
        threadName1.start();
        threadName2.start();
    }
}

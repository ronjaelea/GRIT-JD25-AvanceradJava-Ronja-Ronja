public class SynchronizedDemo {

    public static void Demo() {
        try {
            doDemo();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    private int value = 0;

    public synchronized void increment() {
        value++;
    }

    public synchronized int getValue() {
        return value;
    }


    private static void doDemo() throws InterruptedException {

        SynchronizedDemo counter = new SynchronizedDemo();

        Thread t1 = new Thread(() -> {
            for(int i=0; i < 10_000; i++) counter.increment();
        });
        Thread t2 = new Thread(() -> {
            for(int i=0; i < 10_000; i++) counter.increment();
        });

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println("Counter (border var 20000): " + counter.getValue());

    }

}

public class RaceConditionDemo {

    public static void Demo() {
        try  {
            doDemo();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    private static int counter = 0;

    private static void doDemo() throws InterruptedException {

        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 10_000; i++) counter++;
        });

        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 10_000; i++) counter++;
        });

        // Starta trådar
        t1.start();
        t2.start();

        // Vänta på att trådar blir klara
        t1.join();
        t2.join();

        System.out.println("Det förväntade resultate: 20000");
        System.out.println("Det faktiska resultatet: " + counter);
    }

}

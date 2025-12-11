public class StartThreadByInterfaceDemo implements Runnable {

    public static void Demo() {
        System.out.println("Skapar tråd");
        Thread threadObj = new Thread(
                new StartThreadByInterfaceDemo()
        );
        System.out.println("Tråden är skapad");
        threadObj.start();
        System.out.printf("Tråden är startad");
    }

    @Override
    public void run() {
        System.out.println(
                "Tråd körs i Runnable: " + Thread.currentThread().getName()
        );
    }
}

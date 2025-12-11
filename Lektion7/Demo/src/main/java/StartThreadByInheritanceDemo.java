public class StartThreadByInheritanceDemo extends Thread {

    public static void Demo() {
        System.out.println("Skapar tråd!");
        StartThreadByInheritanceDemo threadObj = new StartThreadByInheritanceDemo();
        System.out.println("Startar tråd!");
        threadObj.start();
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Tråd startad!");
    }

    @Override
    public void run() {
        System.out.println(
                "Tråd startad: " + Thread.currentThread().getName()
        );
    }
}

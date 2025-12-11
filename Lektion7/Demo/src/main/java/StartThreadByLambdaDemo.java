public class StartThreadByLambdaDemo {

    public static void Demo() {

        Thread threadObj = new Thread(() -> {
            System.out.println("Lambda-tråd startad");
            try {
                Thread.sleep(10000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Lambda-tråd färdig!");
        });

        threadObj.start();
    }

}

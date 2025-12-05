package singleton;

public class SingletonDemo {

    public static void Demo() {

        Singleton s1 = Singleton.getInstance();
        Singleton s2 = Singleton.getInstance();
        Singleton s3 = Singleton.getInstance();

        System.out.println("S1: " + s1.getARandomNumber());
        System.out.println("S2: " + s2.getARandomNumber());
        System.out.println("S3: " + s3.getARandomNumber());

    }

}

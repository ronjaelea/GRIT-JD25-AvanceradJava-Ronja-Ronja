package singleton;

import java.util.Random;

public class Singleton {

    private static Singleton instance;

    private Singleton() {
        System.out.println("Singleton constructor");
    }

    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

    // Här kan man implementera specifik kod för vår singleton

    // En metod som returnerar ett slumpmässigt tal
    int aRandomNumber = (new Random()).nextInt(1000);
    public int getARandomNumber() {
        return aRandomNumber;
    }

}

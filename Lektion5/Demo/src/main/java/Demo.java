import factory.FactoryDemo;
import observer.Observer;
import observer.ObserverDemo;
import singleton.SingletonDemo;
import strategy.StrategyDemo;

import java.util.Scanner;

public class Demo {

    public static void main(String[] args) {
        System.out.println("""
                1. Singleton
                2. Observer 
                3. Factory
                4. Strategy
                """);
        System.out.println("Demo: ");
        Scanner sc = new Scanner(System.in);
        int i = 0;
        try {
            i = sc.nextInt();
        } catch (Exception e) {
            System.out.println("Ogiltig inmatning");
            return;
        }

        switch(i) {
            case 1:
                SingletonDemo.Demo();
                break;
            case 2:
                ObserverDemo.Demo();
                break;
            case 3:
                FactoryDemo.Demo();
                break;
            case 4:
                StrategyDemo.Demo();
                break;
            default:
                System.out.println("Ogiltigt val");
        }
    }

}

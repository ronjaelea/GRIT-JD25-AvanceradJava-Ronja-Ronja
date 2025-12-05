package strategy;

public class SwishStrategy implements PaymentStrategy {

    String phoneNumber;
    String name;

    public SwishStrategy(String phoneNumber, String name) {
        this.phoneNumber = phoneNumber;
        this.name = name;
    }

    @Override
    public void pay(int amount) {
        System.out.printf("%d was paid using Swish\n", amount);
    }
}

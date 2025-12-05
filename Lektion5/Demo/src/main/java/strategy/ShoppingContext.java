package strategy;

public class ShoppingContext {

    PaymentStrategy paymentStrategy;

    public ShoppingContext(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }


    public void executeStrategy(int amount) {
        this.paymentStrategy.pay(amount);
    }
}

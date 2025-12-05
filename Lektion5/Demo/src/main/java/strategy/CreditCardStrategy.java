package strategy;

public class CreditCardStrategy implements PaymentStrategy {

    String name;
    String cardNumber;
    String cvv;
    String expiryDate;

    public CreditCardStrategy(String name, String cardNumber, String cvv, String expiryDate) {
        this.name = name;
        this.cardNumber = cardNumber;
        this.cvv = cvv;
        this.expiryDate = expiryDate;
    }

    @Override
    public void pay(int amount) {
        System.out.printf(
            "%d was paid using Credit Card\n",
            amount
        );
    }
}

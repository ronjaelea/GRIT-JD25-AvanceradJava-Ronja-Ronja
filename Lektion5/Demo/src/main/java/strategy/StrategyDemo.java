package strategy;

public class StrategyDemo {

    public static void Demo() {
        ShoppingContext context1 = new ShoppingContext(
            new SwishStrategy("+46123123123", "Martin")
        );
        context1.executeStrategy(67);

        ShoppingContext context2 = new ShoppingContext(
            new CreditCardStrategy(
                    "Martin",
                    "4111 1111 1111 1111",
                    "123",
                    "11/28"
            )
        );
        context2.executeStrategy(76);
    }

}

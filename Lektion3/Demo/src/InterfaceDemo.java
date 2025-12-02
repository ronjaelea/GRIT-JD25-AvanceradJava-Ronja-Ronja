public class InterfaceDemo {

    public static void Demo() {
        PaymentService paymentService = new SwishPaymentService();
        paymentService.pay();

        handlePayment(paymentService);
        handlePayment(new CardPaymentService());

        // Skapa ett anonymt objekt
        PaymentService invoiceService = new PaymentService() {
            @Override
            public void pay() {
                System.out.println("Paying by Invoice");
            }
        };
        invoiceService.pay();
        handlePayment(invoiceService);
    }

    private static void handlePayment(PaymentService paymentService){
        paymentService.pay();
    }

}

interface PaymentService {
    void pay();
}

class CardPaymentService implements PaymentService {
    @Override
    public void pay() {
        System.out.println("Paying with card");
    }
}

class SwishPaymentService implements PaymentService {
    @Override
    public void pay() {
        System.out.println("Paying using Swish");
    }
}
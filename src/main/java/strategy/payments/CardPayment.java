package strategy.payments;

public class CardPayment implements PaymentStrategy {
    @Override
    public boolean processPayment(double amount) {
        System.out.println("Processing card payment: $" + amount);
        System.out.println("Forwarding payment to card processor...");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Payment processed successfully!");
        return true;
    }
}

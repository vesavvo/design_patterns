package strategy.payments;

public class GiftCardPayment implements PaymentStrategy {
    @Override
    public boolean processPayment(double amount) {
        System.out.println("Processing gift card payment: $" + amount);
        System.out.println("Enter gift card code:");
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        String code = scanner.nextLine();
        System.out.println("Validating gift card...");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Gift card balance deducted successfully!");
        return true;
    }
}

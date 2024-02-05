package strategy.payments;

public class CashPayment implements PaymentStrategy {
    @Override
    public boolean processPayment(double amount) {
        System.out.println("Processing cash payment: $" + amount);
        System.out.println("Enter amount of cash:");
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        double cash = scanner.nextDouble();
        if (cash < amount) {
            System.out.println("Insufficient cash!");
            return false;
        }
        System.out.println("Your change: $" + (cash - amount));
        return true;
    }
}

package strategy.payments;

public interface PaymentStrategy {
    boolean processPayment(double amount);
}

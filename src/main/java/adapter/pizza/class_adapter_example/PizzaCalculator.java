package adapter.pizza.class_adapter_example;

public interface PizzaCalculator {
    double calculatePricePerSquareMeter(double firstSideLengthInCm, double secondSideLengthInCm, double priceInEuros);
    double calculatePricePerSquareMeter(double diameterInCm, double priceInEuros);
}

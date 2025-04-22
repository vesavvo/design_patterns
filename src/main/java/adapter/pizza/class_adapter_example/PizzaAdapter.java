package adapter.pizza.class_adapter_example;

public class PizzaAdapter extends adapter.pizza.calculator.PizzaCalculator implements PizzaCalculator {
    @Override
    public double calculatePricePerSquareMeter(double firstSideLengthInCm, double secondSideLengthInCm, double priceInEuros) {
        double radiusEquivalent = Math.sqrt(firstSideLengthInCm * secondSideLengthInCm / Math.PI);
        double diameterEquivalent = 2 * radiusEquivalent;
        return super.calculatePricePerSquareMeter(diameterEquivalent, priceInEuros);
    }

    // no need to override round pizza method
}

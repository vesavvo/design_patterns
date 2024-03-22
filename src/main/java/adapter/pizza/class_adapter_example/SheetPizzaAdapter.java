package adapter.pizza.class_adapter_example;

import adapter.pizza.calculator.PizzaCalculator;

public class SheetPizzaAdapter extends PizzaCalculator implements SheetPizzaCalculator {
    @Override
    public double calculatePricePerSquareMeter(double firstSideLengthInCm, double secondSideLengthInCm, double priceInEuros) {
        double radiusEquivalent = Math.sqrt(firstSideLengthInCm * secondSideLengthInCm / Math.PI);
        double diameterEquivalent = 2 * radiusEquivalent;
        return super.calculatePricePerSquareMeter(diameterEquivalent, priceInEuros);
    }
}

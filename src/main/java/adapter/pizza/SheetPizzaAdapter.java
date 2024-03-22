package adapter.pizza;

import adapter.pizza.calculator.PizzaCalculator;

public class SheetPizzaAdapter implements SheetPizzaCalculator {
    private PizzaCalculator calculator;

    public SheetPizzaAdapter() {
        this.calculator = new PizzaCalculator();
    }

    @Override
    public double calculatePricePerSquareMeter(double firstSideLengthInCm, double secondSideLengthInCm, double priceInEuros) {
        double radiusEquivalent = Math.sqrt(firstSideLengthInCm * secondSideLengthInCm / Math.PI);
        double diameterEquivalent = 2 * radiusEquivalent;
        return calculator.calculatePricePerSquareMeter(diameterEquivalent, priceInEuros);
    }
}

package adapter.pizza.object_adapter_example;

import adapter.pizza.calculator.PizzaCalculator;

public class SheetPizzaAdapter implements SheetPizzaCalculator {
    private PizzaCalculator calculator;

    public SheetPizzaAdapter(PizzaCalculator calculator) {
        this.calculator = calculator;
    }

    @Override
    public double calculatePricePerSquareMeter(double firstSideLengthInCm, double secondSideLengthInCm, double priceInEuros) {
        double radiusEquivalent = Math.sqrt(firstSideLengthInCm * secondSideLengthInCm / Math.PI);
        double diameterEquivalent = 2 * radiusEquivalent;
        return calculator.calculatePricePerSquareMeter(diameterEquivalent, priceInEuros);
    }
}

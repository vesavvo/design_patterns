package adapter.pizza.object_adapter_example;

public class PizzaAdapter implements PizzaCalculator {
    private adapter.pizza.calculator.PizzaCalculator calculator;

    public PizzaAdapter(adapter.pizza.calculator.PizzaCalculator calculator) {
        this.calculator = calculator;
    }

    @Override
    public double calculatePricePerSquareMeter(double firstSideLengthInCm, double secondSideLengthInCm, double priceInEuros) {
        double radiusEquivalent = Math.sqrt(firstSideLengthInCm * secondSideLengthInCm / Math.PI);
        double diameterEquivalent = 2 * radiusEquivalent;
        return calculator.calculatePricePerSquareMeter(diameterEquivalent, priceInEuros);
    }

    @Override
    public double calculatePricePerSquareMeter(double diameterInCm, double priceInEuros) {
        return calculator.calculatePricePerSquareMeter(diameterInCm, priceInEuros);
    }
}

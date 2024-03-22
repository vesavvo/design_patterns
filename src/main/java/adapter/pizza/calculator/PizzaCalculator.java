package adapter.pizza.calculator;

public class PizzaCalculator {
    public double calculatePricePerSquareMeter(double diameterInCm, double priceInEuros) {
        double radiusInMeters = diameterInCm / 100.0 / 2.0;
        double areaInSquareMeters = Math.PI * Math.pow(radiusInMeters, 2);
        return priceInEuros / areaInSquareMeters;
    }
}


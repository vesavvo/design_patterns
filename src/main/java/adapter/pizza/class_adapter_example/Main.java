package adapter.pizza.class_adapter_example;

import adapter.pizza.calculator.PizzaCalculator;

public class Main {

    public static void main(String[] args) {
        PizzaCalculator calculator = new PizzaCalculator();
        SheetPizzaCalculator sheetCalculator = new SheetPizzaAdapter();

        // Use the calculator directly for a round pizza
        double price1 = calculator.calculatePricePerSquareMeter(30, 12);
        System.out.println(price1);

        // Use the adapter for a sheet (rectangular) pizza
        double price2 = sheetCalculator.calculatePricePerSquareMeter(37, 17, 13);
        System.out.println(price2);
    }
}

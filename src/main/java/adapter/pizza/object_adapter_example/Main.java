package adapter.pizza.object_adapter_example;

import adapter.pizza.calculator.PizzaCalculator;

public class Main {

    public static void main(String[] args) {
        PizzaCalculator calculator = new PizzaCalculator();
        SheetPizzaCalculator sheetCalculator = new SheetPizzaAdapter(calculator);

        // round pizza -- use the calculator directly
        double price1 = calculator.calculatePricePerSquareMeter(30, 12);
        System.out.println(price1);

        // sheet pizza -- use via the adapter
        double price2 = sheetCalculator.calculatePricePerSquareMeter(37, 17, 13);
        System.out.println(price2);
    }
}

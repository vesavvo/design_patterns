package adapter.pizza.class_adapter_example;

public class Main {

    public static void main(String[] args) {
        adapter.pizza.calculator.PizzaCalculator calculator = new adapter.pizza.calculator.PizzaCalculator();
        PizzaCalculator adapter = new PizzaAdapter();

        // Use the calculator directly for a round pizza
        double price1 = calculator.calculatePricePerSquareMeter(30, 12);
        System.out.println(price1);

        // ... or via the adapter
        double price1ViaAdapter = adapter.calculatePricePerSquareMeter(30, 12);
        System.out.println(price1ViaAdapter);

        // Use the adapter for a sheet (rectangular) pizza
        double price2 = adapter.calculatePricePerSquareMeter(37, 17, 13);
        System.out.println(price2);
    }
}

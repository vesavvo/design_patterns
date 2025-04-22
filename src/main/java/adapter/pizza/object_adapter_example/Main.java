package adapter.pizza.object_adapter_example;

public class Main {

    public static void main(String[] args) {
        adapter.pizza.calculator.PizzaCalculator calculator = new adapter.pizza.calculator.PizzaCalculator();
        PizzaCalculator adapter = new PizzaAdapter(calculator);

        // round pizza -- use the calculator directly
        double price1 = calculator.calculatePricePerSquareMeter(30, 12);
        System.out.println(price1);

        // ... or via the adapter
        double price1ViaAdapter = adapter.calculatePricePerSquareMeter(30, 12);
        System.out.println(price1ViaAdapter);

        // sheet pizza -- use via the adapter
        double price2 = adapter.calculatePricePerSquareMeter(37, 17, 13);
        System.out.println(price2);
    }
}

package template_method.coffee;

public class Main {
    public static void main(String[] args) {
        System.out.println("Espresso:");
        CoffeeRecipe espresso = new EspressoRecipe();
        espresso.makeCoffee();

        System.out.println("\nLatte:");
        CoffeeRecipe latte = new LatteRecipe();
        latte.makeCoffee();

        System.out.println("\nCappuccino:");
        CoffeeRecipe cappuccino = new CappuccinoRecipe();
        cappuccino.makeCoffee();
    }
}

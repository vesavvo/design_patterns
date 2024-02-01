package template_method.coffee;

public class LatteRecipe extends CoffeeRecipe {
    @Override
    public void addIngredients() {
        System.out.println("Add milk and sugar to prepare a latte");
    }

    @Override
    public void pourInCup() {
        // Latte is served in a large cup
        System.out.println("Prepared latte is poured into a large cup");
    }
}

package template_method.coffee;

public class EspressoRecipe extends CoffeeRecipe {
    @Override
    public void addIngredients() {
        // Espresso typically served without additives
        System.out.println("Espresso is prepared without additives");
    }

    @Override
    public void pourInCup() {
        // Espresso is served in a small cup
        System.out.println("Prepared espresso is poured into a small cup");
    }

    @Override
    public void serveCoffee() {
        System.out.println("Serving espresso");
        serveWithChocolate();
    }

    private void serveWithChocolate() {
        System.out.println("Serving chocolate with espresso");
    }
}

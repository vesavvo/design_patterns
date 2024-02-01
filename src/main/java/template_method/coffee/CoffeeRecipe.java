package template_method.coffee;

public abstract class CoffeeRecipe {
    // Template Method
    public final void makeCoffee() {
        boilWater();
        addCoffee();
        pourInCup();
        addIngredients(); // Abstract method to be implemented by subclasses as needed
        serveCoffee();
    }

    // Default implementation for boiling water
    public void boilWater() {
        System.out.println("Boiling water");
    }

    // Default implementation for adding coffee to water
    public void addCoffee() {
        System.out.println("Adding coffee to water");
    }

    // Default implementation for pouring coffee into a cup
    public void pourInCup() {
        System.out.println("Pouring prepared coffee into a cup");
    }

    // Abstract method for adding ingredients (milk, sugar, etc.)
    public abstract void addIngredients();

    // Default implementation for serving coffee
    public void serveCoffee() {
        System.out.println("Serving coffee");
    }
}

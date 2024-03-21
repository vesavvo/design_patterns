package builder.burgers;

public class CheeseburgerBuilder implements BurgerBuilder {

    private Burger burger;

    public CheeseburgerBuilder() {
        this.burger = new Burger();
    }

    @Override
    public void addBun() {
        burger.addIngredient(new Ingredient("Layer of bun"));
    }

    @Override
    public void addPatty() {
        burger.addIngredient(new Ingredient("Beef Steak"));
    }

    @Override
    public void addCheese() {
        burger.addIngredient(new Ingredient("Cheese"));
    }

    @Override
    public void addSauce() {
        burger.addIngredient(new Ingredient("Ketchup"));
        burger.addIngredient(new Ingredient("Mayonnaise"));
    }

    @Override
    public void addVegetables() {
        burger.addIngredient(new Ingredient("Lettuce"));
        burger.addIngredient(new Ingredient("Tomato"));
    }

    public Burger getBurger() {
        return burger;
    }
}

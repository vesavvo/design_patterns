package builder.burgers;

public class VeggieburgerBuilder implements BurgerBuilder {

    private Burger burger;

    public VeggieburgerBuilder() {
        burger = new Burger();
    }

    public void addBun() {
        burger.addIngredient(new Ingredient("Layer of whole wheat bun"));
    }

    public void addPatty() {
        burger.addIngredient(new Ingredient("Veggie patty"));
    }

    public void addCheese() {
        burger.addIngredient(new Ingredient("Vegan cheese"));
    }

    public void addSauce() {
        burger.addIngredient(new Ingredient("Vegan mayo"));
    }

    public void addVegetables() {
        burger.addIngredient(new Ingredient("Lettuce"));
        burger.addIngredient(new Ingredient("Tomato"));
        burger.addIngredient(new Ingredient("Onion"));
    }

    public Burger getBurger() {
        return burger;
    }
}

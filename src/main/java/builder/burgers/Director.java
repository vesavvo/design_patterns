package builder.burgers;

public class Director {

    private BurgerBuilder builder;

    public Director(BurgerBuilder builder) {
        this.builder = builder;
    }

    public void constructSimpleBurger() {
        builder.addBun();
        builder.addPatty();
        builder.addCheese();
        builder.addSauce();
        builder.addVegetables();
        builder.addBun();
    }

    public void constructDoubleBurger() {
        builder.addBun();
        builder.addPatty();
        builder.addCheese();
        builder.addBun();
        builder.addPatty();
        builder.addCheese();
        builder.addSauce();
        builder.addVegetables();
        builder.addBun();
    }
}

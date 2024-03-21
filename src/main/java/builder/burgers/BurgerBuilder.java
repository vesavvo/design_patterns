package builder.burgers;

public interface BurgerBuilder {
    void addBun();
    void addPatty();
    void addCheese();
    void addSauce();
    void addVegetables();
    Burger getBurger();
}

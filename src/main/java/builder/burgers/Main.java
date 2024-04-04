package builder.burgers;

public class Main {

    public static void main(String[] args) {
        BurgerBuilder builder = new CheeseburgerBuilder();
        Director director = new Director(builder);
        director.constructSimpleBurger();
        Burger meal = builder.getBurger();
        System.out.println(meal);
    }
}

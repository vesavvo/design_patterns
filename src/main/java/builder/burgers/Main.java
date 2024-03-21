package builder.burgers;

public class Main {

    public static void main(String[] args) {
        BurgerBuilder builder = new VeggieburgerBuilder();
        Director director = new Director(builder);
        director.constructDoubleBurger();
        Burger meal = builder.getBurger();
        System.out.println(meal);
    }
}

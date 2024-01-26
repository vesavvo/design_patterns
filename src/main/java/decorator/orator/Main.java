package decorator.orator;

public class Main {
    public static void main(String[] args) {

        Orator orator;

        // let a basic orator speak
        orator = new BasicOrator();
        orator.say("Hello World!");

        // let an orator with capitals speak
        orator = new CapitalsDecorator(orator);
        orator.say("Hello World!");

        // let an orator that speaks backwards, with capitals and with an introduction
        orator = new BackwardsDecorator(new CapitalsDecorator(new IntroDecorator(orator)));
        orator.say("Hello World!");
    }
}

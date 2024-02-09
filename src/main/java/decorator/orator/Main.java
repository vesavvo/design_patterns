package decorator.orator;

public class Main {
    public static void main(String[] args) {

        Orator orator;

        // let a basic orator speak
        orator = new BasicOrator();
        orator.say("Hello World!");

        // uncomment to create decorated orators

        // let a capitalizing orator speak
        orator = new CapitalizingDecorator(new BasicOrator());
        orator.say("Hello World!");

        // let an introducing, capitalizing and reversing orator speak
        orator = new ReversingDecorator(new CapitalizingDecorator(new IntroducingDecorator(new BasicOrator())));
        orator.say("Hello World!");

        // let an introducing and concluding orator speak
        orator = new ConcludingDecorator(new IntroducingDecorator(new BasicOrator()));
        orator.say("Hello World!");
    }
}

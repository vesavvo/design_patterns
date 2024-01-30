package decorator.orator;

public class ConcludingDecorator extends OratorDecorator {

    public ConcludingDecorator(Orator orator) {
        super(orator);
    }

    @Override
    public void say(String message) {
        super.say(message);
        System.out.println("That's all folks!");
    }
}

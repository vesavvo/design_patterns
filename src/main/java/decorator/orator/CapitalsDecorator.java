package decorator.orator;

public class CapitalsDecorator extends OratorDecorator {

    public CapitalsDecorator(Orator orator) {
        super(orator);
    }

    @Override
    public void say(String message) {
        super.say(message.toUpperCase());
    }
}

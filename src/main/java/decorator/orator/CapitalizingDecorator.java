package decorator.orator;

public class CapitalizingDecorator extends OratorDecorator {

    public CapitalizingDecorator(Orator orator) {
        super(orator);
    }

    @Override
    public void say(String message) {
        super.say(message.toUpperCase());
    }
}

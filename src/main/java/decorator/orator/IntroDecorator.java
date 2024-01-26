package decorator.orator;

public class IntroDecorator extends OratorDecorator {

    public IntroDecorator(Orator orator) {
        super(orator);
    }

    @Override
    public void say(String message) {
        System.out.println("Dear user, an important message follows:");
        super.say(message);
    }
}

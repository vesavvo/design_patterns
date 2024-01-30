package decorator.orator;

public class IntroducingDecorator extends OratorDecorator {

    public IntroducingDecorator(Orator orator) {
        super(orator);
    }

    @Override
    public void say(String message) {
        System.out.println("Dear user, an important message follows:");
        super.say(message);
    }
}

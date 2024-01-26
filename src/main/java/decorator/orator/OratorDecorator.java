package decorator.orator;

public class OratorDecorator implements Orator {
    // Reference to the object being decorated
    private Orator orator;

    public OratorDecorator(Orator orator) {
        this.orator = orator;
    }

    @Override
    public void say(String message) {
        orator.say(message);
    }
}

package factory_method.adventure_single_factory;

public class Main {

    public static void main(String[] args) {
        Game game = new Game(GameType.RELAXED);
        game.play();
    }
}

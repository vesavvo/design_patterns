package factory_method.adventure;

public class Main {

    public static void main(String[] args) {
        Game game = new HorrorGame();
        game.play();
    }
}

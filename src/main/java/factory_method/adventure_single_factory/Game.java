package factory_method.adventure_single_factory;

import java.util.Scanner;

public class Game {

    private GameType gameType;

    public Game(GameType gameType) {
        this.gameType = gameType;
    }

    public void play() {
        Scanner sc = new Scanner(System.in);
        Room room;
        do {
            room = createRoom();
            room.enter();
            System.out.println("Press enter to move to the next room ('q' to quit).");
        } while (!sc.nextLine().equals("q"));
    }

    public Room createRoom() {
        switch (gameType) {
            case HORROR:
                return new ScaryRoom();
            case RELAXED:
                return new LovelyRoom();
            default:
                throw new IllegalArgumentException("Unknown game type: " + gameType);
        }
    }
}

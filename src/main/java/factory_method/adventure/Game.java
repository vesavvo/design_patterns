package factory_method.adventure;

import java.util.Scanner;

public abstract class Game {

    public void play() {
        Scanner sc = new Scanner(System.in);
        Room room;
        do {
            room = createRoom();
            room.enter();
            System.out.println("Press enter to move to the next room ('q' to quit).");
        } while (!sc.nextLine().equals("q"));
    }

    public abstract Room createRoom();
}

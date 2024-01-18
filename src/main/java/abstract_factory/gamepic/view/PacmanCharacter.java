package abstract_factory.gamepic.view;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.Image;

public class PacmanCharacter implements Character {

    //Image pacmanImage = new Image("C:\\Users\\olliv\\Desktop\\pacman.PNG");
    Image pacmanImage = new Image("pacman.PNG");
    @Override
    public void display(GraphicsContext gc, int x, int y) {
        gc.drawImage(pacmanImage, x, y, 50,50);
    }
}

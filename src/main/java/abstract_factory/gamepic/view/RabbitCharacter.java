package abstract_factory.gamepic.view;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.Image;

public class RabbitCharacter implements Character {

    Image rabbitImage = new Image("rabbit.PNG");

    @Override
    public void display(GraphicsContext gc, int x, int y) {
        gc.drawImage(rabbitImage, x, y, 100,120);
    }
}

package abstract_factory.gamepic.view;

import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;

public interface GuiPartFactory {

    GraphicsContext createGraphicsContext(Canvas canvas);
    Character createCharacter();

    Canvas createCanvas();

    Food createFood();

}

package abstract_factory.gamepic.view;

import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class PacmanPicGuiPartFactory implements GuiPartFactory {

    public GraphicsContext createGraphicsContext(Canvas canvas) {
        GraphicsContext gc = canvas.getGraphicsContext2D();
        gc.setFill(Color.rgb(15,15,15));
        gc.fillRect(0, 0, gc.getCanvas().getWidth(), gc.getCanvas().getHeight());
        return gc;
    }

    public Canvas createCanvas() {
        Canvas canvas = new Canvas(700, 1000);
        return canvas;
    }


    @Override
    public Character createCharacter() {
        return new PacmanCharacter();
    }

    @Override
    public Food createFood() {
        return new PacmanFood();
    }
}

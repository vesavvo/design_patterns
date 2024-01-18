package abstract_factory.gamepic.view;

import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;

public class RabbitPicGuiPartFactory implements GuiPartFactory {


    @Override
    public GraphicsContext createGraphicsContext(Canvas canvas) {
        GraphicsContext gc = canvas.getGraphicsContext2D();
        return gc;
    }

    public Canvas createCanvas() {
        Canvas canvas = new Canvas(600, 600);
        return canvas;
    }

    @Override
    public Character createCharacter() {
        return new RabbitCharacter();
    }

    @Override
    public Food createFood() {
        return new RabbitFood();
    }
}

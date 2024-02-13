package memento.guistate;

import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

public class ColorBox {

    private int id;
    private Controller controller;

    private Rectangle rectangle;
    private Color[] colors = {Color.RED, Color.BLUE, Color.YELLOW};
    private int colorIndex = 0;

    public ColorBox(int id, Controller controller) {

        rectangle = new Rectangle(100, 100);
        rectangle.setFill(colors[colorIndex]);

        rectangle.setOnMouseClicked(event -> {
            changeColor();
            controller.setOption(id, colorIndex);
        });
    }

    public Rectangle getRectangle() {
        return rectangle;
    }

    private void changeColor() {
        colorIndex = (colorIndex + 1) % colors.length;
        rectangle.setFill(colors[colorIndex]);
    }

    public void setColor(int colorIndex) {
        this.colorIndex = colorIndex;
        rectangle.setFill(colors[colorIndex]);
    }

}

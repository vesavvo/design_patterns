package abstract_factory.gamepic.view;

import javafx.scene.canvas.GraphicsContext;

public interface Character {

    public void display(GraphicsContext gc, int x, int y);
}

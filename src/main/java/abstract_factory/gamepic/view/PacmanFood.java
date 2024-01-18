package abstract_factory.gamepic.view;

import javafx.scene.canvas.GraphicsContext;

public class PacmanFood implements Food {

        public void display(GraphicsContext gc, int number) {
            gc.setFill(javafx.scene.paint.Color.YELLOW);
            int x = 200;
            int y = 110;
            for (int i = 1; i<=number; i++) {
                gc.fillOval(x,y,20, 20);
                x+=60;
                if (x>gc.getCanvas().getWidth()-100) {
                    x=200;
                    y+=60;
                }
            }
        }
}

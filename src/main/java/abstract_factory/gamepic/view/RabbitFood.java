package abstract_factory.gamepic.view;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.Image;

public class RabbitFood implements Food {

    Image foodImage = new Image("carrot.PNG");

        public void display(GraphicsContext gc, int number) {
            for (int i = 1; i<=number; i++) {

                double x = 200+(Math.random() * (gc.getCanvas().getWidth()-250));
                double y = Math.random() * (gc.getCanvas().getHeight()-50);

                gc.drawImage(foodImage, x, y, 25,25);
            }
        }
}

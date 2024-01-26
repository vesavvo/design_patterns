package abstract_factory.gamepic.view;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Gui extends Application {

    private GraphicsContext gc;

    public void start(Stage window) {

        GuiPartFactory factory = new RabbitPicGuiPartFactory();
        //GuiPartFactory factory = new PacmanPicGuiPartFactory();

        Canvas canvas = factory.createCanvas();
        GraphicsContext gc = factory.createGraphicsContext(canvas);

        StackPane root = new StackPane(canvas);
        Scene scene = new Scene(root);

        Character character = factory.createCharacter();
        character.display(gc, 100, 100);

        Food food = factory.createFood();
        food.display(gc,100);

        window.setScene(scene);
        window.setTitle("Game Pic");
        window.setMinWidth(canvas.getWidth());
        window.setMinHeight(canvas.getHeight());

        window.show();

    }
}

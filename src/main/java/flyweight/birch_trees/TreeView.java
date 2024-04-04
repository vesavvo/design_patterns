package flyweight.birch_trees;

import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.Image;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javafx.util.Duration;
import javafx.scene.Scene;

import java.util.Random;

public class TreeView extends Application {
    private static final int TREE_SIZE = 80;
    private TreeController controller = new TreeController();
    private final int CANVAS_WIDTH = controller.getGridWidth() * TREE_SIZE;
    private final int CANVAS_HEIGHT = controller.getGridHeight() * TREE_SIZE;
    private Canvas canvas = new Canvas(CANVAS_WIDTH, CANVAS_HEIGHT);
    private GraphicsContext gc = canvas.getGraphicsContext2D();

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Flyweight Tree Demo");

        Timeline timeline = new Timeline(new KeyFrame(Duration.seconds(1), e -> {
            if (controller.getLeafyTreeCount() < controller.getGridWidth() * controller.getGridHeight()) {
                boolean treeMadeLeafy = false;
                while (!treeMadeLeafy) {
                    int row = new Random().nextInt(controller.getGridHeight());
                    int col = new Random().nextInt(controller.getGridWidth());
                    if (!controller.isTreeLeafy(row, col)) {
                        controller.makeTreeLeafy(row, col);
                        treeMadeLeafy = true;
                    }
                }
                drawTrees();
            }
        }));

        timeline.setCycleCount(Timeline.INDEFINITE);
        timeline.play();

        StackPane root = new StackPane();
        root.getChildren().add(canvas);
        primaryStage.setScene(new Scene(root));
        primaryStage.show();

        drawTrees();
    }

    private void drawTrees() {
        gc.clearRect(0, 0, CANVAS_WIDTH, CANVAS_HEIGHT);
        for (int i = 0; i < controller.getGridHeight(); i++) {
            for (int j = 0; j < controller.getGridWidth(); j++) {
                Image imageToDraw = controller.getTreeImage(i, j);
                gc.drawImage(imageToDraw, j * TREE_SIZE, i * TREE_SIZE, TREE_SIZE, TREE_SIZE);
            }
        }
    }

    public static void main(String[] args) {
        launch(args);
    }
}

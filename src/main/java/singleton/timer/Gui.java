package singleton.timer;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Gui extends Application {


    @Override
    public void start(Stage primaryStage) throws Exception {

        // Would fail because constructor is private:
        //Timer t = new Timer();

        Timer.getInstance().reset();

        // open three windows
        for (int i = 0; i < 3; i++) {
            openWindow("Window " + (i + 1));
        }
    }

    private void openWindow(String windowName) {
        Stage stage = new Stage();
        stage.setTitle(windowName);

        Label label = new Label("Time: ");

        // get time button
        Button button = new Button("Get time");
        button.setOnAction(event -> {
            label.setText("Time: " + Timer.getInstance().getTime());
        });

        // reset time button
        Button button2 = new Button("Reset time");
        button2.setOnAction(event -> {
            Timer.getInstance().reset();
            label.setText("Time: " + Timer.getInstance().getTime());
        });

        VBox root = new VBox();
        root.getChildren().addAll(label, button, button2);
        Scene scene = new Scene(root, 300, 100);
        stage.setScene(scene);
        stage.show();
    }
}


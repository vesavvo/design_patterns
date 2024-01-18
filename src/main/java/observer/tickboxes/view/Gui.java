package observer.tickboxes.view;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.scene.Scene;
import javafx.scene.control.CheckBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import observer.tickboxes.model.*;


public class Gui extends Application {

    UserSelection userSelection = new UserSelection();

    @Override
    public void start(Stage primaryStage) {
        // Open windows simultaneously
        Platform.runLater(() -> openWindow("Window 1"));
        Platform.runLater(() -> openWindow("Window 2"));
        Platform.runLater(() -> openWindow("Window 3"));
    }

    private void openWindow(String windowName) {
        Stage stage = new ObservingStage(userSelection);
        stage.setTitle(windowName);

        //userSelection.addObserver((Observer) stage);

        CheckBox checkBox = new CheckBox("Toggle me");
        checkBox.setId("checkbox");

        checkBox.setOnAction(event -> {
            System.out.println(windowName + " - Checkbox state: " + checkBox.isSelected());
            userSelection.setSelected(checkBox.isSelected());
        });

        VBox root = new VBox(checkBox);
        Scene scene = new Scene(root, 300, 100);

        stage.setScene(scene);
        stage.show();
    }
}

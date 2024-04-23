package command.theater;

import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class StatusWindow {
    private Rectangle lightStatusIndicator;
    private Rectangle curtainStatusIndicator;
    private Label lightStatusLabel;
    private Label curtainStatusLabel;

    public StatusWindow() {
        Stage stage = new Stage();

        lightStatusIndicator = new Rectangle(100, 50);
        lightStatusIndicator.setFill(Color.BLACK);
        lightStatusLabel = new Label("OFF");

        curtainStatusIndicator = new Rectangle(100, 50);
        curtainStatusIndicator.setFill(Color.BLACK);
        curtainStatusLabel = new Label("LOWERED");

        HBox lightStatusBox = new HBox(10, lightStatusIndicator, lightStatusLabel);
        HBox curtainStatusBox = new HBox(10, curtainStatusIndicator, curtainStatusLabel);

        VBox layout = new VBox(10);
        layout.getChildren().addAll(lightStatusBox, curtainStatusBox);

        Scene scene = new Scene(layout, 260, 130);
        stage.setScene(scene);
        stage.setTitle("Status Window");
        stage.show();
    }

    public void updateLightStatus(boolean isOn) {
        if (isOn) {
            lightStatusIndicator.setFill(Color.YELLOW);
            lightStatusLabel.setText("ON");
        } else {
            lightStatusIndicator.setFill(Color.BLACK);
            lightStatusLabel.setText("OFF");
        }
    }

    public void updateCurtainStatus(boolean isRaised) {
        if (isRaised) {
            curtainStatusIndicator.setFill(Color.WHITE);
            curtainStatusLabel.setText("RAISED");
        } else {
            curtainStatusIndicator.setFill(Color.BLACK);
            curtainStatusLabel.setText("LOWERED");
        }
    }
}

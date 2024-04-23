package command.theater;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class GUI extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        StatusWindow statusWindow = new StatusWindow();
        LightSystem lightSystem = new LightSystem(statusWindow);
        CurtainSystem curtainSystem = new CurtainSystem(statusWindow);

        Command lightsOn = new LightsOnCommand(lightSystem);
        Command lightsOff = new LightsOffCommand(lightSystem);
        Command curtainUp = new RaiseCurtainCommand(curtainSystem);
        Command curtainDown = new LowerCurtainCommand(curtainSystem);

        ControlPanel controlPanel = new ControlPanel(lightsOn, lightsOff, curtainUp, curtainDown);
        WallPanel wallPanel = new WallPanel(lightsOn, lightsOff);

        // ControlPanelWindow, buttons for lights and curtain control
        VBox controlLayout = new VBox(10);
        Button btnLightsOn = new Button("Turn Lights On");
        btnLightsOn.setOnAction(e -> controlPanel.switchLightsOn());
        Button btnLightsOff = new Button("Turn Lights Off");
        btnLightsOff.setOnAction(e -> controlPanel.switchLightsOff());
        Button btnCurtainUp = new Button("Raise Curtain");
        btnCurtainUp.setOnAction(e -> controlPanel.raiseCurtain());
        Button btnCurtainDown = new Button("Lower Curtain");
        btnCurtainDown.setOnAction(e -> controlPanel.lowerCurtain());
        controlLayout.getChildren().addAll(btnLightsOn, btnLightsOff, btnCurtainUp, btnCurtainDown);

        Scene controlScene = new Scene(controlLayout, 300, 200);
        Stage controlStage = new Stage();
        controlStage.setTitle("Control Panel");
        controlStage.setScene(controlScene);
        controlStage.show();

        // WallPanelWindow, just two buttons for lights on and off
        VBox wallLayout = new VBox(10);
        Button wallBtnLightsOn = new Button("Turn Lights On");
        wallBtnLightsOn.setOnAction(e -> wallPanel.switchLightsOn());
        Button wallBtnLightsOff = new Button("Turn Lights Off");
        wallBtnLightsOff.setOnAction(e -> wallPanel.switchLightsOff());
        wallLayout.getChildren().addAll(wallBtnLightsOn, wallBtnLightsOff);

        Scene wallScene = new Scene(wallLayout, 300, 200);
        Stage wallStage = new Stage();
        wallStage.setTitle("Wall Panel");
        wallStage.setScene(wallScene);
        wallStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}

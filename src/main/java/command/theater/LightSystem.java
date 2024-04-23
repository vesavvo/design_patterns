package command.theater;

public class LightSystem {
    private StatusWindow statusWindow;

    public LightSystem(StatusWindow statusWindow) {
        this.statusWindow = statusWindow;
    }

    public void on() {
        System.out.println("Lights are ON");
        statusWindow.updateLightStatus(true);
    }

    public void off() {
        System.out.println("Lights are OFF");
        statusWindow.updateLightStatus(false);
    }
}
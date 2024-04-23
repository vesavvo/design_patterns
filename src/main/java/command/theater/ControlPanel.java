package command.theater;

public class ControlPanel {
    private Command lightsOn;
    private Command lightsOff;
    private Command curtainUp;
    private Command curtainDown;

    public ControlPanel(Command lightsOn, Command lightsOff, Command curtainUp, Command curtainDown) {
        this.lightsOn = lightsOn;
        this.lightsOff = lightsOff;
        this.curtainUp = curtainUp;
        this.curtainDown = curtainDown;
    }

    public void switchLightsOn() {
        lightsOn.execute();
    }

    public void switchLightsOff() {
        lightsOff.execute();
    }

    public void raiseCurtain() {
        curtainUp.execute();
    }

    public void lowerCurtain() {
        curtainDown.execute();
    }
}

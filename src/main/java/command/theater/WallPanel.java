package command.theater;

public class WallPanel {
    private Command lightsOn;
    private Command lightsOff;

    public WallPanel(Command lightsOn, Command lightsOff) {
        this.lightsOn = lightsOn;
        this.lightsOff = lightsOff;
    }

    public void switchLightsOn() {
        lightsOn.execute();
    }

    public void switchLightsOff() {
        lightsOff.execute();
    }
}

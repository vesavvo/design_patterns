package command.theater;

public class LightsOffCommand implements Command {
    private LightSystem light;

    public LightsOffCommand(LightSystem light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.off();
    }
}
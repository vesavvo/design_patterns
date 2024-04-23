package command.theater;

public class RaiseCurtainCommand implements Command {
    private CurtainSystem curtain;

    public RaiseCurtainCommand(CurtainSystem curtain) {
        this.curtain = curtain;
    }

    @Override
    public void execute() {
        curtain.raise();
    }
}
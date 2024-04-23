package command.theater;

public class LowerCurtainCommand implements Command {
    private CurtainSystem curtain;

    public LowerCurtainCommand(CurtainSystem curtain) {
        this.curtain = curtain;
    }

    @Override
    public void execute() {
        curtain.lower();
    }
}
package command.theater;

public class CurtainSystem {
    private StatusWindow statusWindow;

    public CurtainSystem(StatusWindow statusWindow) {
        this.statusWindow = statusWindow;
    }

    public void raise() {
        System.out.println("Curtain is RAISED");
        statusWindow.updateCurtainStatus(true);
    }

    public void lower() {
        System.out.println("Curtain is LOWERED");
        statusWindow.updateCurtainStatus(false);
    }
}
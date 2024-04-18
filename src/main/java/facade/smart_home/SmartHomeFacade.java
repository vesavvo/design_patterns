package facade.smart_home;

public class SmartHomeFacade {
    private Lights lights;
    private Heating heating;
    private SecuritySystem security;

    public SmartHomeFacade(Lights lights, Heating heating, SecuritySystem security) {
        this.lights = lights;
        this.heating = heating;
        this.security = security;
    }

    public void arriveHome() {
        System.out.println("Arriving home...");
        lights.turnOn();
        heating.heatOn();
        security.deactivate();
    }

    public void leaveHome() {
        System.out.println("Leaving home...");
        lights.turnOff();
        heating.heatOff();
        security.activate();
    }
}

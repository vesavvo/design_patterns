package mediator.atc;

public interface ATC {

    void registerRunway(Runway runway);
    void requestRunway(Aircraft aircraft);
    void acknowledge(String message);
    void tick();

}

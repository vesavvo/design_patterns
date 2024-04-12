package mediator.atc;

public class Main {

    public static void main(String[] args) {

        Tower tower = new Tower();
        tower.registerRunway(new Runway());
        tower.registerRunway(new Runway());

        Simulator simulator = new Simulator(tower);
        simulator.simulate();
    }
}

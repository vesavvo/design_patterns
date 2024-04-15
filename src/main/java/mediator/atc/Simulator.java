package mediator.atc;

public class Simulator {

    private static final int SIMULATION_TIME = 100;
    private static final double PROB_NEW_TAKEOFF = 0.2;
    private static final double PROB_NEW_LANDING = 0.2;

    private ATC tower;

    public Simulator(Tower tower) {
        this.tower = tower;
    }

    public void simulate() {
        for (int i = 0; i < SIMULATION_TIME; i++) {
            System.out.println("-----------------");
            System.out.println("TIME " + i);
            tower.tick();
            // generate new aircraft, amount follows a geometric distribution
            while (Math.random() < PROB_NEW_TAKEOFF) {
               new Airplane(Intention.TAKEOFF, tower);
            }
            while (Math.random() < PROB_NEW_LANDING) {
                new Airplane(Intention.LANDING, tower);
            }
        }

    }
}

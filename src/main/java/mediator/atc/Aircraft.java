package mediator.atc;

public abstract class Aircraft {

    private static int count = 0;
    private int id;
    private Intention intention;

    private ATC tower;

    public Aircraft(Intention intention, ATC tower) {
        this.id = ++count;
        this.intention = intention;
        this.tower = tower;

        tower.requestRunway(this);
    }

    public Intention getIntention() {
        return intention;
    }

    public void clearForTakeoff(Runway runway) {
        System.out.println(this + " receives takeoff clearance, " + runway);
        tower.acknowledge("Roger taking off from " + runway);
    }

    public void clearForLanding(Runway runway) {
        System.out.println(this + " receives landing clearance, " + runway);
        tower.acknowledge("Roger landing on " + runway);
    }

    public void holdPosition(Runway runway) {
        System.out.println(this + " receives request to hold position on " + runway);
        tower.acknowledge("Roger holding position on " + runway);
    }

    public String toString() {
        return getClass().getSimpleName() + " " + id + " (" + intention + ")";
    }
}

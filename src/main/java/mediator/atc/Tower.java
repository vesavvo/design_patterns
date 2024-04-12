package mediator.atc;

import java.util.ArrayList;
import java.util.List;

public class Tower implements ATC {

    private List<Runway> runways;

    public Tower() {
        this.runways = new ArrayList<>();
    }

    public void registerRunway(Runway runway) {
        runways.add(runway);
    }

    public void requestRunway(Aircraft aircraft) {
        System.out.println("Runway request from " + aircraft);
        Runway runway = selectRunway();
        boolean granted = runway.addAircraft(aircraft);
        if (granted) {
            if (aircraft.getIntention() == Intention.LANDING) {
                aircraft.clearForLanding(runway);
            }
            else if (aircraft.getIntention() == Intention.TAKEOFF) {
                aircraft.clearForTakeoff(runway);
            }
        }
        else {
            aircraft.holdPosition(runway);
        }
    }

    public Runway selectRunway() {

        // check if there is a runway with no aircraft
        for (Runway runway : runways) {
            if (runway.isVacant()) {
                return runway;
            }
        }

        // choose runway with the shortest queue
        Runway selectedRunway = runways.get(0);
        for (Runway runway : runways) {
            if (runway.getQueueSize() < selectedRunway.getQueueSize()) {
                selectedRunway = runway;
            }
        }
        return selectedRunway;
    }

    public void acknowledge(String message) {
        System.out.println("Tower received acknowledge message: " + message);
    }

    public void tick() {
        for (Runway runway : runways) {
            boolean isEmpty = runway.decreaseOccupiedTime();
            if (isEmpty) {
                Aircraft aircraft = runway.getWaitingAircraft();
                if (aircraft != null) {
                    runway.addAircraft(aircraft);
                    if (aircraft.getIntention() == Intention.LANDING) {
                        aircraft.clearForLanding(runway);
                    } else {
                        aircraft.clearForTakeoff(runway);
                    }
                }
            }
        }
    }
}

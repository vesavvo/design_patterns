package mediator.atc;

import java.util.ArrayList;
import java.util.List;

public class Runway {

    private final int OCCUPANCY_TIME = 5;
    private static int count = 0;
    private int id;
    private List<Aircraft> queue;

    private Aircraft currentAircraft = null;
    private int occupiedTimeLeft = 0;

    public Runway() {
        this.id = ++count;
        this.queue = new ArrayList<>();
    }

    public boolean addAircraft(Aircraft aircraft) {

        if (currentAircraft == null) {
            currentAircraft = aircraft;
            this.occupiedTimeLeft = OCCUPANCY_TIME;
            return true;
        }

        queue.add(aircraft);
        return false;
    }

    public Aircraft getWaitingAircraft() {
        if (queue.isEmpty())
            return null;
        return queue.remove(0);
    }

    public String toString() {
        return "Runway " + id;
    }

    public boolean isVacant() {
        return currentAircraft == null;
    }

    public int getQueueSize() {
        return queue.size();
    }

    public boolean decreaseOccupiedTime() {
        if (occupiedTimeLeft > 0) {
            occupiedTimeLeft--;
        }

        if (occupiedTimeLeft == 0) {
            currentAircraft = null;
            return true;
        }
        return false;
    }
}

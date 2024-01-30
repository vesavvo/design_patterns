package state.ticket_vending_machine;

import java.util.Scanner;

public abstract class State {
    private Machine machine;

    public State(Machine machine) {
        this.machine = machine;
    }

    public Machine getMachine() {
        return machine;
    }

    abstract void action();
}

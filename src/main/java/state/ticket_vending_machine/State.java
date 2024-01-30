package state.ticket_vending_machine;

import java.util.Scanner;

public abstract class State {

    static Scanner scanner = new Scanner(System.in);

    private Machine machine;

    public State(Machine machine) {
        this.machine = machine;
    }

    public Machine getMachine() {
        return machine;
    }

    public int readUserChoice(String[] options) {
        // print options
        System.out.println("\nSelect an option:");
        for (int i = 1; i <= options.length; i++) {
            System.out.println(i + ". " + options[i-1]);
        }

        // read user input
        int input = scanner.nextInt();
        return input;
    }

    abstract void action();
}

package state.ticket_vending_machine;

import java.util.Scanner;

public class Machine {
    private static Scanner scanner = new Scanner(System.in);
    private State state;
    private double balance = 0.0;

    public Machine() {
        state = new ReadyState(this);
    }

    public void operate() {
        while (true) {
            if (state == null) {
                // should never happen
                System.out.println("Machine out of order");
                return;
            }
            state.action();
        }
    }

    public void setState(State state) {
        this.state = state;
    }

    public void addBalance(double amount) {
        balance += amount;
        System.out.println("Balance: " + balance);
    }

    public double getBalance() {
        return balance;
    }

    public void clearBalance() {
        balance = 0.0;
        System.out.println("Balance cleared...");
    }

    public int readUserChoice(String[] options) {
        // print options
        System.out.println("\nSelect an option:");
        for (int i = 1; i <= options.length; i++) {
            System.out.println(i + ". " + options[i-1]);
        }
        // read user input
        return scanner.nextInt();
    }

    public void issueTickets() {
        System.out.println("Printing tickets...");
    }
}

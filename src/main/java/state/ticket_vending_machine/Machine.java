package state.ticket_vending_machine;

public class Machine {

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

    public void issueTickets() {
        System.out.println("Printing tickets...");
    }
}

package state.ticket_vending_machine;

public class ReadyState extends State {

    public ReadyState(Machine machine) {
        super(machine);
        this.getMachine().clearBalance();
    }

    public void action() {
        String[] options = {"Buy Tickets"};
        int choice = readUserChoice(options);
        switch (choice) {
            case 1:
                this.getMachine().setState(new TicketSelectionState(this.getMachine()));
                break;
        }
    }
}

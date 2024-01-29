package state.ticket_vending_machine;

public class ReadyState extends State {

    public ReadyState(Machine machine) {
        super(machine);
        this.getMachine().clearBalance();
    }

    public void userAction() {
        String[] options = {"Buy Tickets"};
        int action = readUserChoice(options);
        switch (action) {
            case 1:
                this.getMachine().setState(new TicketSelectionState(this.getMachine()));
                break;
        }
    }
}

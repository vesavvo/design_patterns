package state.ticket_vending_machine;

public class PrintingState extends State {

    public PrintingState(Machine machine) {
        super(machine);
    }

    public void action() {
        this.getMachine().issueTickets();
        this.getMachine().clearBalance();
        String[] options = {"Take the ticket" };
        switch (this.getMachine().readUserChoice(options)) {
            case 1:
                this.getMachine().setState(new ReadyState(this.getMachine()));
                break;
        }
    }
}

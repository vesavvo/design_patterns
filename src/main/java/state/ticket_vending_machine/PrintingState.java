package state.ticket_vending_machine;

public class PrintingState extends State {

    public PrintingState(Machine machine) {
        super(machine);
    }

    public void userAction() {
        getMachine().issueTickets();
        getMachine().clearBalance();
        String[] options = {"Take the ticket" };
        int action = readUserChoice(options);
        switch (action) {
            case 1:
                this.getMachine().setState(new ReadyState(this.getMachine()));
                break;
        }
    }
}

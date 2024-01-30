package state.ticket_vending_machine;

public class TicketSelectionState extends State {

    final double AB_TICKET_PRICE = 2.95;
    final double BC_TICKET_PRICE = 2.95;
    final double ABC_TICKET_PRICE = 4.1;


    public TicketSelectionState(Machine machine) {
        super(machine);
    }

    public void action() {

        String[] options = {"AB ticket", "ABC ticket", "BC ticket", "Pay", "Exit"};
        switch (this.getMachine().readUserChoice(options)) {
            case 1:
                System.out.println("+1 AB ticket selected");
                this.getMachine().addBalance(AB_TICKET_PRICE);
                break;
            case 2:
                System.out.println("+1 ABC ticket selected");
                this.getMachine().addBalance(ABC_TICKET_PRICE);
                break;
            case 3:
                System.out.println("+1 BC ticket selected");
                this.getMachine().addBalance(BC_TICKET_PRICE);
                break;
            case 4:
                this.getMachine().setState(new PaymentState(this.getMachine()));
                break;
            case 5:
                this.getMachine().setState(new ReadyState(this.getMachine()));
                break;
        }
    }
}

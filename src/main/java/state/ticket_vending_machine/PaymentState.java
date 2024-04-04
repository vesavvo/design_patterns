package state.ticket_vending_machine;

public class PaymentState extends State {

    public PaymentState(Machine machine) {
        super(machine);
    }

    public void action() {
        System.out.println("Outstanding balance: " + this.getMachine().getBalance());
        String[] options = {"Enter card", "Exit"};
        switch (this.getMachine().readUserChoice(options)) {
            case 1:
                this.getMachine().setState(new PrintingState(this.getMachine()));
                break;
            case 2:
                this.getMachine().setState(new ReadyState(this.getMachine()));
                break;
            }
    }
}

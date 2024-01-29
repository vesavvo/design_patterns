package state.ticket_vending_machine;

public class PaymentState extends State {

    public PaymentState(Machine machine) {
        super(machine);
    }

    public void userAction() {
        System.out.println("Outstanding balance: " + this.getMachine().getBalance());
        String[] options = {"Enter card", "Exit"};
        int action = readUserChoice(options);
        switch (action) {
            case 1:
                this.getMachine().setState(new PrintingState(this.getMachine()));
                break;
            case 2:
                this.getMachine().setState(new ReadyState(this.getMachine()));
                break;
        }
    }
}

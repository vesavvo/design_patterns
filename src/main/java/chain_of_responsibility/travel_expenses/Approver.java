package chain_of_responsibility.travel_expenses;

public class Approver {

    private Approver nextApprover;

    void process(ExpenseReport expenseReport) {
        if (nextApprover != null) {
            nextApprover.process(expenseReport);
        }
    }
    void setNextApprover(Approver nextApprover) {
        this.nextApprover = nextApprover;
    }

    Approver getNextApprover() {
        return nextApprover;
    }
}

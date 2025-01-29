package chain_of_responsibility.travel_expenses;

public class AutomaticApprover extends Approver {
    private static final double AUTOMATIC_APPROVAL_THRESHOLD = 100.0;

    @Override
    public void process(ExpenseReport expenseReport) {
        if (expenseReport.getExpenses() <= AUTOMATIC_APPROVAL_THRESHOLD) {
            System.out.println("AutomaticApprover: Expense report approved automatically.");
        } else {
            System.out.println("AutomaticApprover: Cannot approve. Sending to next approver.");
            super.process(expenseReport);
        }
    }
}

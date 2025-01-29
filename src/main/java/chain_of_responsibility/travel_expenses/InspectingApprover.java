package chain_of_responsibility.travel_expenses;

public class InspectingApprover extends Approver {
    private static final double INSPECTING_APPROVAL_THRESHOLD = 400.0;

    @Override
    public void process(ExpenseReport expenseReport) {
        if (expenseReport.getExpenses() <= INSPECTING_APPROVAL_THRESHOLD &&
                expenseReport.isPlanned()) {
            System.out.println("InspectingApprover: Expense report approved after detailed automatic review.");
        } else {
            System.out.println("InspectingApprover: Cannot approve. Sending to next approver.");
            super.process(expenseReport);
        }
    }
}

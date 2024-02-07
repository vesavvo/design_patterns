package chain_of_responsibility.travel_expenses;

public class ManualReviewApprover extends Approver {
    @Override
    public void process(ExpenseReport expenseReport) {
        System.out.println("ManualReviewApprover: Expense report sent for manual review.");
    }
}

package chain_of_responsibility.travel_expenses;

public class Main {

    public static void main(String[] args) {

        Approver automaticApprover = new AutomaticApprover();
        Approver inspectingApprover = new InspectingApprover();
        Approver manualReviewApprover = new ManualReviewApprover();
        automaticApprover.setNextApprover(inspectingApprover);
        inspectingApprover.setNextApprover(manualReviewApprover);

        ExpenseReport expenseReport = new ExpenseReport(50.0, true);
        automaticApprover.process(expenseReport);

        //expenseReport = new ExpenseReport(150.0, true);
        //automaticApprover.process(expenseReport);
    }
}

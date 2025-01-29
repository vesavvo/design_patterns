package chain_of_responsibility.travel_expenses;

public class Main {

    public static void main(String[] args) {

        Approver primaryApprover;

        Approver automaticApprover = new AutomaticApprover();
        Approver inspectingApprover = new InspectingApprover();
        Approver manualReviewApprover = new ManualReviewApprover();
        automaticApprover.setNextApprover(inspectingApprover);
        inspectingApprover.setNextApprover(manualReviewApprover);
        primaryApprover = automaticApprover;


        //ExpenseReport expenseReport = new ExpenseReport(50.0, false);
        //primaryApprover.process(expenseReport);

        ExpenseReport expenseReport = new ExpenseReport(15000.0, false);
        primaryApprover.process(expenseReport);
    }
}

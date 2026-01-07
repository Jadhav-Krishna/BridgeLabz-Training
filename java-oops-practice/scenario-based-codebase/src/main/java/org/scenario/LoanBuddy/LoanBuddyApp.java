package org.scenario.LoanBuddy;

public class LoanBuddyApp {

	public static void main(String[] args) {
        Applicant a1 = new Applicant("Rahul", 720, 60000, 500000);
        Applicant a2 = new Applicant("Kuch bhi", 680, 80000, 900000);

        LoanApplication loan = new HomeLoan(a1, 240);
		LoanApplication loan2 = new HomeLoan(a2, 350);

        if (loan.approveLoan()) {
            System.out.println("Loan Approved");
            System.out.println("Monthly EMI = " + loan.calculateEMI());
        } else {
            System.out.println("Loan Rejected");
        }
	}

}

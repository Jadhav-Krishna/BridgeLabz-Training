package org.scenario.LoanBuddy;

public class PersonalLoan extends LoanApplication{
    PersonalLoan(Applicant applicant, int term) {
        super(applicant, "PERSONALLOAN", term, 7.0);
    }

    public double calculateEMI() {
        interestRate = 12.6;
        return super.calculateEMI();
    }
}

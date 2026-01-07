package org.scenario.LoanBuddy;

public class EducationLoan extends LoanApplication{
    EducationLoan(Applicant applicant, int term) {
        super(applicant, "EDUCATIONLOAN", term, 7.0);
    }

    public double calculateEMI() {
        interestRate = 4.2;
        return super.calculateEMI();
    }
}

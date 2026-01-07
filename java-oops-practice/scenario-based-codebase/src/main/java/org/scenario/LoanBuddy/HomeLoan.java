package org.scenario.LoanBuddy;

class HomeLoan extends LoanApplication {

    HomeLoan(Applicant applicant, int term) {
        super(applicant, "HOMELOAN", term, 7.0);
    }

    public double calculateEMI() {
        interestRate = 6.5;
        return super.calculateEMI();
    }
}


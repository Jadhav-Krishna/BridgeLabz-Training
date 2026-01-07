package org.scenario.LoanBuddy;

public class LoanApplication implements IApprovable{
	private String loanType;
	private int term;
	protected double interestRate;
	private String status = "PENDING";
	
	protected Applicant applicant;
	
	public LoanApplication(Applicant applicant, String loanType, int term, double interestRate){
		this.applicant = applicant;
		this.term = term;
		this.loanType = loanType;
		this.interestRate = interestRate;
		this.status = loanType;
	}
	
	@Override
	public boolean approveLoan() {
        if (applicant.isEligible()) {
            updateStatus("APPROVED");
            return true;
        } else {
            updateStatus("REJECTED");
            return false;
        }
	}
	
	@Override
	public double calculateEMI() {
        double P = applicant.getLoanAmount();
        double R = interestRate / (12 * 100); 
        int N = term;

        return (P * R * Math.pow(1 + R, N)) /(Math.pow(1 + R, N) - 1);
	}
	
	private void updateStatus(String newStatus) {
		this.status = newStatus;
	}
}

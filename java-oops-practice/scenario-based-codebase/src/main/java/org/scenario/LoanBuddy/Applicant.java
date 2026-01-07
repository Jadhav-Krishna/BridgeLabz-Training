package org.scenario.LoanBuddy;

public class Applicant{
	private String name;
	private int creditScore;
	private double income;
	private int loanAmount;
	
	public Applicant(String name, int creditScore, double income, int loanAmount){
		this.name = name;
		this.creditScore = creditScore;
		this.income = income;
		this.loanAmount = loanAmount;
	}

	public double getLoanAmount() {
		return this.loanAmount;
	}

	public boolean isEligible() {
		return creditScore > 650;
	}

}

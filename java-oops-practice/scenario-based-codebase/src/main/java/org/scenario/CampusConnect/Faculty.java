package org.scenario.CampusConnect;

public class Faculty extends Person {
	Faculty(int id, String name, String email){
		super(id, name, email);
	}

	@Override
	public void printDetails() {
		System.out.println("Faculty Name : "+ personName + ", Email: "+ email);
	}
}

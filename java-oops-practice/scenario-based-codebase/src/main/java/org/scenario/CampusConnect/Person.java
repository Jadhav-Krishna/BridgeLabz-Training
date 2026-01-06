package org.scenario.CampusConnect;

public abstract class Person {
	protected int personId;
	protected String personName;
	protected String email;

	Person(int personId, String personName, String email){
		this.personId = personId;
		this.personName = personName;
		this.email = email;
	}
	
	public abstract void printDetails();
}

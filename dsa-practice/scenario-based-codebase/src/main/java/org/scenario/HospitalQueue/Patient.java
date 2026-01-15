package org.scenario.HospitalQueue;

class Patient{
	String name;
	int age;
	int criticality;
	
	Patient(String name, int age, int criticality){
		this.name = name;
		this.age = age;
		this.criticality = criticality;
	}
}
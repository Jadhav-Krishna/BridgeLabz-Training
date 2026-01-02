package org.scenario.hospitalpatientmanagement;

public class Patient {
	private int patientId;
	private String name;
	private int age;
	private String disease;
	private String medicalHistory;
	
	public Patient(int patientId, String name, int age, String disease, String medicalHistory){
		this.patientId = patientId;
		this.name = name;
		this.age = age;
		this.disease = disease;
		this.medicalHistory = medicalHistory;
	}
	
	public void displayInfo() {
		System.out.print("patient Id : "+ patientId);
		System.out.print("patient name : "+ name);
		System.out.print("patient age : "+ age);
	}
	
	public void getSummary() {
		System.out.print("patient Disease : "+ disease);
		System.out.print("patient medical past history : "+ medicalHistory);
	}
}

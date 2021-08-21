package ru.vorobyov;

public class MedicalCard {
	String firstName;
	String lastName;
	
	public MedicalCard(Patient patient) {
		this.firstName = patient.getFirstName();
		this.lastName = patient.getLastName();
	}
}

package ru.vorobyov;

public class Archive {
	
	public MedicalCard getMedicalCard(Patient patient) {
		System.out.println("Архив выдал карту");
		return new MedicalCard(patient);
	}
}

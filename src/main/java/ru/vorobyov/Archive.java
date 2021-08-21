package ru.vorobyov;

public class Archive {
	
	public static MedicalCard getMedicalCard(Patient patient) {
		System.out.println("Архив выдал карту");
		return new MedicalCard(patient);
	}
}

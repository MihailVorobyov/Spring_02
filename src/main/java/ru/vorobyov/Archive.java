package ru.vorobyov;

import org.springframework.stereotype.Component;

@Component("archive")
public class Archive {
	
	public MedicalCard getMedicalCard(Patient patient) {
		System.out.println("Архив выдал карту");
		return new MedicalCard(patient);
	}
}

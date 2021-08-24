package ru.vorobyov;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("ru.vorobyov")
public class AppConfig {
	
	@Bean(name = "therapist")
	public Doctor therapist() {
		return new Therapist();
	}

	@Bean(name = "dentist")
	public Doctor dentist() {
		return new Dentist();
	}
	
	@Bean(name = "patient")
	public Patient patient() {
		Patient patient = new Patient();
		patient.setFirstName("Василий");
		patient.setLastName("Иванов");
		patient.setNeededDoctor(therapist());
		return patient;
	}
	
	@Bean(name = "archive")
	public Archive archive() {
		return new Archive();
	}
	
	@Bean(name = "planOfClinic")
	public PlanOfClinic planOfClinic() {
		PlanOfClinic planOfClinic = new PlanOfClinic();
		planOfClinic.roomsTable.put(dentist(), 1);
		planOfClinic.roomsTable.put(therapist(), 2);
		return planOfClinic;
	}
	
	@Bean(name = "reception")
	public Reception reception() {
		Reception reception = new Reception();
		reception.setPatient(patient());
		reception.setArchive(archive());
		reception.setPlanOfClinic(planOfClinic());
		return reception;
	}
}

package ru.vorobyov;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Calendar;
import java.util.Date;

public class Patient {
	
	private final String firstName;
	private final String lastName;
	private Doctor neededDoctor;
	private Reception reception;
	
	public Patient(String firstName, String lastName, Doctor neededDoctor, Reception reception) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.neededDoctor = neededDoctor;
		this.reception = reception;
	}
	
	public void goToDoctor(int roomNumber) {
		neededDoctor.heal();
	}
	
	public String getFirstName() {
		return firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public Doctor getNeededDoctor() {
		return neededDoctor;
	}
	
	public void setNeededDoctor(Doctor neededDoctor) {
		this.neededDoctor = neededDoctor;
	}
	
	public void setReception(Reception reception) {
		this.reception = reception;
	}
	
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
//		Patient patient = new Patient("Василий", "Петров", new Dentist());
//		Reception reception = new Reception();
//		int roomNumber = reception.getRoomNumber(patient);
//		patient.goToDoctor(roomNumber);
		Patient patient = context.getBean("patient", Patient.class);
		Reception reception = context.getBean("reception", Reception.class);
		patient.goToDoctor(reception.getRoomNumber(patient));
	}
}

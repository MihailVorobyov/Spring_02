package ru.vorobyov;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Patient {
	
	private String firstName;
	private String lastName;
	private Doctor neededDoctor;

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
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");

		Patient patient = context.getBean("patient", Patient.class);
		Reception reception = context.getBean("reception", Reception.class);
		int roomNumber = reception.getRoomNumber(patient);
		patient.goToDoctor(roomNumber);
	}
}

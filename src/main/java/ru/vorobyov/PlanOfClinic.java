package ru.vorobyov;

import java.util.HashMap;
import java.util.Map;

public class PlanOfClinic {
	
	Map<Doctor, Integer> roomsTable = new HashMap();
	
	public PlanOfClinic() {
		this.roomsTable.put(new Therapist(), 1);
		this.roomsTable.put(new Dentist(), 2);
	}
	
	public int getRoomNumber(Doctor doctor) {
		System.out.println("Поиск номера комнаты...");
		return roomsTable.getOrDefault(doctor, 0);
	}
}

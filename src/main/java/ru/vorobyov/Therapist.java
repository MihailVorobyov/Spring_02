package ru.vorobyov;

public class Therapist implements Doctor {
	
	@Override
	public void heal() {
		System.out.println("Попейте витамины");
	}
}

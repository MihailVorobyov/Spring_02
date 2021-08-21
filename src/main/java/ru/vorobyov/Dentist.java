package ru.vorobyov;

public class Dentist implements Doctor {
	
	@Override
	public void heal() {
		System.out.println("Скажите \"ААА\"");
	}
}

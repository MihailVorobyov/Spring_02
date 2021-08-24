package ru.vorobyov;

import org.springframework.stereotype.Component;

@Component
public class Dentist implements Doctor {
	
	@Override
	public void heal() {
		System.out.println("Скажите \"ААА\"");
	}
}

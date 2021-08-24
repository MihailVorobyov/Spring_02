package ru.vorobyov;

import org.springframework.stereotype.Component;

@Component
public class Therapist implements Doctor {
	
	@Override
	public void heal() {
		System.out.println("Попейте витамины");
	}
}

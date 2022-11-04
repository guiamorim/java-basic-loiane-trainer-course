package com.loiane.cursojava.exercicios_aula27;

public class Lamp {

	String color;
	String productCode;
	int price;
	String description;
	int colorTemperatureK;
	int lumensPower;
	double lifeSpan;
	boolean turnOn;

	void turnOn() {
		turnOn = true;
	}

	void turnOff() {
		turnOn = false;
	}

	void displayStatus() {
		if (turnOn == true) {
			System.out.println("Lamp is turn On.");
		} else {
			System.out.println("Lamp is turn Off.");
		}
	}

	boolean changeturnOn() {
		if (turnOn) {
			turnOn = false;
			return turnOn;
		} else {
			turnOn = true;
			return turnOn;
		}

	}

}

package com.loiane.cursojava.aula25;

public class Car {

	String brand;
	String model;
	String color;
	String gearType;
	
	double fuelCapacity;
	double fuelConsumption;
	
	
	
	void displayAutonomy() {
		System.out.println(fuelCapacity / fuelConsumption);
	}
	
	

}

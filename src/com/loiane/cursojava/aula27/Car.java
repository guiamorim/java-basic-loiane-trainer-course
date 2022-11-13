package com.loiane.cursojava.aula27;

public class Car {

	String brand;
	String model;
	String color;
	int doorQuantity;
	boolean gearTypeAutomatic;
	double fuelCapacity;
	double fuelConsumption;
	
	
	public void displayAutonomy() {
		System.out.println(fuelCapacity / fuelConsumption);
	}
	
	
	double displayAutonomy2 () {
		return fuelCapacity / fuelConsumption;
	}
	
	
	double displayRefuel (double km) {
		return km / displayAutonomy2();
	}
}

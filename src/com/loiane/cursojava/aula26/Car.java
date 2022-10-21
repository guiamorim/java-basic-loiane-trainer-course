package com.loiane.cursojava.aula26;

public class Car {

	String brand;
	String model;
	String color;
	double fuelCapacity;
	double fuelConsumption;
	String gearType;
	double whelsInch;
	
	
	double displayAutonomy () {
		return fuelCapacity / fuelConsumption;
	}
}

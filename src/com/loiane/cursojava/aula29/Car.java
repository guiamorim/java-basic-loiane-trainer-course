package com.loiane.cursojava.aula29;

public class Car {

	String brand;
	String model;
	int passengers;
	double fuelStorageCapacity;
	double fuelConsumption;

	Car() {
		System.out.println("The classe Car has been instantied");
		passengers = 5;
	}
	
	Car(String brand){
		this.brand = brand;
	}

	void displayAutonomy() {
		System.out.println("The car's autonomy is " + fuelStorageCapacity * fuelConsumption);
	}

	double getAutonomy() {
		System.out.println("Method autonomy has been called");
		return fuelStorageCapacity * fuelConsumption;
	}

	double calculateAvailableFuel(double km) {
		double fuelQuantity = km / fuelConsumption;

		return fuelQuantity;
	}
}

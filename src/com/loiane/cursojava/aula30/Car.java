package com.loiane.cursojava.aula30;

// A this is used for 2 different cases:
// 1. to reference a class parameters ( variable)
// 2. to reference another constructor when using the same 'signature or argumets quantity' as required for a another class constructor.
public class Car {

	String brand;
	String model;
	int passengers;
	double fuelStorageCapacity;
	double fuelConsumption;

	public Car() {
	}

	public Car(String brand, String model) {
		this(brand, model, 10); // this 'this' will call the Car constructor with 3 parameters first and then
								// will back to the current constructor.
		System.out.println("Calling constructor with 2 parameters.");
	}

	public Car(String brand, String model, int passengers) { // this 3 parameter constructor will be called by the
																// previous constructor seen that the 'this' decalration
																// are using an available constructor format when it's
																// informing 3 arguments at the instanciation os a new
																// object.
		this.brand = brand;
		this.model = model;
		this.passengers = passengers;
		System.out.println("Calling constructor with 3 parameters.");
	}

	public Car(String brand, String model, int passengers, double fuelStorageCapacity, double fuelConsumption) {
		super();
		this.brand = brand;
		this.model = model;
		this.passengers = passengers;
		this.fuelStorageCapacity = fuelStorageCapacity;
		this.fuelConsumption = fuelConsumption;
	}

	void displayFuelAutonomy() {
		System.out.println("The car's autonomy is " + this.fuelStorageCapacity * this.fuelConsumption);
	}

	double getAutonomy() {
		System.out.println("Method autonomy has been called");
		return this.fuelStorageCapacity * this.fuelConsumption;
	}

	double calculateAvailableFuel(double km) {
		double fuelQuantity = km / this.fuelConsumption;

		return fuelQuantity;
	}
}

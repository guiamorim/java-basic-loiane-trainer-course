package com.loiane.cursojava.aula31;

// When a class has the default accessibility(Access modifiers), its only can be access by the class within this package. Means package protected.
// When a class has the public accessibility, it's could be accessed by all others class (embeded or not in the original package)
// When a class variable or a class method has a private access modifier, it means that those attributes only can be access inside the own class.

class Car {

	String brand;
	String model;
	int passengers;
	double fuelStorageCapacity;
	double fuelConsumption;

	public Car() {
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

	public double getAutonomy() {
		System.out.println("Method autonomy has been called");
		return this.fuelStorageCapacity * this.fuelConsumption;
	}

	double calculateAvailableFuel(double km) {
		double fuelQuantity = km / this.fuelConsumption;

		return fuelQuantity;
	}
}


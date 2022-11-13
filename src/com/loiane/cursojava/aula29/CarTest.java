package com.loiane.cursojava.aula29;

public class CarTest {

	public static void main(String[] args) {

		Car suv = new Car(); // Standard Constructor mode
		
		suv.brand = "Jeep";
		suv.model = "Cross";
		//suv.passengers = 6;
		suv.fuelStorageCapacity = 100;
		suv.fuelConsumption = 0.2;
		
		System.out.println(suv.passengers);
		
		
		Car suv2 = new Car("Peugeot"); // New constructor with argument
		
		System.out.println(suv2.brand);
	}

}

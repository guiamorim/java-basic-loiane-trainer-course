package com.loiane.cursojava.aula24;

public class CarTest {

	public static void main(String[] args) {

		Car van = new Car();
		
		van.brand = "Fiat";
		van.model = "Ducato";
		van.passengerCapacity = 10;
		van.fuelCapacity = 100;
		van.FuelComsuption = 0.2;
		
		
		System.out.println(van.fuelCapacity);
		
		
		Car fusca = new Car();
		fusca.brand = "VW";
		fusca.model = "Fusca";
		fusca.passengerCapacity = 5;
		fusca.fuelCapacity = 35;
		fusca.FuelComsuption = 0.6;
		
		
		System.out.println(van);
		System.out.println(van.brand);
		
		System.out.println(fusca);
		System.out.println(fusca.model);
	}

}

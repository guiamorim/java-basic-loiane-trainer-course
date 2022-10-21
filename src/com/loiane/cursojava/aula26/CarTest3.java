package com.loiane.cursojava.aula26;

public class CarTest3 {

	public static void main(String[] args) {

		Car suv02 = new Car();
		
		
		suv02.brand = "Jeep";
		suv02.color = "Blue Marine";
		suv02.model = "Compass";
		suv02.fuelCapacity = 80; //Litre
		suv02.fuelConsumption = 0.2; // litre per km
		
		System.out.print("The " + suv02.brand + suv02.model + "has an autonomy of " + suv02.displayAutonomy() + "km.");
		 // call the double method
	}

}

package com.loiane.cursojava.aula25;

public class CarTest2 {

	public static void main(String[] args) {

		Car suv01 = new Car();
		
		suv01.brand = "Jeep";
		suv01.color = "Blue Marine";
		suv01.model = "Compass";
		suv01.fuelCapacity = 80; //Litre
		suv01.fuelConsumption = 0.2; // litre per km
		
		System.out.print("The " + suv01.brand + suv01.model + "has an autonomy of ");
		suv01.displayAutonomy(); // call the void method
		
	
	}

}

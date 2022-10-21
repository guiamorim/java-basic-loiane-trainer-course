package com.loiane.cursojava.aula27;

public class CarTest4 {

	public static void main(String[] args) {

Car suv02 = new Car();
		
		
		suv02.brand = "Jeep";
		suv02.color = "Blue Marine";
		suv02.model = "Compass";
		suv02.fuelCapacity = 10; //Litre
		suv02.fuelConsumption = 0.5; // litre per km
		
		
		suv02.displayAutonomy(); // Call a void method
		System.out.println(suv02.displayAutonomy2()); // Call a method with double return
		System.out.println("Necessary refuel times to ride 100km:" + suv02.displayRefuel(100)); //Call a method using arguments
	}

}

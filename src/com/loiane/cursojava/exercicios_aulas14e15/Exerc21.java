package com.loiane.cursojava.exercicios_aulas14e15;

import java.util.Scanner;


// 21. This App should calculate the amount of discount as per the total of fuel liter bought.

public class Exerc21 {

	public static void main(String[] args) {

	double fuelAmount, alcoholPrice, totalPrice, discount;
	String fuelType;
	
	alcoholPrice = 2.50;
	
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Please enter the quantity of fuel you wish to buy:");
	fuelAmount = sc.nextDouble();
	
	System.out.println("Please, enter the Fuel type:");
	System.out.println("A - Alcohol");
	System.out.println("G - Gasoline");
	
	fuelType = sc.next().strip().toUpperCase();
	
	switch(fuelType) {
	
	case "A":
		if(fuelAmount <= 20 ) {
			System.out.println("3% Off by liter");
			discount = (alcoholPrice * fuelAmount) * 0.03;
			totalPrice = (alcoholPrice * fuelAmount) - discount;
			System.out.println("Final price: €" + totalPrice);
		}else {
			System.out.println("5% Off by liter");
			discount = (alcoholPrice * fuelAmount) * 0.05;
			totalPrice = (alcoholPrice * fuelAmount) - discount;
			System.out.println("Final price: €" + totalPrice);
		}
		break;
	case "G":
		if(fuelAmount > 20 ) {
			System.out.println("6% Off by liter");
			discount = (alcoholPrice * fuelAmount) * 0.20;
			totalPrice = (alcoholPrice * fuelAmount) - discount;
			System.out.println("Final price: €" + totalPrice);
		}else {
			System.out.println("Normal price");
			discount = (alcoholPrice * fuelAmount) * 0.0;
			totalPrice = (alcoholPrice * fuelAmount) - discount;
			System.out.println("Final price: €" + totalPrice);
		}
	}
	
	sc.close();
	
	}

}

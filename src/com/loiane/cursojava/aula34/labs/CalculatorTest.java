package com.loiane.cursojava.aula34.labs;

public class CalculatorTest {

	static void print(double value) {
		System.out.println(value); 
	}
	
	static void print(int value) {
		System.out.println(value); 
	}
	
	
	
	public static void main(String[] args) {
		
//		print(Calculator.multiplication(10, 2.5));
//
//		print(Calculator.division(10, 2.5));
//		
//		print(Calculator.sum(4.7, 3.3));
//		
//		print(Calculator.subtraction(7, 13.9));
		
		print(Calculator.factorial(-3));
	}
}

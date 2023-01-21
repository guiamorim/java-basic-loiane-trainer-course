package com.loiane.cursojava.aula34.labs;

public class CounterStatic {

	
	private static int counter;
	
	CounterStatic (){
		counter++;
	}
	
	public static void counterToZero(){
		counter = 0;
	}
	
	public static void counterIncrement(int num) {
		counter+= num;
	}
	
	public static int counterDisplay() {
		return counter;
	}
	
}

package com.loiane.cursojava.aula35;

public class recursiveMethods {

	
	public static double factorial(int num) {
		
		if(num == 0) {
			return 1;
		}
		
		return num * factorial (num -1);
	}
}

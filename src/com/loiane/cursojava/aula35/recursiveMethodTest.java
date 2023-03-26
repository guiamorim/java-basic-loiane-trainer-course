package com.loiane.cursojava.aula35;

public class recursiveMethodTest {

	public static void main(String[] args) {

		//System.out.println(recursiveMethods.factorial(5));
		
		recursiveMethodTest.print(6);
	}

	
	
	
	public static int print(int x) {

		if (x == 0) {
			return 0;
		}
		
		System.out.println(x);
		
		
		return print(x-1);
	}
	
	
	
	
	

}

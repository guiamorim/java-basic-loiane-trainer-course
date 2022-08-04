package com.loiane.cursojava.aula17;

public class LoopFor {

	public static void main(String[] args) {
		
//		for (initialization variable; condition to be validated; increment of initialization variable) {
//			programming logic;
//		}
		
		
		for( int i = 0; i < 7; i++) {
			System.out.println("Variable i has been incremented to value: " + i);
		}
		
		for (int i = 6; i>= 0; i--) {
			System.out.println("Variable i has been decremented to: " + i);
		}
		
		
		// 2 variables
		for (int i = 0, j = 10; i < j ; i++ , j --) {
			System.out.println("i = " + i + "; and j = " + j);
		}
		
		int count = 0;
		for(;count <= 10; ) {
			System.out.println("Value incremented: " + count);
			count+= 2;
		}
		
		// without curve braces
		int sum = 0;
		for(int i = 0; i < 5; sum += i++);
		System.out.println(sum);
		
		
	}

}

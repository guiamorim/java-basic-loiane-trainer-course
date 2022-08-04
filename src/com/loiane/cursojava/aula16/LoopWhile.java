package com.loiane.cursojava.aula16;

public class LoopWhile {

	public static void main(String[] args) {

		int i = 1;
		int max = 10;
		
		while ( i <= max) {
			System.out.println("The value of i is " + i);
			i++; // i = i +1; or i +=;
		}
		
		System.out.println(i);
		
		do{
			i++;
			System.out.println("The value of i is " + i);
		} while(i <= 20);
		
		System.out.println(i);
	}

}

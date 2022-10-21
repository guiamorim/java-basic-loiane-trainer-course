package com.loiane.cursojava;

import java.util.Random;

public class ForEach {

	public static void main(String[] args) {

		int[] grades = new int[10];
		
		Random random = new Random();
		
		//Fill the array using normal for
		for (int i=0; i<grades.length; i++) {
			grades[i] = random.nextInt(10);
		}
		
		//Display the array elements using normal for
		for(int i= 0; i < grades.length; i++) {
			int grade = grades[i];
			System.out.print(grade + " ");
		}
		
		System.out.println();
		
		
		
		//Display the array elements using enhanced for (for each)
		for (int grade : grades) {
			System.out.print(grade + " ");
		}
	}

}

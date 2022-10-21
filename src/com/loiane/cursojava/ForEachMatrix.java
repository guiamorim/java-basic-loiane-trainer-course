package com.loiane.cursojava;

import java.util.Random;

public class ForEachMatrix {

	public static void main(String[] args) {

		Random randomGrade = new Random();
		
		double[][] studentsGrade = new double [3][2];
		
//		studentsGrade[0][0] = randomGrade.nextDouble();
		
		studentsGrade[0][0] = 20;
		studentsGrade[0][1] = 5.5;
		
		studentsGrade[1][0] = 15;
		studentsGrade[1][1] = 8.9;
		
		studentsGrade[2][0] = 14.8;
		studentsGrade[2][1] = 7.9;
		
		//System.out.println(studentsGrade[0][0]); // Only for test purpose
		
		for(double[] studentGrade : studentsGrade ) {
			for(double grade : studentGrade) {
				System.out.println("Grade:" + grade);
			}
			System.out.println();
		}
		
	}

}

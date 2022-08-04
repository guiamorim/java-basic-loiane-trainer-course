package com.loiane.cursojava.exercicios_aulas14e15;

import java.util.Scanner;

/* Make a app to read two grades and calculate the average between it. 
 * At the end the App must presents the results for 3 different conditions:
 * 'Aprooved with distinction' if the average == 10,
 * 'Aprooved if average is between 7 (inclusive) and lower than 10,
 * and 'not aprooved' if the average is lower than 7.
 */

public class Exerc05 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);

		String[] students;
		double[][] grades;
		
		System.out.println("GRADE VALIDATION APP\n");
		
		System.out.println("Please inform the name of first student: ");
		students = new String[2];
		students[0] = sc.next();
		
		System.out.println("Please, enter with the first of two grades for the student " + students[0] + ".");
		grades = new double[2][2];
		grades [0][0]=sc.nextDouble();
		System.out.println("Now, inform the second grade for the previous student.");
		grades [0][1] = sc.nextDouble();
		
		System.out.println("Thank you for this.\nPlease, enter with the name of the second student: ");
		students[1] = sc.next();
		
		System.out.println("Please, enter the grade for the student " + students[1]);
		System.out.println("Please, enter the first grade:");
		grades[1][0]= sc.nextDouble();
		System.out.println("Please, enter the second grade:");
		grades[1][1] = sc.nextDouble();
		
		double averages[] = new double[2];
		
		//System.out.println(grades.length);
		
		averages[0] = (grades[0][0] + grades[0][1]) / grades.length;
		averages[1] = (grades [1][0] + grades [1][1])/ grades.length;

		
		System.out.println("The final grade for " + students[0] + " is: " + averages[0]);
		System.out.println("The final grade for " + students[1] + " is: " + averages[1]);
	
	
		System.out.println("Please waiting, results are been processed...\n");
		if(averages[0] == 10) {
			System.out.println("Student " + students[0] + " is aprooved with distintion.");
		}else if(averages[0]>=7 && averages[0]<10){
			
			System.out.println("Student " + students[0] + " is aprooved.");
		}else {
			System.out.println("Student " + students[0] + " is not aprooved.");
		}
		
		if(averages[1] == 10) {
			System.out.println("Student " + students[1] + " is aprooved with distintion.");
		}else if(averages[1]>=7 && averages[1]<10){
			
			System.out.println("Student " + students[1] + " is aprooved.");
		}else {
			System.out.println("Student " + students[1] + " is not aprooved.");
		}
		
		sc.close();
	}

}

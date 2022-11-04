package com.loiane.cursojava.exercicios_aula27;

import java.util.Scanner;

public class Exerc03Student {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		Student student01 = new Student();

		System.out.print("Please enter the student name: ");
		student01.name = sc.nextLine();

		System.out.print("Please enter the course name: ");
		student01.courseName = sc.nextLine();

		System.out.print("Please enter the register number: ");
		student01.registrationNumber = sc.nextInt();

		System.out.print("Please enter the number of disciplines [Integers values between 1 and 10]: ");
		int numberOfDisciplines = sc.nextInt();

		student01.disciplines = new String[numberOfDisciplines];

		for (int i = 0; i < student01.disciplines.length; i++) {
			System.out.print("Enter the discipline name: ");
			student01.disciplines[i] = sc.next();
		}

		System.out.print("\nPlease enter the number of grades: ");
		int numberOfGrades = sc.nextInt();

		student01.grades = new double[numberOfDisciplines][numberOfGrades];

		System.out.println("\nEnter the grades for each displines [Values between 0.0 and 10.0]");

		for (int i = 0; i < student01.grades.length; i++) {
			System.out.println("Grades for " + student01.disciplines[i] + ": ");
			for (int j = 0; j < student01.grades[i].length; j++) {
				System.out.print("	- Grade " + (j + 1) + ": ");
				student01.grades[i][j] = sc.nextDouble();
			}
			System.out.println();
		}

		student01.displayInfo();

		sc.close();
	}

}

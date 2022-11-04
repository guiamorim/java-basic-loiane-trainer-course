package com.loiane.cursojava.exercicios_aula27;

public class Student {

	String name;
	int registrationNumber;
	String courseName;
	String[] disciplines;
	double[][] grades;

	void displayInfo() {
		System.out.println("\n -------- [ DISPLAY INFO ] --------");
		System.out.println(" Name: " + this.name);
		System.out.println(" Registration number: " + this.registrationNumber);
		System.out.println(" Course: " + this.courseName);
		System.out.println("\n" + " ----------------------------------");

		double gradeAverage[] = new double[this.disciplines.length];
		double gradesTotalSum;

		for (int i = 0; i < this.disciplines.length; i++) {
			gradesTotalSum = 0;
			System.out.println(this.disciplines[i] + " average: ");
			for (int j = 0; j < this.grades[i].length; j++) {
				gradesTotalSum += this.grades[i][j];
			}
			gradeAverage[i] = gradesTotalSum / this.grades[i].length;
			System.out.printf("	- Final average: %.2f%n", gradeAverage[i]);

			if (gradeAverage[i] >= 7.0) {
				System.out.println("Result: approved");
			} else {
				System.out.println("Result: reproved");

			}
		}

		System.out.println("\n" + " ----------------------------------");
	}
}

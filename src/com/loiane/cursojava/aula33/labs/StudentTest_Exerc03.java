package com.loiane.cursojava.aula33.labs;

import java.util.Scanner;

public class StudentTest_Exerc03 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
	
		Student std01 = new Student();
		
		System.out.print("Please, enter Student's name: ");
		std01.setName(sc.next());
		
		System.out.print("Please, enter the course name: ");
		std01.setCourseName(sc.next());
		
		System.out.print("Please, enter the register number: ");
		std01.setRegistryNumber(sc.next());
		
		
		//Setting discipline names
		for (int i = 0; i< std01.getDisciplineNames().length; i++ ) {
			System.out.println("Please, enter the discipline name " + (i+1) + ": ");
			std01.setDisciplineNameAtPos(i, sc.next());
		}
		
		//Setting discipline grades
		for(int i = 0; i< std01.getDisciplineGrades().length;i++) {
			System.out.println("Entering discipline grade for " + std01.getDisciplineNames()[i]);
			for(int j= 0;j < std01.getDisciplineGrades()[i].length; j++) {
				System.out.println("Enter the value (between 0 and 100) for grade " + (j+1));
				std01.setPosNameIJ(i, j, sc.nextDouble());
			}
		}
		
		//Displaying the info student x disciplines x grades
		std01.displayInfo();
		
		
		//Displaying final condition per disicpline
		for(int i = 0;i < std01.getDisciplineNames().length;i++) {
			if (std01.AprovedChecking(i)) {
				System.out.println("Discipline " + std01.getDisciplineNames()[i] + " - approved.");
			} else {
				System.out.println("Discipline " + std01.getDisciplineNames()[i] + " - not approved.");
			}
		}
	
		sc.close();
	
	}

}

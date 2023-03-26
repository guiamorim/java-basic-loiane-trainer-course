package com.loiane.cursojava.aula36.labs;

// Exerc 36.2
// This app should register the data of course, professor, students and his grades and averages.
// ate the end should output the data informing the average grade of the class and the final status of each student, if approved or not using the average 7 as a minimum value fr this condition.

import java.util.Scanner;

public class CourseTest {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the course name: ");
		String courseName = sc.nextLine();

		System.out.println("Enter the course slot: ");
		String courseSlot = sc.nextLine();

		System.out.println("Enter the professor's name: ");
		String professorName = sc.nextLine();

		System.out.println("Enter the professor's dapartment: ");
		String professorDepartment = sc.nextLine();

		System.out.println("Enter the professor's Email:");
		String professorEmail = sc.nextLine();

		Course course = new Course();
		course.setName(courseName);
		course.setSlot(courseSlot);

		Professor professor = new Professor();
		professor.setName(professorName);
		professor.setDepartament(professorDepartment);
		professor.setEmail(professorEmail);

		course.setProfessor(professor);

		System.out.println("---- [ Students ] ----");

		Student[] students = new Student[5];

		for (int i = 0; i < 5; i++) {
			System.out.println("Enter the student name " + (i + 1) + ":");
			String studentName = sc.nextLine();

			System.out.println("Enter the student register number " + (i + 1) + ":");
			String studentRegister = sc.nextLine();

			double[] grades = new double[4];

			for (int j = 0; j < 4; j++) {
				System.out.println("Enter the grade " + (j + 1) + ":");
				grades[j] = sc.nextDouble();
			}
			sc.nextLine();
			

			Student student = new Student();

			student.setName(studentName);
			student.setRegister(studentRegister);
			student.setGrades(grades);
			
			students[i] = student;

			// students[i].se
		}

		course.setStudents(students);

		// Output test zone
		System.out.println(course.getinfo());

		sc.close();
	}

}

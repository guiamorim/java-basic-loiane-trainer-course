package com.loiane.cursojava.aula41;

public class Student extends Person {

	private String courseName;
	private String disciplines[];
	private String grades[][];

	public Student() {
		super();
	}

	public Student(String name, String address, String telephone, String courseName) {
		super(name, address, telephone); // refer to the superclass Person to store the properties of object
		this.courseName = courseName; // refer to the object from this class
	}

	public void setGradeAverage() {

	}

	public double getGradeAverage() {
		return 20; // to be implemented the logic
	}

	public boolean checkApproving() {
		return false;
	}

	public String[] getDisciplines() {
		return disciplines;
	}

	public void setDisciplines(String[] disciplines) {
		this.disciplines = disciplines;
	}

	public String[][] getGrades() {
		return grades;
	}

	public void setGrades(String[][] grades) {
		this.grades = grades;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	// test methods for study purpose
	public String anyMethod() {
		return super.getVAT() + " " + // Getting from superclass Person
				this.getGradeAverage(); // Getting from this own class
	}

//	After change the class student from the same package aula39 to aula39,differentFolder
//	the attributes using the security level defaul , protected, are no longer accessible as we have in professor class

	public void accessCheck() {

//		super.name = "Guilherme"; // As it's private on super class, from child class this attribute is not
		// visible or reacheable out of public methods get and set.
		// It will be accesible case its changed from private to protected.

//		The 'visibility' attribute is defined as protected or default
//		System.out.println(this.visibility = "NOT Accesible from this. class.");
//		System.out.println(super.visibility = "NOT Accesible from super class.");
	}

	// Added on class40
	@Override
	public String getAddresslabel() {
		String address2 = "Student address: ";
		address2 += this.getAddress();

		return address2;
	}

	@Override
	public void printAddressLabel() {
		System.out.println("Printing address: " + this.getAddress());

	}
}

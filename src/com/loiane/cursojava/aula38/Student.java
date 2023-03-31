package com.loiane.cursojava.aula38;

public class Student extends Person {

	private String courseName;
	private String disciplines[];
	private String grades[][];

	public Student() {
		super();
	}

	public Student(String name, String address, String telephone, String courseName) {
		super(name, address, telephone); //refer to the superclass Person to store the properties of object
		this.courseName = courseName; //refer to the object from this class
	}

	public void setGradeAverage() {

	}

	public double getGradeAverage() {
		return 20; //to be implemented the logic 
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
	
	
	// method test for study purpose
	public String anyMethod() {
		return super.getVAT() + " " +  // Getting from superclass Person
		this.getGradeAverage(); // Getting from this own class
	}
}

package com.loiane.cursojava.aula33.labs;

public class Student {

	private String name;
	private String registryNumber;
	private String courseName;
	private String[] disciplineNames;
	private double[][] disciplineGrades;

	public Student() {
		this.disciplineNames = new String[3];
		this.disciplineGrades = new double[3][4];
	}

	public Student(String name, String registryNumber, String courseName) {
		this.name = name;
		this.registryNumber = registryNumber;
		this.courseName = courseName;
		this.disciplineNames = new String[3];
		this.disciplineGrades = new double[3][4];
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getRegistryNumber() {
		return registryNumber;
	}

	public void setRegistryNumber(String registryNumber) {
		this.registryNumber = registryNumber;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public String[] getDisciplineNames() {
		return disciplineNames;
	}

	public void setDisciplineNames(String[] disciplineNames) {
		this.disciplineNames = disciplineNames;
	}

	public double[][] getDisciplineGrades() {
		return disciplineGrades;
	}

	public void setDisciplineGrades(double[][] disciplineGrades) {
		this.disciplineGrades = disciplineGrades;
	}

	public void displayInfo() {
		System.out.println("Nome: " + this.getName());
		System.out.println("Registry Number: " + this.getRegistryNumber());
		System.out.println("Course Name: " + this.getCourseName());
		
		double average, sum;

		for (int i = 0; i < disciplineGrades.length; i++) {
			
			sum = 0;
			average = 0;
			
			System.out.println("Grade of discipline " + disciplineNames[i] + ":");

			for (int j = 0; j < disciplineGrades[i].length; j++) {
				System.out.print(disciplineGrades[i][j] + " ");
			 sum += disciplineGrades[i][j];
			}
			average = sum / 4;
			
			System.out.print(" - " + average);
			System.out.println();
		}

	}

	public boolean AprovedChecking(int index) {
		if (getAverage(index) >= 70) {
			return true;
		}
		return false;
	}

	
	// Auxiliary Method for ApprovedChenking()
	private double getAverage(int index) {
		double sum = 0;

		for (int i = 0; i < disciplineGrades[index].length; i++) {
			sum += disciplineGrades[index][i];
		}

		double average = sum / 4; //hardcoded, grade quantites
		return average;
	}
	
	
	
	public void setDisciplineNameAtPos(int pos, String disciplineName) {
		this.disciplineNames[pos] = disciplineName;
	}
	
	
	public void setPosNameIJ(int posI, int posJ, double grade) {
		this.disciplineGrades[posI][posJ] = grade;
	}
	
}

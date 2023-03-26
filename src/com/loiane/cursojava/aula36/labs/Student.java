package com.loiane.cursojava.aula36.labs;

public class Student {

	private String name;
	private String register;
	private double[] grades;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getRegister() {
		return register;
	}

	public void setRegister(String register) {
		this.register = register;
	}

	public double[] getGrades() {
		return grades;
	}

	public void setGrades(double[] grades) {
		this.grades = grades;
	}

	public String getInfo() {
		String info = "Name: " + this.name + "; ";
		info += "Register: " + this.register + "; ";

		double total = 0;
		for (double grade : grades) {
			total += grade;
			info += "Grade " + grade + "; ";
		}
		info += "\nTotal: " +total + "; ";

		double average = total / grades.length;
		info += "\nAverage: " + average + " - ";

		if (average >= 7) {
			info += "Approved.;";
		} else {
			info += "Reproved.;";
		}
		
		info += "\n";

		return info;
	}

	public double getGradeSum() {

		double sum = 0;
		for (double grade : grades) {

			sum += grade;
		}

		return sum;
	}
}

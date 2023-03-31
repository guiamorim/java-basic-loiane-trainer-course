package com.loiane.cursojava.aula38;

public class Professor extends Person{

	private String course;
	private String salary;


	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	public String getSalary() {
		return salary;
	}

	public void setSalary(String salary) {
		this.salary = salary;
	}

	public double checkNetSalary() {
		return 0;
	}
}

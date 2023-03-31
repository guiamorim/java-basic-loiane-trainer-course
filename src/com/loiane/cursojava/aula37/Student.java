package com.loiane.cursojava.aula37;

public class Student extends Person {

	private String courseNames[];
	private String disciplines[];
	private String grades[][];

	public void setGradeAverage() {

	}

	public double getGradeAverage() {
		return 0;
	}

	public boolean checkApproving() {
		return false;
	}

	public String[] getCourseNames() {
		return courseNames;
	}

	public void setCourseNames(String[] courseNames) {
		this.courseNames = courseNames;
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
}

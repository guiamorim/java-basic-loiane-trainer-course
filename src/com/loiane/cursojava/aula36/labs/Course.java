package com.loiane.cursojava.aula36.labs;

import java.math.RoundingMode;
import java.text.DecimalFormat;

public class Course {

	private String name;
	private String slot;
	private Professor professor;
	private Student[] students;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSlot() {
		return slot;
	}

	public void setSlot(String slot) {
		this.slot = slot;
	}

	public void setProfessor(Professor professor) {
		this.professor = professor;
	}

	public Professor getProfessor() {
		return professor;
	}

	public Student[] getStudents() {
		return students;
	}

	public void setStudents(Student[] students) {
		this.students = students;
	}

	public String getinfo() {

		String info = "----- [COURSE] -----\n";
		info += "Course: " + this.name + ".\n";
		info += "Course Slot: " + this.slot + ".\n";

		if (professor != null) {
			info += professor.getInfo();
		}
		
		info+= "\n";

		if (students != null) {
			info += (" ---- [STUDENTS] ----\n");
			for (Student student : students) {
				if (student != null) {
					info += student.getInfo();
					info += "\n";
				}
			}
			info += "\nClass average: " + Math.round(getClassGradeAverage());
		}
		return info;
	}

	public double getClassGradeAverage() {

		double classGradeAverage = 0;

		for (Student student : students) {
			if (student != null) {
				classGradeAverage += student.getGradeSum();
			}
		}
		
		classGradeAverage = classGradeAverage/students.length;
		
		return classGradeAverage;
	}

}

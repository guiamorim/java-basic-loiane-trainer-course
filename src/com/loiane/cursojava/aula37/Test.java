package com.loiane.cursojava.aula37;

public class Test {

	public static void main(String[] args) {

		Student student = new Student();
//		aluno.get
		
		Professor professor = new Professor();
//		professor.getAddress();
		
		Person person = new Person();
//		person.getName();
		
		
		Student student2 = new Student();
//		student.getAddress();
		
		Person professor2 = new Professor();
//		professor.checkNetSalary(); //have access to method of class Professor due it be a instance of Professor and type Professor
//		professor2.checkNetSalary(); // Return error due it isn't a instance of a type Professor, but Person.
	}

}

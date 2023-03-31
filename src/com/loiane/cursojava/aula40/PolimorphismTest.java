package com.loiane.cursojava.aula40;

// This class is to test the polimorphism

public class PolimorphismTest {

	public static void main(String[] args) {

		Person person = new Person();
		Person student = new Student();
		Person professor = new Professor();
		
		
		person.setAddress("1 Street, 1");
		student.setAddress("2 Street, 2");
		professor.setAddress("3 Street, 3");
		
		System.out.println(person.getAddresslabel());
		System.out.println(student.getAddresslabel());
		System.out.println(professor.getAddresslabel());
	}

}

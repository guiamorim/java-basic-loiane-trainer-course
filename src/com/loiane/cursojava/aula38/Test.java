package com.loiane.cursojava.aula38;

public class Test {

	public static void main(String[] args) {

		Student st1 = new Student();
		
		st1.setVAT("123456");
		
		st1.setGradeAverage();
		
		System.out.println(st1.anyMethod());
	}

}

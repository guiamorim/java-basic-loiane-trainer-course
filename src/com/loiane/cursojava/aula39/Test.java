package com.loiane.cursojava.aula39;

/*
 * Modifiers Access level
 * Public - everyone in or out of it class can access the attribute
 * Private - only class member has access to that attribute
 * Protected (default) - 
 * */



import com.loiane.cursojava.aula39.differentFolder.Student;

public class Test {

	public static void main(String[] args) {

		Student st1 = new Student();
		
		st1.accessCheck();
//		st1.visibility // it's no longer accessible after moving the class student from .aula39 to .aula39.differentFolder
		
		
		
		Professor prof1 = new Professor();
		
		prof1.visibility = "Yes"; //Attribute from super class Person available to be accesible due both class are inside the same package, level or folder
		
		System.out.println(prof1.visibility); // Attribute has the security level as protected ( default)
		
		
	
	
	}

}

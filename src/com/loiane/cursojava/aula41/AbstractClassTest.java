package com.loiane.cursojava.aula41;

public class AbstractClassTest {

	public static void main(String[] args) {

//		Person person = new Person(); //After change the class person to abstract we are not allowed to rais ea intance of this class
									  // Only is allowed to define how this class will be.
		Person student = new Student();
		Person professor = new Professor();
		
		
//		person.setAddress("1 Street, 1"); // as it wasn't intanciated, there is no object to use a method
		student.setAddress("2 Street, 2");
		
		System.out.println(student.getAddresslabel());
		student.printAddressLabel();
	}

}

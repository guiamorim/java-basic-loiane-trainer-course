package com.loiane.cursojava.aula42;

public class Professor extends Person {

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

	public void accessCheck() {

//		super.name = "Guilherme"; // As it's private on super class, from child class this attribute is not
		// visible or reacheable out of public methods get and set.
		// It will be accesible case its changed from private to protected.

		System.out.println(this.visibility = "Accesible from this. class.");
		System.out.println(super.visibility = "Accesible from super class.");
	}
	
	//Added on class40
	@Override
	public String getAddresslabel() {
		String addressProfessor = "Student address: ";
		addressProfessor += this.getAddress(); 
		
		return addressProfessor;
	}
	
	//added on class41
	public void printAddressLabel() {
		System.out.println("Printing address: " + this.getAddress());
	}

}

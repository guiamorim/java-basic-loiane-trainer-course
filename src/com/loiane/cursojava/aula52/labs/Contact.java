package com.loiane.cursojava.aula52.labs;

public class Contact {

	private static int nextId = 0;

	private int id;
	private String name;
	private String phoneNumber;
	private String email;

	public Contact() {
		nextId++;
		id = nextId;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		String s = "[";
		s += "Id: " + id;
		s += ", Name: " + name;
		s += ", Phone Number: " + phoneNumber;
		s += ", Email: " + email;
		s += "]";

		return s;
	}
}

package com.loiane.cursojava.aula36.labs;

public class Contact {
	private String name;
	private String surname;
	private String telephone;//s[] = new Telephone[2];
	private String email;
	private String address;
	private String number;
	private String city;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
	

	public String getInfo() {
		return  "Name = " + this.getName() + "; " + 
				"Telephone = " + this.getTelephone() + "; " + 
				"Email: " + this.getEmail();
	}
}

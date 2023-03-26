package com.loiane.cursojava.aula36;

public class Test {

	public static void main(String[] args) {

		Contact contact = new Contact();
		
		Address address1 = new Address();
		address1.setStreet("Bafata street");
		address1.setNumber("6");
		address1.setComplement("n/a");
		address1.setCity("Amora");
		address1.setDistrict("Setubal");
		
		
		Phone phone1 = new Phone();
		phone1.setType("residencial");
		phone1.setZoneCode("+351");
		phone1.setNumber("99999-9999");
		
		
		contact.setName("Guilherme");
		contact.setAddress(address1);
		contact.setPhone(phone1);
		

		System.out.println("Name: " + contact.getName());
		
		//Null Address treatment and it null components  
		if(contact.getAddress() != null && contact.getAddress().getStreet() != null) {
			System.out.println("Address: " + contact.getAddress().getStreet());
		} else if (contact.getAddress() != null) {
			System.out.println("[WARNING] - Address has not been defined. Please add an address to this contact.");
		} else {
			System.out.println("[WARNING] - Street value has not been defined for the address linked to this contact. Please inform a street information to the address linked to this contact.");
		}
		
		if(contact.getPhone() != null && contact.getPhone().getNumber() != null) {
			System.out.println("[WARNING] - Phone number has not been defined. Please add an address to this contact.");
		} else if (contact.getPhone() != null) {
			System.out.println("[WARNING] - Phone value has not been defined for the number linked to this contact. Please inform a  phone number");
		} else {
			System.out.println("Phone: " + contact.getPhone().getZoneCode() + " " + contact.getPhone().getNumber());
			
		}

		
		
		
	}

}

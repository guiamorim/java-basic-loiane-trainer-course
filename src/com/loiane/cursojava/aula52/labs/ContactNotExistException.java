package com.loiane.cursojava.aula52.labs;

public class ContactNotExistException extends Exception{

	private static final long serialVersionUID = 1L;
	private String contactName;
	
	public ContactNotExistException(String contactName) {
		this.contactName = contactName;
	}
	
	@Override
	public String getMessage() {
		return "Contact " + contactName + " doesn't exist in the Agenda./n";
	}
}

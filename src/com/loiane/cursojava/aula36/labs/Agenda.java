package com.loiane.cursojava.aula36.labs;

public class Agenda {
	private String name;
	private Contact[] contacts;

	public Agenda() {

	}

	public Agenda(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Contact[] getContacts() {
		return contacts;
	}

	public void setContacts(Contact[] contacts) {
		this.contacts = contacts;
	}

	public String getInfo() {

		String info = this.getName() + ":\n";

		if (contacts != null) {
			for (Contact c : contacts) {
				info += c.getInfo() + ".\n";
			}
		}

		return info;
	}
}

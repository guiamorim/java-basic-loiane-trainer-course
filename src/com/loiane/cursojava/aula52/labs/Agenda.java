package com.loiane.cursojava.aula52.labs;

public class Agenda {

	private Contact[] contacts;

	public Agenda() {

		contacts = new Contact[5];
	}

	public void addContact(Contact contact) throws FullAgendaException {

		boolean isFullAgenda = true;

		for (int i = 0; i < contacts.length; i++) {
			if (contacts[i] == null) {
				contacts[i] = contact;
				isFullAgenda = false;
				break;
			}
		}
		if (isFullAgenda) {
			throw new FullAgendaException();
		}
	}

	public int searchContact(String name) throws ContactNotExistException {
		for (int i = 0; i < contacts.length; i++) {
			if (contacts[i] != null) {
				if (contacts[i].getName().equalsIgnoreCase(name)) {
					return i;
				}
			}
		}
		throw new ContactNotExistException(name);
	}

	@Override
	public String toString() {

		String s = "";
		for (Contact c : contacts) {
			if (c != null) {
				s += c.toString() + "\n";

			}
		}
		return s;
	}
}

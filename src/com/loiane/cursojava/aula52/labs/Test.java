package com.loiane.cursojava.aula52.labs;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		Agenda agenda = new Agenda();
		int option = 1;

		while (option != 3) {
			option = getMenuOption(scan);

			if (option == 1) {// search contact
				searchContact(scan, agenda);
			} if (option == 2) { // Add contact
				addContact(scan, agenda);
			} if (option == 3){
				System.out.println("Thank you for use our application.");
			}
		}
	}

	public static void addContact(Scanner scan, Agenda agenda) {
		try {
			System.out.println("Creating a contact, enter with data:");
			String name = readInformationString(scan, "Enter with a contact name: ");
			String phoneNumber = readInformationString(scan, "Enter with a phone number: ");
			String email = readInformationString(scan, "Enter with a email: ");

			Contact contact = new Contact();
			contact.setName(name);
			contact.setPhoneNumber(phoneNumber);
			contact.setEmail(email);

			System.out.println("\nContact is been created.");
			System.out.println(contact);

			agenda.addContact(contact);
		} catch (FullAgendaException e) {
			System.out.println(e.getMessage());
			//e.printStackTrace();

			System.out.println("\nAgenda Contacts:");
			System.out.println(agenda);
		}

	}

	public static void searchContact(Scanner scan, Agenda agenda) {
		String contactName = readInformationString(scan, "Please, enter with contact name to be searched.");
		try {
			if (agenda.searchContact(contactName) >= 0) {
				System.out.println("Contact exist.");
			}
		} catch (ContactNotExistException e) {
			System.out.println(e.getMessage());
		}

	}

	public static String readInformationString(Scanner scan, String msg) {
		System.out.println(msg);
		String enter = scan.nextLine();
		return enter;
	}

	public static int getMenuOption(Scanner scan) {

		boolean isValidOption = false;
		int option = 3;

		while (!isValidOption) {
			System.out.println("Enter an option:");
			System.out.println("1: Search contact:");
			System.out.println("2: Add contact:");
			System.out.println("3: Exit");

			try {
				String enter = scan.nextLine();
				option = Integer.parseInt(enter);

				if (option == 1 | option == 2 | option == 3) {
					isValidOption = true;
				} else {
					throw new Exception("Option is not valid.");
				}
			} catch (Exception e) {
				System.out.println("Option is not valid. Please, enter a valid option.\n");

			}
		}
		return option;
	}
}

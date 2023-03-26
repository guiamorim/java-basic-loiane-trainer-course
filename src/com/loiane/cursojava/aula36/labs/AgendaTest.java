package com.loiane.cursojava.aula36.labs;

import java.util.Scanner;

public class AgendaTest {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		Agenda agenda = new Agenda();

		System.out.println("Please, enter the agenda name:");
		agenda.setName(scanner.nextLine());

		// Agenda name test
		/*
		 * System.out.println("Agenda" + agendaPessoal.getName());
		 * System.out.println("Agenda" + agendaTrabalho.getName());
		 */

		Contact[] contacts = new Contact[2];

		// Filling the contact's array
		for (int i = 0; i < 2; i++) {
			System.out.println("Please fill the contact " + (i + 1) + ":");
			Contact c = new Contact();

			System.out.print("Name: ");
			c.setName(scanner.nextLine());

			System.out.print("Telefone: ");
			c.setTelephone(scanner.nextLine());

			System.out.print("E-mail: ");
			c.setEmail(scanner.nextLine());

			contacts[i] = c;

			System.out.println();
		}
		
		agenda.setContacts(contacts);
		
		if(agenda != null) {
		System.out.println(agenda.getInfo());
		}
		scanner.close();
	}

}

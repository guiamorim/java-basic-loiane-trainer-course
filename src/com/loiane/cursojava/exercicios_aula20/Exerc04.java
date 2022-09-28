package com.loiane.cursojava.exercicios_aula20;

import java.util.Scanner;

// This app is my first CRUD.
// This App should records appoitments, consult it per day or full agenda. Also allow to delete and update the appointments just added.

// agenda[day-1] -> it's used to show save in the correct array position. else wont be possible to use the first array position, 0.

public class Exerc04 {

	public static void main(String[] args) {

		String[][] agenda = new String[31][24];
		Scanner sc = new Scanner(System.in);

		int day;
		int hour;
		boolean doAnotherOperation = false;

		do {
			System.out.println("=============================");
			System.out.println("|          AGENDA           |");
			System.out.println("=============================");
			System.out.println("\nMenu:");
			System.out.println(" 1 - Insert an apointment");
			System.out.println(" 2 - Update an apointment");
			System.out.println(" 3 - Delete an apointment");
			System.out.println(" 4 - Consult an apointment");
			System.out.println(" 5 - Consult apointments / day");
			System.out.println(" 6 - Consult full agenda");
			System.out.println(" 0 - Exit");
			System.out.print("\nPlease choose an operation: ");

			int option = sc.nextInt();
			char response = 'n';

			switch (option) {

			case 1:

				// CREATE an apointment with day validation and hour
				do {
					System.out.println("Choose a day [1-31]:");
					day = sc.nextInt();

					if (day < 1 || day > 31) {
						System.out.println("Invalid day, please enter a value between 1 and 31.");
					} else {

						do {
							System.out.println("Choose a hour [0-23]:");
							hour = sc.nextInt();

							if (hour < 0 || hour > 23) {
								System.out.println("Invalid hour, please enter a value between 0 and 23.");
							} else {
								System.out.print("Enter the apointment: ");
								agenda[day - 1][hour] = sc.next();
								sc.nextLine(); // this is only to consume the line
							}

						} while (hour < 0 || hour > 23);

					}

				} while (day < 1 || day > 31);

				break;

			case 2:
				// UPDATE an appointment
				do {

					System.out.println("Choose a day [1-31]:");
					day = sc.nextInt();

					do {
						System.out.println("Choose a hour [0-23]:");
						hour = sc.nextInt();

						if (agenda[day - 1][hour] != null) {
							System.out.print("Current appoitment: ");
							System.out.println(agenda[day - 1][hour]);
							System.out.println("Do you want overwrite it?[y/n]");
							response = sc.next().toLowerCase().strip().charAt(0);

							if (response == 'y') {
								System.out.print("Enter the apointment: ");
								agenda[day - 1][hour] = sc.next();
							} else {
								System.out.println("The current apointment has been kept.");
							}

						} else {
							System.out.println("This time is available, there is no previous appointment record.");
							System.out.print("Do you want to enter a new appointment for this time?[y/n]");
							response = sc.next().toLowerCase().strip().charAt(0);

							if (response == 'y') {
								System.out.print("Enter the apointment: ");
								agenda[day - 1][hour] = sc.next();
							} else {
								System.out.println("This time keeps available.");
							}
						}
					} while (hour < 0 || hour > 23);
				} while (day < 1 || day > 31);

				break;

			case 3:
				// DELETE an appointment
				System.out.println("Please, inform the day and hour to delete a record:");
				System.out.print("Day: ");
				day = sc.nextInt();
				System.out.println("Hour: ");
				hour = sc.nextInt();

				if (agenda[day - 1][hour] != null) {

					System.out.println("Current appointment: " + agenda[day - 1][hour]);

					System.out.println("Do you really want to delete it?");
					response = sc.next().strip().toLowerCase().charAt(0);
					do {
						if (response == 'y') {
							agenda[day - 1][hour] = null;
							System.out.println("This record has been deleted.");
						} else if (response == 'n') {
							System.out.println("This record has been kept.");
						} else {
							System.out.println("Invalid input. Please enter 'y' to confirm or 'n' to cancel.");
						}
					} while (response != 'y' && response != 'n');

				} else {
					System.out.println("There is no record for the choosen time.");
				}

				break;

			case 4:
				// CONSULT / READ an appoitment
				System.out.println("Please, inform the day and hour to be showed:");
				System.out.print("Day: ");
				day = sc.nextInt();
				System.out.println("Hour: ");
				hour = sc.nextInt();

				if (agenda[day - 1][hour] != null) {

					System.out.println("Current appointment: " + agenda[day - 1][hour]);

				} else {
					System.out.println("There is no record for the choosen time.");
				}

				break;

			case 5:
				// CONSULT / READ the appoitment per day
				System.out.println("Please, inform the day:");
				System.out.print("Day: ");
				day = sc.nextInt();

				System.out.println("\nShowing Daily Agenda...");
				for (int i = 0; i < agenda.length; i++) {
					if (day == (i + 1)) {
						System.out.println("\nDay	Hour	apointment");
						System.out.println("----------------------------");

						for (int j = 0; j < agenda[i].length; j++) {
							System.out.println(" " + (i + 1) + "	" + j + ":00" + " 	" + agenda[i][j]);
						}
						System.out.println();
					}
				}
				break;

			case 6:
				/// CONSULT / READ all appointments
				System.out.println("\nShowing Full Agenda...");
				for (int i = 0; i < agenda.length; i++) {
					System.out.println("\nDay	Hour	apointment");
					System.out.println("----------------------------");

					for (int j = 0; j < agenda[i].length; j++) {
						System.out.println(" " + (i + 1) + "	" + j + ":00" + " 	" + agenda[i][j]);
					}
					System.out.println();
				}

				break;

			case 7:
				// code
				break;

			default:
				// code

			}

			response = 'y';
			System.out.println("Do you want to do other operation?[y/n]");
			response = sc.next().toLowerCase().strip().charAt(0);

			while (response != 'n' && response != 'y') {
				System.out.println("Invalid option.");

				System.out.println("Do you want to do other operation?[y/n]");
				response = sc.next().toLowerCase().strip().charAt(0);

			}

			if (response == 'y') {
				doAnotherOperation = true;
			} else {
				doAnotherOperation = false;
				System.out.println("Closing app...");
				System.out.println("App finished.");
			}
		} while (doAnotherOperation);

//		System.out.println("Please schedule an apointment: ");

//		System.out.println("1 - January	5 - May		 9 - September");
//		System.out.println("2 - February	6 - June	10 - October");
//		System.out.println("3 - March	7 - July	11 - November");
//		System.out.println("4 - April	8 - August	12 - December");

//		System.out.print("\nChoose a Month [1-12]: ");
//		int month = sc.nextInt();

		// Consult of appoitment all agenda
//		System.out.println("\nShowing Agenda...");
//		for (int i = 0; i < agenda.length; i++) {
//			System.out.println("\nDay	Hour	apointment");
//			System.out.println("----------------------------");
//			for (int j = 0; j < agenda[i].length; j++) {
//				System.out.println(" " + (i + 1) + "	" + j + ":00" + " 	" + agenda[i][j]);
//			}
//		}

		// Consult only 1 day per time

//		System.out.println("Choose the day:");
//		day = sc.nextInt();
//
//		System.out.println("\nShowing Daily Agenda...");
//		for (int i = 0; i < agenda.length; i++) {
//			if (day == (i + 1)) {
//				System.out.println("\nDay	Hour	apointment");
//				System.out.println("----------------------------");
//
//				for (int j = 0; j < agenda[i].length; j++) {
//					System.out.println(" " + (i + 1) + "	" + j + ":00" + " 	" + agenda[i][j]);
//				}
//			}
//		}

		// Output of specifi appoitment
		// System.out.println("Day: " + day + ", hour: " + hour + " :" +
		// agenda[day][hour]);

		sc.close();
	}

}

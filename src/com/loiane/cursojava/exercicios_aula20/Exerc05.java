package com.loiane.cursojava.exercicios_aula20;

import java.util.Scanner;

// This app is my first CRUD.
// This App should records appoitments, consult it per day or full agenda. Also allow to delete and update the appointments just added.

// agenda[day-1] -> it's used to show save in the correct array position. else wont be possible to use the first array position, 0.

public class Exerc05 {

	public static void main(String[] args) {

		String[][][] agenda = new String[12][31][8]; // Month | day | hours
		Scanner sc = new Scanner(System.in);

		int month, day, hour;

		boolean doAnotherOperation = true;
		boolean flg = true;

		do {
			System.out.println("=============================");
			System.out.println("|          AGENDA           |");
			System.out.println("=============================");
			System.out.println("\nMenu:");
			System.out.println(" 1 - Insert an appointment");
			System.out.println(" 2 - Update an appointment");
			System.out.println(" 3 - Delete an appointment");
			System.out.println(" 4 - Consult an appointment");
			System.out.println(" 5 - Consult appointments per Day");
			System.out.println(" 6 - Consult appointments per Month");
			System.out.println(" 7 - Consult full agenda");
			System.out.println(" 0 - Exit");
			System.out.print("\nPlease choose an operation: ");

			int option = sc.nextInt();
			char response = 'n';

			switch (option) {

			case 1:

				// CREATE an appointment with month validation, day and hour

				System.out.println("1 - January	5 - May		 9 - September");
				System.out.println("2 - February	6 - June	10 - October");
				System.out.println("3 - March	7 - July	11 - November");
				System.out.println("4 - April	8 - August	12 - December");

				// Month validation
				do {
					System.out.print("\nChoose a Month, [1-12]: ");
					month = sc.nextInt();

					if (month < 1 || month > 12) {
						System.out.println("Invalid month, please enter a value between 1 and 12.");
						flg = false;
					} else {
						flg = true;
					}

				} while (!flg);

				// Day validation
				do {
					System.out.print("\nChoose a day, [1-31]: ");
					day = sc.nextInt();

					if (day < 1 || day > 31) {
						System.out.println("Invalid day, please enter a value between 1 and 31.");
						flg = false;
					} else {
						flg = true;
					}

				} while (!flg);

				// Hour validation
				do {
					System.out.print("\nChoose a hour, [0 - 8]: ");
					hour = sc.nextInt();

					if (hour < 0 || hour > 8) {
						System.out.println("Invalid hour, please enter a value between 0 and 8.");
						flg = false;
					} else {
						flg = true;
					}

				} while (!flg);

			{
				System.out.print("Enter the appointment: ");
				agenda[month - 1][day - 1][hour] = sc.next();
				// sc.next(); // this is only to consume the next line
			}
				break;

			case 2:
				// UPDATE an appointment
				System.out.println("1 - January	5 - May		 9 - September");
				System.out.println("2 - February	6 - June	10 - October");
				System.out.println("3 - March	7 - July	11 - November");
				System.out.println("4 - April	8 - August	12 - December");

				// Month validation
				do {
					System.out.print("\nChoose a Month, [1-12]: ");
					month = sc.nextInt();

					if (month < 1 || month > 12) {
						System.out.println("Invalid month, please enter a value between 1 and 12.");
						flg = false;
					} else {
						flg = true;
					}

				} while (!flg);

				// Day validation
				do {
					System.out.print("\nChoose a day, [1-31]: ");
					day = sc.nextInt();

					if (day < 1 || day > 31) {
						System.out.println("Invalid day, please enter a value between 1 and 31.");
						flg = false;
					} else {
						flg = true;
					}

				} while (!flg);

				// Hour validation
				do {
					System.out.print("\nChoose a hour, [0 - 8]: ");
					hour = sc.nextInt();

					if (hour < 0 || hour > 8) {
						System.out.println("Invalid hour, please enter a value between 0 and 8.");
						flg = false;
					} else {
						flg = true;
					}

				} while (!flg);

				if (agenda[month - 1][day - 1][hour] != null) {
					System.out.print("There is a previous appointment: ");
					System.out.println(agenda[month - 1][day - 1][hour]);
					System.out.println("Do you want overwrite it?[y/n]");
					response = sc.next().toLowerCase().strip().charAt(0);
					sc.nextLine(); // teste

					if (response == 'y') {
						System.out.print("Enter the appointment: ");
						agenda[month - 1][day - 1][hour] = sc.next();
					} else {
						System.out.println("The current appointment has been kept.");
					}

				} else {
					System.out.println("It's time is available, there is no previous appointment recorded.");
					System.out.print("Do you want to enter a new appointment for this time?[y/n]");
					response = sc.next().toLowerCase().strip().charAt(0);

					if (response == 'y') {
						System.out.print("Enter the appointment: ");
						agenda[month - 1][day - 1][hour] = sc.next();
					} else {
						System.out.println("It's time keeps available.");
					}
				}
				break;

			case 3:
				// DELETE an appointment

				System.out.println("1 - January	5 - May		 9 - September");
				System.out.println("2 - February	6 - June	10 - October");
				System.out.println("3 - March	7 - July	11 - November");
				System.out.println("4 - April	8 - August	12 - December");
				// Month validation
				do {
					System.out.print("\nChoose a Month, [1-12]: ");
					month = sc.nextInt();

					if (month < 1 || month > 12) {
						System.out.println("Invalid month, please enter a value between 1 and 12.");
						flg = false;
					} else {
						flg = true;
					}

				} while (!flg);

				// Day validation
				do {
					System.out.print("\nChoose a day, [1-31]: ");
					day = sc.nextInt();

					if (day < 1 || day > 31) {
						System.out.println("Invalid day, please enter a value between 1 and 31.");
						flg = false;
					} else {
						flg = true;
					}

				} while (!flg);

				// Hour validation
				do {
					System.out.print("\nChoose a hour, [0 - 8]: ");
					hour = sc.nextInt();

					if (hour < 0 || hour > 8) {
						System.out.println("Invalid hour, please enter a value between 0 and 8.");
						flg = false;
					} else {
						flg = true;
					}

				} while (!flg);

				if (agenda[month - 1][day - 1][hour] != null) {

					System.out.println("Current appointment: " + agenda[month - 1][day - 1][hour]);

					System.out.println("Do you really want to delete it?");
					response = sc.next().strip().toLowerCase().charAt(0);
					do {
						if (response == 'y') {
							agenda[month - 1][day - 1][hour] = null;
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

				System.out.println("1 - January	5 - May		 9 - September");
				System.out.println("2 - February	6 - June	10 - October");
				System.out.println("3 - March	7 - July	11 - November");
				System.out.println("4 - April	8 - August	12 - December");
				// Month validation
				do {
					System.out.print("\nChoose a Month, [1-12]: ");
					month = sc.nextInt();

					if (month < 1 || month > 12) {
						System.out.println("Invalid month, please enter a value between 1 and 12.");
						flg = false;
					} else {
						flg = true;
					}

				} while (!flg);

				// Day validation
				do {
					System.out.print("\nChoose a day, [1-31]: ");
					day = sc.nextInt();

					if (day < 1 || day > 31) {
						System.out.println("Invalid day, please enter a value between 1 and 31.");
						flg = false;
					} else {
						flg = true;
					}

				} while (!flg);

				// Hour validation
				do {
					System.out.print("\nChoose a hour, [0 - 8]: ");
					hour = sc.nextInt();

					if (hour < 0 || hour > 8) {
						System.out.println("Invalid hour, please enter a value between 0 and 8.");
						flg = false;
					} else {
						flg = true;
					}

				} while (!flg);

				if (agenda[month - 1][day - 1][hour] != null) {
					System.out.println("Current appointment: " + agenda[month - 1][day - 1][hour]);

				} else {
					System.out.println("There is no record for the choosen time.");
				}

				break;


			case 5:
				// CONSULT / READ the Daily appoitment

				System.out.println("1 - January	5 - May		 9 - September");
				System.out.println("2 - February	6 - June	10 - October");
				System.out.println("3 - March	7 - July	11 - November");
				System.out.println("4 - April	8 - August	12 - December");
				// Month validation
				do {
					System.out.print("\nChoose a Month, [1-12]: ");
					month = sc.nextInt();

					if (month < 1 || month > 12) {
						System.out.println("Invalid month, please enter a value between 1 and 12.");
						flg = false;
					} else {
						flg = true;
					}

				} while (!flg);

				// Day validation
				do {
					System.out.print("\nChoose a day, [1-31]: ");
					day = sc.nextInt();

					if (day < 1 || day > 31) {
						System.out.println("Invalid day, please enter a value between 1 and 31.");
						flg = false;
					} else {
						flg = true;
					}

				} while (!flg);

				System.out.println("\nShowing Monthly Agenda...");
				for (int i = 0; i < agenda.length; i++) {
					if (month == (i + 1)) {
						System.out.println(
								"\nMonth	Day	Hour	Appointment\n" + 
									"===================================\n");

						for (int j = 0; j < agenda[i].length; j++) {

							if (day == j + 1) {
								for (int k = 0; k < agenda[i][j].length; k++) {
									System.out.println(" " + (i + 1) + "  	" + (j + 1) + " 	" + k + ":00" + "   "
											+ agenda[i][j][k]);
								}
								System.out.println("-----------------------------------");
							}
						}
						System.out.println();
					}
				}

				break;

			case 6:
				// CONSULT / READ the Monthly appoitment
				
				System.out.println("1 - January	5 - May		 9 - September");
				System.out.println("2 - February	6 - June	10 - October");
				System.out.println("3 - March	7 - July	11 - November");
				System.out.println("4 - April	8 - August	12 - December");
				// Month validation
				do {
					System.out.print("\nChoose a Month, [1-12]: ");
					month = sc.nextInt();
					
					if (month < 1 || month > 12) {
						System.out.println("Invalid month, please enter a value between 1 and 12.");
						flg = false;
					} else {
						flg = true;
					}
					
				} while (!flg);
				
				System.out.println("\nShowing Monthly Agenda...");
				for (int i = 0; i < agenda.length; i++) {
					if (month == (i + 1)) {
						System.out.println("\nMonth	Day	Hour	Appointment\n" + 
								"===================================\n");
						
						for (int j = 0; j < agenda[i].length; j++) {
							for (int k = 0; k < agenda[i][j].length; k++) {
								System.out.println(
										"  " + (i + 1) + "		" + j + "	" + k + ":00" + "	" + agenda[i][j][k]);
							}
							System.out.println("-----------------------------------");
						}
						System.out.println();
					}
				}
				
				break;
				
			case 7:
				/// CONSULT / READ all appointments

				System.out.println("\nShowing Full Agenda...");
				for (int i = 0; i < agenda.length; i++) {
					System.out.println("\nMonth	Day	Hour	Appointment\n" +
										"===================================\n");

					for (int j = 0; j < agenda[i].length; j++) {
						for (int k = 0; k < agenda[i][j].length; k++) {
							// System.out.println("Test");
							System.out.println(
									" " + (i + 1) + "  	" + (j + 1) + " 	" + k + ":00" + "   " + agenda[i][j][k]);
						}
						System.out.println("-----------------------------------");
					}
					System.out.println();
				}

				break;

			case 0:
				// Exit
				doAnotherOperation = false;
				System.out.println("Closing app...");
				System.out.println("App finished.");
				break;

			default:
				System.out.println("Invalid option.");

			}

			if (doAnotherOperation) {
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
			}

		} while (doAnotherOperation);

		sc.close();
	}
}

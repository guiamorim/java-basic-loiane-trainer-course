package com.loiane.cursojava.exercicios_aulas16and17;

import java.time.LocalDate;
import java.util.Scanner;

// 3. This App will validate if the entries match witht the expected result.
// Else, the application will request a new entry until the condition be matched.

public class Exerc03 {

	public static void main(String[] args) {

		String name;
		long age = 0;
		double salary = 0;
		char genre, maritalStatus;
		boolean validation = true;
		;

		Scanner sc = new Scanner(System.in);

		do {

			System.out.print("\nPlease, enter a name bigger than 3 letters: ");
			name = sc.nextLine();

			// name validation
			if (name.length() < 4) {
				System.out.print("Sorry the name entered has " + name.length() + " letters.");
				System.out.println("The name must to have more than 3 letters.");
				System.out.println("");
				validation = false;
			} else {
				System.out.println("Thank you. Your name has been registered.");
				validation = true;

			}
		} while (validation == false);

		do {

			System.out.println("\nPlease, enter your birthyear:");
			int birthYear = sc.nextInt();
			LocalDate currentYear = LocalDate.now();
			age = currentYear.getYear() - birthYear;

			// Age validation
			System.out.println("Age: " + age);
			if (age < 0 || age > 150) {
				System.out.println("Age is invalid");
				validation = false;
			} else {
				System.out.println("Age is valid.");
				validation = true;
			}
		} while (validation == false);

		do {
			System.out.println("\nPlease, enter a value for Salary:");
			salary = sc.nextDouble();

			// Salary validation
			if (salary > 0) {
				System.out.println("Salary is greater than 0.");
				validation = true;
			} else {
				System.out.println("Salary is equal or lower than 0.");
				validation = false;
			}
			;

		} while (validation == false);

		do {
			// Genre validation
			validation = true;

			System.out.print("\nPlease, enter your genre: (m / f / o)");
			genre = sc.next().strip().toLowerCase().charAt(0);

			switch (genre) {
			case 'f':
				System.out.println("Genre: Female");
				break;
			case 'm':
				System.out.println("Genre: Male");
				break;
			case 'o':
				System.out.println("Genre: Other");
				break;
			default:
				System.out.println("Option is not valid. Please try again.");
			}

			if (genre != 'f' && genre != 'm' && genre != 'o') {
				validation = false;
			}

		} while (validation == false);

		do {
			// Marital status validation

			// Genre validation
			validation = true;

			System.out.println("\nPlease, enter your current marital status:");
			System.out.println("s - single");
			System.out.println("m - married");
			System.out.println("w - widowed");
			System.out.println("d - divorced");
			maritalStatus = sc.next().strip().toLowerCase().charAt(0);

			switch (maritalStatus) {
			case 's':
				System.out.println("Marital Status: Single");
				break;
			case 'm':
				System.out.println("Marital Status: Married");
				break;
			case 'w':
				System.out.println("Marital Status: Widowed");
				break;
			case 'd':
				System.out.println("Marital Status: Divorced");
				break;
			default:
				System.out.println("Option is not valid. Please try again.");
			}

			if (genre != 's' && genre != 'm' && genre != 'w' && genre != 'd') {
				validation = false;
			}
		} while (validation == false);
		
		
		

		sc.close();
	}

}

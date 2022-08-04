package com.loiane.cursojava.exercicios_aulas16and17;

import java.util.Scanner;

// 2. This App will reads and evaluates a login and password (boths being Strings).
// In case these 2 entries are equals, the App will inform user about that and 
// continue requesting the correct entries.

public class Exerc02 {

	public static void main(String[] args) {

		String login, password;
//		int attempt = 0;
		boolean entriesEquals = false;

		Scanner sc = new Scanner(System.in);

			do {
				System.out.println("Please, enter the login and password. Both must be different each other\n");

				System.out.println("Login:");
				login = sc.next();
				System.out.println("\nPassword:");
				password = sc.next();

				if (login.equalsIgnoreCase(password)) {
					
					System.out.println("\nPlease try again, login and password can't be equals.\n");
					entriesEquals = true;

	
				} else {
					System.out.println("\nAccount has been registered");
				}
			} while (entriesEquals);

		sc.close();
	}

}

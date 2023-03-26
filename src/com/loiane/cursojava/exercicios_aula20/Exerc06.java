package com.loiane.cursojava.exercicios_aula20;

// 06. This App is a kind of game called nought and crosses, where the aim a game in which two players seek to complete a row 
// of either three noughts or three crosses drawn alternately in the spaces of a grid of nine squares.
// This app will validate if the position is valid or not and if there is a winner after the 9 plays, else it will be consider a draw.


import java.util.Scanner;

public class Exerc06 {

	public static void main(String[] args) {

		String[][] game = new String[3][3];

		boolean endGame = false;
		boolean validPosition = true;
		int rowPosition, colPosition;
		String player1Signal = "o";
		String player2Signal = "x";
		String player;

		Scanner sc = new Scanner(System.in);

		System.out.println("========== [ NOUGHTS N CROSSESS ] ==========\n");
		System.out.println("Player 1 = 'x' \n" + "Player 2 = 'o' \n");
		do {

			// Show the game board
			System.out.println("Please, choose a available position on the game board:\n");
			for (int i = 0; i < game.length; i++) {
				System.out.print(" ");
				for (int j = 0; j < game[i].length; j++) {
					System.out.print("|" + i + "," + j + "|");
				}
				System.out.print("\n ---------------");
				System.out.println();
			}

			// filling with space, only for better visualization of board game
			for (int i = 0; i < game.length; i++) {
				System.out.print(" ");
				for (int j = 0; j < game[i].length; j++) {
					game[i][j] = " ";
				}
			}

			int plays = 0;
			do {

				// Switching the turn between the player 1 n player 2:
				if (plays % 2 == 0) {
					player = "1";
				} else {
					player = "2";
				}

				// Available position validation
				do {

					System.out.println("\nThis is the player " + player + " turn\n");
					// Row position validation
					do {
						validPosition = true;
						System.out.print("Enter the Line position: [0 - 2]:");
						rowPosition = sc.nextInt();

						if (rowPosition < 0 || rowPosition > 2) {
							System.out.println(
									"Invalid value. Please try again and insert an integer valid value between 0 and 2");
							validPosition = false;
						}

					} while (!validPosition);

					// Column position validation
					do {
						validPosition = true;
						System.out.print("Enter the Column position: [0 - 2]:");
						colPosition = sc.nextInt();

						if (colPosition < 0 || colPosition > 2) {
							System.out.println(
									"Invalid value. Please try again and insert an integer valid value between 0 and 2");
							validPosition = false;
						}
					} while (!validPosition);

					// game[0][0] = 'o'; --> only to Test

					if (!game[rowPosition][colPosition].isBlank()) {
						System.out.println("Sorry, this position is not empty. Please, choose a different one.");
						validPosition = false;
					}

				} while (!validPosition);

				if (player == "1")
					for (int i = 0; i < game.length; i++) {
						for (int j = 0; j < game[i].length; j++) {
							if (rowPosition == i && colPosition == j) {
								game[i][j] = player1Signal;
							}
						}
					}

				if (player == "2")
					for (int i = 0; i < game.length; i++) {
						for (int j = 0; j < game[i].length; j++) {
							if (rowPosition == i && colPosition == j) {
								game[i][j] = player2Signal;
							}
						}
					}

				// Display the game board
				for (int i = 0; i < game.length; i++) {
					System.out.print(" ");
					for (int j = 0; j < game[i].length; j++) {
						System.out.print("|" + game[i][j] + "|");
					}
					System.out.print("\n ---------");
					System.out.println();
				}

				// WIN or DRAW Validation

				// Line validation
				if (!game[0][0].isBlank() && game[0][0].equals(game[0][1]) && game[0][1].equals(game[0][2])) {
					endGame = true;
					if (game[0][0].equals(player1Signal)) {
						System.out.println("The player 1 is the WINNER!");
						break;
					} else {
						System.out.println("The player 2 is the WINNER!");
					}
				} else if (!game[1][0].isBlank() && game[1][0].equals(game[1][1]) && game[1][1].equals(game[1][2])) {
					endGame = true;
					if (game[1][0].equals(player1Signal)) {
						System.out.println("The player 1 is the WINNER!");
					} else {
						System.out.println("The player 2 is the WINNER!");
					}
				} else if (!game[2][0].isBlank() && game[2][0].equals(game[2][1]) && game[2][1].equals(game[2][2])) {
					endGame = true;
					if (game[2][0].equals(player1Signal)) {
						System.out.println("The player 1 is the WINNER!");
					} else {
						System.out.println("The player 2 is the WINNER!");
					}
					// Column validation
				} else if (!game[0][0].isBlank() && game[0][0].equals(game[1][0]) && game[1][0].equals(game[2][0])) {
					endGame = true;
					if (game[0][0].equals(player1Signal)) {
						System.out.println("The player 1 is the WINNER!");
					} else {
						System.out.println("The player 2 is the WINNER!");
					}
				} else if (!game[0][1].isBlank() && game[0][1].equals(game[1][1]) && game[1][1].equals(game[2][1])) {
					endGame = true;
					if (game[0][1].equals(player1Signal)) {
						System.out.println("The player 1 is the WINNER!");
					} else {
						System.out.println("The player 2 is the WINNER!");
					}
				} else if (!game[0][2].isBlank() && game[0][2].equals(game[1][2]) && game[1][2].equals(game[2][2])) {
					endGame = true;
					if (game[0][2].equals(player1Signal)) {
						System.out.println("The player 1 is the WINNER!");
					} else {
						System.out.println("The player 2 is the WINNER!");
					}
					// transversal validation
				} else if (!game[0][0].isBlank() && game[0][0].equals(game[1][1]) && game[1][1].equals(game[2][2])) {
					endGame = true;
					if (game[0][0].equals(player1Signal)) {
						System.out.println("The player 1 is the WINNER!");
					} else {
						System.out.println("The player 2 is the WINNER!");
					}
				} else if (!game[2][0].isBlank() && game[2][0].equals(game[1][1]) && game[1][1].equals(game[0][2])) {
					endGame = true;
					if (game[2][0].equals(player1Signal)) {
						System.out.println("The player 1 is the WINNER!");
					} else {
						System.out.println("The player 2 is the WINNER!");
					}
				} else {
					// (Turn control until 9 attempts, plays variable starts on 0)
					if (plays == 8) {
						endGame = true;
						System.out.println("DRAW!\n" + "No Winners");

					} else {
						endGame = false;
					}
				}
				plays++; // keeps incrementing the plays counting

			} while (!endGame);

			// Game restart control
			System.out.println("Do you wish play it again?[y|n]");
			char lastplay = sc.next().strip().toLowerCase().charAt(0);
			if (lastplay == 'y') {
				endGame = true;

			} else {
				endGame = false;
				System.out.println("Game has been closed.");
			}

		} while (endGame);

		sc.close();
	}

}

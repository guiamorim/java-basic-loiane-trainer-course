package com.loiane.cursojava.aula33.labs;

import java.util.Scanner;

public class TicTacToeTest_Exerc04 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		TicTacToe ticTacToe = new TicTacToe();

		System.out.println("Player 1 = X");
		System.out.println("Player 2 = O");

		boolean won = false;
		char signal;
		int line = 0, column = 0;

		while (!won) {

			if (ticTacToe.turnPlayer1()) {

				System.out.println("Player 1 turn.");
				signal = 'X';
			} else {

				System.out.println("Player 2 turn.");
				signal = '0';
			}

			System.out.println("Please, choose a line and a column (1-3)");

			line = value("Linha", sc);
			column = value("column", sc);

			if (!ticTacToe.moveValidation(line, column, signal)) {
				System.out.println("Position already used, try again.");
			}

			ticTacToe.printBoardGame();

			if (ticTacToe.winnerChecking('X')) {
				won = true;
				System.out.println("Congratulations, player 1 won.");
			} else if (ticTacToe.winnerChecking('O')) {
				won = true;
				System.out.println("Congratulations, player 2 won.");
			} else if (ticTacToe.getmove() > 9) {
				won = true;
				System.out.println("There is no a Winner for this match.");
			}
		}
	}

	// Position value validation
	static int value(String valueType, Scanner sc) {
		int value = 0;
		boolean valueValidator = false;
		while (!valueValidator) {
			System.out.println("Please, enter the " + valueType + " (1, 2 or 3)");
			value = sc.nextInt();
			if (value >= 1 && value <= 3) {
				valueValidator = true;
			} else {
				System.out.println("Invalid entry, please try again!");
			}
		}
		value--; // --> to match with the original array positions
		return value;

	}
}

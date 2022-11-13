package com.loiane.cursojava.exercicios_aula27;

import java.util.Scanner;

public class Exerc04TicTacToe {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		boolean gameEnded = false;
		int move = 0;
		String currentPlayer;

		TicTacToe game01 = new TicTacToe();

		do {
			move = 0;
			game01.mainMessage();

			System.out.print("Enter the player 1 name: ");
			game01.setPlayers(0, sc.next());

			System.out.print("Enter the player 2 name: ");
			game01.setPlayers(1, sc.next());

			System.out.println();

			// Show the boardgame
			game01.fillInitialSlots();
			game01.showBoardGame();
			boolean endGame;
			
			do {
				// Switching the turn between the player 1 and player 2:
				if (move % 2 == 0) {
					currentPlayer = game01.getPlayer(0);
				} else {
					currentPlayer = game01.getPlayer(1);
				}

				int rowPosition;
				int colPosition;
				
				do {
					game01.turnMessage(currentPlayer);
					
					rowPosition = sc.nextInt();
					colPosition = sc.nextInt();
					
					game01.positionValidation(rowPosition, colPosition);
				} while (!game01.returnValidation(rowPosition, colPosition));

				game01.putPlayerSignalOnBoardGame(currentPlayer, rowPosition, colPosition);
				game01.showBoardGame();
				game01.endGameValidation(move);
				
				endGame = game01.endGameValidation(move);

				move++;

			} while (!endGame);

			// Game restart control
			System.out.println("Do you like to play it again [y|n] ?");
			char lastplay = sc.next().strip().toLowerCase().charAt(0);
			if (lastplay == 'y') {
				gameEnded = true;

			} else {
				gameEnded = false;
				System.out.println("Game has been closed.");
			}

		} while (gameEnded);
		sc.close();

	}
}

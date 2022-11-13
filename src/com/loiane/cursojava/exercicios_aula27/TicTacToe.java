package com.loiane.cursojava.exercicios_aula27;

public class TicTacToe {

	private String gameBoard[][] = new String[4][4];
	private String[] players = new String[2];

	// Methods

	// Fill the initial slots
	void fillInitialSlots() {
		for (int i = 1; i < this.gameBoard.length; i++) {
			for (int j = 1; j < this.gameBoard[i].length; j++) {
				this.gameBoard[0][0] = "  ";
				this.gameBoard[0][1] = "1C";
				this.gameBoard[0][2] = "2C";
				this.gameBoard[0][3] = "3C";
				this.gameBoard[1][0] = "1L";
				this.gameBoard[2][0] = "2L";
				this.gameBoard[3][0] = "3L";
				this.gameBoard[i][j] = "  ";
			}
		}
	}

	// Display the main message
	void mainMessage() {
		System.out.println("========== [ TIC TAC TOE ] ==========\n\n" + "Player 1 = 'X' \n" + "Player 2 = 'O' \n");
		System.out.println("Please, choose a available position on the game board:\n");
	}

	// Display the boardgame
	void showBoardGame() {
		for (int i = 0; i < this.gameBoard.length; i++) {

			for (int j = 0; j < this.gameBoard[i].length; j++) {
				System.out.print(this.gameBoard[i][j] + " | ");
			}
			System.out.println();
		}

	}

	// Position validation

	void turnMessage(String currentPlayer) {
		System.out.println("\n" + currentPlayer + " turn.\n");
		System.out.print("Enter the position value for [row, col][1 - 3] split by space: ");
	}

	void positionValidation(int rowPos, int colPos) {
		if ((rowPos < 1 || rowPos > 3) || (colPos < 1 || colPos > 3)) {
			System.out.println("Invalid value. Please try again and insert an integer valid value between 0 and 2");
		} else if (!this.gameBoard[rowPos][colPos].isBlank()) {
			System.out.println("Sorry, this position is not empty. Please, choose a different one.");
		} else {
//			System.out.println("Ok.");
		}
	}
	
	boolean returnValidation(int rowPos, int colPos) {
		if ((rowPos < 1 || rowPos > 3) || (colPos < 1 || colPos > 3)) {
			return false;
		} else if (!this.gameBoard[rowPos][colPos].isBlank()) {
			return false;
		} else {
			return true;
		}
	}

	void putPlayerSignalOnBoardGame(String currentPlayer, int rowPos, int colPos) {
		String player1Signal = " O";
		String player2Signal = " X";

		if (currentPlayer.equals(this.players[0])) {
			for (int i = 0; i < gameBoard.length; i++) {
				for (int j = 0; j < gameBoard[i].length; j++) {
					if (rowPos == i && colPos == j) {
						gameBoard[i][j] = player1Signal;
					}
				}
			}
		}

		if (currentPlayer.equals(this.players[1])) {
			for (int i = 0; i < gameBoard.length; i++) {
				for (int j = 0; j < gameBoard[i].length; j++) {
					if (rowPos == i && colPos == j) {
						gameBoard[i][j] = player2Signal;
					}
				}
			}
		}
	}

	// WIN or DRAW Validation
	boolean endGameValidation(int moveQuantity) {
		String player1Signal = " O";

		// Line validation
		if (!gameBoard[1][1].isBlank() && gameBoard[1][1].equals(gameBoard[1][2]) && gameBoard[1][2].equals(gameBoard[1][3])) {
			if (gameBoard[1][1].equals(player1Signal)) {
				System.out.println("Player 1 Wins");
			} else {
				System.out.println("Player 2 Wins");
			}
			return true;
		} else if (!gameBoard[2][1].isBlank() && gameBoard[2][1].equals(gameBoard[2][2]) && gameBoard[2][2].equals(gameBoard[2][3])) {
			if (gameBoard[2][1].equals(player1Signal)) {
				System.out.println("Player 1 Wins");
			} else {
				System.out.println("Player 2 Wins");
			}
			return true;
		} else if (!gameBoard[3][1].isBlank() && gameBoard[3][1].equals(gameBoard[3][2]) && gameBoard[3][2].equals(gameBoard[3][3])) {
			if (gameBoard[3][1].equals(player1Signal)) {
				System.out.println("Player 1 Wins");
			} else {
				System.out.println("Player 2 Wins");
			}
			return true;
			// Column validation
		} else if (!gameBoard[1][1].isBlank() && gameBoard[1][1].equals(gameBoard[2][1]) && gameBoard[2][1].equals(gameBoard[3][1])) {
			if (gameBoard[1][1].equals(player1Signal)) {
				System.out.println("Player 1 Wins");
			} else {
				System.out.println("Player 2 Wins");
			}
			return true;
		} else if (!gameBoard[1][2].isBlank() && gameBoard[1][2].equals(gameBoard[2][2]) && gameBoard[2][2].equals(gameBoard[3][2])) {
			if (gameBoard[1][2].equals(player1Signal)) {
				System.out.println("Player 1 Wins");
			} else {
				System.out.println("Player 2 Wins");
			}
			return true;
		} else if (!gameBoard[1][3].isBlank() && gameBoard[1][3].equals(gameBoard[2][1]) && gameBoard[2][1].equals(gameBoard[3][1])) {
			if (gameBoard[1][3].equals(player1Signal)) {
				System.out.println("Player 1 Wins");
			} else {
				System.out.println("Player 2 Wins");
			}
			return true;
			// transversal validation
		} else if (!gameBoard[1][1].isBlank() && gameBoard[1][1].equals(gameBoard[2][2]) && gameBoard[2][2].equals(gameBoard[3][3])) {
			if (gameBoard[0][0].equals(player1Signal)) {
				System.out.println("Player 1 Wins");
			} else {
				System.out.println("Player 2 Wins");
			}
			return true;
		} else if (!gameBoard[1][3].isBlank() && gameBoard[1][3].equals(gameBoard[2][2]) && gameBoard[2][2].equals(gameBoard[1][1])) {
			if (gameBoard[2][0].equals(player1Signal)) {
				System.out.println("Player 1 Wins");
			} else {
				System.out.println("Player 2 Wins");
			}
			return true;
		} else {
			// (Turn control until 9 attempts, plays variable starts on 0)
			if (moveQuantity == 9) {
				System.out.println("DRAW!\n" + "There is no Winners");
				return true;
			} else {
				return false;
			}
		}

	}

	public String getPlayer(int position) {
		return players[position];
	}

	public void setPlayers(int position, String playerName) {
		this.players[position] = playerName;
	}

}
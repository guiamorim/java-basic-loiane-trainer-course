package com.loiane.cursojava.aula33.labs;

public class TicTacToe {

	private char [][] boardGame;
	private int move;
	
	public TicTacToe() {
		boardGame = new char [3][3];
		move = 1;
	}

	public char[][] getBoardGame() {
		return boardGame;
	}

	public void setBoardGame(char[][] boardGame) {
		this.boardGame = boardGame;
	}

	public int getmove() {
		return move;
	}

	public void setmove(int move) {
		this.move = move;
	}
	
	
	public boolean moveValidation(int line, int column, char signal) {
		if(boardGame[line][column] == signal || boardGame[line][column] == 'O'){
			return false;
		} else {
			boardGame[line][column] = signal;
			move++;
			return true;
		}
	
	}
	
	
	public void printBoardGame() {
		for(int i = 0 ; i < boardGame.length; i++) {
			for(int j =0; j < boardGame[i].length; j++) {
				System.out.print(boardGame[i][j] + " |");
			}
			System.out.println();
		}
	}
	
	
	public boolean winnerChecking(char signal) {
		if(
				(boardGame[0][0] == signal && boardGame[0][1] == signal && boardGame[0][2] == signal) || //line 01
				(boardGame[1][0] == signal && boardGame[1][1] == signal && boardGame[1][2] == signal) || //line 02
				(boardGame[2][0] == signal && boardGame[2][1] == signal && boardGame[2][2] == signal) || //line 03
				(boardGame[0][0] == signal && boardGame[1][0] == signal && boardGame[2][0] == signal) || //column 01
				(boardGame[0][1] == signal && boardGame[1][1] == signal && boardGame[2][1] == signal) || //column 02
				(boardGame[0][2] == signal && boardGame[1][2] == signal && boardGame[2][2] == signal) || //column 03
				(boardGame[0][0] == signal && boardGame[1][1] == signal && boardGame[2][2] == signal) || //diagonal 01
				(boardGame[0][2] == signal && boardGame[1][1] == signal && boardGame[2][0] == signal))   //diagonal 02
				{
			return true;
		}
		return false;
	}
	
	
	public boolean turnPlayer1() {
		if(move %2 == 1) {
			return true;
		}
		return false;
	}
	
}

package assignments;

import java.util.Scanner;

public class TicTacToe {
	
	static String X = "X";
	static String O = "O";
	static String FREE = " ";
	
	/**
	 * Creates a new 3x3 two-dimensional array to represent a blank tic tac toe board where each cell is free. 
	 * @return a 3x3 two-dimensional array with each element set to " ".
	 */
	public static String[][] createBoard() {
		return null;
	}
	
	/**
	 * Determines the player whose turn it is next, based off of the current piece turn.
	 * @param pieceTurn A string, either "X" or "O", representing the piece that was just placed.
	 * @return The return conditions for this method are: 
	 * - "O" if pieceTurn is "X"
	 * - "X" otherwise.
	 */
	public static String determinePieceTurn(String pieceTurn) {
		return null;
	}
	
	/**
	 * Determines if the game is over, either due to a win by one player, or because no more moves can be made.
	 * @param winner The string representing the piece that won, either "X", "O", or " ".
	 * @param board The two-dimensional array representing the tic tac toe board.
	 * @return The return conditions for this method are:
	 * - true if the winner variable is "X" or "O"
	 * - true if the board is full (HINT: use the isBoardFull method)
	 * - false otherwise
	 */
	public static boolean checkIfGameOver(String winner, String[][] board) {
		return false;
	}
	
	/**
	 * Determines if the board is full.
	 * @param board a two-dimensional array representing a tic tac toe board.
	 * @return The return conditions for this method are:
	 * - true if the board is full and contains no free spaces
	 * - false otherwise
	 */
	public static boolean isBoardFull(String[][] board){
		return false;
	}
	
	/** Places a piece on the board at a certain position
	 * @param xPosition the column number to place the piece at
	 * @param yPosition the row number to place the piece at
	 * @param board	   	a two-dimensional array representing a tic tac toe board
	 * @param pieceTurn the piece to place, either "X" or "O"
	 */
	
	public static void placePiece(int xPosition, int yPosition, String[][] board, String pieceTurn) {
		
	}
	
	/**
	 * Determines if every cell in a specified row contains the same pieces.
	 * @param rowNumber the number of the row to check. 0 = top, 1 = center, 2 = bottom.
	 * @param board a two-dimensional array representing a tic-tac-toe board.
	 * @return The return conditions for this method are:
	 * - true if every cell in the specified row contains the same pieces
	 * - false otherwise
	 */
	public static boolean rowAllSame(int rowNumber, String board[][]) {
		return false;
	}

	/**
	 * Determines if every cell in a specified column contains the same pieces.
	 * @param columnNumber the number of the column to check. 0 = left, 1 = center, 2 = right.
	 * @param board a two-dimensional array representing a tic-tac-toe board.
	 * @return The return conditions for this method are:
	 * - true if every cell in the specified column contains the same pieces
	 * - false otherwise
	 */
	public static boolean columnAllSame(int columnNumber, String board[][]) {
		return false;
	}

	/**
	 * Determines if the given x and y positions are valid
	 * @param xPosition the column number to check
	 * @param yPosition the row number to check
	 * @param board     a two-dimensional array representing a tic tac toe board
	 * @return The return conditions for this method are:
	 * if the given x position is less than 0 or greater than 2, return false
	 * if the given y position is less than 0 or greater than 2, return false
	 * if the space at the given x, y position on the board already has a piece, return false
	 * otherwise, return true
	 */
	public static boolean validateChoice(int xPosition, int yPosition, String[][] board) {
		return false;
	}
	
	/**
	 * Determines if one player has satisfied the conditions necessary to win.
	 * @param board The two-dimensional array representing the tic tac toe board.
	 * @return The return conditions for this method are:
	 * - "X" if the X player has satisfied a win condition
	 * - "O" if the O player has satisfied a win condition
	 * - " " otherwise
	 * 
	 * In tic tac toe, a player has won if they:
	 * - have three pieces in one row
	 * - have three pieces in one column
	 * - have three pieces in one diagonal
	 */
	public static String determineWinner(String[][] board) {
		return null;
	}

	public static void main(String[] args) {
		boolean isGameOver = false;
		String pieceTurn = X;
		String winner = "";
		Scanner keyboard = new Scanner(System.in);
		String[][] board = createBoard();
		printBoard(board);
		do {
			boolean isChoiceValid = false;
			int xPosition = -1;
			int yPosition = -1;
			do {
				printTurnStatement(pieceTurn);
				xPosition = getNumber(keyboard, X);
				yPosition = getNumber(keyboard, O);
				isChoiceValid = validateChoice(xPosition, yPosition, board);
			}while(!isChoiceValid);
			placePiece(xPosition, yPosition, board, pieceTurn);
			winner = determineWinner(board);
			if(checkIfGameOver(winner, board)) {
				isGameOver = true;
				printGameOverStatement(winner);
			}
			printBoard(board);
			pieceTurn = determinePieceTurn(pieceTurn);
		}
		while(!isGameOver);
		keyboard.close();
	}

	public static void printTurnStatement(String pieceTurn) {
		System.out.println("It is player " + pieceTurn + "'s turn");
	}

	public static void printBoard(String[][] board) {
		System.out.println("-------");
		for(int y = 0; y < 3; y++) {
			System.out.print("|");
			for(int x = 0; x < 3; x++) {
				System.out.print(board[x][y]);
				System.out.print("|");
			}
			System.out.println();
			System.out.println("-------");
		}
	}

	public static void printGameOverStatement(String winner) {
		if(winner.equals(FREE)) System.out.println("The game is a draw!");
		else System.out.println("The game was won by player: " + winner);
	}

	public static int getNumber(Scanner keyboard, String coordinate) {
		if(coordinate.equals(O)) coordinate = "Y";
		System.out.print("Enter a number between 0 and 2, inclusive for the " + coordinate + "-coordinate: ");
		return keyboard.nextInt();
	}

}

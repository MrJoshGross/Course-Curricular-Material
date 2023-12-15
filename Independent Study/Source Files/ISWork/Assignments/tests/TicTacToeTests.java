package tests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import assignments.TicTacToe;

public class TicTacToeTests {

	String X = "X";
	String O = "O";
	String FREE = " ";
	String[][] empty,full,xWinDiagonal,oWinVertical,xAndOWinHorizontal;
	
	@Before
	public void setup() {
		empty = new String[][]{	{FREE,FREE,FREE},
								{FREE,FREE,FREE},
								{FREE,FREE,FREE}};
								
		full = new String[][]{	{X,X,O},
								{O,O,X},
								{X,X,O}};
								
		xWinDiagonal = new String[][]{	{X,X,O},
									  	{O,X,X},
									  	{O,FREE,X}};
									  	
		oWinVertical = new String[][]{	{X,FREE,O},
										{O,X,O},
										{O,X,O}};
										
		xAndOWinHorizontal = new String[][]{	{X,X,X},
												{O,O,O},
												{X,FREE,O}};
	}
	
	@Test
	public void testDeterminePieceTurn() {
		assertEquals(TicTacToe.determinePieceTurn(X), O);
		assertEquals(TicTacToe.determinePieceTurn(O), X);
	}

	@Test 
	public void testCheckIfGameOver() {
		assertEquals(TicTacToe.checkIfGameOver(FREE, empty), false);
		assertEquals(TicTacToe.checkIfGameOver(X, empty), true);
		assertEquals(TicTacToe.checkIfGameOver(O, empty), true);
		
		assertEquals(TicTacToe.checkIfGameOver(FREE, full), true);
		assertEquals(TicTacToe.checkIfGameOver(X, full), true);
		assertEquals(TicTacToe.checkIfGameOver(O, full), true);
		
		assertEquals(TicTacToe.checkIfGameOver(FREE, xWinDiagonal), false);
		assertEquals(TicTacToe.checkIfGameOver(X, xWinDiagonal), true);
		assertEquals(TicTacToe.checkIfGameOver(O, xWinDiagonal), true);
		
		assertEquals(TicTacToe.checkIfGameOver(FREE, oWinVertical), false);
		assertEquals(TicTacToe.checkIfGameOver(X, oWinVertical), true);
		assertEquals(TicTacToe.checkIfGameOver(O, oWinVertical), true);
		
		assertEquals(TicTacToe.checkIfGameOver(FREE, xAndOWinHorizontal), false);
		assertEquals(TicTacToe.checkIfGameOver(X, xAndOWinHorizontal), true);
		assertEquals(TicTacToe.checkIfGameOver(O, xAndOWinHorizontal), true);
	}
	
	@Test
	public void testDetermineWinner() {
		assertEquals(TicTacToe.determineWinner(empty), FREE);
		assertEquals(TicTacToe.determineWinner(full), FREE);
		assertEquals(TicTacToe.determineWinner(xWinDiagonal), X);
		assertEquals(TicTacToe.determineWinner(oWinVertical), O);
		assertEquals(TicTacToe.determineWinner(xAndOWinHorizontal), X);
	}
	
	@Test
	public void testIsBoardFull() {
		assertEquals(TicTacToe.isBoardFull(empty), false);
		assertEquals(TicTacToe.isBoardFull(full), true);
		assertEquals(TicTacToe.isBoardFull(xWinDiagonal), false);
		assertEquals(TicTacToe.isBoardFull(oWinVertical), false);
		assertEquals(TicTacToe.isBoardFull(xAndOWinHorizontal), false);
	}
	
	@Test
	public void testColumnAllSame() {
		assertEquals(TicTacToe.columnAllSame(0, empty), true);
		assertEquals(TicTacToe.columnAllSame(1, empty), true);
		assertEquals(TicTacToe.columnAllSame(2, empty), true);
		
		assertEquals(TicTacToe.columnAllSame(0, full), false);
		assertEquals(TicTacToe.columnAllSame(1, full), false);
		assertEquals(TicTacToe.columnAllSame(2, full), false);
		
		assertEquals(TicTacToe.columnAllSame(0, xWinDiagonal), false);
		assertEquals(TicTacToe.columnAllSame(1, xWinDiagonal), false);
		assertEquals(TicTacToe.columnAllSame(2, xWinDiagonal), false);
		
		assertEquals(TicTacToe.columnAllSame(0, oWinVertical), false);
		assertEquals(TicTacToe.columnAllSame(1, oWinVertical), false);
		assertEquals(TicTacToe.columnAllSame(2, oWinVertical), true);
		
		assertEquals(TicTacToe.columnAllSame(0, xAndOWinHorizontal), false);
		assertEquals(TicTacToe.columnAllSame(1, xAndOWinHorizontal), false);
		assertEquals(TicTacToe.columnAllSame(2, xAndOWinHorizontal), false);
	}
	
	@Test
	public void testRowAllSame() {
		assertEquals(TicTacToe.rowAllSame(0, empty), true);
		assertEquals(TicTacToe.rowAllSame(1, empty), true);
		assertEquals(TicTacToe.rowAllSame(2, empty), true);
		
		assertEquals(TicTacToe.rowAllSame(0, full), false);
		assertEquals(TicTacToe.rowAllSame(1, full), false);
		assertEquals(TicTacToe.rowAllSame(2, full), false);
		
		assertEquals(TicTacToe.rowAllSame(0, xWinDiagonal), false);
		assertEquals(TicTacToe.rowAllSame(1, xWinDiagonal), false);
		assertEquals(TicTacToe.rowAllSame(2, xWinDiagonal), false);
		
		assertEquals(TicTacToe.rowAllSame(0, oWinVertical), false);
		assertEquals(TicTacToe.rowAllSame(1, oWinVertical), false);
		assertEquals(TicTacToe.rowAllSame(2, oWinVertical), false);
		
		assertEquals(TicTacToe.rowAllSame(0, xAndOWinHorizontal), true);
		assertEquals(TicTacToe.rowAllSame(1, xAndOWinHorizontal), true);
		assertEquals(TicTacToe.rowAllSame(2, xAndOWinHorizontal), false);
	}
	
	@Test
	public void testPlacePiece() {
		TicTacToe.printBoard(empty);
		TicTacToe.placePiece(0, 0, empty, X);
		TicTacToe.placePiece(0, 1, empty, O);
		TicTacToe.placePiece(0, 2, empty, X);
		TicTacToe.placePiece(1, 0, empty, O);
		TicTacToe.placePiece(1, 1, empty, X);
		TicTacToe.placePiece(1, 2, empty, O);
		TicTacToe.placePiece(2, 0, empty, X);
		TicTacToe.placePiece(2, 1, empty, O);
		TicTacToe.placePiece(2, 2, empty, X);
		TicTacToe.printBoard(empty);
		
		assertEquals(TicTacToe.validateChoice(0, 0, empty), false);
		assertEquals(TicTacToe.validateChoice(0, 1, empty), false);
		assertEquals(TicTacToe.validateChoice(0, 2, empty), false);
		assertEquals(TicTacToe.validateChoice(1, 0, empty), false);
		assertEquals(TicTacToe.validateChoice(1, 1, empty), false);
		assertEquals(TicTacToe.validateChoice(1, 2, empty), false);
		assertEquals(TicTacToe.validateChoice(2, 0, empty), false);
		assertEquals(TicTacToe.validateChoice(2, 1, empty), false);
		assertEquals(TicTacToe.validateChoice(2, 2, empty), false);
		
		assertEquals(TicTacToe.isBoardFull(empty), true);
		assertEquals(TicTacToe.determineWinner(empty), X);
	}
	
	@Test
	public void testValidateChoice() {
		assertEquals(TicTacToe.validateChoice(-1, -1, empty), false);
		assertEquals(TicTacToe.validateChoice(-3, 1, empty), false);
		assertEquals(TicTacToe.validateChoice(1, -4, empty), false);
		assertEquals(TicTacToe.validateChoice(10, 9, empty), false);
		assertEquals(TicTacToe.validateChoice(6, 2, empty), false);
		assertEquals(TicTacToe.validateChoice(0, 0, empty), true);
		assertEquals(TicTacToe.validateChoice(0, 1, empty), true);
		assertEquals(TicTacToe.validateChoice(0, 2, empty), true);
		assertEquals(TicTacToe.validateChoice(1, 0, empty), true);
		assertEquals(TicTacToe.validateChoice(1, 1, empty), true);
		assertEquals(TicTacToe.validateChoice(1, 2, empty), true);
		assertEquals(TicTacToe.validateChoice(2, 0, empty), true);
		assertEquals(TicTacToe.validateChoice(2, 1, empty), true);
		assertEquals(TicTacToe.validateChoice(2, 2, empty), true);
		
		assertEquals(TicTacToe.validateChoice(-1, -1, full), false);
		assertEquals(TicTacToe.validateChoice(-3, 1, full), false);
		assertEquals(TicTacToe.validateChoice(1, -4, full), false);
		assertEquals(TicTacToe.validateChoice(10, 9, full), false);
		assertEquals(TicTacToe.validateChoice(6, 2, full), false);
		assertEquals(TicTacToe.validateChoice(1, 7, full), false);
		assertEquals(TicTacToe.validateChoice(0, 0, full), false);
		assertEquals(TicTacToe.validateChoice(0, 1, full), false);
		assertEquals(TicTacToe.validateChoice(0, 2, full), false);
		assertEquals(TicTacToe.validateChoice(1, 0, full), false);
		assertEquals(TicTacToe.validateChoice(1, 1, full), false);
		assertEquals(TicTacToe.validateChoice(1, 2, full), false);
		assertEquals(TicTacToe.validateChoice(2, 0, full), false);
		assertEquals(TicTacToe.validateChoice(2, 1, full), false);
		assertEquals(TicTacToe.validateChoice(2, 2, full), false);
		
		assertEquals(TicTacToe.validateChoice(-1, -1, xWinDiagonal), false);
		assertEquals(TicTacToe.validateChoice(-3, 1, xWinDiagonal), false);
		assertEquals(TicTacToe.validateChoice(1, -4, xWinDiagonal), false);
		assertEquals(TicTacToe.validateChoice(10, 9, xWinDiagonal), false);
		assertEquals(TicTacToe.validateChoice(6, 2, xWinDiagonal), false);
		assertEquals(TicTacToe.validateChoice(1, 7, xWinDiagonal), false);
		assertEquals(TicTacToe.validateChoice(0, 0, xWinDiagonal), false);
		assertEquals(TicTacToe.validateChoice(0, 1, xWinDiagonal), false);
		assertEquals(TicTacToe.validateChoice(0, 2, xWinDiagonal), false);
		assertEquals(TicTacToe.validateChoice(1, 0, xWinDiagonal), false);
		assertEquals(TicTacToe.validateChoice(1, 1, xWinDiagonal), false);
		assertEquals(TicTacToe.validateChoice(1, 2, xWinDiagonal), false);
		assertEquals(TicTacToe.validateChoice(2, 0, xWinDiagonal), false);
		assertEquals(TicTacToe.validateChoice(2, 1, xWinDiagonal), true);
		assertEquals(TicTacToe.validateChoice(2, 2, xWinDiagonal), false);
		
		assertEquals(TicTacToe.validateChoice(-1, -1, oWinVertical), false);
		assertEquals(TicTacToe.validateChoice(-3, 1, oWinVertical), false);
		assertEquals(TicTacToe.validateChoice(1, -4, oWinVertical), false);
		assertEquals(TicTacToe.validateChoice(10, 9, oWinVertical), false);
		assertEquals(TicTacToe.validateChoice(6, 2, oWinVertical), false);
		assertEquals(TicTacToe.validateChoice(1, 7, oWinVertical), false);
		assertEquals(TicTacToe.validateChoice(0, 0, oWinVertical), false);
		assertEquals(TicTacToe.validateChoice(0, 1, oWinVertical), true);
		assertEquals(TicTacToe.validateChoice(0, 2, oWinVertical), false);
		assertEquals(TicTacToe.validateChoice(1, 0, oWinVertical), false);
		assertEquals(TicTacToe.validateChoice(1, 1, oWinVertical), false);
		assertEquals(TicTacToe.validateChoice(1, 2, oWinVertical), false);
		assertEquals(TicTacToe.validateChoice(2, 0, oWinVertical), false);
		assertEquals(TicTacToe.validateChoice(2, 1, oWinVertical), false);
		assertEquals(TicTacToe.validateChoice(2, 2, oWinVertical), false);
		
		assertEquals(TicTacToe.validateChoice(-1, -1, xAndOWinHorizontal), false);
		assertEquals(TicTacToe.validateChoice(-3, 1, xAndOWinHorizontal), false);
		assertEquals(TicTacToe.validateChoice(1, -4, xAndOWinHorizontal), false);
		assertEquals(TicTacToe.validateChoice(10, 9, xAndOWinHorizontal), false);
		assertEquals(TicTacToe.validateChoice(6, 2, xAndOWinHorizontal), false);
		assertEquals(TicTacToe.validateChoice(1, 7, xAndOWinHorizontal), false);
		assertEquals(TicTacToe.validateChoice(0, 0, xAndOWinHorizontal), false);
		assertEquals(TicTacToe.validateChoice(0, 1, xAndOWinHorizontal), false);
		assertEquals(TicTacToe.validateChoice(0, 2, xAndOWinHorizontal), false);
		assertEquals(TicTacToe.validateChoice(1, 0, xAndOWinHorizontal), false);
		assertEquals(TicTacToe.validateChoice(1, 1, xAndOWinHorizontal), false);
		assertEquals(TicTacToe.validateChoice(1, 2, xAndOWinHorizontal), false);
		assertEquals(TicTacToe.validateChoice(2, 0, xAndOWinHorizontal), false);
		assertEquals(TicTacToe.validateChoice(2, 1, xAndOWinHorizontal), true);
		assertEquals(TicTacToe.validateChoice(2, 2, xAndOWinHorizontal), false);
	}
	
	@Test
	public void testCreateBoard() {
		String[][] newBoard = TicTacToe.createBoard();
		assertEquals(TicTacToe.isBoardFull(newBoard), false);
		assertEquals(TicTacToe.validateChoice(0, 0, newBoard), true);
		assertEquals(TicTacToe.validateChoice(0, 1, newBoard), true);
		assertEquals(TicTacToe.validateChoice(0, 2, newBoard), true);
		assertEquals(TicTacToe.validateChoice(1, 0, newBoard), true);
		assertEquals(TicTacToe.validateChoice(1, 1, newBoard), true);
		assertEquals(TicTacToe.validateChoice(1, 2, newBoard), true);
		assertEquals(TicTacToe.validateChoice(2, 0, newBoard), true);
		assertEquals(TicTacToe.validateChoice(2, 1, newBoard), true);
		assertEquals(TicTacToe.validateChoice(2, 2, newBoard), true);
	}
}

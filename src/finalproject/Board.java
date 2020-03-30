package finalproject;

import java.awt.Color;

public class Board
{
	private ChessPiece[][] board;
	private final int NUMROWS = 8;
	private final int NUMCOLS = 8;

	public Board()
	{
		board = new ChessPiece[NUMROWS][NUMCOLS];
		initializeSideOfBoard(Color.white);
		initializeSideOfBoard(Color.black);
		
	}
	
	private void initializeSideOfBoard(Color color)
	{
		int pawnRow;
		int nonPawnRow;
		
		
		if(color == Color.white)
		{
			pawnRow = 1;
			nonPawnRow = 0; 
			board[nonPawnRow][3] = new Queen();
			board[nonPawnRow][4] = new King();
		}
		else
		{
			pawnRow = NUMROWS - 2;
			nonPawnRow = NUMROWS - 1;
			board[nonPawnRow][4] = new Queen();
			board[nonPawnRow][3] = new King();
		}
		for(int i = 0; i < NUMCOLS; i++)
		{
			board[pawnRow][i] = new Pawn();
		}
		board[nonPawnRow][0] = new Rook();
		board[nonPawnRow][7] = new Rook();
		board[nonPawnRow][1] = new Knight();
		board[nonPawnRow][6] = new Knight();
		board[nonPawnRow][2] = new Bishop();
		board[nonPawnRow][5] = new Bishop();
	}
	
	public boolean isSpaceOccupied(int row, int col)
	{
		return board[row][col] != null;
	}
	
	public boolean isMoveValid(ChessPiece piece, int tgtRow, int tgtCol)
	{
		if(!isSpaceOccupied(tgtRow, tgtCol))
		{
			if(piece instanceof Knight)
			{
				return true;
			}
			else
			{
				
				//Piece is pawn and piece
			}
		}
		return false;// just place holder for code compilation
		
	}
}

package finalproject;

import java.awt.Color;

public class Board
{
	private ChessPiece[][] board;
	private final int NUMROWS = 8;
	private final int NUMCOLS = 8;

	/**
	 * This is the board constructor. It initializes the board
	 */
	public Board()
	{
		board = new ChessPiece[NUMROWS][NUMCOLS];
		initializeSideOfBoard(Color.white); 
		initializeSideOfBoard(Color.black); 
		
	}
	
	/**
	 * 
	 * @param color
	 */
	private void initializeSideOfBoard(Color color)
	{
		int pawnRow;
		int nonPawnRow;
		
		
		if(color == Color.white)
		{
			pawnRow = 1;
			nonPawnRow = 0; 
			board[nonPawnRow][3] = new Queen("white", "Queen", nonPawnRow, 0);
			board[nonPawnRow][4] = new King();
		}
		else
		{
			pawnRow = NUMROWS - 2;
			nonPawnRow = NUMROWS - 1;
			board[nonPawnRow][4] = new Queen("black", "Queen", nonPawnRow, 0);
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
	
	/**
	 * This method checks whether the Space is occupied or not
	 * @param row
	 * @param col
	 * @return
	 */
	public boolean isSpaceOccupied(int row, int col)
	{
		return board[row][col] != null;
	}
	
	/**
	 * This method returns the ChessPiece at a given row and column
	 * @param row
	 * @param column
	 * @return
	 */
	public ChessPiece getPiece(int row, int column) {
	    
	    if(isSpaceOccupied(row,column)) {
	        ChessPiece piece = board[row][column];
	        return piece;
	    }
        return null;
	}
	
	/**
	 * This method allows one to place a Piece at a particular location
	 * Note: May not be needed
	 * @param piece
	 * @param row
	 * @param column
	 * @return
	 */
	public boolean placePiece(ChessPiece piece, int row, int column) {
	    // Check if the row and column is occupied
        if(getPiece(row,column) != null){
            ChessPiece occupiedPiece = getPiece(row,column);
            // If piece is occupied and color same as potential piece: return false
            if(occupiedPiece.getColor() == piece.getColor()) {
                return false;
            }
            // Otherwise check if valid move if so update position and remove occupiedPiece
            else {
                // If valid move: update position and remove occupiedPiece
                if(piece.canMove(row, column)) {
                    occupiedPiece.setcolumn(11); // set to a meaningless value
                    occupiedPiece.setrow(11); // set to a meaningless value
                    piece.setcolumn(column); // set to column
                    piece.setrow(row);  // set to row
                    return true;
                }
                // Otherwise return false
                else {
                    return false;
                }
            }
        }
        // If row and column not occupied, check if validMove? If so update position and return true
        else if (piece.canMove(row, column)) {
            piece.setcolumn(column); // set to column
            piece.setrow(row);  // set to row
            return true;
        }
        // Else return false
	    return false;
	}
	
	/**
	 * This method takes in the row and column values and checks whether we can move
	 * If can move, updates piece position
	 * @param piece
	 * @return
	 */
	public void move(ChessPiece piece, int row, int column) {
	    
	    // If its not possible to placePiece then make a sound or so
	    if(this.placePiece(piece, row, column)== false) {
	        // make a sound or so
	    }
	    // Otherwise just move piece
	    else {
	        this.placePiece(piece, row, column);
	    }
	    
	    /*
	    if(piece.canMove(row, column) == true) {
	        piece.setrow(row);
	        piece.setcolumn(column);
	    }
	    else {
	        // Print something or make a sound or something
	    }
	    */
	    
	}
	
	/*
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
	*/
}

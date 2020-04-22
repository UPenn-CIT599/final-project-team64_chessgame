package gamePieces;

import application.Board;
import application.ChessPiece;
import application.MovePieceChecker;

/**
 * The Bishop class is a concrete class that extends abstract class ChessPiece.
 * It constructs and sets initial positions for the bishops of both teams.
 */
public class Bishop extends ChessPiece {

	/**
	 * This extends the super constructor for Bishop
	 * 
	 * @param board
	 * @param color
	 * @param type
	 * @param row
	 * @param column
	 */
	public Bishop(Board board, boolean isWhite, int row, int column) {

		super(board, isWhite, row, column);

	}

	/**
	 * This method checks whether a ChessPiece can move or not
	 * 
	 * @return
	 */
	@Override
	public boolean canMove(int row, int column) {
	    
        if(this.getBoard().isSpaceOccupied(row, column)) {
            ChessPiece occupiedPiece = this.getBoard().getPiece(row, column);
            // If piece is occupied and color same as potential piece: return false
            if ((occupiedPiece.isWhite() == this.isWhite())) {
                return false;
            }
        }

		// Otherwise check if valid diagonal move
		return MovePieceChecker.isValidDiagonalMove(board, row, column, getRow(), getColumn());

	}
	
	@Override
	public String toString() {
		return isWhite() ? "\u2657" : "\u265D"; 
	}
}

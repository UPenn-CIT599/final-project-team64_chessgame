package gamePieces;

import application.Board;
import application.ChessPiece;
import application.MovePieceChecker;

/**
 * The Queen class is a concrete class that extends abstract class ChessPiece.
 * It constructs and sets initial positions for the queen of both teams.
 *
 * Moves to be checked for: regular capture move
 */
public class Queen extends ChessPiece {

	/**
	 * This extends the super constructor for Queen
	 * 
	 * @param board
	 * @param color
	 * @param type
	 * @param row
	 * @param column
	 */
	public Queen(Board board, boolean isWhite, int row, int column) {

		super(board, isWhite, row, column);

	}

	/**
	 * This method checks whether Chess Piece can move or not
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

		int currentRow = this.getRow();
		int currentColumn = this.getColumn();

		// Otherwise check if valid move
		
		if (MovePieceChecker.isValidDiagonalMove(board, row, column, currentRow, currentColumn)) {
			return true;
		}

		if (MovePieceChecker.isValidVerticalMove(board, row, column, currentRow, currentColumn)) {
			return true;
		}

		if (MovePieceChecker.isValidHorizontalMove(board, row, column, currentRow, currentColumn)) {
			return true;
		}

		// Otherwise move is not valid and return false
		return false;

	}
	
	@Override
	public String toString() {
		return isWhite() ? "\u2655" : "\u265B";
	}

}

package gamePieces;

import application.Board;
import application.MovePieceChecker;

/**
 * The Rook class is a concrete class that extends abstract class ChessPiece. It
 * constructs and sets initial positions for the rooks of both teams.
 */
public class Rook extends ChessPiece {

	/**
	 * @param board
	 * @param color
	 * @param type
	 * @param row
	 * @param column
	 */
	public Rook(Board board, boolean isWhite, String type, int row, int column) {

	    super(board, isWhite, type, row, column);

	}

	/**
	 * This method checks whether a ChessPiece can move or not
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

		int currentRow = getRow();
		int currentColumn = getColumn();

		// Otherwise check if move can be made

		if (MovePieceChecker.isValidVerticalMove(board, row, column, currentRow, currentColumn)) {
			return true;
		}

		if (MovePieceChecker.isValidHorizontalMove(board, row, column, currentRow, currentColumn)) {
			return true;
		}

		return false;
	}

	/**
	 * Provides unicode for particular chess piece to display in GUI
	 */
	@Override
	public String toString() {
		return isWhite() ? "\u2656" : "\u265C";
	}

}

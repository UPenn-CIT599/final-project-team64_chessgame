package gamePieces;

import application.Board;

/**
 * The King class is a concrete class that extends abstract class ChessPiece. It
 * constructs and sets initial positions for the kings of both teams.
 */
public class King extends ChessPiece {

	/**
	 * This extends the super constructor for King
	 * 
	 * @param board
	 * @param color
	 * @param type
	 * @param row
	 * @param column
	 */
	public King(Board board, boolean isWhite, String type, int row, int column) {

		super(board, isWhite, type, row, column);

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

		int currentRow = this.getRow();
		int currentColumn = this.getColumn();

		// First check if move is not resulting in king being check mate
		// If not check for valid move
		if ((Math.abs(row - currentRow) + Math.abs(column - currentColumn)) == 1) {
			return true;
		} 
		else if (((Math.abs(row - currentRow)) == Math.abs(column - currentColumn))
				& (Math.abs(column - currentColumn) == 1)) {
			return true;
		}
		return false;

	}
	
	/**
	 * Provides unicode for particular chess piece to display in GUI
	 */
	@Override
	public String toString() {
	    return isWhite() ? "\u2654" : "\u265A";
	}

}

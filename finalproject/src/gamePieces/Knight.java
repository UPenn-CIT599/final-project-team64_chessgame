package gamePieces;

import application.Board;
import application.ChessPiece;

/**
 * The Knight class is a concrete class that extends abstract class ChessPiece.
 * It constructs and sets initial positions for the knights of both teams.
 */
public class Knight extends ChessPiece {

	/**
	 * This extends the super constructor for Knight
	 * 
	 * @param board
	 * @param color
	 * @param type
	 * @param row
	 * @param column
	 */
	public Knight(Board board, boolean isWhite, String type, int row, int column) {

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

		// First check if move is not resulting in king being check mate
		// If not check for valid move
		return Math.abs(row - getRow()) * Math.abs(column - getColumn()) == 2;

	}
	
	@Override
	public String toString() {
		return isWhite() ? "\u2658" : "\u265E";
	}

}

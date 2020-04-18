package finalproject;

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
	public Knight(Board board, boolean isWhite, int row, int column) {

		super(board, isWhite, row, column);

	}

	/**
	 * This method checks whether a ChessPiece can move or not
	 * 
	 * @return
	 */
	@Override
	public boolean canMove(int row, int column) {

		// First check if move is not resulting in king being check mate
		// If not check for valid move
		return Math.abs(row - getRow()) * Math.abs(column - getColumn()) == 2;

	}
	
	@Override
	public String toString() {
		return isWhite() ? "\u2658" : "\u265E";
	}

}

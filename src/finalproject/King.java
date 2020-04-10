package finalproject;

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
	public King(Board board, String color, String type, int row, int column) {

		super(board, color, type, row, column);

	}

	/**
	 * This method checks whether a ChessPiece can conduct the Castling move or not
	 * 
	 * @return
	 */
	public boolean isValidCastling() {
		return false;
	}

	/**
	 * This method checks whether a ChessPiece can move or not
	 * 
	 * @return
	 */
	@Override
	public boolean canMove(int row, int column) {

		int currentRow = this.getrow();
		int currentColumn = this.getcolumn();

		// First check if move is not resulting in king being check mate
		// If not check for valid move
		if ((Math.abs(row - currentRow) + Math.abs(column - currentColumn)) == 1) {
			return true;
		} else if (((Math.abs(row - currentRow)) == Math.abs(column - currentColumn))
				& (Math.abs(column - currentColumn) == 1)) {
			return true;
		}
		return false;

	}

}

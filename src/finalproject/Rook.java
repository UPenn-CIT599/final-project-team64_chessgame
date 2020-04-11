package finalproject;

/**
 * The Rook class is a concrete class that extends abstract class ChessPiece. It
 * constructs and sets initial positions for the rooks of both teams.
 */
public class Rook extends ChessPiece {

	/**
	 * This extends the super constructor for Rook
	 * 
	 * @param board
	 * @param color
	 * @param type
	 * @param row
	 * @param column
	 */
	public Rook(Board board, String color, String type, int row, int column) {

		super(board, color, type, row, column);

	}

	/**
	 * This method checks whether a ChessPiece can move or not
	 * 
	 * @return
	 */
	@Override
	public boolean canMove(int row, int column) {

		int currentRow = getrow();
		int currentColumn = getcolumn();

		// Otherwise check if move can be made

		if (MovePieceChecker.isValidVerticalMove(board, row, column, currentRow, currentColumn)) {
			return true;
		}

		if (MovePieceChecker.isValidHorizontalMove(board, row, column, currentRow, currentColumn)) {
			return true;
		}

		return false;
	}

}

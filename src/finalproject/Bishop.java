package finalproject;

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
	public Bishop(Board board, String color, String type, int row, int column) {

		super(board, color, type, row, column);

	}

	/**
	 * This method checks whether a ChessPiece can move or not
	 * 
	 * @return
	 */
	@Override
	public boolean canMove(int row, int column) {

		// Otherwise check if valid diagonal move
		return MovePieceChecker.isValidDiagonalMove(board, row, column, getrow(), getcolumn());

	}
}

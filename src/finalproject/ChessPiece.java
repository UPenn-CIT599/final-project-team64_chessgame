package finalproject;

/**
 * The ChessPiece class is an abstract superclass with subclasses: King, Queen,
 * Bishop, Knight, Rook, and Pawn. The subclasses construct the game pieces for
 * both teams in this program.
 */
public abstract class ChessPiece {
	protected Board board;// protected so subclass can access
	protected String color;
	protected String type;
	protected int row;
	protected int column;

	/**
	 * This is the constructor for the ChessPiece
	 */
	public ChessPiece(Board board, String color, String type, int row, int column) {

		this.board = board;
		this.color = color;
		this.type = type;
		this.row = row;
		this.column = column;

	}

	/**
	 * This is getter for the Board
	 */
	public Board getBoard() {
		return board;
	}

	/**
	 * This is getter for the Color
	 */
	public String getColor() {
		return color;
	}

	/**
	 * This is setter for the Color
	 */
	public void setColor(String color) {
		this.color = color;
	}

	/**
	 * This is getter for the Type
	 */
	public String getType() {
		return type;
	}

	/**
	 * This is setter for the Type
	 */
	public void setType(String type) {
		this.type = type;
	}

	/**
	 * This is getter for the Row
	 */
	public int getrow() {
		return row;
	}

	/**
	 * This is setter for the Row
	 */
	public void setrow(int i) {
		this.row = i;
	}

	/**
	 * This is getter for the column
	 */
	public int getcolumn() {
		return this.column;
	}

	/**
	 * This is setter for the column
	 */
	public void setcolumn(int j) {
		this.column = j;
	}

	/**
	 * This method takes in the row and column values and checks whether we can move
	 * If can move, updates piece position
	 * 
	 * @param piece
	 * @return
	 */
	public void move(ChessPiece piece, int row, int column) {

		// check if valid row and column
		if ((row < 8 & row >= 0) & (column < 8 & column >= 0)) {

			// If its not possible to placePiece then make a sound or so
			if (this.getBoard().placePiece(piece, row, column) == false) {
				return;
				// make a sound or so
			}
			// NO NEED FOR ELSE STATEMENT HERE..
			// Otherwise just move piece
			this.getBoard().placePiece(piece, row, column);

		} else {
			// Print something or make sound
			return;
		}
	}

	/**
	 * This method checks whether a chess piece can move or not and will be
	 * overridden in each subclass
	 * 
	 * @param row
	 * @param column
	 * @return
	 */
	public abstract boolean canMove(int row, int column); 
		
	

}

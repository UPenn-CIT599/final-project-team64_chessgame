package gamePieces;

import application.Board;

/**
 * The ChessPiece class is an abstract superclass with subclasses: King, Queen,
 * Bishop, Knight, Rook, and Pawn. The subclasses construct the game pieces for
 * both teams in this program.
 */
public abstract class ChessPiece {
	protected Board board;// protected so subclass can access
	protected boolean isWhite;
	protected String type;
	protected int row;
	protected int column;

	/**
	 * This is the constructor for the ChessPiece
	 */
	public ChessPiece(Board board, boolean isWhite, String type, int row, int column) {

		this.board = board;
		this.isWhite = isWhite;
		this.type = type;
		this.row = row;
		this.column = column;
	}

	public Board getBoard() {
		return board;
	}

	public boolean isWhite() {
		return isWhite;
	}

	public void setColor(boolean isWhite) {
		this.isWhite = isWhite;
	}

	public int getRow() {
		return row;
	}

	public void setRow(int i) {
		this.row = i;
	}

	public int getColumn() {
		return this.column;
	}

	public void setColumn(int j) {
		this.column = j;
	}

	public String gettype() {
	    return this.type;
	}
	
	/**
	 * This method takes in the row and column values and checks whether we can move
	 * If can move, updates piece position
	 * 
	 * @param piece
	 * @return
	 */
	public void move(int row, int column) {

		// check if valid row and column
		if ((row < 8 & row >= 0) & (column < 8 & column >= 0)) {

			// If its not possible to placePiece then make a sound or so
			if (this.getBoard().placePiece(this, row, column) == false) {
				return;
				// make a sound or something
			}
			// NO NEED FOR ELSE STATEMENT HERE..
			// Otherwise just move piece
			this.getBoard().placePiece(this, row, column);

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

    public Object getType() {
        return null;
    }

    public Object getColor() {
        return null;
    } 
    
    /**
     * Helper method for testing in console
     * @return
     */
    public String info() {
    	return getClass().getSimpleName() + "(" + row + ", " + column + ")";
    }
	
}

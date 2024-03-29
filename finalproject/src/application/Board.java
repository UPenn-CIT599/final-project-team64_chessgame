package application;

import java.util.ArrayList;

import gamePieces.Bishop;
import gamePieces.ChessPiece;
import gamePieces.King;
import gamePieces.Knight;
import gamePieces.Pawn;
import gamePieces.Queen;
import gamePieces.Rook;

/**
 * The Board class is a class that constructs an 8x8 ChessBoard using a double
 * ChessPiece array. It has non-trivial methods including initialize(),
 * isSpaceOccupied(), getPiece(), placePiece(), display()
 * 
 */
public class Board {
	public static final int NUMROWS = 8;// making public for GUI
	public static final int NUMCOLS = 8;// making public for GUI
	private ChessPiece[][] board;
	private static ArrayList<ChessPiece> whiteCapturedPieces;
	private static ArrayList<ChessPiece> blackCapturedPieces;
	private boolean isCurrentPlayerWhite = true;
	private boolean isGameOver = false;
	
	/**
	 * This is the board constructor. It initializes the board to a zero board
	 */
	public Board() {
		this.board = new ChessPiece[NUMROWS][NUMCOLS];
		initialize();// constructor will initialize the state of the object
	}
	
	/**
	 * This method interacts with GUI_ChessBoard, determines which team's turn it is
	 * @return
	 */
	public boolean isCurrentPlayerWhite() {
		return isCurrentPlayerWhite;
	}	
	
	/**
	 * This method switches play in GUI_ChessBoard
	 */
	public void switchPlayer() {
		isCurrentPlayerWhite = !isCurrentPlayerWhite;//boolean into opposite value
	}
	
	/**
	 * This method finishes Game
	 * @return
	 */
	public boolean isGameOver(){
        return isGameOver;
    }
	
	/**
	 * This method switches GameStatus in GUI_ChessBoard
	 */
	public void switchGameStatus() {
	    isGameOver = !isGameOver;
	}
	   
	/**
	 * This method returns the ArrayList of white captured pieces
	 * @return
	 */
	public static ArrayList<ChessPiece> getWhiteCapturedPieces() {
		return whiteCapturedPieces;
	}

	/**
	 * This method returns the ArrayList of black captured pieces
	 * @return
	 */
	public static ArrayList<ChessPiece> getBlackCapturedPieces() {
		return blackCapturedPieces;
	}

	/**
	 * This method is used to initialize the board
	 */
	public void initialize() {

		int pawnRow;
		int nonPawnRow;

		pawnRow = 1;
		nonPawnRow = 0;
		
		board[nonPawnRow][4] = new Queen(this, true, "Queen" ,nonPawnRow, 4);
		board[nonPawnRow][3] = new King(this, true, "King" ,nonPawnRow, 3);

		for (int i = 0; i < NUMCOLS; i++) {
			board[pawnRow][i] = new Pawn(this, true, "Pawn" ,pawnRow, i);
		}

		board[nonPawnRow][0] = new Rook(this, true, "Rook" , nonPawnRow, 0);
		board[nonPawnRow][7] = new Rook(this, true, "Rook" ,nonPawnRow, 7);
		board[nonPawnRow][1] = new Knight(this, true, "Knight" ,nonPawnRow, 1);
		board[nonPawnRow][6] = new Knight(this, true, "Knight" ,nonPawnRow, 6);
		board[nonPawnRow][2] = new Bishop(this, true, "Bishop" ,nonPawnRow, 2);
		board[nonPawnRow][5] = new Bishop(this, true, "Bishop",nonPawnRow, 5);

		pawnRow = NUMROWS - 2;
		nonPawnRow = NUMROWS - 1;

		board[nonPawnRow][4] = new Queen(this, false, "Queen" ,nonPawnRow, 4);
        board[nonPawnRow][3] = new King(this, false, "King" ,nonPawnRow, 3);

        for (int i = 0; i < NUMCOLS; i++) {
            board[pawnRow][i] = new Pawn(this, false, "Pawn" ,pawnRow, i);
        }

        board[nonPawnRow][0] = new Rook(this, false, "Rook" , nonPawnRow, 0);
        board[nonPawnRow][7] = new Rook(this, false, "Rook" ,nonPawnRow, 7);
        board[nonPawnRow][1] = new Knight(this, false, "Knight" ,nonPawnRow, 1);
        board[nonPawnRow][6] = new Knight(this, false, "Knight" ,nonPawnRow, 6);
        board[nonPawnRow][2] = new Bishop(this, false, "Bishop" ,nonPawnRow, 2);
        board[nonPawnRow][5] = new Bishop(this, false, "Bishop",nonPawnRow, 5);

		// initialize ArrayLists to keep track of captured pieces
		whiteCapturedPieces = new ArrayList<ChessPiece>();
		blackCapturedPieces = new ArrayList<ChessPiece>();

	}

	/**
	 * This method checks whether the Space is occupied or not
	 * @param row
	 * @param col
	 * @return
	 */
	public boolean isSpaceOccupied(int row, int col) {
		return board[row][col] != null;
	}

	/**
	 * This method returns the ChessPiece at a given row and column
	 * @param row
	 * @param column
	 * @return
	 */
	public ChessPiece getPiece(int row, int column) {
		return board[row][column];
	}

	/**
	 * This method allows one to place a Piece at a particular location Note: May
	 * not be needed
	 * @param piece
	 * @param row
	 * @param column
	 * @return
	 */
	public boolean placePiece(ChessPiece piece, int row, int column) {

		// Check if the row and column is occupied
		if (this.isSpaceOccupied(row, column) != false) {
			ChessPiece occupiedPiece = getPiece(row, column);
			// If piece is occupied and color same as potential piece: return false
			if ((occupiedPiece.isWhite() == piece.isWhite())) {
				return false;
			}
			// Otherwise check if valid move if so update position and remove occupiedPiece
			else {
				// If valid move: update position and remove occupiedPiece
				if (piece.canMove(row, column)) {

					occupiedPiece.setColumn(11); // set to a meaningless value
					occupiedPiece.setRow(11); // set to a meaningless value

					if (occupiedPiece.isWhite()) {
						Board.whiteCapturedPieces.add(occupiedPiece);
                        GUI_Jail.addWhiteTeamPrisoners();
					}

					else {
					    Board.blackCapturedPieces.add(occupiedPiece);
				        GUI_Jail.addBlackTeamPrisoners();

					}

					board[row][column] = board[piece.getRow()][piece.getColumn()];
					board[piece.getRow()][piece.getColumn()] = null;
					piece.setColumn(column); // set to column
					piece.setRow(row); // set to row

					return true;
				}
				// Otherwise return false
				else {
					return false;
				}
			}
		}

		// If row and column not occupied, check if validMove? If so update position and
		// return true
		else if (piece.canMove(row, column)) {
			// update the board
			board[row][column] = board[piece.getRow()][piece.getColumn()];
			board[piece.getRow()][piece.getColumn()] = null;
			// change the piece
			piece.setColumn(column); // set to column
			piece.setRow(row); // set to row

			return true;
		}
		// else return false
		return false;
	}

	/**
	 * This method displays the board Used String only for JUnit purposes.
	 */
	public String display() {
		String result = "";
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[0].length; j++) {
				if (board[i][j] == null) {
					result += "|  ";
				} else {
					result += "|" + (board[i][j].isWhite() ? "W" : "B")
							+ board[i][j].getClass().getSimpleName().charAt(0);
				}
			}
			result += "|\n";
		}
		return result;
	}

}

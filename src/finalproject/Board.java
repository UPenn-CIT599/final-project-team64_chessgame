package finalproject;

//import java.awt.Color;

public class Board
{
	private ChessPiece[][] board;
	private final int NUMROWS = 8;
	private final int NUMCOLS = 8;

	/**
	 * This is the board constructor. 
	 * It initializes the board to a zero board 
	 */
	public Board(){
	  
	  ChessPiece[][] board = new ChessPiece[NUMROWS][NUMCOLS];
	    
	  // Initialize board to zero
	  for(int i = 0; i < board.length; i++) {
	      for(int j = 0; j<board[0].length; j++){
              board[i][j] = null;
          }
	  }  
	  
	}
	
	/**
	 * This method is used to initialize the board
	 *
	 */
	private Board initialize() {
	    
	    Board chessBoard = new Board();
	    
	    int pawnRow;
	    int nonPawnRow;
	    
	    pawnRow = 1;
	    nonPawnRow = 0; 
	    board[nonPawnRow][3] = new Queen(chessBoard, "white", "Queen", nonPawnRow, 3);
	    board[nonPawnRow][4] = new King(chessBoard, "white", "King", nonPawnRow, 4);

        for(int i = 0; i < NUMCOLS; i++){
            board[pawnRow][i] = new Pawn(chessBoard,"white", "Pawn", pawnRow, i);
        }
        board[nonPawnRow][0] = new Rook(chessBoard, "white", "Rook", nonPawnRow, 0);
        board[nonPawnRow][7] = new Rook(chessBoard, "white", "Rook", nonPawnRow, 7);
        board[nonPawnRow][1] = new Knight(chessBoard, "white", "Knight", nonPawnRow, 1);
        board[nonPawnRow][6] = new Knight(chessBoard, "white", "Knight", nonPawnRow, 6);
        board[nonPawnRow][2] = new Bishop(chessBoard, "white", "Bishop", nonPawnRow, 2);
        board[nonPawnRow][5] = new Bishop(chessBoard, "white", "Bishop", nonPawnRow, 5);
        
        
        
	    pawnRow = NUMROWS - 2;
	    nonPawnRow = NUMROWS - 1;
	    
	    board[nonPawnRow][4] = new Queen(chessBoard, "black", "Queen", nonPawnRow, 4);
	    board[nonPawnRow][3] = new King(chessBoard, "black", "King", nonPawnRow, 3);
	    
	    for(int i = 0; i < NUMCOLS; i++){
	        board[pawnRow][i] = new Pawn(chessBoard, "black", "Pawn", pawnRow, i);
	    }
	    
        board[nonPawnRow][0] = new Rook(chessBoard,"black", "Rook", nonPawnRow, 0);
        board[nonPawnRow][7] = new Rook(chessBoard, "black", "Rook", nonPawnRow, 7);
        board[nonPawnRow][1] = new Knight(chessBoard,"black", "Knight", nonPawnRow, 1);
        board[nonPawnRow][6] = new Knight(chessBoard,"black", "Knight", nonPawnRow, 6);
        board[nonPawnRow][2] = new Bishop(chessBoard, "black", "Bishop", nonPawnRow, 2);
        board[nonPawnRow][5] = new Bishop(chessBoard, "black", "Bishop", nonPawnRow, 5);
	  
        return chessBoard;
	}
	
	
	
	
	/**
	 * This method checks whether the Space is occupied or not
	 * @param row
	 * @param col
	 * @return
	 */
	public boolean isSpaceOccupied(int row, int col)
	{
		return board[row][col] != null;
	}
	
	/**
	 * This method returns the ChessPiece at a given row and column
	 * @param row
	 * @param column
	 * @return
	 */
	public ChessPiece getPiece(int row, int column) {
	    
	    if(isSpaceOccupied(row,column)) {
	        ChessPiece piece = board[row][column];
	        return piece;
	    }
        return null;
	}
	
	/**
	 * This method allows one to place a Piece at a particular location
	 * Note: May not be needed
	 * @param piece
	 * @param row
	 * @param column
	 * @return
	 */
	public boolean placePiece(ChessPiece piece, int row, int column) {
	    // Check if the row and column is occupied
        if(getPiece(row,column) != null){
            ChessPiece occupiedPiece = getPiece(row,column);
            // If piece is occupied and color same as potential piece: return false
            if(occupiedPiece.getColor() == piece.getColor()) {
                return false;
            }
            // Otherwise check if valid move if so update position and remove occupiedPiece
            else {
                // If valid move: update position and remove occupiedPiece
                if(piece.canMove(row, column)) {
                    occupiedPiece.setcolumn(11); // set to a meaningless value
                    occupiedPiece.setrow(11); // set to a meaningless value
                    piece.setcolumn(column); // set to column
                    piece.setrow(row);  // set to row
                    return true;
                }
                // Otherwise return false
                else {
                    return false;
                }
            }
        }
        // If row and column not occupied, check if validMove? If so update position and return true
        else if (piece.canMove(row, column)) {
            piece.setcolumn(column); // set to column
            piece.setrow(row);  // set to row
            return true;
        }
        // Else return false
	    return false;
	}
	
	/**
	 * This method takes in the row and column values and checks whether we can move
	 * If can move, updates piece position
	 * @param piece
	 * @return
	 */
	public void move(ChessPiece piece, int row, int column) {
	    
	    // If its not possible to placePiece then make a sound or so
	    if(this.placePiece(piece, row, column)== false) {
	        // make a sound or so
	    }
	    // Otherwise just move piece
	    else {
	        this.placePiece(piece, row, column);
	    }
	    
	    /*
	    if(piece.canMove(row, column) == true) {
	        piece.setrow(row);
	        piece.setcolumn(column);
	    }
	    else {
	        // Print something or make a sound or something
	    }
	    */
	    
	}
	
	public void main(String[] args) {
	    Board board = this.initialize();
	    System.out.println(board);
	}
	

}

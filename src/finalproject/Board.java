package finalproject;

import java.util.*;

//import java.awt.Color;

public class Board{
	private ChessPiece[][] board;
	private ArrayList<ChessPiece> whiteCapturedPieces;
	private ArrayList<ChessPiece> blackCapturedPieces;
	private HashMap<String, ArrayList<ChessPiece>> capturedPieces;
	private final int NUMROWS = 8;
	private final int NUMCOLS = 8;

	/**
	 * This is the board constructor. 
	 * It initializes the board to a zero board 
	 */
	public Board(){
	  board = new ChessPiece[NUMROWS][NUMCOLS];
	  // PK response: made relevant change (deleted code)
	}
	
	/**
	 * This is the board constructor. 
	 * @return
	 */
	public int getBoardLength() {
	    return this.board.length;
	}
	
	/**
	 * This is the board constructor. 
	 * @return
	 */
    public int getBoardWidth() {
        return this.board[0].length;
    }
    
	/**
	 * This method is used to initialize the board
	 */
	public void initialize() {
	    
	    int pawnRow;
        int nonPawnRow;
        
	    pawnRow = 1;
	    nonPawnRow = 0; 
	    board[nonPawnRow][3] = new Queen(this, "white", "Queen", nonPawnRow, 3);
	    board[nonPawnRow][4] = new King(this, "white", "King", nonPawnRow, 4);
	     
        for(int i = 0; i < NUMCOLS; i++){
            board[pawnRow][i] = new Pawn(this,"white", "Pawn", pawnRow, i);
        }
         
        board[nonPawnRow][0] = new Rook(this, "white", "Rook", nonPawnRow, 0);
        board[nonPawnRow][7] = new Rook(this, "white", "Rook", nonPawnRow, 7);
        board[nonPawnRow][1] = new Knight(this, "white", "Knight", nonPawnRow, 1);
        board[nonPawnRow][6] = new Knight(this, "white", "Knight", nonPawnRow, 6);
        board[nonPawnRow][2] = new Bishop(this, "white", "Bishop", nonPawnRow, 2);
        board[nonPawnRow][5] = new Bishop(this, "white", "Bishop", nonPawnRow, 5);
        
        pawnRow = NUMROWS - 2;
        nonPawnRow = NUMROWS - 1;
        
        board[nonPawnRow][4] = new Queen(this, "black", "Queen", nonPawnRow, 4);
        board[nonPawnRow][3] = new King(this, "black", "King", nonPawnRow, 3);
        
        for(int i = 0; i < NUMCOLS; i++){
            board[pawnRow][i] = new Pawn(this, "black", "Pawn", pawnRow, i);
        }
        
        board[nonPawnRow][0] = new Rook(this,"black", "Rook", nonPawnRow, 0);
        board[nonPawnRow][7] = new Rook(this, "black", "Rook", nonPawnRow, 7);
        board[nonPawnRow][1] = new Knight(this,"black", "Knight", nonPawnRow, 1);
        board[nonPawnRow][6] = new Knight(this,"black", "Knight", nonPawnRow, 6);
        board[nonPawnRow][2] = new Bishop(this, "black", "Bishop", nonPawnRow, 2);
        board[nonPawnRow][5] = new Bishop(this, "black", "Bishop", nonPawnRow, 5);
        
        // initialize ArrayLists to keep track of captured pieces 
        this.whiteCapturedPieces = new ArrayList<ChessPiece>();//why the this?
        this.blackCapturedPieces = new ArrayList<ChessPiece>();
        
        // Initialize HashMap to keep track of captured pieces of both sides  WHY THE HASHMAP??
            // PK response: We could use this hash map for the special move for Pawn later
            // when we would want to bring back captured pieces
            // No harm keeping it for now!
        this.capturedPieces = new HashMap<String, ArrayList<ChessPiece>>();
        this.capturedPieces.put("white", this.whiteCapturedPieces);
        this.capturedPieces.put("black", this.blackCapturedPieces);
	
	}
	
	
	/**
	 * This method checks whether the Space is occupied or not
	 * @param row
	 * @param col
	 * @return
	 */
	public boolean isSpaceOccupied(int row, int col){
		return board[row][col] != null;
	}

	
	/**
	 * This method returns the ChessPiece at a given row and column
	 * @param row
	 * @param column
	 * @return
	 */
	public ChessPiece getPiece(int row, int column) {
	    // PK: done what you recommended
	   return board[row][column];  
	   
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
                    
                	//PERHAPS CHANGE TO NULL?? 
                        // PK response : DOES NOT WORK! needs to be an integer?
                        // May need to test this however
                	    // change to meaningless value
                    occupiedPiece.setcolumn(11); // set to a meaningless value 
                    occupiedPiece.setrow(11); // set to a meaningless value
                    
                    
                    if(occupiedPiece.getColor().equals("white")) {
                        this.whiteCapturedPieces.add(occupiedPiece);
                        this.capturedPieces.put("white", this.whiteCapturedPieces);
                    }
                    
                    //HASHMAP REDUNDANT???
                        // PK response: Keep for now for Pawn special move to bring back captured pieces
                    else if(occupiedPiece.getColor().equals("black")) {
                        this.blackCapturedPieces.add(occupiedPiece);
                        this.capturedPieces.put("black", this.blackCapturedPieces);
                    }
                    
                    board[row][column] = board[piece.getrow()][piece.getcolumn()];
                    board[piece.getrow()][piece.getcolumn()] = null;
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
  
            board[row][column] = board[piece.getrow()][piece.getcolumn()];
            board[piece.getrow()][piece.getcolumn()] = null;
            piece.setcolumn(column); // set to column
            piece.setrow(row);  // set to row
            
            return true;
        }
        // else return false
	    return false;
	}
	
	/**
	 * This method takes in the row and column values and checks whether we can move
	 * If can move, updates piece position
	 * @param piece
	 * @return
	 */
	public void move(ChessPiece piece, int row, int column) {
	    
	    // check if valid row and column
	    if((row < 8 & row >= 0) & (column < 8 & column >= 0)) {
	        
	        // If its not possible to placePiece then make a sound or so
            if(this.placePiece(piece, row, column)== false) {
                return;
                // make a sound or so
            }
            //NO NEED FOR ELSE STATEMENT HERE.. 
            // Otherwise just move piece
            this.placePiece(piece, row, column);
            
	    }
	    else {
	        // Print something or make sound
	        return;
	    }
	    
	}
	
	/**
	 * This method displays the board
	 * Used String only for JUnit purposes.
	 */
	public String display() {
		String result = "";
	    for (int i = 0; i < board.length; i++)
		{
			for (int j = 0; j < board[0].length; j++)
			{
				if(board[i][j] == null)
				{
					result += "|  ";
				}
				else
				{
					result += "|" + board[i][j].getColor().charAt(0) + board[i][j].getType().charAt(0);
				}
			}
			result += "|\n";
		}
	    return result;
	}
	
	/*
	 * This method updates the board
	 * may not need this
	public void update() {
	    
	}
	*/
	
	/**
	 * This method checks whether king would be check mate or not
	 * Would take a Piece and see if it leads to check mate?
	 */
	public boolean checkKingCheckMate() {
	    return false;
	}
	
}

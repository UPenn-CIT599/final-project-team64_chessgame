package finalproject;

/**
 * The ChessPiece class is an abstract superclass with subclasses:
 * King, Queen, Bishop, Knight, Rook, and Pawn.
 * The subclasses construct the game pieces for both teams in this program.
 * 
 * @author Team 64 - JMG
 */
public abstract class ChessPiece {
    private Board board;
    private String color;
    private String type;
    private int row;
    private int column;
    
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
     * @return the color
     */
    public String getColor() {
        return color;
    }
    
    /**
     * @param color the color to set
     */
    public void setColor(String color) {
        this.color = color;
    }
    
    /**
     * @return the type
     */
    public String getType() {
        return type;
    }
    
    /**
     * @param type the type to set
     */
    public void setType(String type) {
        this.type = type;
    }
    
    /**
     * @return the row
     */
    public int getrow() {
        return row;
    }

    /**
     * @param set the row
     */
    public void setrow(int i) {
        this.row = i;
    }
    
    /**
     * @return the column
     */
    public int getcolumn() {
        return this.column;
    }
    
    /**
     * @param set the column
     */
    public void setcolumn(int j) {
        this.column = j;
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
     * This method checks whether we have a valid diagonal move or not
     * @param row
     * @param column
     * @param currentRow
     * @param currentColumn
     * @return
     */
    public boolean isValidDiagonalMove(int row, int column, int currentRow, int currentColumn) {
        
        // Check if player is moving Piece Diagonally
        if(Math.abs(row-currentRow) == Math.abs(column-currentColumn)) {
            // Check if move is resulting in check mate if not:
            
            // Check while moving diagonally upwards-right: Piece is not jumping over any piece
            if((row > currentRow) & (column > currentColumn)) {
                for(int i = 1; i <= Math.abs(row-currentRow); i++) {
                    if(this.getBoard().getPiece(currentRow + i, currentColumn + i) != null) {
                        return false;
                    }
                }
                return true;
            }
            // Check while moving diagonally upwards-left: Piece is not jumping over any piece
            else if((row > currentRow) & (column < currentColumn)) {
                for(int i = 1; i <= Math.abs(currentRow-row); i++) {
                    if(this.getBoard().getPiece(currentRow + i, currentColumn - i) != null) {
                        return false;
                    }
                }
                return true;
            }
            // Check while moving diagonally downwards-right: Piece is not jumping over any piece 
            else if((row < currentRow) & (column < currentColumn)) {
                for(int i = 1; i <= Math.abs(currentRow-row); i++) {
                    if(this.getBoard().getPiece(currentRow - i, currentColumn - i) != null) {
                        return false;
                    }
                }
                return true;
            }
            // Check while moving diagonally downwards-left: Piece is not jumping over any piece 
            else if((row < currentRow) & (column > currentColumn)) {
                for(int i = 1; i <= Math.abs(currentRow-row); i++) {
                    if(this.getBoard().getPiece(currentRow - i, currentColumn + i) != null) {
                        return false;
                    }
                }
                return true;
            } 
        }
        
        return false;
    }
    
    /**
     * This method checks whether we have a ValidHorizontal Move or not
     * @param row
     * @param column
     * @param currentRow
     * @param currentColumn
     * @return
     */
    public boolean isValidHorizontalMove(int row, int column, int currentRow, int currentColumn) {
        
        if(Math.abs(row-currentRow)== 0 && Math.abs(column-currentColumn) >= 0 ) {
            // First check if move is not resulting in king being check mate 
            // If not return true
            

            // Check to see if Piece is jumping over any piece
            if(row > currentRow) {
                for(int j = currentColumn; j <= column ; j++) {
                    if(this.getBoard().getPiece(currentRow, j) != null) {
                        return false;
                    }
                }
                return true;
            }
            else if(currentRow > row) {
                for(int j = currentRow; j >= row; j--) {
                    if(this.getBoard().getPiece(currentRow, j) != null) {
                        return false;
                    }
                }
                return true;
            }     
        }
        return false;
        
    }
    
    /**
     * This method checks whether we have a valid Vertical Move or not
     * @param row
     * @param column
     * @param currentRow
     * @param currentColumn
     * @return
     */
    public boolean isValidVerticalMove(int row, int column, int currentRow, int currentColumn) {
        // First check if move is not resulting in king being check mate
        // If not check for valid move
        
        // if valid move
        if(Math.abs(row-currentRow)>= 0 && Math.abs(column-currentColumn) == 0 ) {
         // Check to see if Piece is jumping over any piece
            if(row > currentRow) {
                for(int i = currentRow; i <= row ; i++) {
                    if(this.getBoard().getPiece(i, currentColumn) != null) {
                        return false;
                    }
                }
                return true;
            }
            else if(currentRow > row) {
                for(int i = currentRow; i >= row; i--) {
                    if(this.getBoard().getPiece(i, currentColumn) != null) {
                        return false;
                    }
                }
                return true;
            }
        }
        return false;
    }
    
    /**
     * This method checks whether valid king move
     * @param row
     * @param column
     * @param currentRow
     * @param currentColumn
     * @return
     */
    public boolean isValidKingMove(int row, int column, int currentRow, int currentColumn) {
        // First check if move is not resulting in king being check mate
        // If not check for valid move
        if((Math.abs(row-currentRow) + Math.abs(column-currentColumn)) == 1) {
            return true;
        }
        else if(((Math.abs(row-currentRow)) == Math.abs(column-currentColumn)) & (Math.abs(column-currentColumn) == 1) ) {
            return true;
        }
        return false;
    }
    
    /**
     * This method checks whether valid white pawn move
     * @param row
     * @param column
     * @param currentRow
     * @param currentColumn
     * @return
     */
    public boolean isValidWhitePawnMove(int row, int column, int currentRow, int currentColumn) {
        // First check if move is not resulting in king being check mate
        // If not check for valid move
        if(currentRow == 1) {
            
            if((row-currentRow == 1) & (Math.abs(column-currentColumn) == 0)) {
      
                return true;
            }
            else if((row-currentRow == 2) & (Math.abs(column-currentColumn) == 0)) {
                // if moving two steps: check that we are not jumping over pieces
                if(this.getBoard().getPiece(1 + 1, currentColumn)!= null) {
                    return false;
                }
                return true;
            }
        }
        else {
            if((row-currentRow == 1) & (Math.abs(column-currentColumn) == 0)) {
                
                return true;
            }
        }
        
        return false;
    }
    
    /**
     * This method checks whether valid black pawn move
     * @param row
     * @param column
     * @param currentRow
     * @param currentColumn
     * @return
     */
    public boolean isValidBlackPawnMove(int row, int column, int currentRow, int currentColumn) {
        // First check if move is not resulting in king being check mate
        // If not check for valid move
        if(currentRow == 6) {
            
            if((currentRow-row == 1) & (Math.abs(column-currentColumn) == 0)) {
      
                return true;
            }
            else if((currentRow -row == 2) & (Math.abs(column-currentColumn) == 0)) {
                // if moving two steps: check that we are not jumping over pieces
                if(this.getBoard().getPiece(1 + 6, currentColumn)!= null) {
                    return false;
                }
                return true;
            }
        }
        else {
            if((currentRow-row == 1) & (Math.abs(column-currentColumn) == 0)) {
                
                return true;
            }
        }
        
        return false;
    }
    
    /**
     * This method checks whether valid knight Move
     * @param row
     * @param column
     * @param currentRow
     * @param currentColumn
     * @return
     */
    public boolean isValidKnightMove(int row, int column, int currentRow, int currentColumn) {
        // First check if move is not resulting in king being check mate
        // If not check for valid move
        if((Math.abs(row-currentRow) * Math.abs(column-currentColumn)) == 2) {
            return true;
        }
        return false;
    }
    
    
    /**
     * This method checks whether a chess piece can move 
     * or not and will be overridden in each subclass
     * @param row
     * @param column
     * @return
     */
    public boolean canMove(int row, int column) {
        return false;
    }
    
}

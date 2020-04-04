package finalproject;

/**
 * The Pawn class is a concrete class that extends abstract class ChessPiece.
 * It constructs and sets initial positions for the pawns of both teams.
 */
public class Pawn extends ChessPiece {
    
    /**
     * This extends the super constructor for Queen
     * @param board
     * @param color
     * @param type
     * @param row
     * @param column
     */
    public Pawn(Board board, String color, String type, int row, int column) {
       
        super(board, color, type, row, column);

    }
    
    
    public boolean isSpecialMove() {
        return false;
    }
    
    /**
     * This method checks whether a ChessPiece can move or not
     * @return
     */
    @Override
    public boolean canMove(int row, int column) {
        
        int currentRow= this.getrow();
        int currentColumn = this.getcolumn();
        
        
        if(this.getColor().equals("white")) {
            // Otherwise check if move can be made
            if(this.isValidWhitePawnMove(row, column, currentRow,  currentColumn)) {
                return this.isValidWhitePawnMove( row, column, currentRow,  currentColumn);
            }
            
            // Check to see if special move
        }
        
        else if(this.getColor().equals("black")) {
            // Otherwise check if move can be made
            if(this.isValidBlackPawnMove( row, column, currentRow,  currentColumn)) {
                return this.isValidBlackPawnMove( row, column, currentRow,  currentColumn);
            }
            
            // Check to see if special Move
        }

        return false;

    }
    
}   

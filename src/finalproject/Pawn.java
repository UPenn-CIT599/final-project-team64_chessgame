package finalproject;

/**
 * The Pawn class is a concrete class that extends abstract class ChessPiece.
 * It constructs and sets initial positions for the pawns of both teams.
 * 
 * @author Team 64 - JMG
 */
public class Pawn extends ChessPiece {
    
    /**
     * This extends the super constructor for Queen
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
        
        // If space occupied and by the same color return false
        if((this.getBoard().isSpaceOccupied(row, column)) & (this.getBoard().getPiece(row,column).getColor() == this.getColor())) {
            
            // check if trying to make diagonal move to capture piece 
            if(this.getColor().equals("white")) {
                if((row - currentRow == 1) & Math.abs(column-currentColumn) == 1) {
                    return true;
                }
            }
            
            if(this.getColor().equals("black")) {
                if((currentRow - row == 1) & Math.abs(column-currentColumn) == 1) {
                    return true;
                }
            }
            
            return false;
        }
        
        if(this.getColor().equals("white")) {
            // Otherwise check if move can be made
            if(this.isValidWhitePawnMove( row, column, currentRow,  currentColumn)) {
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





package finalproject;

/**
 * The Knight class is a concrete class that extends abstract class ChessPiece.
 * It constructs and sets initial positions for the knights of both teams.
 * 
 * @author Team 64 - JMG
 */
public class Knight extends ChessPiece {
    
    /**
     * This extends the super constructor for Queen
     * @param color
     * @param type
     * @param row
     * @param column
     */
    public Knight(Board board, String color, String type, int row, int column) {
       
        super(board, color, type, row, column);

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
            return false;
        }
        // Otherwise check if move can be made
        if(this.isValidKnightMove( row, column, currentRow,  currentColumn)) {
            return this.isValidKnightMove( row, column, currentRow,  currentColumn);
        }
        return false;
    }

}
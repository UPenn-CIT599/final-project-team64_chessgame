package finalproject;

/**
 * The Knight class is a concrete class that extends abstract class ChessPiece.
 * It constructs and sets initial positions for the knights of both teams.
 */
public class Knight extends ChessPiece {
    
    /**
     * This extends the super constructor for Knight
     * @param board
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
        
        // Otherwise check if move can be made
        if(this.isValidKnightMove( row, column, currentRow,  currentColumn)) {
            return this.isValidKnightMove( row, column, currentRow,  currentColumn);
        }
        return false;
    }

}

package finalproject;

/**
 * The Bishop class is a concrete class that extends abstract class ChessPiece.
 * It constructs and sets initial positions for the bishops of both teams.
 */
public class Bishop extends ChessPiece {
    
    /**
     * This extends the super constructor for Bishop
     * @param board
     * @param color
     * @param type
     * @param row
     * @param column
     */
    public Bishop(Board board, String color, String type, int row, int column) {
       
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
        
        // Otherwise check if valid diagonal move
        if(this.isValidDiagonalMove(row, column, currentRow, currentColumn)) {
            return isValidDiagonalMove(row, column, currentRow, currentColumn);
        }
        
        //  Otherwise move is not valid and return false
        return false;
    }
}

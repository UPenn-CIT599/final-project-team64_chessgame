package finalproject;

/**
 * The Rook class is a concrete class that extends abstract class ChessPiece.
 * It constructs and sets initial positions for the rooks of both teams.
 */
public class Rook extends ChessPiece {
    
    /**
     * This extends the super constructor for Rook
     * @param board
     * @param color
     * @param type
     * @param row
     * @param column
     */
    public Rook(Board board, String color, String type, int row, int column) {
       
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
        if(this.isValidHorizontalMove(row, column, currentRow, currentColumn)) {
            return isValidHorizontalMove(row, column, currentRow, currentColumn);
        }
        else if(this.isValidHorizontalMove(row, column, currentRow, currentColumn)) {
            return isValidHorizontalMove(row, column, currentRow, currentColumn);
        }
        return false;
    }

}

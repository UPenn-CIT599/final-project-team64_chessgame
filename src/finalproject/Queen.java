package finalproject;

/**
 * The Queen class is a concrete class that extends abstract class ChessPiece.
 * It constructs and sets initial positions for the queen of both teams.
 *
 * @author Team 64 - JMG
 * Moves to be checked for: regular capture move
 */
public class Queen extends ChessPiece {
    
    /**
     * This extends the super constructor for Queen
     * @param color
     * @param type
     * @param row
     * @param column
     */
    public Queen(Board board, String color, String type, int row, int column) {
       
        super(board, color, type, row, column);

    }
    
    /**
     * This method checks whether 
     * Chess Piece can move or not
     * @return
     */
    @Override
    public boolean canMove(int row, int column) {
        
        int currentRow= this.getrow();
        int currentColumn = this.getcolumn();

        // Otherwise check if valid move
        if(this.isValidDiagonalMove(row, column, currentRow, currentColumn)) {
            return isValidDiagonalMove(row, column, currentRow, currentColumn);
        }
        else if(this.isValidHorizontalMove(row, column, currentRow, currentColumn)){
            return isValidHorizontalMove(row, column, currentRow, currentColumn);
        }
        else if(this.isValidVerticalMove(row, column, currentRow, currentColumn)){
            return isValidVerticalMove(row, column, currentRow, currentColumn);
        }
        
        // Otherwise move is not valid and return false
        return false;
        
    }

}

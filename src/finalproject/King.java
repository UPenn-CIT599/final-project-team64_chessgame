package finalproject;

/**
 * The King class is a concrete class that extends abstract class ChessPiece.
 * It constructs and sets initial positions for the kings of both teams.
 * 
 * @author Team 64 - JMG
 */
public class King extends ChessPiece {
    
    /**
     * This extends the super constructor for Queen
     * @param color
     * @param type
     * @param row
     * @param column
     */
    public King(Board board, String color, String type, int row, int column) {
       
        super(board, color, type, row, column);

    }
    
    /**
     * Note this needs to have parameters such as other piece etc maybe from GUI?
     * @return
     */
    public boolean isValidCastling() {
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
        

        if(this.isValidKingMove(row, column, currentRow, currentColumn)) {
            return this.isValidKingMove(row, column, currentRow, currentColumn);
        }
            
        // Check to see if Castling happens
            
   
        return false;
    }

    
}



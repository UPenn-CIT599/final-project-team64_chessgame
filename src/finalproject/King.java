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
        else {
            // check if final row and final column are valid
            if((row < 8 & row >= 0) & (column < 8 & column >= 0)) {
                // Check if Knight is moving appropriately
                if((Math.abs(row-currentRow) + Math.abs(column-currentColumn)) == 1) {
                    // First check if move is not resulting in king being check mate
                    // If not return true
                    return true;
                }
                // else if (//valid castling) { return true; }
                else {
                    return false;
                }
            }
        }
        return false;
    }

    /*
    ChessPiece blackKing = new ChessPiece();
    blackKing.color = "black";
    blackKing.type = "king";
    board[0][4] = blackKing;
    
    ChessPiece whiteKing = new ChessPiece();
    whiteKing.color = "white";
    whiteKing.type = "king";
    board[7][3] = whiteKing;
    */
    
}



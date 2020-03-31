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
                // Check if Queen is moving forwards or backwards
                if(Math.abs(row-currentRow) >= 0 && Math.abs(column-currentColumn) == 0) {
                    // First check if move is not resulting in king being check mate
                    // If not return true
                    return true;
                }
                // Check if Queen is moving leftwards or rightwards
                else if(Math.abs(row-currentRow) == 0 && Math.abs(column-currentColumn) >= 0) {
                    // First check if move is not resulting in king being check mate 
                    // If not return true
                    return true;
                }
                // Check if Queen is moving diagonally 
                else if(Math.abs(row-currentRow) == Math.abs(column-currentColumn)) {
                    // First check if move is not resulting in king being checkmate 
                    // If not return true
                    return true;
                }
                else {
                    return false;
                }
            }
        }
        return false;
    }
    
    /*
    ChessPiece blackQueen = new ChessPiece();
    blackQueen.color = "black";
    blackQueen.type = "queen";
    board[0][3] = blackQueen;

    ChessPiece whiteQueen = new ChessPiece();
    whiteQueen.color = "white";
    whiteQueen.type = "queen";
    board[7][4] = blackQueen;
    */
    
}


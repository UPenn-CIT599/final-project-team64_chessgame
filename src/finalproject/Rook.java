package finalproject;

/**
 * The Rook class is a concrete class that extends abstract class ChessPiece.
 * It constructs and sets initial positions for the rooks of both teams.
 * 
 * @author Team 64 - JMG
 */
public class Rook extends ChessPiece {
    private Board chessBoard;
    
    /**
     * This extends the super constructor for Queen
     * @param color
     * @param type
     * @param row
     * @param column
     */
    public Rook(String color, String type, int row, int column) {
       
        super(color, type, row, column);

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
        if((this.chessBoard.isSpaceOccupied(row, column)) & (this.chessBoard.getPiece(row,column).getColor() == this.getColor())) {
            return false;
        }
        // Otherwise check if move can be made
        else {
            // check if final row and final column are valid
            if((row < 8 & row >= 0) & (column < 8 & column >= 0)) {
                // Check if Rook is moving forwards or backwards
                if(Math.abs(row-currentRow) >= 0 && Math.abs(column-currentColumn) == 0) {
                    // First check if move is not resulting in king being checkmate
                    // If not return true
                    return true;
                }
                // Check if Rook is moving leftwards or rightwards
                else if(Math.abs(row-currentRow) == 0 && Math.abs(column-currentColumn) >= 0) {
                    // First check if move is not resulting in king being check mate 
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
    ChessPiece blackRookLeft = new ChessPiece();
    blackRook.color = "black";
    blackRook.type = "Rook";
    board[0][0] = blackRook;

    ChessPiece blackRookRight = new ChessPiece();
    blackRook.color = "black";
    blackRook.type = "Rook";
    board[0][7] = blackRook;

    ChessPiece whiteRookLeft = new ChessPiece();
    whiteRook.color = "white";
    whiteRook.type = "Rook";
    board[7][7] = whiteRook;

    ChessPiece whiteRookRight = new ChessPiece();
    whiteRook.color = "white";
    whiteRook.type = "Rook";
    board[7][0] = whiteRook;
    */

}

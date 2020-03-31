package finalproject;

/**
 * The Bishop class is a concrete class that extends abstract class ChessPiece.
 * It constructs and sets initial positions for the bishops of both teams.
 * 
 * @author Team 64 - JMG
 */
public class Bishop extends ChessPiece {
    
    /**
     * This extends the super constructor for Queen
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
        
        // If space occupied and by the same color return false
        if((this.getBoard().isSpaceOccupied(row, column)) & (this.getBoard().getPiece(row,column).getColor() == this.getColor())) {
            return false;
        }
        // Otherwise check if move can be made
        else {
            // check if final row and final column are valid
            if((row < 8 & row >= 0) & (column < 8 & column >= 0)) {
                // Check if Bishop moves diagonally 
                if(Math.abs(row-currentRow) == Math.abs(column-currentColumn)) {
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
    ChessPiece blackBishopLeft = new ChessPiece();
    //  blackBishop.color = "black";
    color = "black1";
    this.color = "black2";
    super.color = "black3";
    blackBishop.type = "bishop";
    board[0][2] = blackBishop;
    //    System.out.println(color);
    //    System.out.println(this.color);
    //    System.out.println(super.color);

        
    ChessPiece blackBishopRight = new ChessPiece();
    blackBishop.color = "black";
    blackBishop.type = "bishop";
    board[0][5] = blackBishop;
    
    ChessPiece whiteBishopLeft = new ChessPiece();
    whiteBishop.color = "white";
    whiteBishop.type = "bishop";
    board[7][5] = whiteBishop;
    
    ChessPiece whiteBishopRight = new ChessPiece();
    whiteBishop.color = "white";
    whiteBishop.type = "bishop";
    board[7][2] = whiteBishop;
    */
}

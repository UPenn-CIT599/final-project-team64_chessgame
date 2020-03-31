package finalproject;

/**
 * The Pawn class is a concrete class that extends abstract class ChessPiece.
 * It constructs and sets initial positions for the pawns of both teams.
 * 
 * @author Team 64 - JMG
 */
public class Pawn extends ChessPiece {
    private Board chessBoard;
    /**
     * This extends the super constructor for Queen
     * @param color
     * @param type
     * @param row
     * @param column
     */
    public Pawn(String color, String type, int row, int column) {
       
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
        int whitePawnRow = 1;
        int blackPawnRow = 6;
        
        // If space occupied and by the same color return false
        if((this.chessBoard.isSpaceOccupied(row, column)) & (this.chessBoard.getPiece(row,column).getColor() == this.getColor())) {
            return false;
        }
        // Otherwise check if move can be made
        else {
            // check if final row and final column are valid
            if((row < 8 & row >= 0) & (column < 8 & column >= 0)) {
               if(this.chessBoard.getPiece(currentRow, currentColumn).getColor().equals("white")) {
                   if(currentRow == whitePawnRow) {
                       if((row-currentRow == 2 | row-currentRow == 1) & (Math.abs(column-currentColumn) == 0)) {
                           return true;
                       }
                       else if((row - currentRow == 1) & Math.abs(column-currentColumn) == 1) {
                           return true;
                       }
                       else {
                           return false;
                       }
                   }
                   else {
                    // Two valid moves one special move
                       if((row-currentRow == 1) & (Math.abs(column-currentColumn) == 0)) {
                           return true;
                       }
                       else if((row - currentRow == 1) & Math.abs(column-currentColumn) == 1) {
                           return true;
                       }
                       // also need to check for special move 
                       //else if(special move) {return true;}
                       else {
                           return false;
                       }
                       
                   }
               }
               else if(this.chessBoard.getPiece(currentRow, currentColumn).getColor().equals("black")) {
                   if(currentRow == blackPawnRow) {
                       if((currentRow - row == 2 | currentRow - row == 1) & (Math.abs(column-currentColumn) == 0)) {
                           return true;
                       }
                       else if((currentRow - row == 1) & Math.abs(column-currentColumn) == 1) {
                           return true;
                       }
                       else {
                           return false;
                       }
                   }
                   else {
                    // Two valid moves one special move
                       if((currentRow - row == 1) & (Math.abs(column-currentColumn) == 0)) {
                           return true;
                       }
                       else if((currentRow - row == 1) & Math.abs(column-currentColumn) == 1) {
                           return true;
                       }
                       // also need to check for special move 
                       //else if(special move) {return true;}
                       else {
                           return false;
                       }
                   }
               }
            }
        return false;
        }
    }
}   
    /*
    for(int i = 0; i < 8; i++){
        ChessPiece blackPawn = new ChessPiece();
        blackPawn.color = "black";
        blackPawn.type = "pawn";
        game.board[1][i] = blackPawn;
    }
    for(int j = 0; j < 8; j++){
        ChessPiece whitePawn = new ChessPiece();
        whitePawn.color = "white";
        whitePawn.type = "pawn";
        game.board[6][i] = whitePawn;

    }
    */



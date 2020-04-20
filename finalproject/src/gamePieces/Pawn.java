package finalproject.gamePieces;

import finalproject.application.Board;
import finalproject.application.ChessPiece;

/**
 * The Pawn class is a concrete class that extends abstract class ChessPiece.
 * It constructs and sets initial positions for the pawns of both teams.
 */
public class Pawn extends ChessPiece {
    
    /**
     * This extends the super constructor for Queen
     * @param board
     * @param color
     * @param type
     * @param row
     * @param column
     */
    public Pawn(Board board, boolean isWhite, int row, int column) {
       
        super(board, isWhite, row, column);

    }
    
    
    public boolean isSpecialMove() {
        return false;
    }
    
    /**
     * This method checks whether a ChessPiece can move or not
     * @return
     */
    @Override
    public boolean canMove(int row, int column) {
        
        int currentRow= this.getRow();
        int currentColumn = this.getColumn();
        
        
        if(isWhite()) {
            // Otherwise check if move can be made
            if(this.isValidWhitePawnMove(row, column, currentRow,  currentColumn)) {
                return this.isValidWhitePawnMove( row, column, currentRow,  currentColumn);
            }
            
            // Check to see if special move
        }
        else {
            // Otherwise check if move can be made
            if(this.isValidBlackPawnMove(row, column, currentRow,  currentColumn)) {
                return this.isValidBlackPawnMove(row, column, currentRow,  currentColumn);
            }
            
            // Check to see if special Move
        }

        return false;

    }
    
    /**
     * This method checks whether valid white pawn move
     * @param row
     * @param column
     * @param currentRow
     * @param currentColumn
     * @return
     */
    private boolean isValidWhitePawnMove(int row, int column, int currentRow, int currentColumn) {
        // First check if move is not resulting in king being check mate
        // If not check for valid move
        if(currentRow == 1) {
            
            if((row-currentRow == 1) & (Math.abs(column-currentColumn) == 0)) {
                return true;
            }
            else if((row-currentRow == 2) & (Math.abs(column-currentColumn) == 0)) {
                // if moving two steps: check that we are not jumping over pieces
                if(this.getBoard().getPiece(1 + 1, currentColumn)!= null) {
                    return false;
                }
                return true;
            }
            // else if space is occupied 
            else if(this.getBoard().isSpaceOccupied(row, column)) {
                if((Math.abs(column - currentColumn)== 1) & (row-currentRow == 1)) {
                    return true;
                }
                return false;
            }
        }
        else {
            if((row-currentRow == 1) & (Math.abs(column-currentColumn) == 0)) {
                return true;
            }
            else if(this.getBoard().isSpaceOccupied(row, column)) {
                if((Math.abs(column - currentColumn)== 1) & (row-currentRow == 1)) {
                    return true;
                }
                return false;
            }
        }
        return false;
    }
    
    /**
     * This method checks whether valid black pawn move
     * @param row
     * @param column
     * @param currentRow
     * @param currentColumn
     * @return
     */
    private boolean isValidBlackPawnMove(int row, int column, int currentRow, int currentColumn) {
        // First check if move is not resulting in king being check mate
        // If not check for valid move
        if(currentRow == 6) {
            if((currentRow-row == 1) & (Math.abs(column-currentColumn) == 0)) { 
                return true;
            }
            else if((currentRow -row == 2) & (Math.abs(column-currentColumn) == 0)) {
                // if moving two steps: check that we are not jumping over pieces
                if(this.getBoard().getPiece(6-1, currentColumn)!= null) {
                    return false;
                }
                return true;
            }
            // else if space is occupied 
            else if(this.getBoard().isSpaceOccupied(row, column)) {
                if((Math.abs(column - currentColumn)== 1) & (currentRow -row== 1)) {
                    return true;
                }
                return false;
            }
        }
        else {
            if((currentRow -row == 1) & (Math.abs(column-currentColumn) == 0)) {
                
                return true;
            }
            // else if space is occupied 
            else if(this.getBoard().isSpaceOccupied(row, column)) {
                if((Math.abs(column - currentColumn)== 1) & (currentRow -row == 1)) {
                    return true;
                }
                return false;
            }
        }
        return false;
    }
     
    @Override
    public String toString() {
    	return isWhite() ? "\u2659" : "\u265F";
    }
    
    
}   

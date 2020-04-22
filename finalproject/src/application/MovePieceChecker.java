package application;

public class MovePieceChecker {
    
    /**
     * This method checks whether we have a valid diagonal move or not
     * @param row
     * @param column
     * @param currentRow
     * @param currentColumn
     * @return
     */
    public static boolean isValidDiagonalMove(Board board, int row, int column, int currentRow, int currentColumn) {
        
        // Check if player is moving Piece Diagonally
        if(Math.abs(row-currentRow) == Math.abs(column-currentColumn)) {
            // Check if move is resulting in check mate if not:
            
            // Check while moving diagonally upwards-right: Piece is not jumping over any piece
            if((row > currentRow) & (column > currentColumn)) {
                for(int i = 1; i < Math.abs(row-currentRow); i++) {
                    if(board.getPiece(currentRow + i, currentColumn + i) != null) {
                        return false;
                    }
                }
                return true;
            }
            // Check while moving diagonally upwards-left: Piece is not jumping over any piece
            else if((row > currentRow) & (column < currentColumn)) {
                for(int i = 1; i < Math.abs(currentRow-row); i++) {
                    if(board.getPiece(currentRow + i, currentColumn - i) != null) {
                        return false;
                    }
                }
                return true;
            }
            // Check while moving diagonally downwards-right: Piece is not jumping over any piece 
            else if((row < currentRow) & (column < currentColumn)) {
                for(int i = 1; i < Math.abs(currentRow-row); i++) {
                    if(board.getPiece(currentRow - i, currentColumn - i) != null) {
                        return false;
                    }
                }
                return true;
            }
            // Check while moving diagonally downwards-left: Piece is not jumping over any piece 
            else if((row < currentRow) & (column > currentColumn)) {
                for(int i = 1; i < Math.abs(currentRow-row); i++) {
                    if(board.getPiece(currentRow - i, currentColumn + i) != null) {
                        return false;
                    }
                }
                return true;
            } 
        }
        
        return false;
    }
    
    
    /**
     * This method checks whether we have a ValidHorizontal Move or not
     * @param row
     * @param column
     * @param currentRow
     * @param currentColumn
     * @return
     */
    public static boolean isValidHorizontalMove(Board board, int row, int column, int currentRow, int currentColumn) {
        
        if(Math.abs(row-currentRow)== 0 && Math.abs(column-currentColumn) >= 0 ) {
            // First check if move is not resulting in king being check mate 
            // If not return true
            // Check to see if Piece is jumping over any piece
            if(column > currentColumn) {
                for(int j = currentColumn + 1; j < column ; j++) {
                    if(board.getPiece(currentRow, j) != null) {
                        return false;
                    }
                }
                return true;
            }
            else if(currentColumn > column) {
                for(int j = currentColumn - 1; j > column; j--) {
                    if(board.getPiece(currentRow, j) != null) {
                        return false;
                    }
                }
                return true;
            }     
        }
        return false;
        
    }
    
    /**
     * This method checks whether we have a valid Vertical Move or not
     * @param row
     * @param column
     * @param currentRow
     * @param currentColumn
     * @return
     */
    public static boolean isValidVerticalMove(Board board, int row, int column, int currentRow, int currentColumn) {
        // First check if move is not resulting in king being check mate
        // If not check for valid move if valid move
        if(Math.abs(row-currentRow)>= 0 && Math.abs(column-currentColumn) == 0 ) {
 
            // Check to see if Piece is jumping over any piece
            if(row > currentRow) {
                for(int i = currentRow+1; i < row ; i++) {
                    if(board.getPiece(i, currentColumn) != null) {
                        return false;
                    }
                }
                return true;
            }
            else if(currentRow > row) {
                for(int i = currentRow-1; i > row; i--) {
                    if(board.getPiece(i, currentColumn) != null) {
                        return false;
                    }
                }
                return true;
            }
        }
        return false;
    }

}


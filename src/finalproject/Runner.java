package finalproject;

/**
 * The Runner class comprises of the method that launches the game.
 */
public class Runner {
    
/**
 * This method launches the game.
 */
    public static void main(String[] args) {
        Board board = new Board();
        board.initialize();
        System.out.println(board.display());
        board.placePiece(board.getPiece(1,0),3,0);
        System.out.println(board.display());
        board.placePiece(board.getPiece(1,7),2,7); 
        board.placePiece(board.getPiece(2,7),3,7); 
        board.placePiece(board.getPiece(3,0),4,1);
        board.placePiece(board.getPiece(1,3), 2,4);
        System.out.println(board.display());
        
        board.placePiece(board.getPiece(6,1),4,1);
        System.out.println(board.display());
        board.placePiece(board.getPiece(6,6),5,6); 
        System.out.println(board.display());
        board.placePiece(board.getPiece(5,6),4,6);
        System.out.println(board.display());
        
        board.placePiece(board.getPiece(6,3), 7,4);
        System.out.println(board.display());
        board.placePiece(board.getPiece(4, 1), 3, 2);
        System.out.println(board.display());
        board.placePiece(board.getPiece(4,6), 2, 6);
        System.out.println(board.display());
        
        board.placePiece(board.getPiece(3,7), 4, 6); 
        System.out.println(board.display());
        
        board.placePiece(board.getPiece(4,1), 3, 0); 
        System.out.println(board.display());
        
        
        board.placePiece(board.getPiece(1,2), 3,2); 
        board.placePiece(board.getPiece(3,2), 4,2); 
        board.placePiece(board.getPiece(4,2), 5,2); 
        System.out.println(board.display());
        
        board.placePiece(board.getPiece(6,3), 5,2); 
        System.out.println(board.display());

        board.placePiece(board.getPiece(6,4), 5,4); 
        board.placePiece(board.getPiece(5,4), 4,4); 
        board.placePiece(board.getPiece(4,4), 3,4); 
        board.placePiece(board.getPiece(3,4), 2,4);
        System.out.println(board.display());
        
    }
}

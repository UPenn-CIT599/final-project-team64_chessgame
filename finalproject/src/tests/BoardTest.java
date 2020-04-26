package tests;

import static org.junit.Assert.*;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.FixMethodOrder;
import org.junit.runners.MethodSorters;

import application.Board;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class BoardTest {
    private static Board board;
    
    
    /**
     * Sets up reused objects for all test cases
     * @throws Exception
     */
    @BeforeClass
    public static void setupBeforeClass() throws Exception {
        board = new Board();
        board.initialize();
    }
    
    @Test
    public void testASwitchPlayer() {
        // Test that once we switch player, the player isn't white as default player is white
        board.switchPlayer();
        assertFalse(board.isCurrentPlayerWhite());
    }
    

    @Test
    public void testBSwitchGameStatus() {
        // Test that once we switch game status, the game is over
        board.switchGameStatus();
        assertTrue(board.isGameOver());
    }
    
    @Test
    public void testCIsSpaceOccupied() {
        // Test that once we initialize board space occupied
        assertTrue(board.isSpaceOccupied(0,0));
    }

    @Test
    public void testDGetPiece() {
        // Test that we can get white piece using getPiece() method
        assertEquals(board.getPiece(1, 0).gettype(), "Pawn");
        assertTrue(board.getPiece(1, 0).isWhite());
        
        // Test that we can get black piece using getPiece() method
        assertEquals(board.getPiece(6, 0).gettype(), "Pawn");
        assertFalse(board.getPiece(6, 0).isWhite());
    }
    
    @Test
    public void testEPlacePiece() {
        
        // 1. Test that we can place white piece in pawn row
        board.placePiece(board.getPiece(1, 0), 3, 0);
        assertEquals(board.getPiece(3, 0).gettype(), "Pawn");
        assertTrue(board.getPiece(3, 0).isWhite());
        
        // 2. Test that we can place white piece in non pawn row
        board.placePiece(board.getPiece(0, 0), 2, 0);
        assertEquals(board.getPiece(2, 0).gettype(), "Rook");
        assertTrue(board.getPiece(2, 0).isWhite());
        
        // 3. Test that we can place black piece in pawn row
        board.placePiece(board.getPiece(6, 0), 4, 0);
        assertEquals(board.getPiece(4, 0).gettype(), "Pawn");
        assertFalse(board.getPiece(4, 0).isWhite());
        
        // 4. Test that we can place black piece in non pawn row
        board.placePiece(board.getPiece(7, 0), 5, 0);
        assertEquals(board.getPiece(5, 0).gettype(), "Rook");
        assertFalse(board.getPiece(5, 0).isWhite());
        
    }
    
    @Test
    public void testFVerticalHorizontalMove() {
        
        
        // 0. move pawn ahead
        board.placePiece(board.getPiece(1, 4), 3, 4);
        
        // 1. vertical move forwards
        board.placePiece(board.getPiece(0,4), 2, 4);
        assertTrue(board.getPiece(2,4).isWhite());
        assertEquals(board.getPiece(2,4).gettype(),"Queen");
        assertFalse(board.isSpaceOccupied(0, 4));
        
        // 2. Horizontal move rightwards
        board.placePiece(board.getPiece(2,4), 2, 7);
        assertTrue(board.getPiece(2,7).isWhite());
        assertEquals(board.getPiece(2,7).gettype(),"Queen");
        assertFalse(board.isSpaceOccupied(2, 4));
        
        // 3. Horizontal move leftwards
        board.placePiece(board.getPiece(2,7), 2, 4);
        assertTrue(board.getPiece(2,4).isWhite());
        assertEquals(board.getPiece(2,4).gettype(),"Queen");
        assertFalse(board.isSpaceOccupied(2, 7));
        
        // 4. vertical move backwards
        board.placePiece(board.getPiece(2,4), 0, 4);
        assertTrue(board.getPiece(0,4).isWhite());
        assertEquals(board.getPiece(0,4).gettype(),"Queen");
        assertFalse(board.isSpaceOccupied(2, 4));
        
    }
    
    @Test
    public void testGDiagonalMove() {
        
        // 0. Move pawn ahead
        board.placePiece(board.getPiece(1, 3), 3, 3);
        board.placePiece(board.getPiece(0, 4), 2, 4);
        board.placePiece(board.getPiece(2, 4), 2, 6);
        board.placePiece(board.getPiece(2, 6), 3, 6);
           
        // 1. Diagonal move backward right
        board.getPiece(3, 6).canMove(2, 7); 
        
        // 2. Diagonal move backward left
        board.getPiece(3, 6).canMove(2, 5); 

        // 3. Diagonal move backward left
        board.getPiece(3, 6).canMove(4, 7); 
        
        // 4. Diagonal move backward left
        board.getPiece(3, 6).canMove(4, 5); 
       
    }

    
}

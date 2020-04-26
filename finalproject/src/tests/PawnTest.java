package tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import application.Board;
import gamePieces.Pawn;

public class PawnTest {
    private static Board board;
    private static Pawn testWhitePawn;
    private static Pawn testBlackPawn;

    /**
     * Sets up reused objects for all test cases
     * @throws Exception
     */
    @BeforeAll
    public static void setupBeforeClass() throws Exception {
        board = new Board();
        board.initialize();
        
        testWhitePawn = new Pawn(board, true, "Pawn", 1 , 0);
        testBlackPawn = new Pawn(board, true, "Pawn", 6, 1);
        
    }
    
    /**
     * This method tests whether basic valid white pawn moves work or not
     */
    @Test
    @Order(1)
    void testBasicWhitePawnMovements() {
        
        // 1. Move by two from pawn row for WhitePawn works
        assertTrue(testWhitePawn.isValidWhitePawnMove(3, 0, 1 ,0)); // move by two from pawn row
        
        // 2. Move by one from pawn row for WhitePawn works
        assertTrue(testWhitePawn.isValidWhitePawnMove(2, 0, 1, 0));
        
        // 3. Move by one from non-pawn row works
        assertTrue(testWhitePawn.isValidWhitePawnMove(3,0 ,2,0));
      
    }
    
    /**
     * This method tests whether invalid white pawn moves don't work
     */
    @Test
    @Order(2)
    void testInvalidWhitePawnMovements() {
       
        // 1. diagonal move when position not occupied by piece of opponent (when in pawn row) should not work
        assertFalse(testWhitePawn.isValidWhitePawnMove(4,1 , 3,0)); 
        
        // 2. diagonal move when position not occupied by piece of opponent (when in non pawn row) should not work
        assertFalse(testWhitePawn.isValidWhitePawnMove(2,4 , 1,3)); 
        
        // 3. move by two when not in non pawn row should not work
        assertFalse(testWhitePawn.isValidWhitePawnMove(5, 0, 3, 0));
            
    }
    
    @Test
    @Order(3)
    void testBasicBlackPawnMovements() {
        
        // 1. Move by two from pawn row for BlackPawn works
        assertTrue(testBlackPawn.isValidBlackPawnMove(4, 1, 6 ,1)); // move by two from pawn row
        
        // 2. Move by one from pawn row for BlackPawn works
        assertTrue(testBlackPawn.isValidBlackPawnMove(5, 1, 6, 1));
        
        // 3. Move by one from non-pawn row works
        assertTrue(testBlackPawn.isValidBlackPawnMove(4,1 ,5,1));
           
    }
    
    @Test
    @Order(4)
    void testInvalidBlackPawnMovements() {
        
        // 1. diagonal move when position not occupied by piece of opponent (when in pawn row) should not work
        assertFalse(testBlackPawn.isValidBlackPawnMove(6,3 , 5,4)); 
        
        // 2. diagonal move when not occupied by piece of opponent (when in non pawn row) should not work
        assertFalse(testBlackPawn.isValidBlackPawnMove(4,1 , 3,2)); 
        
        // 3. move by two when not in non pawn row should not work
        assertFalse(testBlackPawn.isValidBlackPawnMove(4,6 , 2,6)); 
        
    }
    
    @Test
    @Order(5)
    void testDiagonalMovements() {
        
        // 0. Move the white pawn to a spot to allow capture by black pawn at (6,1)
        board.placePiece(board.getPiece(1,0), 3, 0);
        board.placePiece(board.getPiece(3,0), 4, 0);
        board.placePiece(board.getPiece(4,0), 5, 0);
            // Move black pawn to a spot to allow capture by white pawn at (1,6)
        board.placePiece(board.getPiece(6,7), 4, 7);
        board.placePiece(board.getPiece(4,7), 3, 7);
        board.placePiece(board.getPiece(3,7), 2, 7);
        
        
        // 1. White pawn (in non pawn row) can capture black pawn by moving diagonally
        assertTrue(board.getPiece(5,0).canMove(6, 1));
        
        // 2. White pawn (in pawn row) can capture black pawn by moving diagonally
        assertTrue(board.getPiece(1,6).canMove(2,7));
        
        // 3. Black pawn (in non pawn row) can capture white pawn by moving diagonally
        assertTrue(board.getPiece(2,7).canMove(1,6));
        
        // 4. Black pawn (in pawn row) can capture white pawn by moving diagonally
        assertTrue(board.getPiece(6, 1).canMove(5, 0));
        
    }
    
    @AfterAll
    public static void cleanUp(){
        board = null;
        assertNull(board);
        testWhitePawn = null;
        assertNull(testWhitePawn);
        testBlackPawn = null;
        assertNull(testBlackPawn);
    }
    
    
}

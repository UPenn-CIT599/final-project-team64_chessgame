package tests;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.FixMethodOrder;
import org.junit.runners.MethodSorters;

import application.Board;
import gamePieces.Knight;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class KnightTest {
    private static Board board;
    private static Knight testWhiteKnight;
    
    /**
     * Sets up reused objects for all test cases
     * @throws Exception
     */
    @BeforeClass
    public static void setupBeforeClass() throws Exception {
        board = new Board();
        board.initialize();
        testWhiteKnight = new Knight(board, true , "Knight" , 0 , 1);
    }
    
    @Test
    public void testAKnightMove() {
        
        // 1. Check if valid to move by 2 steps right by one
        assertTrue(testWhiteKnight.canMove(2,2));
            // Then move the piece 
            board.placePiece(testWhiteKnight, 2, 2);
            assertTrue(board.getPiece(2,2).isWhite());
            assertEquals(board.getPiece(2,2).gettype(),"Knight");
            assertFalse(board.isSpaceOccupied(0,1));
        
        // 2. Check if valid to move forward by 2 left by one 
        assertTrue(testWhiteKnight.canMove(4,1));
            // Then move the piece 
            board.placePiece(testWhiteKnight, 4, 1);
            assertTrue(board.getPiece(4,1).isWhite());
            assertEquals(board.getPiece(4,1).gettype(),"Knight");
            assertFalse(board.isSpaceOccupied(2,2));
            
       // 3. Move if valid to move forward by 1 right by two
       assertTrue(testWhiteKnight.canMove(5, 3));
           // Then move the piece  
           board.placePiece(testWhiteKnight, 5, 3);
           assertTrue(board.getPiece(5,3).isWhite());
           assertEquals(board.getPiece(5,3).gettype(),"Knight");
           assertFalse(board.isSpaceOccupied(4,1));
           
       // 4. Check if valid to move forward by 1 left by two
       assertTrue(testWhiteKnight.canMove(6, 1));
       
       // 5. Check if valid to move back by 2 right by one 
       assertTrue(testWhiteKnight.canMove(3, 4));
       
       // 6. Check if valid to move back by 2 left by one 
       assertTrue(testWhiteKnight.canMove(3, 2));
       
       // 7. Check if valid to move back by one right by two
       assertTrue(testWhiteKnight.canMove(4, 5));
       
       // 8. Check if valid to move back by one left by two
       assertTrue(testWhiteKnight.canMove(4, 1));
       
     
    }
    
    @Test
    public void testKnightBoardInteractions() {
        
        // 1. Try moving to occupied spot occupied by same color piece
        assertFalse(board.getPiece(0, 6).canMove(1, 4));
            
        // 2. Try seeing move to capture using white knight works
        assertTrue(testWhiteKnight.canMove(6, 5));
        
    }

}

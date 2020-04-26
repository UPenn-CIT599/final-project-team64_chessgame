package tests;

import static org.junit.Assert.*;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.FixMethodOrder;
import org.junit.runners.MethodSorters;

import application.Board;
import gamePieces.King;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class KingTest {
    private static Board board;
    private static King testKing;
    
    /**
     * Sets up reused objects for all test cases
     * @throws Exception
     */
    @BeforeClass
    public static void setupBeforeClass() throws Exception {
        board = new Board();
        board.initialize();
        testKing = new King(board, true , "King" , 3 , 3);
    }
    
    @Test
    public void testAKingMove() {
        // 1. Move forward by one 
        assertTrue(testKing.canMove(4,3));
        
        // 2. Move forward right by one
        assertTrue(testKing.canMove(4,4));
        
        // 3. Move forward left by one
        assertTrue(testKing.canMove(4,2));
        
        // 4. Move right side
        assertTrue(testKing.canMove(3,4));
        
        // 5. Move left side
        assertTrue(testKing.canMove(3,2));
        
        // 6. Move back by one
        assertTrue(testKing.canMove(2,3));

        // 7. Move back right by one 
        assertTrue(testKing.canMove(2,4));

        // 8. Move back left by one 
        assertTrue(testKing.canMove(2,2));
    }
    
    @Test
    public void testBKingBoardInteractions() {
       
        // 1. Try moving to occupied spot occupied by same color piece
        assertFalse(board.getPiece(0, 3).canMove(1, 3));
        
        // First move pieces to allow king to capture pieces
        board.placePiece(board.getPiece(1,3), 3, 3);
        board.placePiece(board.getPiece(6, 4), 4, 4);
        board.placePiece(board.getPiece(4, 4), 3, 4);
        board.placePiece(board.getPiece(3, 4), 2, 4);
        board.placePiece(board.getPiece(0, 3), 1, 3);
       
        // 2. Try capturing using white king
        assertEquals(board.getPiece(1,3).gettype(), "King");
        assertTrue(board.getPiece(1, 3).isWhite());
        assertEquals(board.getPiece(2,4).gettype(), "Pawn");
        assertFalse(board.getPiece(2, 4).isWhite());
        assertTrue(board.getPiece(1,3).canMove(2,4));

        
    }
    
}


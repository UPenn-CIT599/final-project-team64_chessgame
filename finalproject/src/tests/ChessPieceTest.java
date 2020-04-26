package tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import application.Board;

class ChessPieceTest {
    private static Board board;
 
    
    /**
     * Sets up reused objects for all test cases
     * @throws Exception
     */
    @BeforeAll
    public static void setupBeforeClass() throws Exception {
        board = new Board();
        board.initialize();
    }
    
    @Test
    void testMove() {
        board.getPiece(1,0).move(3,0);
        assertEquals(board.getPiece(3, 0).gettype(), "Pawn");
        assertTrue(board.getPiece(3, 0).isWhite());
        assertFalse(board.isSpaceOccupied(1, 0));
    }

}

package tests;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

import application.Board;

public class ChessPieceTest {
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
    public void testMove() {
        board.getPiece(1,0).move(3,0);
        assertEquals(board.getPiece(3, 0).gettype(), "Pawn");
        assertTrue(board.getPiece(3, 0).isWhite());
        assertFalse(board.isSpaceOccupied(1, 0));
    }
}

package finalproject;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.BeforeClass;
import org.junit.jupiter.api.Test;


//import tests.Board;
//import tests.ChessPiece;

class BoardTest {
    private static Board board;
    private static ChessPiece piece;
    

    @Test
    void testBoard() {
        //fail("Not yet implemented");
    }

    /**
     * Sets up reused objects for all test cases
     * @throws Exception
     */
    @BeforeClass
    public static void setupBeforeClass() throws Exception {
        board = new Board();
        board.initialize();
        //System.out.println(board.getPiece(1, 1).getColor());
    }
    
    
    /**
     * This test checks after constructing the board
     * whether dimensions of board are the same 
     */
    @Test
    public void instantiateBoard() {
        assertEquals(board.getBoardLength(), 8);
        assertEquals(board.getBoardWidth(), 8);
    }
    
    @Test
    void testInitialize() {
        fail("Not yet implemented");
    }

    @Test
    void testIsSpaceOccupied() {
        fail("Not yet implemented");
    }

    @Test
    void testPlacePiece() {
        fail("Not yet implemented");
    }

    @Test
    void testMove() {
        fail("Not yet implemented");
    }

    @Test
    void testDisplay() {
        fail("Not yet implemented");
    }

    @Test
    void testCheckKingCheckMate() {
        fail("Not yet implemented");
    }

}

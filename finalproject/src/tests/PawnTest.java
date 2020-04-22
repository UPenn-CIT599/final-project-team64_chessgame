package tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
//import org.junit.FixMethodOrder;
//import org.junit.runners.MethodSorters;

import consoleVersion.Board;
import consoleVersion.Pawn;

class PawnTest {
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
        testWhitePawn = new Pawn(board, true, "Pawn", 1 , 0);
        
    }
    
    /**
     * This method tests whether basic valid white pawn moves work or not
     */
    @Test
    void testBasicWhitePawnMovements() {
        
        // 1. Move by two from pawn row for WhitePawn works
        assertTrue(testWhitePawn.isValidWhitePawnMove(3, 0, 1 ,0)); // move by two from pawn row
        
        // 2. Move by one from pawn row for WhitePawn works
        assertTrue(testWhitePawn.isValidWhitePawnMove(2, 0, 1, 0));
            // Now move the testWhitePawn by one from (1,0) to (2,0)
            board.placePiece(testWhitePawn, 2,0); 
                // Check there is a white pawn in the new location
            assertEquals(board.getPiece(2, 0).getType(), "Pawn"); // also checks canMove method within Pawn() works
            assertEquals(board.getPiece(2, 0).isWhite(), true);
                // Check that there is no longer a white pawn in the previous location
            assertFalse(board.isSpaceOccupied(1, 0));
        
        // 3. Move by one from non-pawn row works
        assertTrue(testWhitePawn.isValidWhitePawnMove(3,0 ,2,0));
            // Now move the testWhitePawn by one spot 
            board.placePiece(testWhitePawn, 3, 0);
                // Check there is a white pawn in the new location
            assertEquals(board.getPiece(3, 0).getType(), "Pawn"); // also checks canMove method within Pawn() works
            assertEquals(board.getPiece(3, 0).isWhite(), true);
                // Check that there is no longer a white pawn in the previous location
            assertEquals(board.isSpaceOccupied(2, 0), false);
      
       
    }
    
    /**
     * This method tests whether invalid white pawn moves don't work
     */
    @Test
    void testInvalidWhitePawnMovements() {
       
    // 2.1 diagonal move when position not occupied by piece of opponent (when in pawn row) should not work
    assertFalse(testWhitePawn.isValidWhitePawnMove(4,1 , 3,0)); 
    
    
    // 2.2 diagonal move when position not occupied by piece of opponent (when in non pawn row) should not work
    assertFalse(testWhitePawn.isValidWhitePawnMove(2,4 , 1,3)); 
    
    // 2.3 move by two when not in non pawn row should not work
    assertFalse(testWhitePawn.isValidWhitePawnMove(5, 0, 3, 0));
        
    }
    
    @Test
    void testBasicBlackPawnMovements() {
        testBlackPawn = new Pawn(board, true, "Pawn", 6, 1);
        
        // 1. Move by two from pawn row for BlackPawn works
        assertTrue(testBlackPawn.isValidBlackPawnMove(4, 1, 6 ,1)); // move by two from pawn row
        
        // 2. Move by one from pawn row for BlackPawn works
        assertTrue(testBlackPawn.isValidBlackPawnMove(5, 1, 6, 1));
            // Now move the testBlackPawn by one from (6,1) to (5,1)
            board.placePiece(testBlackPawn, 5,1);
            // Check there is a white pawn in the new location
            assertEquals(board.getPiece(5, 1).getType(), "Pawn"); // also checks canMove method within Pawn() works

            /*
             // 2. Move by one from pawn row for BlackPawn works
             assertTrue(testBlackPawn.isValidBlackPawnMove(5, 1, 6, 1));
             // Now move the testBlackPawn by one from (6,1) to (5,1)
             board.placePiece(testBlackPawn, 5,1); 
             // Check there is a white pawn in the new location
            assertEquals(board.getPiece(5, 1).getType(), "Pawn"); // also checks canMove method within Pawn() work
            assertFalse(board.getPiece(5, 1).isWhite());
                 // Check that there is no longer a white pawn in the previous location
             assertFalse(board.isSpaceOccupied(6, 1));
         
             // 3. Move by one from non-pawn row works
             assertTrue(testWhitePawn.isValidWhitePawnMove(4,1 ,5,1));
             // Now move the testWhitePawn by one spot 
             board.placePiece(testWhitePawn, 4, 1);
                 // Check there is a white pawn in the new location
             assertEquals(board.getPiece(4, 1).getType(), "Pawn"); // also checks canMove method within Pawn() works
             assertEquals(board.getPiece(4, 1).isWhite(), true);
                 // Check that there is no longer a white pawn in the previous location
             assertFalse(board.isSpaceOccupied(5, 1));
             */
    }
    
 
/*

// 4. test to see if invalid black pawn moves do not work
   // 4.1 diagonal move when not occupied by piece of opponent (when in pawn row) should not work
board.placePiece(board.getPiece(6,3), 5,4); // try moving piece diagonally when not other piece of opponent
assertEquals(board.getPiece(6, 3).getType(), "Pawn");
assertEquals(board.getPiece(6, 3).getColor(), "black");
assertEquals(board.isSpaceOccupied(5, 4), false); // place trying to move to is empty
  // 4.2 diagonal move when not occupied by piece of opponent (when in non pawn row) should not work
board.placePiece(board.getPiece(4, 1), 3, 2); // try moving piece diagonally when not other piece of opponent
assertEquals(board.getPiece(4,1).getType(), "Pawn");
assertEquals(board.getPiece(4,1).getColor(), "black");
assertEquals(board.isSpaceOccupied(3,2), false); // place trying to move to is empty
  // 4.3 move by two when not in non pawn row should not work
board.placePiece(board.getPiece(4,6), 2, 6); // try moving by two when not in non pawn row
assertEquals(board.getPiece(4, 6).getType(), "Pawn");
assertEquals(board.getPiece(4,6).getColor(), "black");
assertEquals(board.isSpaceOccupied(2, 6), false); // place trying to move to is empty

// 5. test out diagonal moves for both black and white pawns when not in non-pawn row
  // 5.1 test if white pawn can capture black pawn by moving diagonally
board.placePiece(board.getPiece(3,7), 4, 6);
assertEquals(board.getPiece(4, 6).getType(), "Pawn"); // test to see if black pawn has been captured
assertEquals(board.getPiece(4,6).getColor(), "white");
assertEquals(board.isSpaceOccupied(3, 7), false); // see that previous location of white pawn is empty
assertEquals(board.getBlackCapturedPieces().get(0).getColor(), "black");
assertEquals(board.getBlackCapturedPieces().get(0).getType(), "Pawn");
  // 5.2 test if black pawn can capture white pawn by moving diagonally
board.placePiece(board.getPiece(4,1), 3, 0);
assertEquals(board.getPiece(3,0).getType(), "Pawn"); // test to see if black pawn has been captured
assertEquals(board.getPiece(3,0).getColor(), "black");
assertEquals(board.isSpaceOccupied(4,1), false); // see that previous location of white pawn is empty
assertEquals(board.getWhiteCapturedPieces().get(0).getColor(), "white");
assertEquals(board.getWhiteCapturedPieces().get(0).getType(), "Pawn");

// 6. test out diagonal moves for both black and white pawns when not in pawn row
  // 6.1 test black pawn can capture white pawn
      // first move white pawn to end of the board
board.placePiece(board.getPiece(1,2), 3,2);
board.placePiece(board.getPiece(3,2), 4,2);
board.placePiece(board.getPiece(4,2), 5,2);
      // then see whether black pawn in pawn row can capture white pawn
board.placePiece(board.getPiece(6,3), 5,2);
assertEquals(board.getPiece(5,2).getColor(),"black");
assertEquals(board.getPiece(5,2).getType(),"Pawn");
assertEquals(board.isSpaceOccupied(6,3), false); // place trying to move from is empty
assertEquals(board.getWhiteCapturedPieces().get(1).getColor(), "white"); // ensure added to array of captured pieces
assertEquals(board.getWhiteCapturedPieces().get(1).getType(), "Pawn");
  // 6.2 test white pawn can capture black pawn
      // first move white pawn to end of the board
board.placePiece(board.getPiece(6,4), 5,4);
board.placePiece(board.getPiece(5,4), 4,4);
board.placePiece(board.getPiece(4,4), 3,4);
board.placePiece(board.getPiece(3,4), 2,4);
      // then see whether black pawn in pawn row can capture white pawn
board.placePiece(board.getPiece(1,3), 2,4);
assertEquals(board.getPiece(2,4).getColor(),"white");
assertEquals(board.getPiece(2,4).getType(),"Pawn");
assertEquals(board.isSpaceOccupied(1,3), false); // place trying to move from is empty
assertEquals(board.getBlackCapturedPieces().get(1).getColor(), "black"); // ensure added to array of captured pieces
assertEquals(board.getBlackCapturedPieces().get(1).getType(), "Pawn");

*/
     

}

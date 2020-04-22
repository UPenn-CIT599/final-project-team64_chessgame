package tests;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.TestMethodOrder;
import org.junit.jupiter.api.BeforeAll;



import consoleVersion.Board;

@TestMethodOrder(OrderAnnotation.class)
class BoardTest {

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
    @Order(1)
    public void testPawnMoves() {
          
         // 1. test to see if basic valid white pawn moves works
            // 1.1 move by two from pawn row 
        board.placePiece(board.getPiece(1,0),3,0); // move by two from pawn row
            // Check there is a white pawn in the new location 
        assertEquals(board.getPiece(3, 0).getType(), "Pawn");
        assertTrue(board.getPiece(3, 0).isWhite());
               // Check that there is no longer a white pawn in the previous location
        assertFalse(board.isSpaceOccupied(1, 0));
           // 1.2 move by one from pawn row
        board.placePiece(board.getPiece(1,7),2,7); // move by one from pawn row
               // Check there is a white pawn in the new location 
        assertEquals(board.getPiece(2, 7).getType(), "Pawn");
        assertTrue(board.getPiece(2, 7).isWhite());
               // Check that there is no longer a white pawn in the previous location
        assertFalse(board.isSpaceOccupied(1, 7));
           // 1.3 test move by one from non-pawn row works
        board.placePiece(board.getPiece(2,7),3,7); // move by one from pawn row
               // Check there is a white pawn in the new location 
               assertEquals(board.getPiece(3, 7).getType(), "Pawn");
               assertTrue(board.getPiece(3, 7).isWhite());
               // Check that there is no longer a white pawn in the previous location
        assertFalse(board.isSpaceOccupied(2, 7));
        
         // 2. test to see if invalid white pawn moves do not work
            // 2.1 diagonal move when position not occupied by piece of opponent (when in non pawn row) should not work
        board.placePiece(board.getPiece(3, 0), 4, 1); // try moving piece diagonally position empty
        assertEquals(board.getPiece(3,0).getType(), "Pawn");
        assertTrue(board.getPiece(3,0).isWhite());
        assertFalse(board.isSpaceOccupied(4,1)); // place trying to move to is empty
            // 2.2 diagonal move when not occupied by piece of opponent (when in pawn row) should not work
        board.placePiece(board.getPiece(1, 3), 2, 4); // try moving piece diagonally when not other piece of opponent
        assertEquals(board.getPiece(1, 3).getType(), "Pawn");
        assertTrue(board.getPiece(1, 3).isWhite());
        assertFalse(board.isSpaceOccupied(2, 4)); // place trying to move to is emptySu
            // 2.3 move by two when not in non pawn row should not work
        board.placePiece(board.getPiece(3,7), 5, 7); // try moving by two when not in non pawn row
        assertEquals(board.getPiece(3, 7).getType(), "Pawn");
        assertTrue(board.getPiece(3,7).isWhite());
        assertFalse(board.isSpaceOccupied(5, 7)); // place trying to move to is empty
        
        // 3. test to see if basic valid black pawn moves works
            // 3.1 move by two from pawn row
        board.placePiece(board.getPiece(6,1),4,1); // move by two from pawn row
        assertEquals(board.getPiece(4,1).getType(), "Pawn"); // Check there is a white pawn in the new location
        assertFalse(board.getPiece(4,1).isWhite());
        assertFalse(board.isSpaceOccupied(6,1)); // Check that there is no longer a white pawn in the previous location
            // 3.2 move by one from pawn row
        board.placePiece(board.getPiece(6,6),5,6); // move by one from pawn row
        assertEquals(board.getPiece(5, 6).getType(), "Pawn"); // Check there is a white pawn in the new location
        assertFalse(board.getPiece(5, 6).isWhite());
        assertFalse(board.isSpaceOccupied(6, 6)); // Check that there is no longer a white pawn in the previous location
            // 3.3 test move by one from non-pawn row works
        board.placePiece(board.getPiece(5,6),4,6); // move by one from non pawn row
        assertEquals(board.getPiece(4, 6).getType(), "Pawn"); // Check there is a white pawn in the new location
        assertFalse(board.getPiece(4, 6).isWhite());
        assertFalse(board.isSpaceOccupied(5, 6)); // Check that there is no longer a white pawn in the previous location
        
         // 4. test to see if invalid black pawn moves do not work
            // 4.1 diagonal move when not occupied by piece of opponent (when in pawn row) should not work
       board.placePiece(board.getPiece(6,3), 5,4); // try moving piece diagonally when not other piece of opponent
       assertEquals(board.getPiece(6, 3).getType(), "Pawn");
       assertFalse(board.getPiece(6, 3).isWhite());
       assertFalse(board.isSpaceOccupied(5, 4)); // place trying to move to is empty
           // 4.2 diagonal move when not occupied by piece of opponent (when in non pawn row) should not work
       board.placePiece(board.getPiece(4, 1), 3, 2); // try moving piece diagonally when not other piece of opponent
       assertEquals(board.getPiece(4,1).getType(), "Pawn");
       assertFalse(board.getPiece(4,1).isWhite());
       assertFalse(board.isSpaceOccupied(3,2)); // place trying to move to is empty
           // 4.3 move by two when not in non pawn row should not work
       board.placePiece(board.getPiece(4,6), 2, 6); // try moving by two when not in non pawn row
       assertEquals(board.getPiece(4, 6).getType(), "Pawn");
       assertFalse(board.getPiece(4,6).isWhite());
       assertFalse(board.isSpaceOccupied(2, 6)); // place trying to move to is empty
   
       // 5. test out diagonal moves for both black and white pawns when not in non-pawn row
           // 5.1 test if white pawn can capture black pawn by moving diagonally
       board.placePiece(board.getPiece(3,7), 4, 6);
       assertEquals(board.getPiece(4, 6).getType(), "Pawn"); // test to see if black pawn has been captured
       assertTrue(board.getPiece(4,6).isWhite());
       assertFalse(board.isSpaceOccupied(3, 7)); // see that previous location of white pawn is empty
       assertFalse(board.getBlackCapturedPieces().get(0).isWhite());
       assertEquals(board.getBlackCapturedPieces().get(0).getType(), "Pawn");
           // 5.2 test if black pawn can capture white pawn by moving diagonally
       board.placePiece(board.getPiece(4,1), 3, 0);
       assertEquals(board.getPiece(3,0).getType(), "Pawn"); // test to see if black pawn has been captured
       assertFalse(board.getPiece(3,0).isWhite());
       assertFalse(board.isSpaceOccupied(4,1)); // see that previous location of white pawn is empty
       assertTrue(board.getWhiteCapturedPieces().get(0).isWhite());
       assertEquals(board.getWhiteCapturedPieces().get(0).getType(), "Pawn");
   
       // 6. test out diagonal moves for both black and white pawns when not in pawn row
           // 6.1 test black pawn can capture white pawn
               // first move white pawn to end of the board
       board.placePiece(board.getPiece(1,2), 3,2);
       board.placePiece(board.getPiece(3,2), 4,2);
       board.placePiece(board.getPiece(4,2), 5,2);
               // then see whether black pawn in pawn row can capture white pawn
       board.placePiece(board.getPiece(6,3), 5,2);
       assertFalse(board.getPiece(5,2).isWhite());
       assertEquals(board.getPiece(5,2).getType(),"Pawn");
       assertFalse(board.isSpaceOccupied(6,3)); // place trying to move from is empty
       assertTrue(board.getWhiteCapturedPieces().get(1).isWhite()); // ensure added to array of captured pieces
       assertEquals(board.getWhiteCapturedPieces().get(1).getType(), "Pawn");
           // 6.2 test white pawn can capture black pawn
               // first move white pawn to end of the board
       board.placePiece(board.getPiece(6,4), 5,4);
       board.placePiece(board.getPiece(5,4), 4,4);
       board.placePiece(board.getPiece(4,4), 3,4);
       board.placePiece(board.getPiece(3,4), 2,4);
               // then see whether black pawn in pawn row can capture white pawn
       board.placePiece(board.getPiece(1,3), 2,4);
       assertTrue(board.getPiece(2,4).isWhite());
       assertEquals(board.getPiece(2,4).getType(),"Pawn");
       assertFalse(board.isSpaceOccupied(1,3)); // place trying to move from is empty
       assertFalse(board.getBlackCapturedPieces().get(1).isWhite()); // ensure added to array of captured pieces
       assertEquals(board.getBlackCapturedPieces().get(1).getType(), "Pawn");
       
    }
    
    
    @Test
    @Order(2)
    public void testVerticalMove() {
        
        
        // 1. vertical move forwards
        board.placePiece(board.getPiece(0,3), 2, 3);
        assertTrue(board.getPiece(2,3).isWhite());
        assertEquals(board.getPiece(2,3).getType(),"Queen");
        assertFalse(board.isSpaceOccupied(0, 3));
        
        // 2. vertical move forwards to capture piece 
        board.placePiece(board.getPiece(2,3), 7, 3);
        assertTrue(board.getPiece(7,3).isWhite());
        assertEquals(board.getPiece(7,3).getType(),"Queen");
        assertFalse(board.isSpaceOccupied(2, 3));
            // test for captured pieces
        assertFalse(board.getBlackCapturedPieces().get(2).isWhite()); // ensure added to array of captured pieces
        assertEquals(board.getBlackCapturedPieces().get(2).getType(), "King");
        
        // 3. vertical move backwards
        board.placePiece(board.getPiece(7,3), 3, 3);
        assertTrue(board.getPiece(3,3).isWhite());
        assertEquals(board.getPiece(3,3).getType(),"Queen");
        assertFalse(board.isSpaceOccupied(7, 3));
        
        
    }
    
    
    @Test
    @Order(3)
    public void testHorizontalMove() {
        
        
        // 1. horizontal move rightwards (capture piece)
        board.placePiece(board.getPiece(3,3), 3, 0);
        assertTrue(board.getPiece(3,0).isWhite());
        assertEquals(board.getPiece(3,0).getType(),"Queen");
        assertFalse(board.isSpaceOccupied(3, 3));
            // test for captured pieces
        assertFalse(board.getBlackCapturedPieces().get(3).isWhite()); // ensure added to array of captured pieces
        assertEquals(board.getBlackCapturedPieces().get(3).getType(), "Pawn");
        
        // 2. horizontal move leftwards
        board.placePiece(board.getPiece(3,0), 3, 4);
        assertTrue(board.getPiece(3,4).isWhite());
        assertEquals(board.getPiece(3,4).getType(),"Queen");
        assertFalse(board.isSpaceOccupied(3, 0));
        
        // 3. horizontal move rightwards
        board.placePiece(board.getPiece(3,4), 3, 2);
        assertTrue(board.getPiece(3,2).isWhite());
        assertEquals(board.getPiece(3,2).getType(),"Queen");
        assertFalse(board.isSpaceOccupied(3,4));
        
        
    }
    
    
    @Test
    @Order(4)
    public void testDiagonalMove() {
        
        
        // 1. Diagonal move backward right
        board.placePiece(board.getPiece(3, 2), 2,1); 
        assertTrue(board.getPiece(2,1).isWhite());
        assertEquals(board.getPiece(2,1).getType(),"Queen");
        assertFalse(board.isSpaceOccupied(3,2));
        
        // 2. Diagonal move backward left
        board.placePiece(board.getPiece(2, 1), 0,3); 
        assertTrue(board.getPiece(0,3).isWhite());
        assertEquals(board.getPiece(0,3).getType(),"Queen");
        assertFalse(board.isSpaceOccupied(2,1));
        
        // 3. Diagonal move forward right
        board.placePiece(board.getPiece(0, 3), 3,0); 
        assertTrue(board.getPiece(3,0).isWhite());
        assertEquals(board.getPiece(3,0).getType(),"Queen");
        assertFalse(board.isSpaceOccupied(0,3));
        
        // 4. Diagonal move forward left
        board.placePiece(board.getPiece(3, 0), 5,2); 
        assertTrue(board.getPiece(5,2).isWhite());
        assertEquals(board.getPiece(5,2).getType(),"Queen");
        assertFalse(board.isSpaceOccupied(3,0));
            // test for captured pieces
        assertFalse(board.getBlackCapturedPieces().get(4).isWhite()); // ensure added to array of captured pieces
        assertEquals(board.getBlackCapturedPieces().get(4).getType(), "Pawn");
        
        
    }

    @Test
    @Order(5)
    public void testKnightMove() {
        

        // 1. Move forward by 2 steps right by one 
        board.placePiece(board.getPiece(0, 1), 2, 2);
        assertTrue(board.getPiece(2,2).isWhite());
        assertEquals(board.getPiece(2,2).getType(),"Knight");
        assertFalse(board.isSpaceOccupied(0,1));

        // 2. Move forward by 2 steps left by one
        board.placePiece(board.getPiece(2, 2), 4, 1);
        assertTrue(board.getPiece(4,1).isWhite());
        assertEquals(board.getPiece(4,1).getType(),"Knight");
        assertFalse(board.isSpaceOccupied(2,2));
        
        
        // 3. Move back by 2 steps right by one 
        board.placePiece(board.getPiece(4, 1), 2, 2);
        assertTrue(board.getPiece(2,2).isWhite());
        assertEquals(board.getPiece(2,2).getType(),"Knight");
        assertFalse(board.isSpaceOccupied(4,1));

        
        // 4. Move back by 2 steps left by one
        board.placePiece(board.getPiece(2,2), 0,1);
        assertTrue(board.getPiece(0,1).isWhite());
        assertEquals(board.getPiece(0,1).getType(),"Knight");
        assertFalse(board.isSpaceOccupied(2,2));
        
        
        
        // 5. Move forward by 1 step right by two
        board.placePiece(board.getPiece(0,1),1,3);
        assertTrue(board.getPiece(1,3).isWhite());
        assertEquals(board.getPiece(1,3).getType(),"Knight");
        assertFalse(board.isSpaceOccupied(0,1));
        
        
        
        // 6. Move forward by 1 step left by two
        board.placePiece(board.getPiece(1,3),2,1);
        assertTrue(board.getPiece(2,1).isWhite());
        assertEquals(board.getPiece(2,1).getType(),"Knight");
        assertFalse(board.isSpaceOccupied(1,3));
        
        
        
        // 7. Move back by 1 step right by two
        board.placePiece(board.getPiece(2,1),1,3);
        assertTrue(board.getPiece(1,3).isWhite());
        assertEquals(board.getPiece(1,3).getType(),"Knight");
        assertFalse(board.isSpaceOccupied(2,1));
        
        
        
        // 8. Move back by 1 step left by two
        board.placePiece(board.getPiece(1,3),0,1);
        assertTrue(board.getPiece(0,1).isWhite());
        assertEquals(board.getPiece(0,1).getType(),"Knight");
        assertFalse(board.isSpaceOccupied(1,3));
        
        
        
        // 9. Try capturing using White Knight
        board.placePiece(board.getPiece(0,1),2,2);
        board.placePiece(board.getPiece(2,2),4,1);
        board.placePiece(board.getPiece(4,1),6,2);
        assertTrue(board.getPiece(6,2).isWhite());
        assertEquals(board.getPiece(6,2).getType(),"Knight");
        assertFalse(board.isSpaceOccupied(4,1));
            // test for captured pieces
        assertFalse(board.getBlackCapturedPieces().get(5).isWhite()); // ensure added to array of captured pieces
        assertEquals(board.getBlackCapturedPieces().get(5).getType(), "Pawn");
        
        
        
        // 10. Try moving to occupied spot where occupant is occupied
        board.placePiece(board.getPiece(0,6),1,4);
        assertTrue(board.isSpaceOccupied(1,4));
        
       
        
    }
    
    @Test
    @Order(6)
    public void KingMoveTest() {
        
        
        // 1. Move forward left by one 
        board.placePiece(board.getPiece(0,4),1,3);
        assertTrue(board.getPiece(1,3).isWhite());
        assertEquals(board.getPiece(1,3).getType(),"King");
        assertFalse(board.isSpaceOccupied(0,4));
        
        // 2. Move forward by one
        board.placePiece(board.getPiece(1,3),2,3);
        assertTrue(board.getPiece(2,3).isWhite());
        assertEquals(board.getPiece(2,3).getType(),"King");
        assertFalse(board.isSpaceOccupied(1,3));
        
        // 3. Move forward right by one 
        board.placePiece(board.getPiece(2,3),3,4);
        assertTrue(board.getPiece(3,4).isWhite());
        assertEquals(board.getPiece(3,4).getType(),"King");
        assertFalse(board.isSpaceOccupied(2,3));
        
        // 4. Move side left by one 
        board.placePiece(board.getPiece(3,4),3,5);
        assertTrue(board.getPiece(3,5).isWhite());
        assertEquals(board.getPiece(3,5).getType(),"King");
        assertFalse(board.isSpaceOccupied(3,4));
       
        // 5. Move side right by one
        board.placePiece(board.getPiece(3,5),3,4);
        assertTrue(board.getPiece(3,4).isWhite());
        assertEquals(board.getPiece(3,4).getType(),"King");
        assertFalse(board.isSpaceOccupied(3,5));
        
        // 6. Move back left by one 
        board.placePiece(board.getPiece(3,4),2,3);
        assertTrue(board.getPiece(2,3).isWhite());
        assertEquals(board.getPiece(2,3).getType(),"King");
        assertFalse(board.isSpaceOccupied(3,4));
       
        // 7. Move back by one
        board.placePiece(board.getPiece(2,3),1,3);
        assertTrue(board.getPiece(1,3).isWhite());
        assertEquals(board.getPiece(1,3).getType(),"King");
        assertFalse(board.isSpaceOccupied(2,3));
        
        // 8. Move back right by one 
        board.placePiece(board.getPiece(1,3),0,4);
        assertTrue(board.getPiece(0,4).isWhite());
        assertEquals(board.getPiece(0,4).getType(),"King");
        assertFalse(board.isSpaceOccupied(1,3));
        
        
       
    }
    

}

package finalproject.tests;

import static org.junit.Assert.assertEquals;
import org.junit.BeforeClass;
import org.junit.Test;
//import org.junit.jupiter.api.Order;
import org.junit.FixMethodOrder;
import org.junit.runners.MethodSorters;

import finalproject.Board;

    /** 
    * This class is the test class for its counterpart class in the program
    */
    @FixMethodOrder(MethodSorters.NAME_ASCENDING)
    public class BoardTest{
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
    /**
     * This test method checks whether the display() 
     * after initialization is accurate.
     */ 
    public void testDisplay(){
        String expectedResult = 
                  "|wR|wK|wB|wQ|wK|wB|wK|wR|\n"
                + "|wP|wP|wP|wP|wP|wP|wP|wP|\n"
                + "|  |  |  |  |  |  |  |  |\n"
                + "|  |  |  |  |  |  |  |  |\n"
                + "|  |  |  |  |  |  |  |  |\n"
                + "|  |  |  |  |  |  |  |  |\n"
                + "|bP|bP|bP|bP|bP|bP|bP|bP|\n"
                + "|bR|bK|bB|bK|bQ|bB|bK|bR|\n";
        assertEquals(expectedResult, board.display());
    }
    
    @Test
    /**
     * This test method ensures the placePiece() 
     * method is working as expected. 
     * Particularly, it tests whether all valid pawnMoves are working
     */ 
    public void testPlacePiece() {
        
        // 1. test to see if basic valid white pawn moves works
            // 1.1 move by two from pawn row 
        board.placePiece(board.getPiece(1,0),3,0); // move by two from pawn row
                // Check there is a white pawn in the new location 
        assertEquals(board.getPiece(3, 0).getType(), "Pawn");
        assertEquals(board.getPiece(3, 0).getColor(), "white");
                // Check that there is no longer a white pawn in the previous location
        assertEquals(board.isSpaceOccupied(1, 0), false);
            // 1.2 move by one from pawn row
        board.placePiece(board.getPiece(1,7),2,7); // move by one from pawn row
                // Check there is a white pawn in the new location 
        assertEquals(board.getPiece(2, 7).getType(), "Pawn");
        assertEquals(board.getPiece(2, 7).getColor(), "white");
                // Check that there is no longer a white pawn in the previous location
        assertEquals(board.isSpaceOccupied(1, 7), false);
            // 1.3 test move by one from non-pawn row works
        board.placePiece(board.getPiece(2,7),3,7); // move by one from pawn row
                // Check there is a white pawn in the new location 
                assertEquals(board.getPiece(3, 7).getType(), "Pawn");
                assertEquals(board.getPiece(3, 7).getColor(), "white");
                // Check that there is no longer a white pawn in the previous location
        assertEquals(board.isSpaceOccupied(2, 7), false);
        
        // 2. test to see if invalid white pawn moves do not work
            // 2.1 diagonal move when position not occupied by piece of opponent (when in pawn row) should not work
        board.placePiece(board.getPiece(3, 0), 4, 1); // try moving piece diagonally position empty
        assertEquals(board.getPiece(3,0).getType(), "Pawn");
        assertEquals(board.getPiece(3,0).getColor(), "white");
        assertEquals(board.isSpaceOccupied(4,1), false); // place trying to move to is empty
            // 2.2 diagonal move when not occupied by piece of opponent (when in non pawn row) should not work
        board.placePiece(board.getPiece(1, 3), 2, 4); // try moving piece diagonally when not other piece of opponent
        assertEquals(board.getPiece(1, 3).getType(), "Pawn");
        assertEquals(board.getPiece(1, 3).getColor(), "white");
        assertEquals(board.isSpaceOccupied(2, 4), false); // place trying to move to is emptySu     
            // 2.3 move by two when not in non pawn row should not work
        board.placePiece(board.getPiece(3,7), 5, 7); // try moving by two when not in non pawn row
        assertEquals(board.getPiece(3, 7).getType(), "Pawn");
        assertEquals(board.getPiece(3,7).getColor(), "white");
        assertEquals(board.isSpaceOccupied(5, 7), false); // place trying to move to is empty
        
        // 3. test to see if basic valid black pawn moves works
            // 3.1 move by two from pawn row 
        board.placePiece(board.getPiece(6,1),4,1); // move by two from pawn row
        assertEquals(board.getPiece(4,1).getType(), "Pawn"); // Check there is a white pawn in the new location 
        assertEquals(board.getPiece(4,1).getColor(), "black");
        assertEquals(board.isSpaceOccupied(6,1), false); // Check that there is no longer a white pawn in the previous location
            // 3.2 move by one from pawn row
        board.placePiece(board.getPiece(6,6),5,6); // move by one from pawn row        
        assertEquals(board.getPiece(5, 6).getType(), "Pawn"); // Check there is a white pawn in the new location 
        assertEquals(board.getPiece(5, 6).getColor(), "black");
        assertEquals(board.isSpaceOccupied(6, 6), false); // Check that there is no longer a white pawn in the previous location
            // 3.3 test move by one from non-pawn row works
        board.placePiece(board.getPiece(5,6),4,6); // move by one from non pawn row
        assertEquals(board.getPiece(4, 6).getType(), "Pawn"); // Check there is a white pawn in the new location 
        assertEquals(board.getPiece(4, 6).getColor(), "black");
        assertEquals(board.isSpaceOccupied(5, 6), false); // Check that there is no longer a white pawn in the previous location

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
        
    }

}

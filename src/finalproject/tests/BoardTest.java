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
    public void testPlacePiece() {
        
        // test to see if basic invalid pawn move does not work
        board.placePiece(board.getPiece(1, 0), 1, 1);
        assertEquals(board.getPiece(1, 0).getType(), "Pawn");
        assertEquals(board.getPiece(1, 0).getColor(), "white");
        
        // test to see if basic valid pawn move works
        board.placePiece(board.getPiece(1,0),3,0);
            // Check there is a white pawn in the new location
        assertEquals(board.getPiece(3, 0).getType(), "Pawn");
        assertEquals(board.getPiece(3, 0).getColor(), "white");
            // Check that there is no longer a white pawn in the previous location
        assertEquals(board.isSpaceOccupied(1, 0), false);
        
        // test to see if move to occupied piece does not work: use knight
        board.placePiece(board.getPiece(0,1),1,4); // try to move knight to a place where pawn occupied
            // Check to see if knight still in its position
        assertEquals(board.getPiece(0,1).getType(), "Knight");
        assertEquals(board.getPiece(0,1).getColor(), "white");
            // Check to see pawn still in position trying to move 
        assertEquals(board.getPiece(1,4).getType(), "Pawn");
        assertEquals(board.getPiece(1,4).getColor(), "white");
        
        // test to see if captured pieces works
        board.placePiece(board.getPiece(1,1),3,1); // move white pawn to see if we can capture piece
        board.placePiece(board.getPiece(7,1),5,0); // move black knight to capture white pawn
            // test to see if pieces have indeed moved from original position
                // white pawn
            assertEquals(board.getPiece(3,1).getType(), "Pawn");
            assertEquals(board.getPiece(3,1).getColor(), "white");
            assertEquals(board.isSpaceOccupied(1,1), false);
                // black knight
            assertEquals(board.getPiece(5,0).getType(), "Knight");
            assertEquals(board.getPiece(5,0).getColor(), "black");
            assertEquals(board.isSpaceOccupied(7,1), false);
            // test to see if we can capture the piece
            board.placePiece(board.getPiece(5,0),3,1); // now have the black knight capture white pawn
                // Check to see if black knight has moved to new location
            assertEquals(board.getPiece(3,1).getType(), "Knight"); 
            assertEquals(board.getPiece(3,1).getColor(), "black");
            assertEquals(board.isSpaceOccupied(5,0), false);
                // Check to see if white pawn has been captured and is in captured pieces array
            assertEquals(board.getWhiteCapturedPieces().get(0).getType(), "Pawn");
            assertEquals(board.getWhiteCapturedPieces().get(0).getColor(), "white");

    }

}

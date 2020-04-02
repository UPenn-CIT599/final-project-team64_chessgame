package finalproject;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.jupiter.api.Test;


public class BoardTest
{
	@Test
	public void testDisplay()
	{
		Board board = new Board();
        board.initialize();
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
}

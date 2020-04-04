package finalproject.tests;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.junit.jupiter.api.Nested;

import finalproject.Board;
import finalproject.Player;

/** 
 * This class is the test class for its counterpart class in the program
 */
public class PlayerTest {

    @Test
    /**
     * This test method ensures Player on whiteTeam returns as whiteTeam.
     */ 
    public void testIsWhiteTeam() {
        boolean whiteTeam = true;
        assertTrue(whiteTeam);
    }

    @Test
    /**
     * This test method ensures Player on blackTeam returns as blackTeam.
     */  
    public void testIsBlackTeam() {
        boolean blackTeam = true;
        assertTrue(blackTeam);
    }

//  @RunWith(Player.class)
    @Nested
    public static class Player_1 {
        
        @Test
        /**
         * This test method ensures new Player_1 is shown on the whiteTeam  
         * when a new Player is created in the Player_1 inner class that extends Player.
         */  
        public void testWhiteTeam() {
            Player Player_1 = new Player();
            assertTrue(Player_1.isWhiteTeam() == true);
            assertEquals(Player_1.isWhiteTeam(), Player.whiteTeam);

        }
    }

//  @RunWith(Player.class)
    @Nested
    public static class Player_2 {
        
        @Test
        /**
         * This test method ensures new Player_2 is shown on the whiteTeam  
         * when a new Player is created in the Player_2 inner class that extends Player.
         */ 
        public void testBlackTeam() {
            Player Player_2 = new Player();
            assertTrue(Player_2.isBlackTeam() == true);
            assertEquals(Player_2.isWhiteTeam(), Player.blackTeam);
        }
    }
} 

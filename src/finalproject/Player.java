package finalproject;

import finalproject.Player;

/**
 * The Player class is an abstract class that creates the two players in the game.
 * The two players are inner subclasses of this class.
 */
public class Player {
    public static boolean whiteTeam;
    public static boolean blackTeam;
    
    /**
     * This method establishes state of being on whiteTeam.
     */    
    public boolean isWhiteTeam() {
        return whiteTeam == true;
    }
    
    /**
     * This method establishes state of being on blackTeam.
     */  
    public boolean isBlackTeam() {
        return blackTeam == true;
    }
 
    /**
     * The Player_1 class is an inner class and a sub class that extends the Player class.
     * The two players are inner subclasses of this class.
     */
    public class Player_1 extends Player {

        /**
         * This method creates new Player "Player_1" on the whiteTeam.
         */  
            public void whiteTeam(boolean whiteTeam) {
                Player.whiteTeam = whiteTeam;
                Player.blackTeam = false;
            }
        }
    

    public class Player_2 extends Player {

        /**
         * This method creates new Player "Player_2" on the blackTeam.
         */
            public void blackTeam(boolean blackTeam) {
                Player.blackTeam = blackTeam;
                Player.whiteTeam = false;
            }
    }   
}

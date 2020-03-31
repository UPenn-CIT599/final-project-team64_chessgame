package finalproject;

/**
 * The King class is a concrete class that extends abstract class ChessPiece.
 * It constructs and sets initial positions for the kings of both teams.
 * 
 * @author Team 64 - JMG
 */
public class King extends ChessPiece {

    ChessPiece blackKing = new ChessPiece();
    blackKing.color = "black";
    blackKing.type = "king";
    board[0][4] = blackKing;
    
    ChessPiece whiteKing = new ChessPiece();
    whiteKing.color = "white";
    whiteKing.type = "king";
    board[7][3] = whiteKing;
    
}
}


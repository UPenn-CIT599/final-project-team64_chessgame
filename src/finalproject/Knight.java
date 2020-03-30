
/**
 * The Knight class is a concrete class that extends abstract class ChessPiece.
 * It constructs and sets initial positions for the knights of both teams.
 * 
 * @author Team 64 - JMG
 */
public class Knight extends ChessPiece {

    ChessPiece blackKnightLeft = new ChessPiece();
    blackKnight.color = "black";
    blackKnight.type = "Knight";
    board[0][1] = blackKnight;

    ChessPiece blackKnightRight = new ChessPiece();
    blackKnight.color = "black";
    blackKnight.type = "Knight";
    board[0][6] = blackKnight;

    ChessPiece whiteKnightLeft = new ChessPiece();
    whiteKnight.color = "white";
    whiteKnight.type = "Knight";
    board[7][6] = whiteKnight;

    ChessPiece whiteKnightRight = new ChessPiece();
    whiteKnight.color = "white";
    whiteKnight.type = "Knight";
    board[7][1] = whiteKnight;

}
}
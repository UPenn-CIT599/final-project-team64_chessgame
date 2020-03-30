
/**
 * The Queen class is a concrete class that extends abstract class ChessPiece.
 * It constructs and sets initial positions for the queen of both teams.
 *
 * @author Team 64 - JMG
 * Moves to be checked for: regular capture move
 */
public class Queen extends ChessPiece {

    ChessPiece blackQueen = new ChessPiece();
    blackQueen.color = "black";
    blackQueen.type = "queen";
    board[0][3] = blackQueen;

    ChessPiece whiteQueen = new ChessPiece();
    whiteQueen.color = "white";
    whiteQueen.type = "queen";
    board[7][4] = blackQueen;
}
}

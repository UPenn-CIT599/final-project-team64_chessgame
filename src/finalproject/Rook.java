package finalproject;

/**
 * The Rook class is a concrete class that extends abstract class ChessPiece.
 * It constructs and sets initial positions for the rooks of both teams.
 * 
 * @author Team 64 - JMG
 */
public class Rook extends ChessPiece {

    ChessPiece blackRookLeft = new ChessPiece();
    blackRook.color = "black";
    blackRook.type = "Rook";
    board[0][0] = blackRook;

    ChessPiece blackRookRight = new ChessPiece();
    blackRook.color = "black";
    blackRook.type = "Rook";
    board[0][7] = blackRook;

    ChessPiece whiteRookLeft = new ChessPiece();
    whiteRook.color = "white";
    whiteRook.type = "Rook";
    board[7][7] = whiteRook;

    ChessPiece whiteRookRight = new ChessPiece();
    whiteRook.color = "white";
    whiteRook.type = "Rook";
    board[7][0] = whiteRook;

}
}

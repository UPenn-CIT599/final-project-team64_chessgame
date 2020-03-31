package finalproject;

/**
 * The Pawn class is a concrete class that extends abstract class ChessPiece.
 * It constructs and sets initial positions for the pawns of both teams.
 * 
 * @author Team 64 - JMG
 */
public class Pawn extends ChessPiece {

    for(int i = 0; i < 8; i++)
    {
        ChessPiece blackPawn = new ChessPiece();
        blackPawn.color = "black";
        blackPawn.type = "pawn";
        game.board[1][i] = blackPawn;
    }
    for(int j = 0; j < 8; j++)
    {
        ChessPiece whitePawn = new ChessPiece();
        whitePawn.color = "white";
        whitePawn.type = "pawn";
        game.board[6][i] = whitePawn;

    }
}
}

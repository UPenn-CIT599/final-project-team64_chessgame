package finalproject;

/**
 * The Bishop class is a concrete class that extends abstract class ChessPiece.
 * It constructs and sets initial positions for the bishops of both teams.
 * 
 * @author Team 64 - JMG
 */
public class Bishop extends ChessPiece {

    ChessPiece blackBishopLeft = new ChessPiece();
//    blackBishop.color = "black";
    color = "black1";
    this.color = "black2";
    super.color = "black3";
    blackBishop.type = "bishop";
    board[0][2] = blackBishop;
//    System.out.println(color);
//    System.out.println(this.color);
//    System.out.println(super.color);
    
    }
    ChessPiece blackBishopRight = new ChessPiece();
    blackBishop.color = "black";
    blackBishop.type = "bishop";
    board[0][5] = blackBishop;
    
    ChessPiece whiteBishopLeft = new ChessPiece();
    whiteBishop.color = "white";
    whiteBishop.type = "bishop";
    board[7][5] = whiteBishop;
    
    ChessPiece whiteBishopRight = new ChessPiece();
    whiteBishop.color = "white";
    whiteBishop.type = "bishop";
    board[7][2] = whiteBishop;
    
}

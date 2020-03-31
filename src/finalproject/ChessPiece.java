package finalproject;

import java.util.ArrayList;

/**
 * The ChessPiece class is an abstract superclass with subclasses:
 * King, Queen, Bishop, Knight, Rook, and Pawn.
 * The subclasses construct the game pieces for both teams in this program.
 * 
 * @author Team 64 - JMG
 */
public abstract class ChessPiece {
    //private Board chessBoard;
    private String color;
    private String type;
    private int row;
    private int column;
    
    /**
     * This is the constructor for the ChessPiece
     */
    public ChessPiece(String color, String type, int row, int column) {
        this.color = color;
        this.type = type;
        this.row = row;
        this.column = column;
    }
    
    
    /**
     * @return the color
     */
    public String getColor() {
        return color;
    }
    
    /**
     * @param color the color to set
     */
    public void setColor(String color) {
        this.color = color;
    }
    /**
     * @return the type
     */
    public String getType() {
        return type;
    }
    
    /**
     * @param type the type to set
     */
    public void setType(String type) {
        this.type = type;
    }
    
    /**
     * @return the row
     */
    public int getrow() {
        return row;
    }

    /**
     * @param set the row
     */
    public void setrow(int i) {
        this.row = i;
    }
    
    /**
     * @return the column
     */
    public int getcolumn() {
        return this.column;
    }
    
    /**
     * @param set the column
     */
    public void setcolumn(int j) {
        this.column = j;
    }
    
    public ArrayList<String> legalMoves(){
        ArrayList<String> strList = new ArrayList<String>();
       return strList;
    }
    
    /**
     * This method checks whether a ChessPiece can move or not and will be extended in subclasses
     * @param row
     * @param column
     * @return
     */
    public boolean canMove(int row, int column) {
        return false;
    }
    
}

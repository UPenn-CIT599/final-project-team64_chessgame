
/**
 * The ChessPiece class is an abstract superclass with subclasses:
 * King, Queen, Bishop, Knight, Rook, and Pawn.
 * The subclasses construct the game pieces for both teams in this program.
 * 
 * @author Team 64 - JMG
 */
public abstract class ChessPiece {
    private String color;
    private String type;
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
    
    
}

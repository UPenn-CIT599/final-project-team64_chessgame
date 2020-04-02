package finalproject;

public class Runner {
    
    public static void main(String[] args) {
        Board board = new Board();
        board.initialize();
        System.out.println(board.display());
    }

}

package draft;

public class GUI_ChessPieces {

    public static final String WHITE_KING = "\u2654";
    public static final String WHITE_QUEEN = "\u2655";
    public static final String WHITE_BISHOP_LEFT = "\u2657";
    public static final String WHITE_KNIGHT_LEFT = "\u2658";
    public static final String WHITE_ROOK_LEFT = "\u2656";
    public static final String WHITE_BISHOP_RIGHT = "\u2657";
    public static final String WHITE_KNIGHT_RIGHT = "\u2658";
    public static final String WHITE_ROOK_RIGHT = "\u2656";
    public static final String WHITE_PAWN_0 = "\u2659";
    public static final String WHITE_PAWN_1 = "\u2659";
    public static final String WHITE_PAWN_2 = "\u2659";
    public static final String WHITE_PAWN_3 = "\u2659";
    public static final String WHITE_PAWN_4 = "\u2659";
    public static final String WHITE_PAWN_5 = "\u2659";
    public static final String WHITE_PAWN_6 = "\u2659";
    public static final String WHITE_PAWN_7 = "\u2659";

    public static final String BLACK_KING = "\u265A";
    public static final String BLACK_QUEEN = "\u265B";
    public static final String BLACK_BISHOP_LEFT = "\u265D";
    public static final String BLACK_KNIGHT_LEFT = "\u265E";
    public static final String BLACK_ROOK_LEFT = "\u265C";
    public static final String BLACK_BISHOP_RIGHT = "\u265D";
    public static final String BLACK_KNIGHT_RIGHT = "\u265E";
    public static final String BLACK_ROOK_RIGHT = "\u265C";
    public static final String BLACK_PAWN_0 = "\u265F";
    public static final String BLACK_PAWN_1 = "\u265F";
    public static final String BLACK_PAWN_2 = "\u265F";
    public static final String BLACK_PAWN_3 = "\u265F";
    public static final String BLACK_PAWN_4 = "\u265F";
    public static final String BLACK_PAWN_5 = "\u265F";
    public static final String BLACK_PAWN_6 = "\u265F";
    public static final String BLACK_PAWN_7 = "\u265F";

    public GUI_ChessPieces() {

    }

    static GUI_ChessPieces[] WhiteTeam = new GUI_ChessPieces[16];
    static GUI_ChessPieces[] BlackTeam = new GUI_ChessPieces[16];
//    GUI_Chess_Pieces[] GUI_CP_Black_Team = new GUI_Chess_Pieces[16];

    static String[] GUI_CP_White_Team = {WHITE_KING,WHITE_QUEEN,WHITE_BISHOP_LEFT,WHITE_KNIGHT_LEFT,
            WHITE_ROOK_LEFT,WHITE_BISHOP_RIGHT,WHITE_KNIGHT_RIGHT,WHITE_ROOK_RIGHT,
            WHITE_PAWN_0,WHITE_PAWN_1,WHITE_PAWN_2,WHITE_PAWN_3,WHITE_PAWN_4,
            WHITE_PAWN_5,WHITE_PAWN_6,WHITE_PAWN_7};
            
    static String[] GUI_CP_Black_Team = {BLACK_KING,BLACK_QUEEN,BLACK_BISHOP_LEFT,BLACK_KNIGHT_LEFT,
            BLACK_ROOK_LEFT,BLACK_BISHOP_RIGHT,BLACK_KNIGHT_RIGHT,BLACK_ROOK_RIGHT,
            BLACK_PAWN_0,BLACK_PAWN_1,BLACK_PAWN_2,BLACK_PAWN_3,BLACK_PAWN_4,
            BLACK_PAWN_5,BLACK_PAWN_6,BLACK_PAWN_7};
        
    
    public static void main(String[] args) {
        for (GUI_ChessPieces e : WhiteTeam) {
            System.out.println(e);
        }
        for (GUI_ChessPieces e : BlackTeam) {
            System.out.println(e);
        }
        for (String e : GUI_CP_White_Team) {
            System.out.println(e);
        }
        for (String e : GUI_CP_Black_Team) {
            System.out.println(e);
        }


    }

}

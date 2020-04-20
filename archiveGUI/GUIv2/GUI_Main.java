package team64_chessGame_v6;

import java.awt.*;
import javax.swing.*;

@SuppressWarnings("serial")

public class GUI_Main extends JFrame {
    private JFrame frame; // main GUI window   
    private GUI_Toolbar toolbar; // right - contains buttons for new game and quit game
    private JPanel header; // top - contains top of window info for game: title, status, etc.
    private JPanel board; // center - contains chessBoard
    private JPanel jail; // left - contains area where captured chessPieces are placed

        
        /**
         * Pulls the GUI's components in and arranges their layout
         */ 
        public GUI_Main() {
            
            frame = new JFrame("Spring 2020 - MCIT 591 - TEAM 64 - Chess Game");
            
            frame.setLayout(new BorderLayout());

            toolbar = new GUI_Toolbar();
            header = new JPanel();
            board = new JPanel();
            jail = new JPanel();

            frame.add(toolbar, BorderLayout.EAST);
            frame.add(header, BorderLayout.NORTH);
            frame.add(board, BorderLayout.CENTER);
            frame.add(jail, BorderLayout.WEST);

            frame.setSize(1000, 1000);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setVisible(true);
            
            }
}

package finalproject.application;

import java.awt.*;
import javax.swing.*;
import javax.swing.GroupLayout.Alignment;



@SuppressWarnings("serial")

public class GUI_Main extends JFrame {
    private JFrame frame; // main GUI window   
    private GUI_Toolbar toolbar; // right - contains buttons for new game and quit game
    private GUI_Header header; // top - contains top of window info for game: title, status, etc.
    private GUI_ChessBoard board; // center - contains chessBoard
    private GUI_Jail jail; // left - contains area where captured chessPieces are placed
        
        /**
         * Pulls the GUI's components in and arranges their layout
         */ 
        public GUI_Main() {
            
            frame = new JFrame("Spring 2020 - MCIT 591 - TEAM 64 - Chess Game");
            frame.setSize(new Dimension(1000, 804));
            frame.setResizable(false);
            frame.setPreferredSize(new Dimension(1000, 800));
            frame.setMinimumSize(new Dimension(500, 500));
            frame.setMaximumSize(new Dimension(1000, 1000));
            
            frame.getContentPane().setLayout(new BorderLayout());

            toolbar = new GUI_Toolbar();
            header = new GUI_Header();
            board = new GUI_ChessBoard();
            jail = new GUI_Jail();

            frame.getContentPane().add(toolbar, BorderLayout.EAST);
            toolbar.setLayout(new GridLayout(3, 1, 0, 0));
            frame.getContentPane().add(header, BorderLayout.NORTH);
            frame.getContentPane().add(board, BorderLayout.CENTER);
            frame.getContentPane().add(jail, BorderLayout.WEST);
            
            GroupLayout gl_jail = new GroupLayout(jail);
            gl_jail.setHorizontalGroup(
                gl_jail.createParallelGroup(Alignment.LEADING)
                    .addGap(0, 268, Short.MAX_VALUE)
            );
            gl_jail.setVerticalGroup(
                gl_jail.createParallelGroup(Alignment.LEADING)
                    .addGap(0, 751, Short.MAX_VALUE)
            );
            jail.setLayout(gl_jail);

            frame.setSize(1000, 1000);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setVisible(true);
            
            }
}

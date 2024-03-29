package application;

import java.awt.*;
import javax.swing.*;

@SuppressWarnings("serial")

/**
 * This class creates and organizes the GUI's components, then arranges their layout
 */ 
public class GUI_Main extends JFrame {
    private static JFrame frame; // main GUI window   
    private GUI_Buttons buttons; // right - contains buttons for new game and quit game
    private GUI_Header header; // top - contains top of window info for game: title, status, etc.
    private GUI_ChessBoard board; // center - contains chessBoard
    private GUI_Jail jail; // left - contains area where captured chessPieces are placed

    /**
     * Creates main window app and its components, then arranges their layout
     */ 
    public GUI_Main() {

        //Create and set up the window
        frame = new JFrame("Spring 2020 - MCIT 591 - TEAM 64 - Chess Game");
        frame.setSize(new Dimension(1250, 750));
        frame.getContentPane().setLayout(new BorderLayout(50,50));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

        //Create and set up the content areas of the window
        buttons = new GUI_Buttons();
        header = new GUI_Header();
        board = new GUI_ChessBoard();
        jail = new GUI_Jail();

        //Add the content areas of the window to the actual window
        frame.getContentPane().add(buttons, BorderLayout.EAST);
        frame.getContentPane().add(header, BorderLayout.NORTH);
        frame.getContentPane().add(board, BorderLayout.CENTER);
        frame.getContentPane().add(jail, BorderLayout.WEST);
        
    }

    /**
     * Upon new game button click, closes current game before a new game is launched 
     */
    public static void close_GUI() {
        frame.dispose(); 
    }

    /**
     * sets cross platform look & feel 
     * @param args
     */
    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel("javax.swing.plaf.metal.MetalLookAndFeel");
        } catch (UnsupportedLookAndFeelException ex) {
            ex.printStackTrace();
        } catch (IllegalAccessException ex) {
            ex.printStackTrace();
        } catch (InstantiationException ex) {
            ex.printStackTrace();
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
        }
        UIManager.put("swing.boldMetal", Boolean.FALSE);
    }
}


package application;

import java.awt.Color;
import java.awt.Container;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class GUI_Main {

    /**
     * Pulls in the GUI's components in and arranges their layout. 
     */ 
    public static void addComponentsToPane(Container pane) {
        pane.setLayout(null);

        //adds status (aka information) bar above chessBoard (aka north portion of GUI)  
        JPanel notificationPanel = new JPanel();
        notificationPanel.setBackground(Color.WHITE);
        notificationPanel.setBounds(200, 75, 600, 50);
        pane.add(notificationPanel);

        JTextArea textInNotificationBar = new JTextArea();
        notificationPanel.add(textInNotificationBar);
        textInNotificationBar.setFont(new Font("Arial", Font.BOLD, 14));
        textInNotificationBar.setLineWrap(false);
        textInNotificationBar.setBackground(Color.WHITE);
        textInNotificationBar.setText("NOTIFICATION BAR");
        //still need to add more functionality, player turn, instructions, etc.
        

        


        //adds chessboard in center portion of the GUI
        JPanel board = new JPanel();
        board.setBackground(new Color(150, 150, 150));
        board.setBounds(300, 250, 450, 450);
        pane.add(board);
        //work in progress
 
        
        
        //adds captured pieces area on top-left (aka southwest) portion of the GUI
        JLabel powLabelPrisonersTeamBlack = new JLabel("Captured By Black Team");
        powLabelPrisonersTeamBlack.setBounds(50, 225, 200, 25);
        pane.add(powLabelPrisonersTeamBlack);
        
        JPanel prisonersCapturedByBlackTeam = new JPanel();
        prisonersCapturedByBlackTeam.setBackground(Color.GRAY);
        prisonersCapturedByBlackTeam.setBounds(50, 250, 200, 200);
        pane.add(prisonersCapturedByBlackTeam); 
        
        JTextArea textInBlackTeamPrison = new JTextArea();
        prisonersCapturedByBlackTeam.add(textInBlackTeamPrison);
        textInBlackTeamPrison.setFont(new Font("Arial", Font.BOLD, 14));
        textInBlackTeamPrison.setLineWrap(true);
        textInBlackTeamPrison.setBackground(Color.WHITE);
        textInBlackTeamPrison.setText("PRISON"); 
        //still need to add more functionality, captured pieces & promtions.        
        
        

        //adds captured pieces area on bottom-left (aka northwest) portion of the GUI
        JLabel powLabelPrisonersTeamWhite = new JLabel("Captured By White Team");
        powLabelPrisonersTeamWhite.setToolTipText("");
        powLabelPrisonersTeamWhite.setCursor(Cursor.getPredefinedCursor(Cursor.CROSSHAIR_CURSOR));
        powLabelPrisonersTeamWhite.setOpaque(true);
        powLabelPrisonersTeamWhite.setBounds(50, 475, 200, 25);
        pane.add(powLabelPrisonersTeamWhite);
        
        JPanel prisonersCapturedByWhiteTeam = new JPanel();
        prisonersCapturedByWhiteTeam.setBackground(Color.GRAY);
        prisonersCapturedByWhiteTeam.setBounds(50, 500, 200, 200);
        pane.add(prisonersCapturedByWhiteTeam);        
        
        JTextArea textInWhiteTeamPrison = new JTextArea();
        prisonersCapturedByWhiteTeam.add(textInWhiteTeamPrison);
        textInWhiteTeamPrison.setFont(new Font("Arial", Font.BOLD, 14));
        textInWhiteTeamPrison.setLineWrap(true);
        textInWhiteTeamPrison.setBackground(Color.WHITE);
        textInWhiteTeamPrison.setText("PRISON");
        //still need to add more functionality, captured pieces & promtions.

        
        



        
        //adds New Game Button
        JButton JButtonNewGame = new JButton("NEW GAME");
        JButtonNewGame.setFont(new Font("Tahoma", Font.BOLD, 14));
        JButtonNewGame.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                textInNotificationBar.setText("NEW GAME BUTTON HAS BEEN MOUSE-CLICKED!");
            }
        });
        JButtonNewGame.setBounds(800, 250, 125, 25);
        pane.add(JButtonNewGame);
        //still need to develop a new game function

        //adds Quit Game Button on bottom-right (aka southeast) portion of the GUI
        JButton JButtonQuitGame = new JButton("QUIT GAME");
        JButtonQuitGame.setFont(new Font("Tahoma", Font.BOLD, 14));
        JButtonQuitGame.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                textInNotificationBar.setText("QUIT GAME BUTTON HAS BEEN MOUSE-CLICKED!");
            }
        });
        JButtonQuitGame.setBounds(800, 550, 125, 25);
        pane.add(JButtonQuitGame);
        //still need to develop a quit game function
    }
}

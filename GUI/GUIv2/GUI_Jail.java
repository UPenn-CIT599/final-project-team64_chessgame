package draft;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class GUI_Jail extends JFrame implements GUI_Interface_addToolbar {
    private static JLabel powLabelPrisonersTeamBlack;  
    private static JPanel prisonersCapturedByBlackTeam;  
    private static JTextArea textInBlackTeamPrison; 
    private static JLabel powLabelPrisonersTeamWhite;  
    private static JPanel prisonersCapturedByWhiteTeam; 
    private static JTextArea textInWhiteTeamPrison;

    public void add(Object object) {
        // TODO Auto-generated method stub
        
    }
    
    /*
     * adds captured pieces area on left portion of the GUI
     */
    public void createJail() {
    //still need to add more functionality, captured pieces & promotions        

    //creates label for jail containing black team prisoners    
    powLabelPrisonersTeamBlack = new JLabel("Captured By Black Team");
    powLabelPrisonersTeamBlack.setBounds(50, 225, 200, 25);
    add(powLabelPrisonersTeamBlack);
    
    //creates actual "jail" where black team prisoners are placed    
    prisonersCapturedByBlackTeam = new JPanel();
    prisonersCapturedByBlackTeam.setBackground(Color.GRAY);
    prisonersCapturedByBlackTeam.setBounds(50, 250, 200, 200);
    add(prisonersCapturedByBlackTeam); 
    
    //creates textArea in "jail" to place prisoner icons    
    textInBlackTeamPrison = new JTextArea();
    prisonersCapturedByBlackTeam.add(textInBlackTeamPrison);
    textInBlackTeamPrison.setFont(new Font("Arial", Font.BOLD, 14));
    textInBlackTeamPrison.setLineWrap(true);
    textInBlackTeamPrison.setBackground(Color.WHITE);
    textInBlackTeamPrison.setText("PRISON"); 


    
    
    
    //creates label for jail containing white team prisoners    
    powLabelPrisonersTeamWhite = new JLabel("Captured By White Team");
    powLabelPrisonersTeamWhite.setToolTipText("");
    powLabelPrisonersTeamWhite.setCursor(Cursor.getPredefinedCursor(Cursor.CROSSHAIR_CURSOR));
    powLabelPrisonersTeamWhite.setOpaque(true);
    powLabelPrisonersTeamWhite.setBounds(50, 475, 200, 25);
    add(powLabelPrisonersTeamWhite);
    
    //creates actual "jail" where white team prisoners are placed    
    prisonersCapturedByWhiteTeam = new JPanel();
    prisonersCapturedByWhiteTeam.setBackground(Color.GRAY);
    prisonersCapturedByWhiteTeam.setBounds(50, 500, 200, 200);
    add(prisonersCapturedByWhiteTeam);        
    
    //creates textArea in "jail" to place prisoner icons    
    textInWhiteTeamPrison = new JTextArea();
    prisonersCapturedByWhiteTeam.add(textInWhiteTeamPrison);
    textInWhiteTeamPrison.setFont(new Font("Arial", Font.BOLD, 14));
    textInWhiteTeamPrison.setLineWrap(true);
    textInWhiteTeamPrison.setBackground(Color.WHITE);
    textInWhiteTeamPrison.setText("PRISON");
    //still need to add more functionality, captured pieces & promtions.
    }
}

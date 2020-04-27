package application;

import java.awt.*;
import javax.swing.*;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;

@SuppressWarnings("serial")

public class GUI_Header extends JPanel {
    static JTextArea textInNotificationBar;

    /**
     * The GUI_Header class adds status (aka information) bar above chessBoard (aka north portion of GUI)  
     */
    public GUI_Header() {
 
        setBorder(new CompoundBorder(new EmptyBorder(75, 25, 25, 50), getBorder()));
        
        textInNotificationBar = new JTextArea();

        textInNotificationBar.setBounds(1, 1, 500, 200);
        textInNotificationBar.setForeground(Color.WHITE);
        textInNotificationBar.setBackground(Color.BLUE);
        textInNotificationBar.setFont(new Font("Arial", Font.BOLD, 22));

        textInNotificationBar.setWrapStyleWord(true);
        textInNotificationBar.setLineWrap(true);
        textInNotificationBar.setWrapStyleWord(true);
        
        textInNotificationBar.setAutoscrolls(false);
        textInNotificationBar.setEditable(false);
        
        add(textInNotificationBar);
        
        //Shows message for team with first move and stabilizes gui layout spacing
        infoMsgWhiteTeamTurn();
    }

    /**
     * sets message - self-explanatory  
     */
    public static void infoMsgWhiteTeamTurn() {
        textInNotificationBar.setText("\n                      It is white team's turn! \n");
    }
    
    /**
     * sets message - self-explanatory  
     */
    public static void infoMsgBlackTeamTurn() {
        textInNotificationBar.setText("\n                      It is black team's turn! \n");
    }
    
    /**
     * sets message - self-explanatory  
     */
    public static void infoGameOverBlack() {
      textInNotificationBar.setText("\n                   Game Over! White Team wins! \n");
  }
        
    /**
     * sets message - self-explanatory  
     */
    public static void infoGameOverWhite() {
      textInNotificationBar.setText("\n                   Game Over! Black Team wins! \n");
  }
    
}

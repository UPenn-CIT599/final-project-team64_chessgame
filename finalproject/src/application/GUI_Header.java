package application;

import java.awt.*;
import javax.swing.*;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;

@SuppressWarnings("serial")

public class GUI_Header extends JPanel {
    static JTextArea textInNotificationBar;

    /*
     * Adds status (aka information) bar above chessBoard (aka north portion of GUI)  
     */
    public GUI_Header() {
 
        setBorder(new CompoundBorder(new EmptyBorder(75, 25, 25, 50), getBorder()));//centered@ 50, 105, 50, 50
        
        textInNotificationBar = new JTextArea();

        textInNotificationBar.setBounds(1, 1, 500, 200);//centered@ 300, 1, 475, 200
        textInNotificationBar.setForeground(Color.WHITE);
        textInNotificationBar.setBackground(Color.BLUE);
        textInNotificationBar.setFont(new Font("Arial", Font.BOLD, 22));

        textInNotificationBar.setWrapStyleWord(true);
        textInNotificationBar.setLineWrap(true);
        textInNotificationBar.setWrapStyleWord(true);
        
        textInNotificationBar.setAutoscrolls(false);
        textInNotificationBar.setEditable(false);
        
        add(textInNotificationBar);
        
        //place holder for action event message handling in info / status bar
        infoMsgBlackTeamTurn();        
        infoMsgWhiteTeamTurn();
    }

    public static void infoMsgWhiteTeamTurn() {
//        textInNotificationBar.append("\n It is white team's turn! \n");
        textInNotificationBar.setText("\n                      It is white team's turn! \n");

        
        //        textInNotificationBar.getComponentOrientation().isHorizontal();
//        textInNotificationBar.setSelectedTextColor(Color.WHITE);
    }
    
    public static void infoMsgBlackTeamTurn() {
//        textInNotificationBar.append("\n It is black team's turn! \n");
        textInNotificationBar.setText("\n                      It is black team's turn! \n");
    }
    
    public static void infoGameOverBlack() {
//      textInNotificationBar.append("\n It is black team's turn! \n");
      textInNotificationBar.setText("\n                      Game Over! White Team wins! \n");
  }
        
    public static void infoGameOverWhite() {
//      textInNotificationBar.append("\n It is black team's turn! \n");
      textInNotificationBar.setText("\n                      Game Over! Black Team wins! \n");
  }
    
    
    
}

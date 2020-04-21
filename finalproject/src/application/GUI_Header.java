package application;

import java.awt.*;
import javax.swing.*;
import javax.swing.border.BevelBorder;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;

@SuppressWarnings("serial")

public class GUI_Header extends JPanel {
    JPanel notificationPanel;
    JTextArea textInNotificationBar;

    /*
     * Adds status (aka information) bar above chessBoard (aka north portion of GUI)  
     */
    public GUI_Header() {
        //still need to add more functionality, player turn, instructions, etc.

        notificationPanel = new JPanel();
        setBorder(new CompoundBorder(new EmptyBorder(50, 50, 50, 50), getBorder()));
        
        textInNotificationBar = new JTextArea();
        textInNotificationBar.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
        textInNotificationBar.setEditable(false);
        textInNotificationBar.setWrapStyleWord(true);
        textInNotificationBar.setBounds(1, 1, 500, 200);
//        textInNotificationBar.setBorder(new BevelBorder(BevelBorder.RAISED, Color.BLACK, null, null, null));

        textInNotificationBar.setFont(new Font("Arial", Font.BOLD, 14));
        textInNotificationBar.setLineWrap(true);
        textInNotificationBar.setWrapStyleWord(true);
        textInNotificationBar.setBackground(Color.LIGHT_GRAY);

//        notificationPanel.add(textInNotificationBar);
        add(notificationPanel);
        add(textInNotificationBar);
        
        //place holder for action event message handling in info / status bar
        infoMsgWhiteTeamTurn();
        infoMsgBlackTeamTurn();
    }

    public void infoMsgWhiteTeamTurn() {
        textInNotificationBar.append("It is white team's turn! \n");
//        textInNotificationBar.setText("It is white team's turn!"); //alternate msg
    }
    
    public void infoMsgBlackTeamTurn() {
        textInNotificationBar.append("It is black team's turn! \n");
//        textInNotificationBar.setText("It is black team's turn!"); //alternate msg
    }
    
}

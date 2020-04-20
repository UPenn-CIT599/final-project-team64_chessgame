package application;

import java.awt.*;
import javax.swing.*;
import javax.swing.border.BevelBorder;

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
//        notificationPanel.setAlignmentY(Component.TOP_ALIGNMENT);
//        notificationPanel.setLocation(100, 50);
//        
//        notificationPanel.setBorder(new BevelBorder(BevelBorder.RAISED, Color.BLACK, null, null, null));
//        notificationPanel.setPreferredSize(new Dimension(500, 200));
        
        textInNotificationBar = new JTextArea();
        textInNotificationBar.setEditable(false);
        textInNotificationBar.setWrapStyleWord(true);
        textInNotificationBar.setBounds(1, 1, 500, 200);
        textInNotificationBar.setBorder(new BevelBorder(BevelBorder.RAISED, Color.BLACK, null, null, null));

//        setLayout(new FlowLayout(FlowLayout.CENTER));

//        notificationPanel.setBackground(Color.WHITE);
//        notificationPanel.setLayout(null);

        textInNotificationBar.setFont(new Font("Arial", Font.BOLD, 14));
        textInNotificationBar.setLineWrap(true);
        textInNotificationBar.setWrapStyleWord(true);;
        textInNotificationBar.setBackground(Color.WHITE);
//        textInNotificationBar.setText("NOTIFICATION BAR - TEST TEST TEST TEST TEST TEST TEST TEST TEST TEST TEST TEST TEST TEST TEST");

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

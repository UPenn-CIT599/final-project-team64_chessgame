package team64_chessGame_v6;

import java.awt.*;
import javax.swing.*;

@SuppressWarnings("serial")

public class GUI_Header extends JPanel {
    JPanel notificationPanel;
    JTextArea textInNotificationBar;

    /*
     * Adds status (aka information) bar above chessBoard (aka north portion of GUI)  
     */
    public void Header() {
        //still need to add more functionality, player turn, instructions, etc.
        
    notificationPanel = new JPanel();
    textInNotificationBar = new JTextArea();
    
    setLayout(new FlowLayout(FlowLayout.CENTER));

    notificationPanel.setBackground(Color.WHITE);
    notificationPanel.setBounds(200, 75, 600, 50);

    notificationPanel.add(textInNotificationBar);
    textInNotificationBar.setFont(new Font("Arial", Font.BOLD, 14));
    textInNotificationBar.setLineWrap(false);
    textInNotificationBar.setBackground(Color.WHITE);
    textInNotificationBar.setText("NOTIFICATION BAR");
    
    add(notificationPanel);
    add(textInNotificationBar);

    
    }
    
}

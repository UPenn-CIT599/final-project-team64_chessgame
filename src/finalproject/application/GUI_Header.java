package finalproject.application;

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
        notificationPanel.setAlignmentY(Component.TOP_ALIGNMENT);
        notificationPanel.setBorder(new BevelBorder(BevelBorder.RAISED, Color.BLACK, null, null, null));
        notificationPanel.setBounds(new Rectangle(50, 50, 50, 50));
        notificationPanel.setMinimumSize(new Dimension(250, 250));
        notificationPanel.setMaximumSize(new Dimension(1000, 1000));
        notificationPanel.setPreferredSize(new Dimension(500, 200));
        textInNotificationBar = new JTextArea();
        textInNotificationBar.setWrapStyleWord(true);
        textInNotificationBar.setBounds(43, 52, 714, 21);

        setLayout(new FlowLayout(FlowLayout.CENTER));

        notificationPanel.setBackground(Color.WHITE);
        notificationPanel.setBounds(200, 75, 600, 200);
        notificationPanel.setLayout(null);

        textInNotificationBar.setFont(new Font("Arial", Font.BOLD, 14));
        textInNotificationBar.setLineWrap(false);
        textInNotificationBar.setBackground(Color.WHITE);
        textInNotificationBar.setText("NOTIFICATION BAR - TEST TEST TEST TEST TEST TEST TEST TEST TEST TEST TEST TEST TEST TEST TEST");

        notificationPanel.add(textInNotificationBar);
        add(notificationPanel);


    }

}

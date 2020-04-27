package application;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;

@SuppressWarnings("serial")

/**
 * The GUI_Buttons class is a class that constructs creates, activates, listens to,
 * and responds to the buttons in the EAST / right side of the window.
 */
public class GUI_Buttons extends JPanel implements ActionListener {
    private JButton newGUIGameButton;
    //    private JButton newConsoleGameButton; // saved console option for future integration in app
    private JButton quitGameButton;

    /**
     * Creates, initializes, designs, and activates GUI buttons
     */
    public GUI_Buttons() {

        setBorder(new CompoundBorder(new EmptyBorder(150, 25, 210, 25), getBorder()));

        newGUIGameButton = new JButton("New GUI Game!");
        newGUIGameButton.addActionListener(this);
        newGUIGameButton.setFont(new Font("Arial", Font.BOLD, 22));

        //        newConsoleGameButton = new JButton("New Console Game!"); // saved console option for future integration in app
        //        newConsoleGameButton.addActionListener(this); // saved console option for future integration in app
        //        newConsoleGameButton.setFont(new Font("Arial", Font.BOLD, 22)); // saved console option for future integration in app

        quitGameButton = new JButton("Quit Game!");
        quitGameButton.addActionListener(this);
        quitGameButton.setFont(new Font("Arial", Font.BOLD, 22));

        setLayout(new BorderLayout());

        add(newGUIGameButton, BorderLayout.NORTH);
        //        add(newConsoleGameButton, BorderLayout.CENTER); // saved console option for future integration in app
        add(quitGameButton, BorderLayout.SOUTH);
    }

    /**
     * Launches actions in response to "heard" button clicks
     */
    @Override
    public void actionPerformed(ActionEvent e) {
        JButton clicked = (JButton)e.getSource();

        if(clicked == newGUIGameButton) {
            Toolkit.getDefaultToolkit().beep();
            GUI_Main.close_GUI(); 
            new GUI_Main();
        }

        //        else if(clicked == newConsoleGameButton) { // saved console option for future integration in app
        //            Toolkit.getDefaultToolkit().beep(); // saved console option for future integration in app
        //            GUI_Main.close_GUI(); // saved console option for future integration in app
        //            new consoleVersion.Runner(); // saved console option for future integration in app
        //            }

        else if(clicked == quitGameButton) {
            Toolkit.getDefaultToolkit().beep();
            System.exit(0);
        }
    }
}


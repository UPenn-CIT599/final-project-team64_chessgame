package application;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


@SuppressWarnings("serial")

public class GUI_Toolbar extends JPanel implements ActionListener {
    private JButton newGUIGameButton;
    private JButton newNonGUIGameButton;
    private JButton quitGameButton;

    private interfaces.GUI_Interface_StringListener textListener;

    public GUI_Toolbar() {
        newGUIGameButton = new JButton("New GUI Game!");
        newGUIGameButton.addActionListener(this);

        newNonGUIGameButton = new JButton("New NON-GUI Game!");
        newNonGUIGameButton.addActionListener(this);
        
        quitGameButton = new JButton("Quit Game!");
        quitGameButton.addActionListener(this);
        
        setLayout(new GridLayout(3, 1, 10, 10));

        add(newGUIGameButton);
        add(newNonGUIGameButton);
        add(quitGameButton);
    }

    public void setStringListener(interfaces.GUI_Interface_StringListener listener) {
        this.textListener = listener;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        JButton clicked = (JButton)e.getSource();

        if(clicked == newGUIGameButton) {
            if(textListener != null) {
                textListener.textEmitted("New GUI Game Button Clicked!\n");
                System.out.println("New GUI Game Button Selected!\n");
            }
        }
        else if(clicked == newNonGUIGameButton) {
            if(textListener != null) {
                textListener.textEmitted("New NON-GUI Game Button Selected!\n");
                System.out.println("New NON-GUI Game Button Selected!\n");
            }
        }
        else if(clicked == quitGameButton) {
            if(textListener != null) {
                textListener.textEmitted("Quit Game Button Selected!\n");
                System.out.println("Quit Game Button Selected!\n");
            }
        }
    }
}

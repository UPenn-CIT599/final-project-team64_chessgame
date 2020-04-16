package team64_chessGame_v6;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

import draft.GUI_Interface_StringListener;


@SuppressWarnings("serial")

public class GUI_Toolbar extends JPanel implements ActionListener {
    private JButton newGameButton;
    private JButton quitGameButton;

    private GUI_Interface_StringListener textListener;

    public GUI_Toolbar() {
        newGameButton = new JButton("New Game!");
        newGameButton.addActionListener(this);

        quitGameButton = new JButton("Quit Game!");
        quitGameButton.addActionListener(this);

        setLayout(new FlowLayout(FlowLayout.CENTER));

        add(newGameButton);
        add(quitGameButton);
    }

    public void setStringListener(GUI_Interface_StringListener listener) {
        this.textListener = listener;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        JButton clicked = (JButton)e.getSource();

        if(clicked == newGameButton) {
            if(textListener != null) {
                textListener.textEmitted("New Game Button Clicked!\n");
            }
        }
        else if(clicked == quitGameButton) {
            if(textListener != null) {
                textListener.textEmitted("Quit Game Button Selected!\n");
            }
        }
    }
}

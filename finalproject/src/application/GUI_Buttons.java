package application;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;

@SuppressWarnings("serial")

public class GUI_Buttons extends JPanel implements ActionListener {
    private JButton newGUIGameButton;
    private JButton newConsoleGameButton;
    private JButton quitGameButton;
    
    public GUI_Buttons() {

        setBorder(new CompoundBorder(new EmptyBorder(150, 25, 210, 25), getBorder()));

        newGUIGameButton = new JButton("New GUI Game!");
        newGUIGameButton.addActionListener(this);
        newGUIGameButton.setFont(new Font("Arial", Font.BOLD, 22));

        newConsoleGameButton = new JButton("New Console Game!");
        newConsoleGameButton.addActionListener(this);
        newConsoleGameButton.setFont(new Font("Arial", Font.BOLD, 22));
       
        quitGameButton = new JButton("Quit Game!");
        quitGameButton.addActionListener(this);
        quitGameButton.setFont(new Font("Arial", Font.BOLD, 22));

        setLayout(new BorderLayout());

        add(newGUIGameButton, BorderLayout.NORTH);
        add(newConsoleGameButton, BorderLayout.CENTER);
        add(quitGameButton, BorderLayout.SOUTH);
        
   }

    public void setStringListener(interfaces.GUI_Interface_StringListener listener) {
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        JButton clicked = (JButton)e.getSource();

        if(clicked == newGUIGameButton) {
            Toolkit.getDefaultToolkit().beep();
            GUI_Main.close_GUI(); 
            new GUI_Main();
            }
        
        else if(clicked == newConsoleGameButton) {
            Toolkit.getDefaultToolkit().beep();
            new consoleVersion.Runner();
            }
        
        else if(clicked == quitGameButton) {
            Toolkit.getDefaultToolkit().beep();
            System.exit(0);
            }
        }
    }


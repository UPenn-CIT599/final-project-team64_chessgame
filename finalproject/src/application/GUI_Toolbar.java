package application;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;

@SuppressWarnings("serial")

public class GUI_Toolbar extends JPanel implements ActionListener {
    private JButton newGUIGameButton;
    private JButton newConsoleGameButton;
    private JButton quitGameButton;
    
//    public void setBorder(Border border) {
//        
//    }

    public GUI_Toolbar() {

        setBorder(new CompoundBorder(new EmptyBorder(200, 50, 200, 50), getBorder()));

        newGUIGameButton = new JButton("New GUI Game!");
        newGUIGameButton.setAlignmentY(Component.TOP_ALIGNMENT);
        newGUIGameButton.addActionListener(this);

        newConsoleGameButton = new JButton("New Console Game!");
        newConsoleGameButton.addActionListener(this);
       
        quitGameButton = new JButton("Quit Game!");
        quitGameButton.setAlignmentY(Component.BOTTOM_ALIGNMENT);
        quitGameButton.addActionListener(this);

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


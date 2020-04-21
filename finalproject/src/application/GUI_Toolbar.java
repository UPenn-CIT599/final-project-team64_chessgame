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

        setBorder(new CompoundBorder(new EmptyBorder(150, 50, 150, 50), getBorder()));

        newGUIGameButton = new JButton("New GUI Game!");
        newGUIGameButton.setBorder(new BevelBorder(BevelBorder.RAISED, Color.BLACK, null, null, null));
        newGUIGameButton.setAlignmentY(Component.TOP_ALIGNMENT);
        newGUIGameButton.addActionListener(this);
        newGUIGameButton.setSize(150, 50);

        newConsoleGameButton = new JButton("New Console Game!");
        newConsoleGameButton.setBorder(new BevelBorder(BevelBorder.RAISED, Color.BLACK, null, null, null));
        newConsoleGameButton.addActionListener(this);
        newConsoleGameButton.setSize(150, 50);
        
        
        quitGameButton = new JButton("Quit Game!");
        quitGameButton.setBorder(new BevelBorder(BevelBorder.RAISED, Color.BLACK, null, null, null));
        quitGameButton.setAlignmentY(Component.BOTTOM_ALIGNMENT);
        quitGameButton.addActionListener(this);
        quitGameButton.setSize(150, 50);

        setLayout(new BorderLayout(125, 125));

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


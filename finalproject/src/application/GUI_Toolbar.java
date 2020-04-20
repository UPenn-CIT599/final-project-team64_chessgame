package application;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.BevelBorder;


@SuppressWarnings("serial")

public class GUI_Toolbar extends JPanel implements ActionListener {
    private JButton newGUIGameButton;
    private JButton newNonGUIGameButton;
    private JButton quitGameButton;
//    private JButton topButton;
//    private JButton bottomButton;


    
//    public Insets insets() {
//        return null;
//        
//    }
    
//    public Insets(100, 50, 100, 50);
//    int left,
//            int bottom,
//            int right)

    
    
    public GUI_Toolbar() {
        setBounds(new Rectangle(600, 100, 100, 250));
        insets();
        setSize(new Dimension(100, 250));
        
//        topButton = new JButton("");
//        topButton.setVisible(false);
//        topButton.setSize(25, 25);

        newGUIGameButton = new JButton("New GUI Game! ***is functional");
        newGUIGameButton.setBorder(new BevelBorder(BevelBorder.RAISED, Color.BLACK, null, null, null));
        newGUIGameButton.setAlignmentY(Component.TOP_ALIGNMENT);
        newGUIGameButton.addActionListener(this);
        newGUIGameButton.setSize(150, 100);

        newNonGUIGameButton = new JButton("New NON-GUI Game! ***not yet functional");
        newNonGUIGameButton.setBorder(new BevelBorder(BevelBorder.RAISED, Color.BLACK, null, null, null));
        newNonGUIGameButton.addActionListener(this);
        newNonGUIGameButton.setSize(150, 25);
        
        
        quitGameButton = new JButton("Quit Game! ***is functional");
        quitGameButton.setBorder(new BevelBorder(BevelBorder.RAISED, Color.BLACK, null, null, null));
        quitGameButton.setAlignmentY(Component.BOTTOM_ALIGNMENT);
        quitGameButton.addActionListener(this);
        quitGameButton.setSize(150, 100);

//        bottomButton = new JButton("");
//        bottomButton.setVisible(false);
//        bottomButton.setSize(25, 25);

//        setLayout(new GridLayout(3, 1, 200, 200));
        setLayout(new BorderLayout(100, 100));

//        add(topButton);
        add(newGUIGameButton, BorderLayout.NORTH);
        add(newNonGUIGameButton, BorderLayout.CENTER);
        add(quitGameButton, BorderLayout.SOUTH);
//        add(bottomButton);
   }

    public void setStringListener(finalproject.interfaces.GUI_Interface_StringListener listener) {
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        JButton clicked = (JButton)e.getSource();

        if(clicked == newGUIGameButton) {
            Toolkit.getDefaultToolkit().beep();
            GUI_Main.close_GUI(); 
            new GUI_Main();
            }
        
        else if(clicked == newNonGUIGameButton) {
            Toolkit.getDefaultToolkit().beep();
            new GUI_Main();
            }
        
        else if(clicked == quitGameButton) {
            Toolkit.getDefaultToolkit().beep();
            System.exit(0);
            }
        }
    }


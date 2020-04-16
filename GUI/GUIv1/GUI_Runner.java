package application;

import java.awt.*;
import javax.swing.*;

public class GUI_Runner {
    
    /**
     * Creates the GUI. 
     * @return 
     */ 
    public static Component createGUI() {
        JFrame mainFrame = new JFrame ("TEAM 64 CHESS GAME!");
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        GUI_Main.addComponentsToPane(mainFrame.getContentPane());

        Insets insets = mainFrame.getInsets();
        mainFrame.setSize(1000 + insets.left + insets.right, 800 + insets.top + insets.bottom);
        mainFrame.setVisible(true);
        return mainFrame;
    }
    /**
     * Shows the GUI essentially acting as the runner for this application. 
     */    
    public static void main(String[] args) {
       javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createGUI();
            }
        }); 
    }
}

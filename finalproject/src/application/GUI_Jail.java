package application;


import java.awt.*;
import javax.swing.*;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;

@SuppressWarnings("serial")


public class GUI_Jail extends JPanel {
    private JLabel label_1;
    private JLabel label_2;
    private JTextArea textInTopJailArea;
    private JTextArea textInBottomJailArea;

        
    /*
     * Adds status (aka information) bar above chessBoard (aka north portion of GUI)  
     */
    public GUI_Jail() {
        setBorder(new CompoundBorder(new EmptyBorder(50, 100, 150, 50), getBorder()));
        setSize(new Dimension(150, 600));
        setLayout(new GridLayout(0, 1, 100, 0));

        //creating two jail cell labels
        label_1 = new JLabel("Captured by White Team: ");
        label_1.setFont(new Font("Tahoma", Font.PLAIN, 14));

        label_2 = new JLabel("Captured by Black Team: ");
        label_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
        
        //developing text & graphics area for both jail cells to display prisoners
        textInTopJailArea = new JTextArea();
        textInTopJailArea.setWrapStyleWord(true);
        textInTopJailArea.setLineWrap(true);
        textInTopJailArea.setFont(new Font("Arial", Font.BOLD, 14));
        textInTopJailArea.setBackground(Color.WHITE);
        textInTopJailArea.setText("Jail for prisoners of Black Team");
        textInTopJailArea.setEditable(false);

        textInBottomJailArea = new JTextArea();
        textInBottomJailArea.setWrapStyleWord(true);
        textInBottomJailArea.setLineWrap(true);
        textInBottomJailArea.setFont(new Font("Arial", Font.BOLD, 14));
        textInBottomJailArea.setBackground(Color.WHITE);
        textInBottomJailArea.setText("Jail for prisoners of White Team");
        textInBottomJailArea.setEditable(false);

        //adding elements to panel
        
        add(label_1);
        add(textInTopJailArea);

        add(label_2);
        add(textInBottomJailArea);
    }

}


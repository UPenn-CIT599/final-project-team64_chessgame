package application;


import java.awt.*;
import javax.swing.*;
import javax.swing.border.BevelBorder;

@SuppressWarnings("serial")


public class GUI_Jail extends JPanel {
    private JPanel jailCapturedByWhiteTeam;
    private JPanel jailCapturedByBlackTeam;

    private JTextArea textInTopJailArea;
    private JTextArea textInBottomJailArea;

    /*
     * Adds status (aka information) bar above chessBoard (aka north portion of GUI)  
     */
    public GUI_Jail() {
        setAlignmentX(Component.LEFT_ALIGNMENT);
        setSize(new Dimension(215, 602));
        setMinimumSize(new Dimension(250, 750));
        setMaximumSize(new Dimension(1000, 1000));
        //still need to add more functionality, player turn, instructions, etc.

        //creating two jail cells
        jailCapturedByWhiteTeam = new JPanel();
        jailCapturedByWhiteTeam.setSize(new Dimension(185, 200));
        jailCapturedByWhiteTeam.setLocation(new Point(10, 115));
        jailCapturedByBlackTeam = new JPanel();
        jailCapturedByBlackTeam.setAlignmentY(Component.BOTTOM_ALIGNMENT);
        jailCapturedByBlackTeam.setSize(160, 200);
        jailCapturedByBlackTeam.setLocation(new Point(10, 338));
        jailCapturedByBlackTeam.setMinimumSize(new Dimension(50, 50));
        jailCapturedByBlackTeam.setMaximumSize(new Dimension(250, 250));
        jailCapturedByBlackTeam.setPreferredSize(new Dimension(100, 200));

//        //establishing the layout of the "west" panel
//        setLayout(new FlowLayout(FlowLayout.LEADING));

        //drawing jail #1
        jailCapturedByWhiteTeam.setAlignmentY(Component.TOP_ALIGNMENT);
        jailCapturedByWhiteTeam.setBackground(Color.WHITE);
        jailCapturedByWhiteTeam.setBorder(new BevelBorder(BevelBorder.RAISED, Color.BLACK, Color.BLACK, Color.BLACK, Color.BLACK));
//        jailCapturedByWhiteTeam.setBounds(new Rectangle(50, 50, 50, 50));
//        jailCapturedByWhiteTeam.setBounds(50, 50, 100, 100);
        jailCapturedByWhiteTeam.setMinimumSize(new Dimension(50, 50));
        jailCapturedByWhiteTeam.setMaximumSize(new Dimension(250, 250));
        jailCapturedByWhiteTeam.setPreferredSize(new Dimension(200, 200));

        //drawing jail #2
        jailCapturedByBlackTeam.setAlignmentY(Component.TOP_ALIGNMENT);
        jailCapturedByBlackTeam.setBackground(Color.WHITE);
        jailCapturedByBlackTeam.setBorder(new BevelBorder(BevelBorder.RAISED, Color.BLACK, Color.YELLOW, Color.BLUE, Color.WHITE));
//        jailCapturedByBlackTeam.setBounds(new Rectangle(50, 50, 50, 50));
//        jailCapturedByBlackTeam.setBounds(50, 250, 100, 100);
        jailCapturedByBlackTeam.setMinimumSize(new Dimension(50, 50));
        jailCapturedByBlackTeam.setMaximumSize(new Dimension(250, 250));
        jailCapturedByBlackTeam.setPreferredSize(new Dimension(50, 200));
        
        //allowing both jail cells to have absolute layout for ease of placement
        jailCapturedByWhiteTeam.setLayout(null);
        jailCapturedByBlackTeam.setLayout(null);

        //developing area graphics of jail cell #1
        textInTopJailArea = new JTextArea();
        textInTopJailArea.setSize(new Dimension(50, 100));
        textInTopJailArea.setPreferredSize(new Dimension(50, 100));
        textInTopJailArea.setMinimumSize(new Dimension(50, 100));
        textInTopJailArea.setMaximumSize(new Dimension(250, 250));
//        textInTopJailArea.setBounds(new Rectangle(5, 5, 5, 5));
        textInTopJailArea.setAlignmentY(Component.BOTTOM_ALIGNMENT);
        textInTopJailArea.setWrapStyleWord(true);
        textInTopJailArea.setBounds(5, 5, 5, 5);
        textInTopJailArea.setFont(new Font("Arial", Font.BOLD, 14));
        textInTopJailArea.setLineWrap(false);
        textInTopJailArea.setBackground(Color.WHITE);
        textInTopJailArea.setText("TOP JAIL AREA");

        //developing area graphics of jail cell #2
        textInBottomJailArea = new JTextArea();
        textInBottomJailArea.setSize(new Dimension(50, 100));
        textInBottomJailArea.setPreferredSize(new Dimension(50, 100));
        textInBottomJailArea.setMinimumSize(new Dimension(50, 100));
        textInBottomJailArea.setMaximumSize(new Dimension(250, 250));
//        textInBottomJailArea.setBounds(new Rectangle(5, 5, 5, 5));
        textInBottomJailArea.setAlignmentY(Component.BOTTOM_ALIGNMENT);
        textInBottomJailArea.setWrapStyleWord(true);
        textInBottomJailArea.setBounds(5, 5, 5, 5);
        textInBottomJailArea.setFont(new Font("Arial", Font.BOLD, 14));
        textInBottomJailArea.setLineWrap(false);
        textInBottomJailArea.setBackground(Color.WHITE);
        textInBottomJailArea.setText("BOTTOM JAIL AREA");

        //adding text areas to both jail cells
        jailCapturedByBlackTeam.add(textInTopJailArea);
        setLayout(null);
        jailCapturedByWhiteTeam.add(textInBottomJailArea);

        //adding both jail cells to main application window
        add(jailCapturedByWhiteTeam);
        add(jailCapturedByBlackTeam);


    }

}


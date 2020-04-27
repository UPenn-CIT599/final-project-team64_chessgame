package application;


import java.awt.*;
import java.util.ArrayList;

import javax.swing.*;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;

import gamePieces.ChessPiece;

@SuppressWarnings("serial")


public class GUI_Jail extends JPanel {
    private JLabel label_1;
    private JLabel label_2;
    private static JTextPane textJailTop;
    private static JTextPane textJailBottom;

    /*
     * Adds status (aka information) bar above chessBoard (aka north portion of GUI)  
     */
    public GUI_Jail() {

        //setting up overall panel in gui west area
        setBorder(new CompoundBorder(new EmptyBorder(0, 25, 75, 25), getBorder()));
        GridBagLayout gridBagLayout = new GridBagLayout();
        gridBagLayout.columnWidths = new int[]{0, 150};
        gridBagLayout.rowHeights = new int[]{0, 0, 25, 25, 25, 25, 0, 0, 0};
        setLayout(gridBagLayout);

        //creating top jail label and layout constraints
        label_2 = new JLabel("Captured by Black Team: ");
        label_2.setHorizontalAlignment(SwingConstants.CENTER);
        label_2.setHorizontalTextPosition(SwingConstants.CENTER);
        label_2.setPreferredSize(new Dimension(200, 15));
        label_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
        GridBagConstraints gbc_label_1 = new GridBagConstraints();
        gbc_label_1.insets = new Insets(0, 0, 5, 0);
        gbc_label_1.gridx = 1;
        gbc_label_1.gridy = 2;

        //creating bottom jail label and layout constraints
        label_1 = new JLabel("Captured by White Team: ");
        label_1.setPreferredSize(new Dimension(200, 15));
        label_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
        label_1.setHorizontalAlignment(SwingConstants.CENTER);
        label_1.setHorizontalTextPosition(SwingConstants.CENTER);
        GridBagConstraints gbc_label_2 = new GridBagConstraints();
        gbc_label_2.insets = new Insets(2, 2, 5, 2);
        gbc_label_2.gridx = 1;
        gbc_label_2.gridy = 5;

        //creating bottom jail cell and layout constraints
        textJailBottom = new JTextPane();
        textJailBottom.setPreferredSize(new Dimension(200, 150));
        textJailBottom.setFont(new Font("Arial", Font.BOLD, 14));
        textJailBottom.setBackground(Color.WHITE);
        textJailBottom.setForeground(Color.BLACK);
        textJailBottom.setToolTipText("No prisoners yet!");
        textJailBottom.setEditable(false);
        textJailBottom.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        GridBagConstraints gbc_textJailBottom = new GridBagConstraints();
        gbc_textJailBottom.ipady = 5;
        gbc_textJailBottom.ipadx = 5;
        gbc_textJailBottom.anchor = GridBagConstraints.NORTH;
        gbc_textJailBottom.insets = new Insets(2, 2, 5, 2);
        gbc_textJailBottom.fill = GridBagConstraints.HORIZONTAL;
        gbc_textJailBottom.gridx = 1;
        gbc_textJailBottom.gridy = 6;

        //creating top jail cell and layout constraints
        textJailTop = new JTextPane();
        textJailTop.setPreferredSize(new Dimension(200, 150));
        textJailTop.setFont(new Font("Arial", Font.BOLD, 14));
        textJailTop.setForeground(Color.WHITE);
        textJailTop.setBackground(Color.BLACK);
        textJailTop.setToolTipText("No prisoners yet!");
        textJailTop.setEditable(false);
        textJailTop.setBorder(BorderFactory.createLineBorder(Color.WHITE));
        GridBagConstraints gbc_textJailTop = new GridBagConstraints();
        gbc_textJailTop.ipady = 5;
        gbc_textJailTop.ipadx = 5;
        gbc_textJailTop.fill = GridBagConstraints.HORIZONTAL;
        gbc_textJailTop.anchor = GridBagConstraints.NORTH;
        gbc_textJailTop.insets = new Insets(2, 2, 5, 2);
        gbc_textJailTop.gridx = 1;
        gbc_textJailTop.gridy = 3; 
        
        //adding elements to panel
        add(label_2, gbc_label_1);
        add(textJailTop, gbc_textJailTop);

        add(label_1, gbc_label_2);
        add(textJailBottom, gbc_textJailBottom);
    }

    static void addWhiteTeamPrisoners() {
        ArrayList<ChessPiece> caps = Board.getWhiteCapturedPieces();
        String caps1 = new String(); 
        for (int i = 0; i < caps.size(); i++) {
            caps1 += String.valueOf(caps.get(i));
            textJailTop.setText(caps1);
        }
    }

    static void addBlackTeamPrisoners() {
        ArrayList<ChessPiece> caps = Board.getBlackCapturedPieces();
        String caps1 = new String(); 
        for (int i = 0; i < caps.size(); i++) {
            caps1 += String.valueOf(caps.get(i));
            textJailBottom.setText(caps1);
        }
    }
}


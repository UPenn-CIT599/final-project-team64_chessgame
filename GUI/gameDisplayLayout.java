package application;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;
import javax.swing.border.*;

//TODO: 
// chessPiece icons @ https://docs.oracle.com/javase/tutorial/uiswing/components/icon.html


public class gameDisplayLayout extends JPanel {

    public gameDisplayLayout() {
        setOpaque(false);
        setFont(new Font("Tahoma", Font.PLAIN, 30));
        setForeground(Color.WHITE);
        setLayout(null);

        JTextArea txtrNotificationBar_1 = new JTextArea();
        txtrNotificationBar_1.setBounds(308, 118, 244, 22);
        add(txtrNotificationBar_1);
        txtrNotificationBar_1.setText("IT IS THE TURN OF ----- PLAYER");

        JLabel titleLabel = new JLabel("TEAM 64 CHESS GAME!");
        titleLabel.setFont(new Font("Tahoma", Font.PLAIN, 30));
        titleLabel.setOpaque(true);
        titleLabel.setBorder(new BevelBorder(BevelBorder.LOWERED, Color.BLACK, null, null, null));
        titleLabel.setBackground(Color.CYAN);
        titleLabel.setBounds(273, 11, 316, 48);
        add(titleLabel);

        JPanel whitePOW = new JPanel();
        whitePOW.setBackground(Color.LIGHT_GRAY);
        whitePOW.setBounds(10, 190, 150, 150);
        add(whitePOW);

        JPanel board = new JPanel();
        board.setBackground(new Color(128, 128, 128));
        board.setBounds(209, 153, 450, 450);
        add(board);

        JButton tileButton_7_0 = new JButton("♜");//"7-0");
        tileButton_7_0.setBackground(Color.BLACK);
        tileButton_7_0.setForeground(Color.BLACK);
        tileButton_7_0.setPreferredSize(new Dimension(50, 50));
        tileButton_7_0.setMinimumSize(new Dimension(50, 50));
        tileButton_7_0.setMaximumSize(new Dimension(50, 50));
        tileButton_7_0.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent arg0) {
                System.out.println("TILE 7-0 HAS BEEN MOUSE-CLICKED!");
            }
        });
        board.add(tileButton_7_0);

        JButton tileButton_7_1 = new JButton("\u265E");//"7-1");
        tileButton_7_0.setBackground(Color.BLACK);
        tileButton_7_0.setForeground(Color.BLACK);
        tileButton_7_1.setPreferredSize(new Dimension(50, 50));
        tileButton_7_1.setMinimumSize(new Dimension(50, 50));
        tileButton_7_1.setMaximumSize(new Dimension(50, 50));
        board.add(tileButton_7_1);

        JButton tileButton_7_2 = new JButton("\u265D");//"7-2");
        tileButton_7_2.setPreferredSize(new Dimension(50, 50));
        tileButton_7_2.setMinimumSize(new Dimension(50, 50));
        tileButton_7_2.setMaximumSize(new Dimension(50, 50));
        board.add(tileButton_7_2);

        JButton tileButton_7_3 = new JButton("\u265B");//"7-3");
        tileButton_7_3.setPreferredSize(new Dimension(50, 50));
        tileButton_7_3.setMinimumSize(new Dimension(50, 50));
        tileButton_7_3.setMaximumSize(new Dimension(50, 50));
        board.add(tileButton_7_3);

        JButton tileButton_7_4 = new JButton("\u265A");//"7-4");
        tileButton_7_4.setPreferredSize(new Dimension(50, 50));
        tileButton_7_4.setMinimumSize(new Dimension(50, 50));
        tileButton_7_4.setMaximumSize(new Dimension(50, 50));
        board.add(tileButton_7_4);

        JButton tileButton_7_5 = new JButton("\u265D");//"7-5");
        tileButton_7_5.setPreferredSize(new Dimension(50, 50));
        tileButton_7_5.setMinimumSize(new Dimension(50, 50));
        tileButton_7_5.setMaximumSize(new Dimension(50, 50));
        board.add(tileButton_7_5);

        JButton tileButton_7_6 = new JButton("\u265E");//"7-6");
        tileButton_7_6.setPreferredSize(new Dimension(50, 50));
        tileButton_7_6.setMinimumSize(new Dimension(50, 50));
        tileButton_7_6.setMaximumSize(new Dimension(50, 50));
        board.add(tileButton_7_6);

        JButton tileButton_7_7 = new JButton("\u265C");//"7-7");
        tileButton_7_7.setPreferredSize(new Dimension(50, 50));
        tileButton_7_7.setMinimumSize(new Dimension(50, 50));
        tileButton_7_7.setMaximumSize(new Dimension(50, 50));
        board.add(tileButton_7_7);

        JButton tileButton_6_0 = new JButton("6-0");
        tileButton_6_0.setPreferredSize(new Dimension(50, 50));
        tileButton_6_0.setMinimumSize(new Dimension(50, 50));
        tileButton_6_0.setMaximumSize(new Dimension(50, 50));
        board.add(tileButton_6_0);

        JButton tileButton_6_1 = new JButton("6-1");
        tileButton_6_1.setPreferredSize(new Dimension(50, 50));
        tileButton_6_1.setMinimumSize(new Dimension(50, 50));
        tileButton_6_1.setMaximumSize(new Dimension(50, 50));
        board.add(tileButton_6_1);

        JButton tileButton_6_2 = new JButton("6-2");
        tileButton_6_2.setPreferredSize(new Dimension(50, 50));
        tileButton_6_2.setMinimumSize(new Dimension(50, 50));
        tileButton_6_2.setMaximumSize(new Dimension(50, 50));
        board.add(tileButton_6_2);

        JButton tileButton_6_3 = new JButton("6-3");
        tileButton_6_3.setPreferredSize(new Dimension(50, 50));
        tileButton_6_3.setMinimumSize(new Dimension(50, 50));
        tileButton_6_3.setMaximumSize(new Dimension(50, 50));
        board.add(tileButton_6_3);

        JButton tileButton_6_4 = new JButton("6-4");
        tileButton_6_4.setPreferredSize(new Dimension(50, 50));
        tileButton_6_4.setMinimumSize(new Dimension(50, 50));
        tileButton_6_4.setMaximumSize(new Dimension(50, 50));
        board.add(tileButton_6_4);

        JButton tileButton_6_5 = new JButton("6-5");
        tileButton_6_5.setPreferredSize(new Dimension(50, 50));
        tileButton_6_5.setMinimumSize(new Dimension(50, 50));
        tileButton_6_5.setMaximumSize(new Dimension(50, 50));
        board.add(tileButton_6_5);

        JButton tileButton_6_6 = new JButton("6-6");
        tileButton_6_6.setPreferredSize(new Dimension(50, 50));
        tileButton_6_6.setMinimumSize(new Dimension(50, 50));
        tileButton_6_6.setMaximumSize(new Dimension(50, 50));
        board.add(tileButton_6_6);

        JButton tileButton_6_7 = new JButton("6-7");
        tileButton_6_7.setPreferredSize(new Dimension(50, 50));
        tileButton_6_7.setMinimumSize(new Dimension(50, 50));
        tileButton_6_7.setMaximumSize(new Dimension(50, 50));
        board.add(tileButton_6_7);

        JButton tileButton_5_0 = new JButton("5-0");
        tileButton_5_0.setPreferredSize(new Dimension(50, 50));
        tileButton_5_0.setMinimumSize(new Dimension(50, 50));
        tileButton_5_0.setMaximumSize(new Dimension(50, 50));
        board.add(tileButton_5_0);

        JButton tileButton_5_1 = new JButton("5-1");
        tileButton_5_1.setPreferredSize(new Dimension(50, 50));
        tileButton_5_1.setMinimumSize(new Dimension(50, 50));
        tileButton_5_1.setMaximumSize(new Dimension(50, 50));
        board.add(tileButton_5_1);

        JButton tileButton_5_2 = new JButton("5-2");
        tileButton_5_2.setPreferredSize(new Dimension(50, 50));
        tileButton_5_2.setMinimumSize(new Dimension(50, 50));
        tileButton_5_2.setMaximumSize(new Dimension(50, 50));
        board.add(tileButton_5_2);

        JButton tileButton_5_3 = new JButton("5-3");
        tileButton_5_3.setPreferredSize(new Dimension(50, 50));
        tileButton_5_3.setMinimumSize(new Dimension(50, 50));
        tileButton_5_3.setMaximumSize(new Dimension(50, 50));
        board.add(tileButton_5_3);

        JButton tileButton_5_4 = new JButton("5-4");
        tileButton_5_4.setPreferredSize(new Dimension(50, 50));
        tileButton_5_4.setMinimumSize(new Dimension(50, 50));
        tileButton_5_4.setMaximumSize(new Dimension(50, 50));
        board.add(tileButton_5_4);

        JButton tileButton_5_5 = new JButton("5-5");
        tileButton_5_5.setPreferredSize(new Dimension(50, 50));
        tileButton_5_5.setMinimumSize(new Dimension(50, 50));
        tileButton_5_5.setMaximumSize(new Dimension(50, 50));
        board.add(tileButton_5_5);

        JButton tileButton_5_6 = new JButton("5-6");
        tileButton_5_6.setPreferredSize(new Dimension(50, 50));
        tileButton_5_6.setMinimumSize(new Dimension(50, 50));
        tileButton_5_6.setMaximumSize(new Dimension(50, 50));
        board.add(tileButton_5_6);

        JButton tileButton_5_7 = new JButton("5-7");
        tileButton_5_7.setPreferredSize(new Dimension(50, 50));
        tileButton_5_7.setMinimumSize(new Dimension(50, 50));
        tileButton_5_7.setMaximumSize(new Dimension(50, 50));
        board.add(tileButton_5_7);

        JButton tileButton_4_0 = new JButton("4-0");
        tileButton_4_0.setPreferredSize(new Dimension(50, 50));
        tileButton_4_0.setMinimumSize(new Dimension(50, 50));
        tileButton_4_0.setMaximumSize(new Dimension(50, 50));
        board.add(tileButton_4_0);

        JButton tileButton_4_1 = new JButton("4-1");
        tileButton_4_1.setPreferredSize(new Dimension(50, 50));
        tileButton_4_1.setMinimumSize(new Dimension(50, 50));
        tileButton_4_1.setMaximumSize(new Dimension(50, 50));
        board.add(tileButton_4_1);

        JButton tileButton_4_2 = new JButton("4-2");
        tileButton_4_2.setPreferredSize(new Dimension(50, 50));
        tileButton_4_2.setMinimumSize(new Dimension(50, 50));
        tileButton_4_2.setMaximumSize(new Dimension(50, 50));
        board.add(tileButton_4_2);

        JButton tileButton_4_3 = new JButton("4-3");
        tileButton_4_3.setPreferredSize(new Dimension(50, 50));
        tileButton_4_3.setMinimumSize(new Dimension(50, 50));
        tileButton_4_3.setMaximumSize(new Dimension(50, 50));
        board.add(tileButton_4_3);

        JButton tileButton_4_4 = new JButton("4-4");
        tileButton_4_4.setPreferredSize(new Dimension(50, 50));
        tileButton_4_4.setMinimumSize(new Dimension(50, 50));
        tileButton_4_4.setMaximumSize(new Dimension(50, 50));
        board.add(tileButton_4_4);

        JButton tileButton_4_5 = new JButton("4-5");
        tileButton_4_5.setPreferredSize(new Dimension(50, 50));
        tileButton_4_5.setMinimumSize(new Dimension(50, 50));
        tileButton_4_5.setMaximumSize(new Dimension(50, 50));
        board.add(tileButton_4_5);

        JButton tileButton_4_6 = new JButton("4-6");
        tileButton_4_6.setPreferredSize(new Dimension(50, 50));
        tileButton_4_6.setMinimumSize(new Dimension(50, 50));
        tileButton_4_6.setMaximumSize(new Dimension(50, 50));
        board.add(tileButton_4_6);

        JButton tileButton_4_7 = new JButton("4-7");
        tileButton_4_7.setPreferredSize(new Dimension(50, 50));
        tileButton_4_7.setMinimumSize(new Dimension(50, 50));
        tileButton_4_7.setMaximumSize(new Dimension(50, 50));
        board.add(tileButton_4_7);

        JButton tileButton_3_0 = new JButton("3-0");
        tileButton_3_0.setPreferredSize(new Dimension(50, 50));
        tileButton_3_0.setMinimumSize(new Dimension(50, 50));
        tileButton_3_0.setMaximumSize(new Dimension(50, 50));
        board.add(tileButton_3_0);

        JButton tileButton_3_1 = new JButton("3-1");
        tileButton_3_1.setPreferredSize(new Dimension(50, 50));
        tileButton_3_1.setMinimumSize(new Dimension(50, 50));
        tileButton_3_1.setMaximumSize(new Dimension(50, 50));
        board.add(tileButton_3_1);

        JButton tileButton_3_2 = new JButton("3-2");
        tileButton_3_2.setPreferredSize(new Dimension(50, 50));
        tileButton_3_2.setMinimumSize(new Dimension(50, 50));
        tileButton_3_2.setMaximumSize(new Dimension(50, 50));
        board.add(tileButton_3_2);

        JButton tileButton_3_3 = new JButton("3-3");
        tileButton_3_3.setPreferredSize(new Dimension(50, 50));
        tileButton_3_3.setMinimumSize(new Dimension(50, 50));
        tileButton_3_3.setMaximumSize(new Dimension(50, 50));
        board.add(tileButton_3_3);

        JButton tileButton_3_4 = new JButton("3-4");
        tileButton_3_4.setPreferredSize(new Dimension(50, 50));
        tileButton_3_4.setMinimumSize(new Dimension(50, 50));
        tileButton_3_4.setMaximumSize(new Dimension(50, 50));
        board.add(tileButton_3_4);

        JButton tileButton_3_5 = new JButton("3-5");
        tileButton_3_5.setPreferredSize(new Dimension(50, 50));
        tileButton_3_5.setMinimumSize(new Dimension(50, 50));
        tileButton_3_5.setMaximumSize(new Dimension(50, 50));
        board.add(tileButton_3_5);

        JButton tileButton_3_6 = new JButton("3-6");
        tileButton_3_6.setPreferredSize(new Dimension(50, 50));
        tileButton_3_6.setMinimumSize(new Dimension(50, 50));
        tileButton_3_6.setMaximumSize(new Dimension(50, 50));
        board.add(tileButton_3_6);

        JButton tileButton_3_7 = new JButton("3-7");
        tileButton_3_7.setPreferredSize(new Dimension(50, 50));
        tileButton_3_7.setMinimumSize(new Dimension(50, 50));
        tileButton_3_7.setMaximumSize(new Dimension(50, 50));
        board.add(tileButton_3_7);

        JButton tileButton_2_0 = new JButton("2-0");
        tileButton_2_0.setPreferredSize(new Dimension(50, 50));
        tileButton_2_0.setMinimumSize(new Dimension(50, 50));
        tileButton_2_0.setMaximumSize(new Dimension(50, 50));
        board.add(tileButton_2_0);

        JButton tileButton_2_1 = new JButton("2-1");
        tileButton_2_1.setPreferredSize(new Dimension(50, 50));
        tileButton_2_1.setMinimumSize(new Dimension(50, 50));
        tileButton_2_1.setMaximumSize(new Dimension(50, 50));
        board.add(tileButton_2_1);

        JButton tileButton_2_2 = new JButton("2-2");
        tileButton_2_2.setPreferredSize(new Dimension(50, 50));
        tileButton_2_2.setMinimumSize(new Dimension(50, 50));
        tileButton_2_2.setMaximumSize(new Dimension(50, 50));
        board.add(tileButton_2_2);

        JButton tileButton_2_3 = new JButton("2-3");
        tileButton_2_3.setPreferredSize(new Dimension(50, 50));
        tileButton_2_3.setMinimumSize(new Dimension(50, 50));
        tileButton_2_3.setMaximumSize(new Dimension(50, 50));
        board.add(tileButton_2_3);

        JButton tileButton_2_4 = new JButton("2-4");
        tileButton_2_4.setPreferredSize(new Dimension(50, 50));
        tileButton_2_4.setMinimumSize(new Dimension(50, 50));
        tileButton_2_4.setMaximumSize(new Dimension(50, 50));
        board.add(tileButton_2_4);

        JButton tileButton_2_5 = new JButton("2-5");
        tileButton_2_5.setPreferredSize(new Dimension(50, 50));
        tileButton_2_5.setMinimumSize(new Dimension(50, 50));
        tileButton_2_5.setMaximumSize(new Dimension(50, 50));
        board.add(tileButton_2_5);

        JButton tileButton_2_6 = new JButton("2-6");
        tileButton_2_6.setPreferredSize(new Dimension(50, 50));
        tileButton_2_6.setMinimumSize(new Dimension(50, 50));
        tileButton_2_6.setMaximumSize(new Dimension(50, 50));
        board.add(tileButton_2_6);

        JButton tileButton_2_7 = new JButton("2-7");
        tileButton_2_7.setPreferredSize(new Dimension(50, 50));
        tileButton_2_7.setMinimumSize(new Dimension(50, 50));
        tileButton_2_7.setMaximumSize(new Dimension(50, 50));
        board.add(tileButton_2_7);

        JButton tileButton_1_0 = new JButton("1-0");
        tileButton_1_0.setPreferredSize(new Dimension(50, 50));
        tileButton_1_0.setMinimumSize(new Dimension(50, 50));
        tileButton_1_0.setMaximumSize(new Dimension(50, 50));
        board.add(tileButton_1_0);

        JButton tileButton_1_1 = new JButton("1-1");
        tileButton_1_1.setPreferredSize(new Dimension(50, 50));
        tileButton_1_1.setMinimumSize(new Dimension(50, 50));
        tileButton_1_1.setMaximumSize(new Dimension(50, 50));
        board.add(tileButton_1_1);

        JButton tileButton_1_2 = new JButton("1-2");
        tileButton_1_2.setPreferredSize(new Dimension(50, 50));
        tileButton_1_2.setMinimumSize(new Dimension(50, 50));
        tileButton_1_2.setMaximumSize(new Dimension(50, 50));
        board.add(tileButton_1_2);

        JButton tileButton_1_3 = new JButton("1-3");
        tileButton_1_3.setPreferredSize(new Dimension(50, 50));
        tileButton_1_3.setMinimumSize(new Dimension(50, 50));
        tileButton_1_3.setMaximumSize(new Dimension(50, 50));
        board.add(tileButton_1_3);

        JButton tileButton_1_4 = new JButton("1-4");
        tileButton_1_4.setPreferredSize(new Dimension(50, 50));
        tileButton_1_4.setMinimumSize(new Dimension(50, 50));
        tileButton_1_4.setMaximumSize(new Dimension(50, 50));
        board.add(tileButton_1_4);

        JButton tileButton_1_5 = new JButton("1-5");
        tileButton_1_5.setPreferredSize(new Dimension(50, 50));
        tileButton_1_5.setMinimumSize(new Dimension(50, 50));
        tileButton_1_5.setMaximumSize(new Dimension(50, 50));
        board.add(tileButton_1_5);

        JButton tileButton_1_6 = new JButton("1-6");
        tileButton_1_6.setPreferredSize(new Dimension(50, 50));
        tileButton_1_6.setMinimumSize(new Dimension(50, 50));
        tileButton_1_6.setMaximumSize(new Dimension(50, 50));
        board.add(tileButton_1_6);

        JButton tileButton_1_7 = new JButton("1-7");
        tileButton_1_7.setPreferredSize(new Dimension(50, 50));
        tileButton_1_7.setMinimumSize(new Dimension(50, 50));
        tileButton_1_7.setMaximumSize(new Dimension(50, 50));
        board.add(tileButton_1_7);

        JButton tileButton_0_0 = new JButton("0-0");
        tileButton_0_0.setPreferredSize(new Dimension(50, 50));
        tileButton_0_0.setMinimumSize(new Dimension(50, 50));
        tileButton_0_0.setMaximumSize(new Dimension(50, 50));
        board.add(tileButton_0_0);

        JButton tileButton_0_1 = new JButton("0-1");
        tileButton_0_1.setPreferredSize(new Dimension(50, 50));
        tileButton_0_1.setMinimumSize(new Dimension(50, 50));
        tileButton_0_1.setMaximumSize(new Dimension(50, 50));
        board.add(tileButton_0_1);

        JButton tileButton_0_2 = new JButton("0-2");
        tileButton_0_2.setPreferredSize(new Dimension(50, 50));
        tileButton_0_2.setMinimumSize(new Dimension(50, 50));
        tileButton_0_2.setMaximumSize(new Dimension(50, 50));
        board.add(tileButton_0_2);

        JButton tileButton_0_3 = new JButton("0-3");
        tileButton_0_3.setPreferredSize(new Dimension(50, 50));
        tileButton_0_3.setMinimumSize(new Dimension(50, 50));
        tileButton_0_3.setMaximumSize(new Dimension(50, 50));
        board.add(tileButton_0_3);

        JButton tileButton_0_4 = new JButton("0-4");
        tileButton_0_4.setPreferredSize(new Dimension(50, 50));
        tileButton_0_4.setMinimumSize(new Dimension(50, 50));
        tileButton_0_4.setMaximumSize(new Dimension(50, 50));
        board.add(tileButton_0_4);

        JButton tileButton_0_5 = new JButton("0-5");
        tileButton_0_5.setPreferredSize(new Dimension(50, 50));
        tileButton_0_5.setMinimumSize(new Dimension(50, 50));
        tileButton_0_5.setMaximumSize(new Dimension(50, 50));
        board.add(tileButton_0_5);

        JButton tileButton_0_6 = new JButton("0-6");
        tileButton_0_6.setPreferredSize(new Dimension(50, 50));
        tileButton_0_6.setMinimumSize(new Dimension(50, 50));
        tileButton_0_6.setMaximumSize(new Dimension(50, 50));
        board.add(tileButton_0_6);

        JButton tileButton_0_7 = new JButton("0-7");
        tileButton_0_7.setPreferredSize(new Dimension(50, 50));
        tileButton_0_7.setMinimumSize(new Dimension(50, 50));
        tileButton_0_7.setMaximumSize(new Dimension(50, 50));
        board.add(tileButton_0_7);               

        JPanel blackPOW = new JPanel();
        blackPOW.setBackground(Color.LIGHT_GRAY);
        blackPOW.setBounds(10, 414, 150, 150);
        add(blackPOW);

        JLabel powLabelPrisonersTeamWhite = new JLabel("Captured By White Team");
        powLabelPrisonersTeamWhite.setToolTipText("");
        powLabelPrisonersTeamWhite.setCursor(Cursor.getPredefinedCursor(Cursor.CROSSHAIR_CURSOR));
        powLabelPrisonersTeamWhite.setOpaque(true);
        powLabelPrisonersTeamWhite.setBounds(10, 381, 150, 22);
        add(powLabelPrisonersTeamWhite);

        JLabel powLabelPrisonersTeamBlack = new JLabel("Captured By Black Team");
        powLabelPrisonersTeamBlack.setBounds(10, 172, 222, 14);
        add(powLabelPrisonersTeamBlack);

        JButton btnNewGame = new JButton("NEW GAME");
        btnNewGame.setFont(new Font("Tahoma", Font.BOLD, 14));
        btnNewGame.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                System.out.println("NEW GAME BUTTON HAS BEEN MOUSE-CLICKED!");
            }
        });
        btnNewGame.setBounds(723, 261, 115, 23);
        add(btnNewGame);

        JButton btnQuitGame = new JButton("QUIT GAME");
        btnQuitGame.setFont(new Font("Tahoma", Font.BOLD, 14));
        btnQuitGame.setBounds(723, 373, 115, 23);
        add(btnQuitGame);

        JPanel notificationPanel = new JPanel();
        notificationPanel.setBackground(Color.BLUE);
        notificationPanel.setBounds(160, 83, 555, 59);
        add(notificationPanel);

        JTextArea txtrNotificationBar = new JTextArea();
        notificationPanel.add(txtrNotificationBar);
        txtrNotificationBar.setText("NOTIFICATION BAR");
    }
}

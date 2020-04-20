package nonGUIversion;


import java.awt.*;
import java.awt.event.*;

import javax.swing.*;
import javax.swing.border.*;

//TODO: 
// chessPiece icons @ https://docs.oracle.com/javase/tutorial/uiswing/components/icon.html


public class GameDisplayLayout extends JPanel {

    public GameDisplayLayout() {
        setOpaque(false);
        setFont(new Font("Tahoma", Font.PLAIN, 30));
        setForeground(Color.WHITE);
        setLayout(null);
        
            JTextArea txtrNotificationBar_1 = new JTextArea();
            txtrNotificationBar_1.setBounds(308, 120, 244, 22);
            add(txtrNotificationBar_1);
            txtrNotificationBar_1.setText("IT IS THE TURN OF ----- PLAYER");

        JLabel titleLabel = new JLabel("TEAM 64 CHESS GAME!");
        titleLabel.setFont(new Font("Tahoma", Font.PLAIN, 30));
        titleLabel.setOpaque(true);
        titleLabel.setBorder(new BevelBorder(BevelBorder.LOWERED, Color.BLACK, null, null, null));
        titleLabel.setBackground(Color.GREEN);
        titleLabel.setBounds(273, 11, 316, 48);
        add(titleLabel);

        JPanel whitePOW = new JPanel();
        whitePOW.setBackground(Color.YELLOW);
        whitePOW.setBounds(10, 186, 196, 144);
        add(whitePOW);

        JPanel board = new JPanel();
        board.setBackground(Color.YELLOW);
        board.setBounds(209, 153, 450, 390);
        add(board);
        
            JButton testButton_7_0 = new JButton("7-0");
            board.add(testButton_7_0);
            
            JButton testButton_7_1 = new JButton("7-1");
            board.add(testButton_7_1);
            
            JButton testButton_7_2 = new JButton("7-2");
            board.add(testButton_7_2);
            
            JButton testButton_7_3 = new JButton("7-3");
            board.add(testButton_7_3);
            
            JButton testButton_7_4 = new JButton("7-4");
            board.add(testButton_7_4);
            
            JButton testButton_7_5 = new JButton("7-5");
            board.add(testButton_7_5);
            
            JButton testButton_7_6 = new JButton("7-6");
            board.add(testButton_7_6);
            
            JButton testButton_7_7 = new JButton("7-7");
            board.add(testButton_7_7);
            
            JButton testButton_6_0 = new JButton("6-0");
            board.add(testButton_6_0);
            
            JButton testButton_6_1 = new JButton("6-1");
            board.add(testButton_6_1);
            
            JButton testButton_6_2 = new JButton("6-2");
            board.add(testButton_6_2);
            
            JButton testButton_6_3 = new JButton("6-3");
            board.add(testButton_6_3);
            
            JButton testButton_6_4 = new JButton("6-4");
            board.add(testButton_6_4);
            
            JButton testButton_6_5 = new JButton("6-5");
            board.add(testButton_6_5);
            
            JButton testButton_6_6 = new JButton("6-6");
            board.add(testButton_6_6);
            
            JButton testButton_6_7 = new JButton("6-7");
            board.add(testButton_6_7);
            
            JButton testButton_5_0 = new JButton("5-0");
            board.add(testButton_5_0);
            
            JButton testButton_5_1 = new JButton("5-1");
            board.add(testButton_5_1);
            
            JButton testButton_5_2 = new JButton("5-2");
            board.add(testButton_5_2);
            
            JButton testButton_5_3 = new JButton("5-3");
            board.add(testButton_5_3);
            
            JButton testButton_5_4 = new JButton("5-4");
            board.add(testButton_5_4);
            
            JButton testButton_5_5 = new JButton("5-5");
            board.add(testButton_5_5);
            
            JButton testButton_5_6 = new JButton("5-6");
            board.add(testButton_5_6);
            
            JButton testButton_5_7 = new JButton("5-7");
            board.add(testButton_5_7);
            
            JButton testButton_4_0 = new JButton("4-0");
            board.add(testButton_4_0);
            
            JButton testButton_4_1 = new JButton("4-1");
            board.add(testButton_4_1);
            
            JButton testButton_4_2 = new JButton("4-2");
            board.add(testButton_4_2);
            
            JButton testButton_4_3 = new JButton("4-3");
            board.add(testButton_4_3);
            
            JButton testButton_4_4 = new JButton("4-4");
            board.add(testButton_4_4);
            
            JButton testButton_4_5 = new JButton("4-5");
            board.add(testButton_4_5);
            
            JButton testButton_4_6 = new JButton("4-6");
            board.add(testButton_4_6);
            
            JButton testButton_4_7 = new JButton("4-7");
            board.add(testButton_4_7);
            
            JButton testButton_3_0 = new JButton("3-0");
            board.add(testButton_3_0);
            
            JButton testButton_3_1 = new JButton("3-1");
            board.add(testButton_3_1);
            
            JButton testButton_3_2 = new JButton("3-2");
            board.add(testButton_3_2);
            
            JButton testButton_3_3 = new JButton("3-3");
            board.add(testButton_3_3);
            
            JButton testButton_3_4 = new JButton("3-4");
            board.add(testButton_3_4);
            
            JButton testButton_3_5 = new JButton("3-5");
            board.add(testButton_3_5);
            
            JButton testButton_3_6 = new JButton("3-6");
            board.add(testButton_3_6);
            
            JButton testButton_3_7 = new JButton("3-7");
            board.add(testButton_3_7);
    
            JButton testButton_2_0 = new JButton("2-0");
            board.add(testButton_2_0);
            
            JButton testButton_2_1 = new JButton("2-1");
            board.add(testButton_2_1);
            
            JButton testButton_2_2 = new JButton("2-2");
            board.add(testButton_2_2);
            
            JButton testButton_2_3 = new JButton("2-3");
            board.add(testButton_2_3);
            
            JButton testButton_2_4 = new JButton("2-4");
            board.add(testButton_2_4);
            
            JButton testButton_2_5 = new JButton("2-5");
            board.add(testButton_2_5);
            
            JButton testButton_2_6 = new JButton("2-6");
            board.add(testButton_2_6);
            
            JButton testButton_2_7 = new JButton("2-7");
            board.add(testButton_2_7);

            JButton testButton_1_0 = new JButton("1-0");
            board.add(testButton_1_0);
            
            JButton testButton_1_1 = new JButton("1-1");
            board.add(testButton_1_1);
            
            JButton testButton_1_2 = new JButton("1-2");
            board.add(testButton_1_2);
            
            JButton testButton_1_3 = new JButton("1-3");
            board.add(testButton_1_3);
            
            JButton testButton_1_4 = new JButton("1-4");
            board.add(testButton_1_4);
            
            JButton testButton_1_5 = new JButton("1-5");
            board.add(testButton_1_5);
            
            JButton testButton_1_6 = new JButton("1-6");
            board.add(testButton_1_6);
            
            JButton testButton_1_7 = new JButton("1-7");
            board.add(testButton_1_7);

            JButton testButton_0_0 = new JButton("0-0");
            board.add(testButton_0_0);
    
            JButton testButton_0_1 = new JButton("0-1");
            board.add(testButton_0_1);
    
            JButton testButton_0_2 = new JButton("0-2");
            board.add(testButton_0_2);
    
            JButton testButton_0_3 = new JButton("0-3");
            board.add(testButton_0_3);
    
            JButton testButton_0_4 = new JButton("0-4");
            board.add(testButton_0_4);
    
            JButton testButton_0_5 = new JButton("0-5");
            board.add(testButton_0_5);
    
            JButton testButton_0_6 = new JButton("0-6");
            board.add(testButton_0_6);
    
            JButton testButton_0_7 = new JButton("0-7");
            board.add(testButton_0_7);               

        JPanel blackPOW = new JPanel();
        blackPOW.setBackground(Color.YELLOW);
        blackPOW.setBounds(10, 357, 196, 188);
        add(blackPOW);

        JLabel powLabelPrisonersTeamWhite = new JLabel("Chess Pieces Captured By White Team");
        powLabelPrisonersTeamWhite.setBounds(10, 341, 222, 14);
        add(powLabelPrisonersTeamWhite);

        JLabel powLabelPrisonersTeamBlack = new JLabel("Chess Pieces Captured By Black Team");
        powLabelPrisonersTeamBlack.setBounds(10, 172, 222, 14);
        add(powLabelPrisonersTeamBlack);

        JButton btnNewGame = new JButton("NEW GAME");
        btnNewGame.setBounds(723, 261, 89, 23);
        add(btnNewGame);

        JButton btnQuitGame = new JButton("QUIT GAME");
        btnQuitGame.setBounds(723, 373, 89, 23);
        add(btnQuitGame);
                
                        JPanel notificationPanel = new JPanel();
                        notificationPanel.setBackground(Color.YELLOW);
                        notificationPanel.setBounds(160, 83, 555, 59);
                        add(notificationPanel);
                        
                                JTextArea txtrNotificationBar = new JTextArea();
                                notificationPanel.add(txtrNotificationBar);
                                txtrNotificationBar.setText("NOTIFICATION BAR");
    }
}

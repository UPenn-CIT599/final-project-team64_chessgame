package application;

import javax.swing.JPanel;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;

import java.awt.*;
import java.awt.event.*;
import java.util.*;

import javax.swing.*;

@SuppressWarnings("serial")

public class GUI_ChessBoard extends JPanel {
    private static Board board;
    private static ArrayList<Square> squares;
    private static ChessPiece selectedPiece;

    public GUI_ChessBoard() {
        setBorder(new CompoundBorder(new EmptyBorder(0, 50, 50, 50), getBorder()));
        setAlignmentY(Component.BOTTOM_ALIGNMENT);
        setSize(new Dimension(500, 500));
        setMinimumSize(new Dimension(500, 500));
        setMaximumSize(new Dimension(600, 600));
        board = new Board();
        squares = new ArrayList<>();
                    JPanel panel = new JPanel();
                    panel.setSize(600, 600);// sets frame size height and width
                    panel.add(createBoardPanel());
                    panel.setVisible(true);// show frame
//        setLayout(new FlowLayout(FlowLayout.CENTER));

        add(panel);
        
        panel = new JPanel(new GridLayout(Board.NUMROWS, Board.NUMCOLS));
        for (int row = 0; row < Board.NUMROWS; row++) {
            for (int col = 0; col < Board.NUMCOLS; col++) {
                Square square = new Square(row, col, board.getPiece(row, col), (row + col) % 2 == 0);
                panel.add(square);
                squares.add(square);
            }
        }       
    }

    public JPanel createBoardPanel() {
        JPanel panel = new JPanel(new GridLayout(Board.NUMROWS, Board.NUMCOLS));
        for (int row = 0; row < Board.NUMROWS; row++) {
            for (int col = 0; col < Board.NUMCOLS; col++) {
                Square square = new Square(row, col, board.getPiece(row, col), (row + col) % 2 == 0);
                panel.add(square);
                squares.add(square);
            }
        }
        return panel;
    }

    private static class Square extends JButton {
        private int row;
        private int column;
        private ChessPiece piece;
        private boolean isWhiteSquare;
        
        @Override
        public void paintComponent(Graphics g) {
            super.paintComponent(g);//paint the background first jbutton 
            drawPiece();//then draw the piece on top of "paint"
        }

        private void drawPiece() {
            if(piece != null) {
                setFont(new Font("Arial Unicode MS", Font.PLAIN, 30));
                setText(piece.toString());
            }
        }

        private void setColor() {
            setBackground(isWhiteSquare ? Color.WHITE : Color.LIGHT_GRAY);
        }

        // square for which chess piece
        public Square(int row, int column, ChessPiece piece, boolean isWhiteSquare) {
            this.row = row;
            this.column = column;
            this.piece = piece;
            this.isWhiteSquare = isWhiteSquare;
            setColor();
            if (piece != null) {
                drawPiece();
            }

            addActionListener(new ActionListener() {

                @Override
                public void actionPerformed(ActionEvent event) {
                    // System.out.println("Clicked on " + piece.getClass().getSimpleName());
                    if (selectedPiece == null) {
                        // if piece we are clicking
                        // on does not match
                        // current player then
                        // can't move piece
                        if (piece == null || piece.isWhite() != board.isCurrentPlayerWhite()) {
                            return;
                        }
                        for (Square square : squares) {

                            if (piece.canMove(square.row, square.column)) {
                                square.setBackground(Color.CYAN);
                            } else {
                                square.setColor();
                            }
                        }

                        setBackground(Color.GREEN);
                        selectedPiece = piece;
                    }
                    else if(getBackground().equals(Color.CYAN)) {//potential move is valid
                        board.placePiece(selectedPiece, row, column);
                        Square.this.piece = selectedPiece;//special syntax bc inside of action listener.. Must reference class
                        repaint();//telling JButton to redraw itself.
                        selectedPiece = null;
                        board.switchPlayer();
                    }
                }
            });
        }
    }
}




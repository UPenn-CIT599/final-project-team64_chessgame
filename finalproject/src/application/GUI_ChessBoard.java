package application;

import javax.swing.JPanel;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

import javax.swing.*;

@SuppressWarnings("serial")

public class GUI_ChessBoard extends JPanel {

    private Board board;
    private ArrayList<Square> squares;
    private ChessPiece selectedPiece;
    private Square selectedSquare;

    public GUI_ChessBoard() {
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
        //setLayout(new FlowLayout(FlowLayout.CENTER));

        add(panel);

        panel = new JPanel(new GridLayout(Board.NUMROWS, Board.NUMCOLS));
        for (int row = Board.NUMROWS-1; row >= 0; row--) {
            for (int col = Board.NUMCOLS-1; col >=0; col--) {
                Square square = new Square(row, col, board.getPiece(row, col), (row + col) % 2 == 0);
                panel.add(square);
                squares.add(square);
            }
        }

    }

    public JPanel createBoardPanel() {
        JPanel panel = new JPanel(new GridLayout(Board.NUMROWS, Board.NUMCOLS));
        for (int row = Board.NUMROWS-1; row >= 0; row--) {
            for (int col = Board.NUMCOLS-1; col >= 0; col--) {
                Square square = new Square(row, col, board.getPiece(row, col), (row + col) % 2 == 0);
                panel.add(square);
                squares.add(square);
            }
        }
        return panel;
    }

    //This is a helper method that resets color after move
    private void resetSquareColors() {
        for (Square square : squares) {
            square.setColor();
        }
    }

    private class Square extends JButton {
        private int row;
        private int column;
        private ChessPiece piece;
        private boolean isWhiteSquare;

        @Override
        public void paintComponent(Graphics g) {
            super.paintComponent(g); //paint the background first JButton 
            drawPiece(); //then draw the piece on top of "paint"
        }

        private void drawPiece() {
            if (piece != null) {
                setFont(new Font("Arial Unicode MS", Font.PLAIN, 30));
                setText(piece.toString());
            } else {
                setText("");
            }
        }

        private void setColor() {
            setBackground(isWhiteSquare ? Color.WHITE : Color.LIGHT_GRAY);
        }

        // square for which chess piece
        public Square(int row, int column, ChessPiece initialPiece, boolean isWhiteSquare) {
            this.row = row;
            this.column = column;
            this.piece = initialPiece;
            this.isWhiteSquare = isWhiteSquare;
            setColor();
            if (initialPiece != null) {
                drawPiece();
            }

            addActionListener(new ActionListener() {

                @Override
                public void actionPerformed(ActionEvent event) {
                    
                    if(!(board.isGameOver())) {
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
                                    //System.out.println(piece.getClass().getName());
                                    square.setBackground(Color.CYAN);
                                    square.setOpaque(true);
                                } else {
                                    square.setColor();
                                }
                            }
    
                            setBackground(Color.GREEN);
                            selectedPiece = piece;
                            selectedSquare = Square.this; //current square
                        }
                        //piece selected but want to switch to another piece of same color (player is changing mind)
                        else if (piece != null && piece.isWhite == board.isCurrentPlayerWhite()) {
                            selectedSquare.setColor();
                            for (Square square : squares) {
    
                                if (piece.canMove(square.row, square.column)) {
                                    square.setBackground(Color.CYAN);
                                    square.setOpaque(true);
                                } else {
                                    square.setColor(); 
                                }
                            }
                            setBackground(Color.GREEN);
                            selectedPiece = piece;
                            selectedSquare = Square.this; //current square
                        } 
                        else if (getBackground().equals(Color.CYAN)) {//potential move is valid
                            
                            String occupiedPiece = "";
                            if(board.isSpaceOccupied(row, column)) {
                                occupiedPiece = board.getPiece(row, column).gettype();
                            }
    
                            
                            selectedPiece.move(row, column);
                            
                            resetSquareColors();
                            selectedSquare.piece = null; //piece in square will be removed from original position 
                            Square.this.piece = selectedPiece; //special syntax bc inside of action listener.. Must reference class
                            repaint(); //telling JButton to redraw itself.
                            selectedPiece = null;
                            selectedSquare = null;
                            
                        
                            board.switchPlayer();
                            
                            
                            if(board.isCurrentPlayerWhite()) {
                                GUI_Header.infoMsgWhiteTeamTurn();//announces white team's turn in display area at top of gui
                            }
                            else {
                                GUI_Header.infoMsgBlackTeamTurn(); //announces white team's turn in display area at top of gui 
                            }
                            
                            if (occupiedPiece == "King" & board.isCurrentPlayerWhite()) {
                                board.switchGameStatus();
                                GUI_Header.infoGameOverWhite(); 
                            }
                            else if (occupiedPiece == "King" & !(board.isCurrentPlayerWhite())){
                                board.switchGameStatus();
                                GUI_Header.infoGameOverBlack(); 
                            }
                        }
                    }

                }
                
            }); 
        }
    }

}

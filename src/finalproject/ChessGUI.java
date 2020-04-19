package finalproject;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.AbstractButton;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.WindowConstants;


public class ChessGUI {
	private Board board;
	private List<Square> squares = new ArrayList<>();
	private ChessPiece selectedPiece;

	public static void main(String[] args) {
		new ChessGUI();
	}

	public ChessGUI() {
		board = new Board();
		JFrame frame = new JFrame("Chess");
		JButton button = new JButton();// UNSURE ABOUT CONSTRUCTOR HERE
		frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		frame.setSize(600, 600);// sets frame size height and width
		frame.add(createMainPanel());
		frame.setVisible(true);// show frame

	}

	private JPanel createMainPanel() {
		JPanel panel = new JPanel(new BorderLayout());
		panel.add(createBoardPanel(), BorderLayout.CENTER);// creates board in center of main panel
		return panel;
	}

	private JPanel createBoardPanel() {
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

	
	
	private class Square extends JButton {
		private ChessPiece piece;
		private boolean isWhiteSquare;
		private int row;
		private int column;
		
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
			setBackground(isWhiteSquare ? Color.WHITE : Color.YELLOW);
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
						if (piece == null || piece.isWhite != board.isCurrentPlayerWhite()) {
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

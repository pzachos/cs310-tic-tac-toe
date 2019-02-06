package edu.jsu.mcis;

import java.awt.*;
import javax.swing.*;

public class TicTacToeView extends JPanel {
    
    private final TicTacToeController controller;

    private final JButton[][] board;
    private final JPanel squaresPanel;
    private final JLabel resultLabel;

    public TicTacToeView(TicTacToeController controller, int width) {

        this.controller = controller;

        this.setLayout(new BoxLayout(this, BoxLayout.PAGE_AXIS));
        board = new JButton[width][width];
        squaresPanel = new JPanel(new GridLayout(width,width));
        resultLabel = new JLabel();
        resultLabel.setName("ResultLabel");
        
        for (int row = 0; row < width; row++) {
            
            for (int col = 0; col < width; col++) {
                
                board[row][col] = new JButton(); 
                board[row][col].addActionListener(controller);
                board[row][col].setName("Square" + row + col);
                board[row][col].setPreferredSize(new Dimension(64,64));
                squaresPanel.add(board[row][col]);
                
            }
            
        }

        this.add(squaresPanel);
        this.add(resultLabel);
        
        resultLabel.setText("Welcome to Tic-Tac-Toe!");

    }
        
    public void updateSquares() {

        /* Refresh the GUI with updated data from the Model (via the Controller) */

        // INSERT YOUR CODE HERE

    }
    
    public void disableSquares() {

        /* Disable buttons (to disallow input after game is over) */
    
        // INSERT YOUR CODE HERE
            
    }
        
    public void showResult(String message) {
        
        resultLabel.setText(message);
        
    }
    
    public void clearResult() {
        
        resultLabel.setText(" ");
        
    }

}
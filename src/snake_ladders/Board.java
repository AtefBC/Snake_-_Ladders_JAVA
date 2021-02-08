package snake_ladders;

import javax.swing.border.LineBorder;

import java.util.ArrayList;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.io.Console;

public class Board extends JPanel {
	private final int MAX = 100; //MAX number for the board
	private int[] ladderStarts = { 3, 6, 20, 36, 63, 68 };
    private int[] ladderEnds =   {51, 27, 60, 55, 95, 98 };
    
    private int[] snakeStarts = {25, 34, 47, 65, 87, 91, 99 };
    private int[] snakeEnds =   {5, 1, 19,  52, 57, 61, 69 };
    private boolean tracing;

	private ArrayList<JButton> boardArray = new ArrayList<JButton>();
	/**
	 * Create the panel.
	 */
	public Board() {
		
		super(new GridLayout(0,10));
		setOpaque(false);
		setBorder(new LineBorder(Color.RED, 4));
		this.setPreferredSize(new Dimension(1000,1000)); //sets the game board size in the frame
		
		for(int i=0;i<MAX;i++)
        {
            boardArray.add(new JButton());
            add(boardArray.get(i));
            boardArray.get(i).setBorder(BorderFactory.createLineBorder(Color.DARK_GRAY,1));
            boardArray.get(i).setOpaque(false);
            boardArray.get(i).setContentAreaFilled(false);
            boardArray.get(i).setBorderPainted(false);
            //Change the text on the button's color
            boardArray.get(i).setForeground(Color.blue);
        }
		
		//Changes board orientation to start from bottom_left and end at top_right
        setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
        
        
        for(int i=0;i<boardArray.size();i++)
        {
            setComponentZOrder(boardArray.get(i),boardArray.size()-1-i);
        }
        
        //Add ladders
        for (int i = 0; i < ladderStarts.length; i++) {
            boardArray.get(ladderStarts[i]-1).setText("<html>"+String.valueOf(ladderStarts[i])+"<br>"+"Start Ladder"+ String.valueOf(i+1) + "</html>");
            boardArray.get(ladderEnds[i]-1).setText("<html>"+String.valueOf(ladderEnds[i])+"<br>"+"End Ladder"+ String.valueOf(i+1) + "</html>");
        }
        
        //Add snakes
        for (int i = 0; i < snakeStarts.length; i++) {
            boardArray.get(snakeStarts[i]-1).setText("<html>"+String.valueOf(snakeStarts[i])+"<br>"+"Start Snake"+ String.valueOf(i+1) + "</html>");
            boardArray.get(snakeEnds[i]-1).setText("<html>"+String.valueOf(snakeEnds[i])+"<br>"+"End Snake"+ String.valueOf(i+1) + "</html>");
        }

	}

}

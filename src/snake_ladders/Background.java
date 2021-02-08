package snake_ladders;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Image;

public class Background extends JPanel {

	/**
	 * Create the panel.
	 */
	public Background() {
		setBorder(new LineBorder(Color.RED, 4));
		setLayout(null);
		
		
		JLabel Label = new JLabel("New label");
		Label.setBounds(0, 4, 636, 636);
		add(Label);
		
		
		ImageIcon icon = new ImageIcon("Board.png");
		Image img = icon.getImage();
		Image imgScale = img.getScaledInstance(Label.getWidth(), Label.getHeight(), Image.SCALE_SMOOTH);
		ImageIcon scaledIcon = new ImageIcon(imgScale);
		Label.setIcon(scaledIcon);
		
	}

}

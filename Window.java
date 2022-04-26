import java.awt.Canvas;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import javax.swing.JFrame;


public class Window extends Canvas {
	CapstoneGame game = new CapstoneGame();
	public Window (int width, int height, String title, CapstoneGame game) {
		JFrame frame = new JFrame(title);
		
		// The frame is set to a constant size of width and height, hence you cannot expand or shrink the window.
		frame.setPreferredSize(new Dimension(width, height));
		frame.setMaximumSize(new Dimension(width, height));
		frame.setMinimumSize(new Dimension(width, height));
		frame.setResizable(false);
		
		// Closes the window.
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// Window appears in the center of the screen.
		frame.setLocationRelativeTo(null);
		
		// Calls the CapstoneGame class and allows for the window to be seen and be able to run.
		frame.add(game);
		frame.setVisible(true);
		CapstoneGame.start();	
	}
	
	public void paint (Graphics g) {
		
	}
}

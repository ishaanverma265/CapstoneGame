import java.awt.Canvas;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;

public class CapstoneGame extends Canvas {
	
	public CapstoneGame () {
		setBackground(Color.black);
	}
	
	public static void main (String[] args) {
		new Window(800, 600, "FireFighters Prototype", new CapstoneGame());
	}

	public static void start() {
		// TODO Auto-generated method stub
		
	}
	
    public void paint (Graphics g) {
        Graphics2D g2 = (Graphics2D) g;
        
        // Sets the center of the screen to be at the center of the screen.
        int width = getWidth();
        int height = getHeight();
        int xCenter = width / 2;
        int yCenter = height / 2;
        
        // Changes the font to be bolded.
        Font comicSansBolded = new Font("Comic Sans", Font.BOLD, 35);
        
        // Draws the title screen.
        g2.setColor(Color.red);
        g2.setFont(comicSansBolded);
        g2.drawString ("FireFighers Prototype", xCenter - 125, yCenter - 100);
     }
}
package chess;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

public class WhiteCircle extends JPanel{
	
	public void paint(Graphics g)
	{
		g.setColor(Color.black);
		g.fillOval(0, 0, (int)(getWidth()*0.98), (int)(getHeight()*0.98));
		
		
	}
	

}

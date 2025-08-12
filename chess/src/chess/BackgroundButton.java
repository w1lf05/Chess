package chess;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;

public class BackgroundButton extends JButton{
	
	int x;
	int y;
	Model model;
	WhiteCircle whitecircle = new WhiteCircle();
	
	ImageIcon whitepawn = new ImageIcon("C:\\Users\\wilfs\\Desktop\\Extra Projects\\chess\\Screenshot 2025-04-08 145726.png\"");
	
	
	public BackgroundButton()
	{
		this.setPreferredSize(new Dimension(50, 50));
		this.setBorder(BorderFactory.createLineBorder(Color.black));		
		
	}
	
	public void setplayable() 
	{
		//this.add(whitecircle);
		this.setText("can move");
	}
	
	public void setgreenbackground()
	{
		this.setBackground(Color.red);
	}
	
	public void setwhitebackground()
	{
		this.setBackground(Color.white);
	}
	
	public int getxcoord()
	{
		return x;
	}
	
	public int getycoord()
	{
		return y;
	}
	
	public void setcoords(int x, int y)
	{
		this.x = x;
		this.y = y;
	}
	
	
	
	public void setoriginal()
	{
		if(this.getBackground() == Color.green)
		{
			this.removeAll();
			this.setBackground(Color.green);
		}
		if(this.getBackground() == Color.white)
		{
			this.removeAll();
			this.setBackground(Color.white);
		}
		this.setText("");
		
		
	}
	
	public void setwhitepawn()
	{
		this.setText("WPawn");
		//this.setIcon(whitepawn);
	}
	
	

	public void setwhiterook() {
		// TODO Auto-generated method stub
		this.setText("WRook");
	}

	public void setwhiteknight() {
		// TODO Auto-generated method stub
		this.setText("WKnight");
	}

	public void setwhitebishop() {
		// TODO Auto-generated method stub
		this.setText("WBishop");
	}

	public void setwhitequeen() {
		// TODO Auto-generated method stub
		this.setText("WQueen");
	}

	public void setwhiteking() {
		// TODO Auto-generated method stub
		this.setText("WKing");
	}
	
	public void setblackpawn()
	{
		this.setText("BPawn");
		//this.setIcon(new ImageIcon("\"C:\\Users\\wilfs\\Desktop\\Extra Projects\\chess\\Screenshot 2025-04-08 145804.png\""));
		
	}

	public void setblackrook() {
		// TODO Auto-generated method stub
		this.setText("BRook");
	}

	public void setblackknight() {
		// TODO Auto-generated method stub
		this.setText("BKnight");
	}

	public void setblackbishop() {
		// TODO Auto-generated method stub
		this.setText("BBishop");
	}

	public void setblackqueen() {
		// TODO Auto-generated method stub
		this.setText("BQueen");
	}

	public void setblackking() {
		// TODO Auto-generated method stub
		this.setText("BKing");
	}
	
}

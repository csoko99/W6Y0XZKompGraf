package hu.the.w6y0xz;

import javax.swing.*;
import java.awt.*;

public class W6Y0XZProg8 extends JFrame{

	
	 W6Y0XZProg8(){
	    	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        setLayout(null);
	        setTitle("W6Y0XZ-Színek");
	        getContentPane().setBackground(Color.yellow);
	        setSize(650, 300);
	        setVisible(true);
	    }
	    
	 public void paint(Graphics g) {
	        super.paint(g);
	        drawSquare(g, Color.red, 50, 50);    
	        drawSquare(g, Color.magenta, 250, 50); 
	        drawSquare(g, Color.cyan, 450, 50);  
	    }
	 
	 private void drawSquare(Graphics g, Color color, int x, int y) {
	        g.setColor(color);
	        g.fillRect(x, y, 100, 100); 
	    }
	 
	    public static void main(String[] args)
	    {
	        new W6Y0XZProg8();
	    }
	
}

package hu.the.w6y0xz;

import javax.swing.*;
import java.awt.FlowLayout;

public class W6Y0XZProg3 extends JFrame{
	
	JLabel felirat1;
	JLabel felirat2;
	W6Y0XZProg3()
	{
		felirat1 = new JLabel ("Programtervező informatikus, PTI");
		felirat2 = new JLabel ("Programtervező informatikus, 2024");
		
		felirat1.setBounds(50, 50, 250, 30);
		felirat2.setBounds(50, 100, 250, 30);
		
		add (felirat1);
		add (felirat2);
		
		setLayout(new FlowLayout());
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setSize(400,300);
		setVisible(true);
		
	}
	
	public static void main(String args[]) 
	{
		new W6Y0XZProg3();
	}
}

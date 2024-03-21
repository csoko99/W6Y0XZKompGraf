package hu.the.w6y0xz;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class W6Y0XZProg2 extends JFrame{
	
	JLabel felirat;
	
	W6Y0XZProg2()
	{
		felirat= new JLabel("Programtervező informatikus, Bsc");
		add (felirat);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(400,300);
		pack();
		setVisible(true);
	}
	
	public static void main(String args[]) 
	{
		new W6Y0XZProg2();
	}
}

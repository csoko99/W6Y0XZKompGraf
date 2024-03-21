package hu.the.w6y0xz;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class W6Y0XZProg5 extends JFrame implements ActionListener{

	
	JButton exitgomb;
	
	W6Y0XZProg5()
	{
		exitgomb = new JButton("Kilépés"); 
		
		exitgomb.setBounds(100, 100, 100, 30);
		exitgomb.addActionListener(this);
		
		add(exitgomb);
		setLayout(null);
		
		setSize(400,300);
		setVisible(true);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		System.exit(0);
		
	}
	
	public static void main(String[] args) {
		new W6Y0XZProg5();

	}

	

}

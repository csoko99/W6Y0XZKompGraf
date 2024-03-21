package hu.the.w6y0xz;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class W6Y0XZProg6 extends JFrame implements ActionListener{

	JButton kilép;
	JButton változtat;
	JButton vissza;
	
	 W6Y0XZProg6() {
		kilép = new JButton("Kilépés");
		változtat = new JButton("Változtat");
		vissza = new JButton("Vissza");
		
	
		kilép.addActionListener(this);
		változtat.addActionListener(this);
		vissza.addActionListener(this);
		
		kilép.setBounds(50, 100, 100, 30);
		változtat.setBounds(150, 100, 100, 30);
		vissza.setBounds(250, 100, 100, 30);
		
		add(kilép);
		add(változtat);
		add(vissza);
		
		setLayout(null);
		
		setSize(400,300);
		setVisible(true);
	}

	public static void main(String[] args) {
		new W6Y0XZProg6();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == kilép) {
			System.exit(0);
		}
		
		if(e.getSource() == változtat) {
			setTitle("Működik");
		}
		
		if(e.getSource() == vissza) {
			setTitle("Előző");
		}
	}

}

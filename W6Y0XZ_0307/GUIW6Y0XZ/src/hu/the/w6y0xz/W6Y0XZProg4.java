package hu.the.w6y0xz;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class W6Y0XZProg4{


	public static void main(String[] args) {
		JFrame ablak = new JFrame("Grafikus Felület");
		ablak.setBounds(20,20,400,300);
		ablak.getContentPane().setLayout(null);
		
		JLabel felirat = new JLabel("Helló W6Y0XZ");
		ablak.getContentPane().add(felirat);
		
		felirat.setBounds(40, 100, 100, 20);
		
		ablak.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ablak.setVisible(true);
	}

}

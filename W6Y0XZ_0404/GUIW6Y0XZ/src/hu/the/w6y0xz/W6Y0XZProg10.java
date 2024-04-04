package hu.the.w6y0xz;


import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class W6Y0XZProg10 extends JFrame{

	JLabel szoveg = new JLabel ("Szöveg:");
	JRadioButton kek = new JRadioButton("Kék");
	JRadioButton piros = new JRadioButton("Piros");
	JRadioButton kis = new JRadioButton ("Kisbetű");
	JRadioButton nagy = new JRadioButton ("Nagybetű");
	JButton torles = new JButton ("Törlés");
	JTextField szoveg_mezo = new JTextField(15);
	ButtonGroup kek_piros = new ButtonGroup();
	ButtonGroup kis_nagy = new ButtonGroup();
	
	public W6Y0XZProg10() {
		
		setTitle("Jelölőnégyzet");
        setSize(250, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());
        
        
        add(szoveg);
        add(szoveg_mezo);
        add(torles);
       
        add(kek);
        add(piros);
        add(kis);
        add(nagy);
       
        kek_piros.add(kek);
        kek_piros.add(piros);
        kis_nagy.add(kis);
        kis_nagy.add(nagy);
        
        
        torles.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                szoveg_mezo.setText("");
            }
        });
        
        kek.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	szoveg_mezo.setForeground(Color.BLUE);
            }
        });

        piros.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	szoveg_mezo.setForeground(Color.RED);
            }
        });

        kis.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	szoveg_mezo.setText(szoveg_mezo.getText().toLowerCase());
            }
        });

        nagy.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	szoveg_mezo.setText(szoveg_mezo.getText().toUpperCase());
            }
        });


        setVisible(true);
	}
	
	public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new W6Y0XZProg10();
            }
        });
	}
}
package hu.the.w6y0xz;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class W6Y0XZProg9 extends JFrame{

	JLabel szoveg = new JLabel ("Szöveg:");
	JCheckBox kek_piros = new JCheckBox("Kék/Piros");
	JCheckBox kis_nagy = new JCheckBox ("Kisbetű/Nagybetű");
	JButton torles = new JButton ("Törlés");
	JTextField szoveg_mezo = new JTextField(15);
	
	
	public W6Y0XZProg9() {
		
		setTitle("Jelölőnégyzet");
        setSize(250, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());
        
        add(szoveg);
        add(szoveg_mezo);
        add(torles);
        add(kek_piros);
        add(kis_nagy);
        
       
        
        torles.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                szoveg_mezo.setText("");
            }
        });
        
        kek_piros.addItemListener(new ItemListener() {
            public void itemStateChanged(ItemEvent e) {
                if (kek_piros.isSelected()) {
                	szoveg_mezo.setForeground(Color.BLUE);
                } else {
                	szoveg_mezo.setForeground(Color.RED);
                }
            }
        });
        
        kis_nagy.addItemListener(new ItemListener() {
            public void itemStateChanged(ItemEvent e) {
                if (kis_nagy.isSelected()) {
                	szoveg_mezo.setText(szoveg_mezo.getText().toUpperCase());
                } else {
                	szoveg_mezo.setText(szoveg_mezo.getText().toLowerCase());
                }
            }
        });

        setVisible(true);
	}
	
	public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new W6Y0XZProg9();
            }
        });
	}
}

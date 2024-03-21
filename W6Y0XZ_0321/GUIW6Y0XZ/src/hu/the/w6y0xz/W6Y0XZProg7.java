package hu.the.w6y0xz;

import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;

public class W6Y0XZProg7 extends JFrame{

	JLabel felirat1 = new JLabel("Programtervező informatikus 2024");
    JLabel felirat2 = new JLabel("Programtervező informatikus 2024");
    JLabel felirat3 = new JLabel("Programtervező informatikus 2024");
    
    Font felirat1Font = new Font("serif", Font.ITALIC | Font.BOLD, 40);
    Font felirat2Font = new Font("serif", Font.PLAIN | Font.BOLD, 30);
    Font felirat3Font = new Font("serif", Font.ITALIC, 20);
    
    W6Y0XZProg7(){
    	
    	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    	felirat1.setForeground(Color.blue);
    	felirat1.setFont(felirat1Font);
        Dimension meret1 = felirat1.getPreferredSize();
        felirat1.setBounds(30, 50, meret1.width, meret1.height);
        add(felirat1);
        
        felirat2.setForeground(Color.black);
        felirat2.setFont(felirat2Font);
        Dimension meret2 = felirat2.getPreferredSize();
        felirat2.setBounds(30, 125, meret2.width, meret2.height);
        add(felirat2);
        
        felirat3.setForeground(Color.red);
        felirat3.setFont(felirat3Font);
        Dimension meret3 = felirat3.getPreferredSize();
        felirat3.setBounds(30, 200, meret3.width, meret3.height);
        add(felirat3);
        
        setLayout(null);
        setTitle("Laczkó");
        getContentPane().setBackground(Color.yellow);
        setSize(650, 300);
        setVisible(true);
    }
    
    public static void main(String[] args)
    {
        new W6Y0XZProg7();
    }
}

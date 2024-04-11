package hu.the.w6y0xz;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class W6Y0XZProg12 extends JFrame{
	
	private JTextField szovegmezo;

    public W6Y0XZProg12() {
    	
    	setTitle("Számolás");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(350, 70);

        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout()); 
        panel.setBackground(Color.LIGHT_GRAY);

        JButton kilepgomb = new JButton("Kilép");
        kilepgomb.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        panel.add(kilepgomb);
        
        JButton duplazgomb = new JButton("Dupláz");
        duplazgomb.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                duplaz();
            }
        });
        panel.add(duplazgomb);
        
        szovegmezo = new JTextField(10);
        panel.add(szovegmezo);

        add(panel);

        setVisible(true);
    }

    private void duplaz() {
        try {
            int szam = Integer.parseInt(szovegmezo.getText());
            szovegmezo.setText(String.valueOf(szam * 2));
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Hibás formátum! Csak számokat adjon meg.", "Hiba", JOptionPane.ERROR_MESSAGE);
        }
    }
   

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new W6Y0XZProg12();
            }
        });
    }
}

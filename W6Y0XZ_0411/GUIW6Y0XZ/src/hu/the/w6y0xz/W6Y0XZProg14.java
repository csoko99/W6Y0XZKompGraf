package hu.the.w6y0xz;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class W6Y0XZProg14 extends JFrame {

    public W6Y0XZProg14() {
    	
        setTitle("W6Y0XZ Párbeszédablak");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 200);
        setLayout(new BorderLayout());

        JTextField szovegmezo = new JTextField();
        add(szovegmezo, BorderLayout.CENTER);

    
        JButton ablaknyitogomb = new JButton("W6Y0XZ Párbeszédablak");
        ablaknyitogomb.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                showCustomDialog(W6Y0XZProg14.this, szovegmezo);
            }
        });
        add(ablaknyitogomb, BorderLayout.SOUTH);
    }

    private void showCustomDialog(JFrame parentFrame, JTextField textField) {
     
        JFrame parbeszedablak = new JFrame("W6Y0XZ Párbeszédablak");
        parbeszedablak.setSize(200, 150);
        parbeszedablak.setLayout(new FlowLayout());
        parbeszedablak.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        JTextField parbeszedszoveg = new JTextField(15);
        parbeszedablak.add(parbeszedszoveg);

        JButton megsegomb = new JButton("Mégse");
        megsegomb.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            	parbeszedablak.dispose();             }
        });
        parbeszedablak.add(megsegomb);
        
        JButton beallitgomb = new JButton("Beállít");
        beallitgomb.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String text = parbeszedszoveg.getText();
                String currentText = textField.getText(); 
                textField.setText(currentText + " " + text);
                parbeszedablak.dispose(); 
            }
        });
        parbeszedablak.add(beallitgomb);

        parbeszedablak.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new W6Y0XZProg14().setVisible(true);
            }
        });
    }
}

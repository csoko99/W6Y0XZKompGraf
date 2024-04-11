package hu.the.w6y0xz;

import javax.swing.*;
import java.awt.event.*;

public class W6Y0XZProg15 extends JFrame{
	
	public W6Y0XZProg15() {
        setTitle("W6Y0XZ Menü");
        setSize(300, 200);
        
        JMenuBar menu = new JMenuBar();
        setJMenuBar(menu);
        
        JMenu adatbevitel = new JMenu("Adatbevitel");
        JMenu szamitasok = new JMenu("Számítások");
        
        menu.add(adatbevitel);
        menu.add(szamitasok);
        
        JMenuItem aOldalM = new JMenuItem("A oldal");
        JMenuItem bOldalM = new JMenuItem("B oldal");
        JMenuItem keruletM = new JMenuItem("Kerület");
        JMenuItem teruletM = new JMenuItem("Terület");
        JMenuItem kilepesM = new JMenuItem("Kilépés");
        
        adatbevitel.add(aOldalM);
        adatbevitel.add(bOldalM);
        szamitasok.add(keruletM);
        szamitasok.add(teruletM);
        szamitasok.add(kilepesM);
        
        aOldalM.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String input = JOptionPane.showInputDialog("Adja meg az A oldal hosszát:");
                double aSide = Double.parseDouble(input);
                calculate(aSide, 'a');
            }
        });
        
        bOldalM.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String input = JOptionPane.showInputDialog("Adja meg a B oldal hosszát:");
                double bSide = Double.parseDouble(input);
                calculate(bSide, 'b');
            }
        });
        
        keruletM.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                double kerulet = calculateKerulet();
                JOptionPane.showMessageDialog(null, "A téglalap kerülete: " + kerulet);
            }
        });
        
        teruletM.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                double terulet = calculateTerulet();
                JOptionPane.showMessageDialog(null, "A téglalap területe: " + terulet);
            }
        });
        
        kilepesM.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
    }
    
    private double aOldal = 0;
    private double bOldal = 0;
    
    private void calculate(double oldal, char melyikoldal) {
        if (melyikoldal == 'a') {
        	aOldal = oldal;
        } else if (melyikoldal == 'b') {
        	bOldal = oldal;
        }
    }
    
    private double calculateKerulet() {
        return 2 * (aOldal + bOldal);
    }
    
    private double calculateTerulet() {
        return aOldal * bOldal;
    }
    
    public static void main(String[] args) {
    	W6Y0XZProg15 frame = new W6Y0XZProg15();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}

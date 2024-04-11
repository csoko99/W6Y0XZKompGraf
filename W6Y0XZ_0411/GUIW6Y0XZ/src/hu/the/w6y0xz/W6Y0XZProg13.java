package hu.the.w6y0xz;

import javax.swing.*;
import java.awt.*;
import java.awt.event.AdjustmentEvent;
import java.awt.event.AdjustmentListener;

public class W6Y0XZProg13 extends JFrame{

	private JScrollBar szam1;
    private JScrollBar szam2;
    private JLabel szoveg1;
    private JLabel szoveg2;
    private JLabel szoveg3;
    private JTextField osszeadas;

    public W6Y0XZProg13() {
        setTitle("Összeadó-Scroll");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 140);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(3, 2));

        szoveg1 = new JLabel("Szám 1:");
        panel.add(szoveg1);

        szam1 = new JScrollBar(JScrollBar.HORIZONTAL, 50, 1, 1, 100);
        szam1.addAdjustmentListener(new ScrollBarListener());
        panel.add(szam1);

        szoveg2 = new JLabel("Szám 2:");
        panel.add(szoveg2);
      
        szam2 = new JScrollBar(JScrollBar.HORIZONTAL, 50, 1, 1, 100);
        szam2.addAdjustmentListener(new ScrollBarListener());
        panel.add(szam2);
       
        szoveg3 = new JLabel("Összeg:");
        panel.add(szoveg3);
        
        osszeadas = new JTextField();
        osszeadas.setEditable(false);
        panel.add(osszeadas);

        
        add(panel);

        setVisible(true);
    }

    private class ScrollBarListener implements AdjustmentListener {
        @Override
        public void adjustmentValueChanged(AdjustmentEvent e) {
            int value1 = szam1.getValue();
            int value2 = szam2.getValue();
            int result = value1 + value2;
            osszeadas.setText(value1 + " + " + value2 + " = " + result);
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new W6Y0XZProg13();
            }
        });
    }
	
}

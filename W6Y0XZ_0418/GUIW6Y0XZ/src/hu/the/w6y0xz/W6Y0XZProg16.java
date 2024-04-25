package hu.the.w6y0xz;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JFrame;

public class W6Y0XZProg16 extends JFrame {

    W6Y0XZProg16() {
        this.setSize(300, 250);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        
        g.setColor(Color.RED);
        g.fillOval(30, 40, 40, 50);
        
        g.fillOval(80, 40, 50, 40);
        
        g.fillOval(150, 40, 50, 50);
        
        g.fillArc(30, 100, 50, 50, 0, 90);
        g.fillArc(90, 100, 50, 50, 90, 90);
        g.fillArc(130, 100, 50, 50, 180, 45);
        g.fillArc(140, 100, 50, 50, 270, 45);
        
        for (int i = 0; i < 360; i += 40) { 
            g.fillArc( 30, 150, 50, 50, i, 20); 
        }
        
        for (int i = 0; i < 360; i += 40) { 
            g.fillArc( 90, 150, 30, 50, i, 20); 
        }
        
        for (int i = 0; i < 180; i += 40) { 
            g.fillArc( 180, 150, 50, 50, i, 20); 
        }
        
        g.drawRect(0, 0, getWidth() - 2, getHeight() - 2);
    }

    public static void main(String[] args) {
        new W6Y0XZProg16();
    }
}

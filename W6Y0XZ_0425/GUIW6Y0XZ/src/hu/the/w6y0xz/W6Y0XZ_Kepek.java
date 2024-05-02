package hu.the.w6y0xz;

import java.awt.*;
import javax.swing.*;

public class W6Y0XZ_Kepek extends JFrame {

    ImageIcon kep;
    Image kicsi;
    Image kozepes;
    Image nagy;

    W6Y0XZ_Kepek() {
        setTitle("Kép méretezése");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500, 430);

        kep = new ImageIcon("egyetem.png");

        int width = kep.getIconWidth();
        int height = kep.getIconHeight();
        
        int smallWidth = width / 6;
        int smallHeight = height / 6;
        
        int normalWidth = width / 4;
        int normalHeight = height / 4;
        
        int bigWidth = width/2;
        int bigHeight = height/2;

        kicsi = kep.getImage().getScaledInstance(smallWidth, smallHeight, Image.SCALE_AREA_AVERAGING);
        kozepes = kep.getImage().getScaledInstance(normalWidth, normalHeight, Image.SCALE_AREA_AVERAGING);
        nagy = kep.getImage().getScaledInstance(bigWidth, bigHeight, Image.SCALE_AREA_AVERAGING);
        
        JPanel imagePanel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                
                g.drawImage(kicsi, 0, 0, this);
                g.drawImage(kozepes, 100, 0, this);
                g.drawImage(nagy, 250, 0, this);
            }
        };

        add(imagePanel, BorderLayout.CENTER);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new W6Y0XZ_Kepek().setVisible(true);
            }
        });
    }
}


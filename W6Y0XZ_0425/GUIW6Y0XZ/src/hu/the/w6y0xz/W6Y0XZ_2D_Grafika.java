package hu.the.w6y0xz;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.*;

public class W6Y0XZ_2D_Grafika extends JFrame {

    public W6Y0XZ_2D_Grafika() {
        setTitle("2D Grafika");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500, 500);

        JPanel drawingPanel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                Graphics2D g2d = (Graphics2D) g;

                setBackground(Color.WHITE);

                g2d.rotate(Math.toRadians(-45), 100, 150);
                Arc2D ellipse = new Arc2D.Double(-100, 200, 400, 200, 90, 360/2, Arc2D.OPEN);
                g2d.setColor(Color.BLUE);
                g2d.fill(ellipse);

                Arc2D ellipse2 = new Arc2D.Double(200, 350, 200, 200, 30, 120, Arc2D.OPEN); 
                g2d.setColor(Color.GREEN);
                g2d.fill(ellipse2);

                ImageIcon imageIcon = new ImageIcon("egyetem.png");
                Image image = imageIcon.getImage();
                int width = imageIcon.getIconWidth() / 4;
                int height = imageIcon.getIconHeight() / 4;

                g2d.setComposite(AlphaComposite.getInstance(AlphaComposite.SRC_OVER, 0.8f));

                g2d.setColor(Color.RED);
                g2d.setFont(new Font("Arial", Font.BOLD, 26));
                g2d.drawString("Tokaj-Hegyalja Egyetem", 30, 350);

           
                g2d.drawImage(image, 90, 100, width, height, this);
            }
        };

        getContentPane().add(drawingPanel, BorderLayout.CENTER);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new W6Y0XZ_2D_Grafika().setVisible(true);
        });
    }
}

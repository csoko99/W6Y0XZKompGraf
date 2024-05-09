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
                
                Shape hiddenellipse = new Arc2D.Double(-100, 0, 510, 400, 90, 360, Arc2D.OPEN);
                
                g2d.rotate(Math.toRadians(-45), 100, 150);
                Arc2D ellipse = new Arc2D.Double(-100, 200, 400, 200, 90, 360/2, Arc2D.OPEN);
                g2d.setPaint(new GradientPaint(200, 200, Color.BLUE, 210, 210, Color.YELLOW, true ));
                g2d.fill(ellipse);
                g2d.setClip(hiddenellipse);
                
                Shape ellipse2 = new Ellipse2D.Float(100, 300, 400, 700);
                g2d.setPaint(Color.GREEN);
                g2d.fill(ellipse2);
                g2d.setPaint(Color.MAGENTA);
                g2d.setStroke(new BasicStroke(5));
                g2d.draw(ellipse2);
                g2d.setClip(hiddenellipse);

                g2d.setPaint(new GradientPaint(30, 30, Color.BLACK, 40, 40, Color.RED, true));
                g2d.setFont(new Font("Arial", Font.BOLD, 26));
                g2d.drawString("Tokaj-Hegyalja Egyetem", 30, 350);
                
                ImageIcon imageIcon = new ImageIcon("egyetem.png");
                Image image = imageIcon.getImage();
                int width = imageIcon.getIconWidth() / 4;
                int height = imageIcon.getIconHeight() / 4;
                g2d.setComposite(AlphaComposite.getInstance(AlphaComposite.SRC_OVER, 0.8f));
                g2d.drawImage(image, 90, 100, width, height, this);
                g2d.setClip(90, 100, 300, 400);
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

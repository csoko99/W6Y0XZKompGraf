package hu.the.w6y0xz;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class W6Y0XZProg18 extends JFrame {
    
    private static final long serialVersionUID = 1L; 

    private Color drawColor = Color.BLACK;
    private DrawingPanel drawingPanel; 

    public W6Y0XZProg18() {
        setTitle("Szabadkézi Rajzolás");
        setSize(500, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        drawingPanel = new DrawingPanel();

        JButton backgroundColorButton = new JButton("Háttérszín");
        backgroundColorButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Color newColor = JColorChooser.showDialog(null, "Válassz háttérszínt", drawingPanel.getBackground());
                if (newColor != null) {
                    drawingPanel.setBackground(newColor);
                }
            }
        });

        JButton drawColorButton = new JButton("Rajzszín");
        drawColorButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Color newColor = JColorChooser.showDialog(null, "Válassz rajzszínt", drawColor);
                if (newColor != null) {
                    drawColor = newColor;
                }
            }
        });

        JButton clearButton = new JButton("Törlés");
        clearButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                drawingPanel.clear();
            }
        });

        JPanel buttonPanel = new JPanel();
        buttonPanel.add(backgroundColorButton);
        buttonPanel.add(drawColorButton);
        buttonPanel.add(clearButton);

        getContentPane().add(drawingPanel, BorderLayout.CENTER);
        getContentPane().add(buttonPanel, BorderLayout.SOUTH);
    }

    
    class DrawingPanel extends JPanel {
        private int prevX, prevY;

        public DrawingPanel() {
            
            addMouseListener(new MouseAdapter() {
                @Override
                public void mousePressed(MouseEvent e) {
                    prevX = e.getX();
                    prevY = e.getY();
                }
            });

            
            addMouseMotionListener(new MouseMotionAdapter() {
                @Override
                public void mouseDragged(MouseEvent e) {
                    int x = e.getX();
                    int y = e.getY();
                    Graphics g = getGraphics();
                    g.setColor(drawColor);
                    g.drawLine(prevX, prevY, x, y);
                    prevX = x;
                    prevY = y;
                }
            });
        }

        
        public void clear() {
            Graphics g = getGraphics();
            g.setColor(getBackground());
            g.fillRect(0, 0, getWidth(), getHeight());
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                W6Y0XZProg18 app = new W6Y0XZProg18();
                app.setVisible(true);
            }
        });
    }
}

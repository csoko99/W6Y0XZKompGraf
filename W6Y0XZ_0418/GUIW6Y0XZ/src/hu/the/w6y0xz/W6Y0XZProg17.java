package hu.the.w6y0xz;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class W6Y0XZProg17 extends JFrame {

    public JButton drawButton = new JButton("Rajzolás");
    public int width;
    public int height;
    public boolean isClicked = false;

    W6Y0XZProg17() {
        setTitle("Rajzolás gombra kattintva");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        width = getWidth();
        height = getHeight();

        drawButton.setFont(new Font("Serif", Font.BOLD, 14));

        drawButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                isClicked = true;
                repaint();
            }
        });

        JPanel buttonPanel = new JPanel(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.weightx = 1.0;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.insets = new Insets(10, 10, 10, 10);
        buttonPanel.add(drawButton, gbc);

        getContentPane().add(buttonPanel, "South"); 

    }

    @Override
    public void paint(Graphics r) {
        super.paint(r);

        r.setColor(Color.RED);
        for (int i = 0; i < width; i += 20) {
            r.drawLine(0, 0, i, height);
        }

        if (isClicked) {
            r.setColor(Color.BLUE);
            for (int i = width; i > 0; i -= 20) {
                r.drawLine(width, 0, i, height);
            }
        }

    }

    public static void main(String[] args) {
        try {
            W6Y0XZProg17 app = new W6Y0XZProg17();
            app.setVisible(true);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

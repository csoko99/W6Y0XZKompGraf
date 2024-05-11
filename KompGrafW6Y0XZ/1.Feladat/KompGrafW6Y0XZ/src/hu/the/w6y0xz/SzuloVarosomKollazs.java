package hu.the.w6y0xz;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.*;

public class SzuloVarosomKollazs extends JFrame
{
	
	private ImageIcon apollo = new ImageIcon("apollo_mozi.jpeg");
	private ImageIcon deri = new ImageIcon("deri_muzeum.jpeg");
	private ImageIcon egyetem = new ImageIcon("egyetem.jpg");
	private ImageIcon modem = new ImageIcon("modem.jpg");
	private ImageIcon nagyerdo = new ImageIcon("nagyerdo.jpg");
	private ImageIcon nagytemplom = new ImageIcon("nagytemplom.jpg");
	private int nagytemplom_width = apollo.getIconWidth() / 2;
	private int nagytemplom_height = apollo.getIconHeight() / 2;
	private ImageIcon stadion = new ImageIcon("stadion.jpeg");	
	private ImageIcon strand = new ImageIcon("strand.jpeg");
	private ImageIcon viztorony = new ImageIcon("viztorony.jpeg");
	
	public SzuloVarosomKollazs()
	{
		setTitle("Szülővárosom");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(1000, 1000);
        
        JPanel panel = new JPanel() 
	    {
            
	        protected void paintComponent(Graphics g) 
	        {
	            super.paintComponent(g);
	            Graphics2D g2d = (Graphics2D) g;
	            
	            int width = 250;
	            int height = 150;
	            
	            setBackground(Color.yellow);
	            
	            Shape hiddenellipse = new Arc2D.Double(350, 250, 300, 300, 90, 360, Arc2D.OPEN);
	            AffineTransform old = g2d.getTransform();
	            
	            g2d.setFont(new Font("Times New Roman", Font.BOLD, 26));
                g2d.drawString("Appoló mozi", 540, 40);
	        	g2d.setColor(Color.BLACK);
	        	Image mozi = apollo.getImage();
	        	g2d.drawImage (mozi, 500, 50, width, height, this);
	        	
	        	g2d.setFont(new Font("Times New Roman", Font.BOLD, 26));
                g2d.drawString("Déri múzeum", 540, 590);
	        	Image muzeum = deri.getImage();
	        	g2d.drawImage (muzeum, 500, 600, width, height, this);
	        	
	        	g2d.setFont(new Font("Times New Roman", Font.BOLD, 26));
                g2d.drawString("Debreceni Egyetem", 210, 590);
	        	Image egyetem_kep = egyetem.getImage();
	        	g2d.drawImage (egyetem_kep, 200, 600, width, height, this);
	        	
	        	g2d.rotate(Math.toRadians(90), 560, 400);
	        	g2d.setFont(new Font("Times New Roman", Font.BOLD, 20));
                g2d.drawString("Modem", 450, 0);
                g2d.setTransform(old);
	        	Image modem_kep = modem.getImage();
	        	g2d.drawImage (modem_kep, 700, 250, width, height, this);
	        	
	        	g2d.rotate(Math.toRadians(90), 560, 400);
	        	g2d.setFont(new Font("Times New Roman", Font.BOLD, 20));
                g2d.drawString("Nagyerdő", 610, 0);
                g2d.setTransform(old);
	        	Image nagyerdo_kep = nagyerdo.getImage();
	        	g2d.drawImage (nagyerdo_kep, 700, 420, width, height, this);
	        	
	        	g2d.rotate(Math.toRadians(270), 305, 305);
	        	g2d.setFont(new Font("Times New Roman", Font.BOLD, 20));
                g2d.drawString("LOKI stadion", 60, 40);
                g2d.setTransform(old);
	        	Image stadion_kep = stadion.getImage();
	        	g2d.drawImage (stadion_kep, 50, 420, width, height, this);
	        	
	        	
                g2d.rotate(Math.toRadians(270), 305, 305);
	        	g2d.setFont(new Font("Times New Roman", Font.BOLD, 20));
                g2d.drawString("Nagyerdei strand", 210, 40);
                g2d.setTransform(old);
	        	Image strand_kep = strand.getImage();
	        	g2d.drawImage (strand_kep, 50, 250, width, height, this);
	        	
	        	g2d.setFont(new Font("Times New Roman", Font.BOLD, 26));
                g2d.drawString("Nagyerdei víztorony", 210, 40);
	        	Image torony = viztorony.getImage();
	        	g2d.drawImage (torony, 200, 50, width, height, this);
	        	
	        	g2d.setPaint(new GradientPaint(30, 30, Color.BLUE, 40, 40, Color.BLACK, true));
                g2d.setFont(new Font("Arial", Font.BOLD, 36));
                g2d.drawString("Szülővárosom - Debrecen", 300, 240);
                
	        	g2d.setClip(hiddenellipse);
	        	Image templom = nagytemplom.getImage();
	        	g2d.drawImage (templom, 250, 250, nagytemplom_width, nagytemplom_height, this);

	        	
	        }
	 };
        
        getContentPane().add(panel, BorderLayout.CENTER);
	}
	
	public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new SzuloVarosomKollazs().setVisible(true);
        });
	}
}

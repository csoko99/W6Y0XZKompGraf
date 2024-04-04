package hu.the.w6y0xz;

import javax.swing.*;
import java.awt.*;

public class W6Y0XZProg11 extends JFrame{

	public W6Y0XZProg11() {
		
		setTitle("PTI");
        setSize(220, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        getContentPane().setBackground(new Color(173, 216, 230));
        
        String[] nevek = {"Programtervező informatikus:","Laczkó Lajos", "Papp Kevin", "Bárdos Triszten", "Mihály Károly", "Veres Zoltán"};
        
        JList<String> lista = new JList<>(nevek);
        
        JScrollPane gorgeto = new JScrollPane(lista);
        
        getContentPane().add(gorgeto, BorderLayout.CENTER);
        
        
	}
	
	public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
        	W6Y0XZProg11 app = new W6Y0XZProg11();
            app.setVisible(true);
        });
    }
}

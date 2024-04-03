package GUI;
import javax.swing.*;
import java.awt.*;


public class VentanaPrincipal extends JFrame {
	public VentanaPrincipal () {
		
		 setTitle("Gestor de proyectos");
	     setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	     setSize(1280, 800);
	     setLocationRelativeTo(null); // Centrar la ventana en la pantalla
	
	     JPanel panelAñadir = new JPanel();
	     panelAñadir.setBackground(Color.WHITE);
	     getContentPane().add(panelAñadir, BorderLayout.CENTER);
	
	     getContentPane().add(panelAñadir);
	     panelAñadir.setLayout(null);
	     
	     JPanel panel = new JPanel();
	     panel.setBackground(new Color(51, 132, 182));
	     panel.setBounds(0, 0, 307, 761);
	     panelAñadir.add(panel);
	     panel.setLayout(null);
	     setVisible(true);
	     
	     JPanel panel_1 = new JPanel();
	     panel_1.setBounds(0, 0, 307, 115);
	     panel_1.setBackground(new Color(43, 116, 171));
	     panel.add(panel_1);
	     
	     JLabel lblNewLabel = new JLabel("New label");
	     lblNewLabel.setBounds(315, 11, 340, 85);
	     panelAñadir.add(lblNewLabel);
	     
	     
	     
	}
}

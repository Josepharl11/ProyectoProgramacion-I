package GUI;

import javax.swing.*;
import java.awt.Font;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.BorderLayout;


public class Proveedores extends JPanel{
	private JTable table;
	public Proveedores() {
		setLayout(new BorderLayout(0, 0));
		setSize(960, 761);
		
		JPanel panelProveedores = new JPanel();
		panelProveedores.setBackground(Color.WHITE);
		add(panelProveedores, BorderLayout.CENTER);
		panelProveedores.setLayout(null);
		
		JLabel lblProveedores = new JLabel("Proveedores");
		lblProveedores.setIcon(new ImageIcon(Proveedores.class.getResource("/images/iconamoon_delivery-fast-fill.png")));
		lblProveedores.setIconTextGap(20);
		lblProveedores.setForeground(new Color(29, 53, 87));
		lblProveedores.setFont(new Font("Sentic", Font.BOLD, 42));
		lblProveedores.setBounds(23, 21, 357, 61);
		panelProveedores.add(lblProveedores);
		
		
	}
}

package GUI;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Desicion extends javax.swing.JFrame {
	public Desicion() {
	
        setTitle("Gestor de proyectos");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(1280, 800);
        setLocationRelativeTo(null); // Centrar la ventana en la pantalla

        JPanel panelBackGround = new JPanel();
        panelBackGround.setBackground(Color.WHITE);
        getContentPane().add(panelBackGround, BorderLayout.CENTER);
        panelBackGround.setLayout(null);

        getContentPane().add(panelBackGround);
        setVisible(true);
        
        JButton btnVentas = new JButton("Ventas");
        btnVentas.setBorderPainted(false);
        btnVentas.setFocusable(false);
        btnVentas.setMargin(new Insets(2, 19, 2, 14));
        btnVentas.setHorizontalAlignment(SwingConstants.LEFT);
        btnVentas.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        btnVentas.setIconTextGap(70);
        btnVentas.setIcon(new ImageIcon(Desicion.class.getResource("/images/mdi_cart.png")));
        btnVentas.setForeground(Color.WHITE);
        btnVentas.setBackground(new Color(230, 57, 70));
        btnVentas.setBounds(430, 149, 404, 92);
        btnVentas.setFont(new Font("Sentic", Font.BOLD, 40));
        panelBackGround.add(btnVentas);
        
        btnVentas.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		VentanaPrincipal ventanaprincipal= new VentanaPrincipal();
        		ventanaprincipal.setVisible(true);
        		Desicion.this.setVisible(false);
        		
        	}
        });
        
        
        JButton btnInventario = new JButton("Inventario");
        btnInventario.setBorderPainted(false);
        btnInventario.setFocusable(false);
        btnInventario.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        btnInventario.setMargin(new Insets(2, 19, 2, 14));
        btnInventario.setIcon(new ImageIcon(Desicion.class.getResource("/images/material-symbols_inventory-rounded.png")));
        btnInventario.setIconTextGap(40);
        btnInventario.setHorizontalAlignment(SwingConstants.LEFT);
        btnInventario.setForeground(Color.WHITE);
        btnInventario.setFont(new Font("Sentic", Font.BOLD, 40));
        btnInventario.setBackground(new Color(51, 131, 182));
        btnInventario.setBounds(430, 320, 404, 92);
        panelBackGround.add(btnInventario);
        
        JButton btnUsuarios = new JButton("Usuarios");
        btnUsuarios.setBorderPainted(false);
        btnUsuarios.setFocusable(false);
        btnUsuarios.setHorizontalAlignment(SwingConstants.LEFT);
        btnUsuarios.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        btnUsuarios.setMargin(new Insets(2, 19, 2, 14));
        btnUsuarios.setIcon(new ImageIcon(Desicion.class.getResource("/images/mdi_user.png")));
        btnUsuarios.setIconTextGap(50);
        btnUsuarios.setForeground(Color.WHITE);
        btnUsuarios.setFont(new Font("Sentic", Font.BOLD, 40));
        btnUsuarios.setBackground(new Color(29, 53, 87));
        btnUsuarios.setBounds(430, 493, 404, 92);
        panelBackGround.add(btnUsuarios);

        
    }
}
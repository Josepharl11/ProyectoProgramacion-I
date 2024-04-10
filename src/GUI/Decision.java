package GUI;
import javax.swing.*;

import DataBase.ConexionMySQL;

import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Decision extends javax.swing.JFrame {
	private VentanaPrincipal ventanaPrincipal;
	private String nombreUsuario;


    
   
	
	
	public Decision() {
		initComponents();
	}
	
	public Decision(String nombreUsuario, String cargoEmpleado) {
		this.nombreUsuario = nombreUsuario;
		initComponents();
		ventanaPrincipal = new VentanaPrincipal(nombreUsuario, cargoEmpleado);
	}
        
	private void initComponents() {
		setTitle("Gestor de proyectos");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(1280, 800);
        setResizable(false);
        setLocationRelativeTo(null);

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
        btnVentas.setIcon(new ImageIcon(Decision.class.getResource("/images/mdi_cartPrincipal.png")));
        btnVentas.setForeground(Color.WHITE);
        btnVentas.setBackground(new Color(230, 57, 70));
        btnVentas.setBounds(430, 212, 404, 92);
        btnVentas.setFont(new Font("Sentic", Font.BOLD, 40));
        panelBackGround.add(btnVentas);
        
        btnVentas.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		VentanaPrincipal ventanaprincipal= new VentanaPrincipal();
        		ventanaprincipal.setVisible(true);
        		Decision.this.setVisible(false);
        	}
        });
        
        
        JButton btnInventario = new JButton("Inventario");
        btnInventario.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		VentanaPrincipal ventanaprincipal= new VentanaPrincipal();
        		ventanaprincipal.setVisible(true);
        		Decision.this.setVisible(false);
        	}
        });
        btnInventario.setBorderPainted(false);
        btnInventario.setFocusable(false);
        btnInventario.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        btnInventario.setMargin(new Insets(2, 19, 2, 14));
        btnInventario.setIcon(new ImageIcon(Decision.class.getResource("/images/material-symbols_inventory-roundedPrincipal.png")));
        btnInventario.setIconTextGap(40);
        btnInventario.setHorizontalAlignment(SwingConstants.LEFT);
        btnInventario.setForeground(Color.WHITE);
        btnInventario.setFont(new Font("Sentic", Font.BOLD, 40));
        btnInventario.setBackground(new Color(51, 131, 182));
        btnInventario.setBounds(430, 383, 404, 92);
        panelBackGround.add(btnInventario);
        
        JButton btnUsuarios = new JButton("Usuarios");
        btnUsuarios.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		VentanaPrincipal ventanaprincipal= new VentanaPrincipal();
        		ventanaprincipal.setVisible(true);
        		Decision.this.setVisible(false);
        	}
        });
        btnUsuarios.setBorderPainted(false);
        btnUsuarios.setFocusable(false);
        btnUsuarios.setHorizontalAlignment(SwingConstants.LEFT);
        btnUsuarios.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        btnUsuarios.setMargin(new Insets(2, 19, 1, 14));
        btnUsuarios.setIcon(new ImageIcon(Decision.class.getResource("/images/mdi_userPrincipal.png")));
        btnUsuarios.setIconTextGap(50);
        btnUsuarios.setForeground(Color.WHITE);
        btnUsuarios.setFont(new Font("Sentic", Font.BOLD, 40));
        btnUsuarios.setBackground(new Color(29, 53, 87));
        btnUsuarios.setBounds(430, 556, 404, 92);
        panelBackGround.add(btnUsuarios);
        
        JLabel lblNewLabel = new JLabel("Bienvenido");
        lblNewLabel.setFont(new Font("Sentic", Font.BOLD, 50));
        lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel.setBounds(442, 60, 379, 73);
        panelBackGround.add(lblNewLabel);
        
        JLabel lblUsuario = new JLabel();
        lblUsuario.setText(nombreUsuario);
        lblUsuario.setFont(new Font("Sentic", Font.PLAIN, 30));
        lblUsuario.setHorizontalAlignment(SwingConstants.CENTER);
        lblUsuario.setBounds(482, 118, 299, 42);
        panelBackGround.add(lblUsuario);
        
        JButton btnNewButton = new JButton("");
        btnNewButton.setFocusable(false);
        btnNewButton.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		Login login = new Login();
        		login.setVisible(true);
        		Decision.this.setVisible(false);
        		
        	}
        });
        btnNewButton.setHorizontalTextPosition(SwingConstants.CENTER);
        btnNewButton.setBorderPainted(false);
        btnNewButton.setBackground(new Color(0, 64, 128));
        btnNewButton.setIcon(new ImageIcon(Decision.class.getResource("/images/ic_outline-logout.png")));
        btnNewButton.setBounds(29, 648, 78, 82);
        panelBackGround.add(btnNewButton);
    }
}
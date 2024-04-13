package GUI;
import javax.swing.*;

import DataBase.ConexionMySQL;

import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Login extends javax.swing.JFrame {
	
	private JTextField textField;
	private JPasswordField passwordField;
    public Login() {
    	
        setTitle("Iniciar sesión");
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
        
        Panel panelLogin = new Panel();
        panelLogin.setBackground(new Color(243, 243, 243));
        panelLogin.setBounds(444, 69, 375, 463);
        panelBackGround.add(panelLogin);
        panelLogin.setLayout(null);
        
        
        JLabel lblIniciaSesion = new JLabel("Inicia sesión");
        lblIniciaSesion.setHorizontalAlignment(SwingConstants.CENTER);
        lblIniciaSesion.setForeground(new Color(51, 132, 182));
        lblIniciaSesion.setBounds(35, 43, 306, 53);
        lblIniciaSesion.setFont(new Font("Sentic", Font.BOLD, 45));
        panelLogin.add(lblIniciaSesion);
        
        JLabel lblUsuario = new JLabel("Usuario");
        lblUsuario.setHorizontalAlignment(SwingConstants.LEFT);
        lblUsuario.setForeground(new Color(51, 132, 182));
        lblUsuario.setFont(new Font("Sentic", Font.PLAIN, 18));
        lblUsuario.setBounds(23, 149, 74, 31);
        panelLogin.add(lblUsuario);
        
        textField = new JTextField();
        textField.setText("");
        textField.setFont(new Font("Sentic", Font.PLAIN, 18));
        textField.setBounds(23, 181, 329, 37);
        panelLogin.add(textField);
        textField.setColumns(10);
        
        JLabel lblContrasena = new JLabel("Contraseña");
        lblContrasena.setHorizontalAlignment(SwingConstants.LEFT);
        lblContrasena.setForeground(new Color(51, 132, 182));
        lblContrasena.setFont(new Font("Sentic", Font.PLAIN, 18));
        lblContrasena.setBounds(23, 231, 124, 31);
        panelLogin.add(lblContrasena);
        
        passwordField = new JPasswordField();
        passwordField.setText("");
        passwordField.setToolTipText("");
        passwordField.setBounds(23, 263, 331, 37);
        panelLogin.add(passwordField);
        
        JButton btnIniciar = new JButton("Iniciar");
        btnIniciar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        btnIniciar.setBounds(134, 365, 89, 53);
        panelLogin.add(btnIniciar);
        btnIniciar.setBackground(new Color(51, 132, 182));
        btnIniciar.setForeground(Color.WHITE);
        Font fuente = new Font("Sentic", Font.PLAIN, 16);
        btnIniciar.setFont(fuente);
        
        
        btnIniciar.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		String usuario = textField.getText();
                String contraseña = new String(passwordField.getPassword());
                
                String nombreUsuario = ConexionMySQL.validarCredenciales(usuario, contraseña);
                String cargoEmpleado = ConexionMySQL.obtenerCargoEmpleado(usuario);
                
                if (nombreUsuario != null) {
                	VentanaPrincipal ventanaPrincipal = new VentanaPrincipal(nombreUsuario, cargoEmpleado);
                	ventanaPrincipal.setVisible(true);
                	
                	
                	//Decision decision = new Decision(nombreUsuario, cargoEmpleado);
                	//decision.setVisible(true);
                	Login.this.setVisible(false);
                } else {
                    JOptionPane.showMessageDialog(Login.this, "Credenciales inválidas. Inténtalo de nuevo.");
                }
        	}
        });

        Panel panelCuadroAzul = new Panel();
        panelCuadroAzul.setBackground(new Color(51, 132, 182));
        panelCuadroAzul.setBounds(392, 227, 480, 363);
        panelBackGround.add(panelCuadroAzul);
        panelCuadroAzul.setLayout(null);
    }
}
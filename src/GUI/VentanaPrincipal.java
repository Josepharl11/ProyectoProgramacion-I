package GUI;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.table.DefaultTableModel;
import javax.swing.border.CompoundBorder;
import javax.swing.border.LineBorder;
import javax.swing.border.MatteBorder;
import javax.swing.border.EmptyBorder;


public class VentanaPrincipal extends JFrame {
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTable table;
	private JLabel lblNombreDeUsuario;
    private JLabel lblTipoDeRol;
    
    public VentanaPrincipal() {
    	
    }
    
    public VentanaPrincipal(String nombreUsuario, String cargoEmpleado) {
    	 setTitle("Gestor de proyectos");
	     setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	     setSize(1280, 800);
	     setResizable(false);
	     setLocationRelativeTo(null); // Centrar la ventana en la pantalla
	
	     JPanel Background = new JPanel();
	     Background.setBackground(Color.WHITE);
	     getContentPane().add(Background, BorderLayout.CENTER);
	
	     getContentPane().add(Background);
	     Background.setLayout(null);

	     JScrollPane scrollPaneContenido = new JScrollPane();
	     scrollPaneContenido.setBounds(306, 0, 960, 697);
	     scrollPaneContenido.setSize(960, 761);
	     Background.add(scrollPaneContenido);

	     JPanel PanelMenu = new JPanel();
	     PanelMenu.setBackground(new Color(51, 132, 182));
	     PanelMenu.setBounds(0, 0, 307, 761);
	     Background.add(PanelMenu);
	     PanelMenu.setLayout(null);
	     setVisible(true);
	     
	     JPanel panelDeRoles = new JPanel();
	     panelDeRoles.setBounds(0, 0, 307, 115);
	     panelDeRoles.setBackground(new Color(43, 116, 171));
	     PanelMenu.add(panelDeRoles);
	     panelDeRoles.setLayout(null);
	     
	     JLabel lblNewLabel_1 = new JLabel("");
	     lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
	     lblNewLabel_1.setHorizontalTextPosition(SwingConstants.CENTER);
	     lblNewLabel_1.setIcon(new ImageIcon(VentanaPrincipal.class.getResource("/images/mdi_user-1.png")));
	     lblNewLabel_1.setBounds(45, 22, 67, 71);
	     panelDeRoles.add(lblNewLabel_1);
	     
	     JButton btnButtonReturn = new JButton("");
	     btnButtonReturn.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
	     btnButtonReturn.setFocusable(false);
	     btnButtonReturn.addActionListener(new ActionListener() {
	     	public void actionPerformed(ActionEvent e) {
	     		Decision desicion = new Decision();
	     		desicion.setVisible(true);
	     		VentanaPrincipal.this.setVisible(false);
	     		
	     	}
	     });
	     
	     JButton btnMenuVentas = new JButton("Ventas");
	     btnMenuVentas.addActionListener(new ActionListener() {
	    	    public void actionPerformed(ActionEvent e) {
	    	        Ventas ventas = new Ventas();
	    	        scrollPaneContenido.setViewportView(ventas);

	    	        scrollPaneContenido.revalidate();
	    	        scrollPaneContenido.repaint();
	    	    }
	    	});
	     
	     btnMenuVentas.setBorderPainted(false);
	     btnMenuVentas.setMargin(new Insets(2, 25, 2, 14));
	     btnMenuVentas.setIconTextGap(20);
	     btnMenuVentas.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
	     btnMenuVentas.setHorizontalAlignment(SwingConstants.LEADING);
	     btnMenuVentas.setForeground(Color.WHITE);
	     btnMenuVentas.setBackground(new Color(51, 132, 182));
	     btnMenuVentas.setFont(new Font("Sentic", Font.BOLD, 18));
	     btnMenuVentas.setIcon(new ImageIcon(VentanaPrincipal.class.getResource("/images/mdi_cart-1columna.png")));
	     btnMenuVentas.setBounds(0, 133, 307, 62);
	     PanelMenu.add(btnMenuVentas);
	     
	     btnButtonReturn.setBorderPainted(false);
	     btnButtonReturn.setBackground(new Color(43, 116, 171));
	     btnButtonReturn.setIcon(new ImageIcon(VentanaPrincipal.class.getResource("/images/Vector.png")));
	     btnButtonReturn.setBounds(10, 27, 40, 36);
	     panelDeRoles.add(btnButtonReturn);
	     
	     JLabel lblNombreDeUsuario = new JLabel();
	     lblNombreDeUsuario.setText(nombreUsuario);
	     lblNombreDeUsuario.setForeground(Color.WHITE);
	     lblNombreDeUsuario.setFont(new Font("Sentic", Font.BOLD, 22));
	     lblNombreDeUsuario.setBounds(122, 32, 175, 36);
	     panelDeRoles.add(lblNombreDeUsuario);
	     
	     JLabel lblTipoDeRol = new JLabel();
	     lblTipoDeRol.setText(cargoEmpleado);
	     lblTipoDeRol.setForeground(Color.WHITE);
	     lblTipoDeRol.setFont(new Font("Helvetica", Font.BOLD, 15));
	     lblTipoDeRol.setBounds(122, 59, 158, 22);
	     panelDeRoles.add(lblTipoDeRol);
	     
	     JButton btnMenuProveedores = new JButton("Proveedores");
	     btnMenuProveedores.addActionListener(new ActionListener() {
	         public void actionPerformed(ActionEvent e) {
	        	 
	             Proveedores proveedores = new Proveedores();
	             
	             // Agrega el inventario al panel contenido del JScrollPane
	             scrollPaneContenido.setViewportView(proveedores);
	             
	             // Llama a revalidate() y repaint() para actualizar la interfaz de usuario
	             scrollPaneContenido.revalidate();
	             scrollPaneContenido.repaint();
	         }
	     });
	     
	     btnMenuProveedores.setBorderPainted(false);
	     btnMenuProveedores.setIconTextGap(20);
	     btnMenuProveedores.setMargin(new Insets(2, 25, 2, 14));
	     btnMenuProveedores.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
	     btnMenuProveedores.setHorizontalAlignment(SwingConstants.LEADING);
	     btnMenuProveedores.setForeground(Color.WHITE);
	     btnMenuProveedores.setBackground(new Color(51, 132, 182));
	     btnMenuProveedores.setFont(new Font("Sentic", Font.BOLD, 18));
	     btnMenuProveedores.setIcon(new ImageIcon(VentanaPrincipal.class.getResource("/images/iconamoon_delivery-fast-fillcolumna.png")));
	     btnMenuProveedores.setBounds(0, 256, 307, 62);
	     PanelMenu.add(btnMenuProveedores);
	     
	     JButton btnMenuUsuarios = new JButton("Usuarios");
	     
	     btnMenuUsuarios.addActionListener(new ActionListener() {
	         public void actionPerformed(ActionEvent e) {
	        	 
	             Usuarios usuarios = new Usuarios();
	             
	             // Agrega el inventario al panel contenido del JScrollPane
	             scrollPaneContenido.setViewportView(usuarios);
	             
	             // Llama a revalidate() y repaint() para actualizar la interfaz de usuario
	             scrollPaneContenido.revalidate();
	             scrollPaneContenido.repaint();
	         }
	     });
	     
	     btnMenuUsuarios.setIconTextGap(20);
	     btnMenuUsuarios.setMargin(new Insets(2, 25, 2, 14));
	     btnMenuUsuarios.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
	     btnMenuUsuarios.setBorderPainted(false);
	     btnMenuUsuarios.setHorizontalAlignment(SwingConstants.LEADING);
	     btnMenuUsuarios.setForeground(Color.WHITE);
	     btnMenuUsuarios.setBackground(new Color(51, 132, 182));
	     btnMenuUsuarios.setFont(new Font("Sentic", Font.BOLD, 18));
	     btnMenuUsuarios.setIcon(new ImageIcon(VentanaPrincipal.class.getResource("/images/UserVectorcolumna.png")));
	     btnMenuUsuarios.setBounds(0, 318, 307, 62);

	     PanelMenu.add(btnMenuUsuarios);
	     
	     JButton btnMenuInventario = new JButton("Inventario");
	     btnMenuInventario.addActionListener(new ActionListener() {
	         public void actionPerformed(ActionEvent e) {
	        	 
	             Inventario inventario = new Inventario();
	             // Agrega el inventario al panel contenido del JScrollPane
	             scrollPaneContenido.setViewportView(inventario);
	             
	             // Llama a revalidate() y repaint() para actualizar la interfaz de usuario
	             scrollPaneContenido.revalidate();
	             scrollPaneContenido.repaint();
	         }
	     });
	     
	     btnMenuInventario.setBorderPainted(false);
	     btnMenuInventario.setIconTextGap(20);
	     btnMenuInventario.setMargin(new Insets(2, 25, 2, 14));
	     btnMenuInventario.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
	     btnMenuInventario.setHorizontalAlignment(SwingConstants.LEADING);
	     btnMenuInventario.setFont(new Font("Sentic", Font.BOLD, 18));
	     btnMenuInventario.setForeground(Color.WHITE);
	     btnMenuInventario.setBackground(new Color(51, 132, 182));
	     btnMenuInventario.setIcon(new ImageIcon(VentanaPrincipal.class.getResource("/images/material-symbols_inventory-rounded-1columna.png")));
	     btnMenuInventario.setBounds(0, 195, 307, 62);
	     PanelMenu.add(btnMenuInventario);

	     JButton btnMenuClientes = new JButton("Clientes");
	     btnMenuClientes.setIcon(new ImageIcon(VentanaPrincipal.class.getResource("/images/fa-solid_ClientesMenu.png")));
	     btnMenuClientes.setMargin(new Insets(2, 25, 2, 14));
	     btnMenuClientes.setIconTextGap(20);
	     btnMenuClientes.setHorizontalAlignment(SwingConstants.LEADING);
	     btnMenuClientes.setForeground(Color.WHITE);
	     btnMenuClientes.setFont(new Font("Sentic", Font.BOLD, 18));
	     btnMenuClientes.setBorderPainted(false);
	     btnMenuClientes.setBackground(new Color(51, 132, 182));
	     btnMenuClientes.setBounds(0, 381, 307, 62);
	     PanelMenu.add(btnMenuClientes);
	     
	     // Roles de Empleados.
	     if (!cargoEmpleado.equalsIgnoreCase("Administrador")) {
	         btnMenuProveedores.setVisible(false);
	         btnMenuUsuarios.setVisible(false);
	         btnMenuInventario.setVisible(false);
	     }
	     
	     btnMenuClientes.addActionListener(new ActionListener () {
	    	 public void actionPerformed(ActionEvent e) {
	        	 
	    		 ClientesGUI clientesGUI = new ClientesGUI();
	             // Agrega el inventario al panel contenido del JScrollPane
	             scrollPaneContenido.setViewportView(clientesGUI);
	             
	             // Llama a revalidate() y repaint() para actualizar la interfaz de usuario
	             scrollPaneContenido.revalidate();
	             scrollPaneContenido.repaint();
	         }
	     });
	     
	     JButton btnLogout = new JButton("Cerrar sesion");
	     btnLogout.setForeground(Color.WHITE);
	     btnLogout.setFont(new Font("Segoe UI", Font.PLAIN, 16));
	     btnLogout.setBorderPainted(false);
	     
	     btnLogout.addActionListener(new ActionListener() {
	     	public void actionPerformed(ActionEvent e) {
	     		Login login = new Login();
	     		login.setVisible(true);
	     		VentanaPrincipal.this.setVisible(false);
	     	}
	     });
	     
	     btnLogout.setIcon(new ImageIcon(VentanaPrincipal.class.getResource("/images/ic_outline-logout.png")));
	     btnLogout.setBackground(new Color(51, 132, 182));
	     btnLogout.setBounds(10, 688, 200, 62);
	     PanelMenu.add(btnLogout);   
	     
	     
	     
	     
	}
}
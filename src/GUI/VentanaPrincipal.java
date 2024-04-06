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
	     setLocationRelativeTo(null); // Centrar la ventana en la pantalla
	
	     JPanel panelAñadir = new JPanel();
	     panelAñadir.setBackground(Color.WHITE);
	     getContentPane().add(panelAñadir, BorderLayout.CENTER);
	
	     getContentPane().add(panelAñadir);
	     panelAñadir.setLayout(null);
	     
	     JPanel PanelMenu = new JPanel();
	     PanelMenu.setBackground(new Color(51, 132, 182));
	     PanelMenu.setBounds(0, 0, 307, 761);
	     panelAñadir.add(PanelMenu);
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
	     		Desicion desicion = new Desicion();
	     		desicion.setVisible(true);
	     		VentanaPrincipal.this.setVisible(false);
	     		
	     	}
	     });
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
	     
	     JButton btnMenuVentas = new JButton("Ventas");
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
	     
	     JScrollPane scrollPaneVENTAS = new JScrollPane();
	     scrollPaneVENTAS.setBounds(306, 0, 958, 822);
	     panelAñadir.add(scrollPaneVENTAS);
	     
	     JPanel panel_2 = new JPanel();
	     scrollPaneVENTAS.setViewportView(panel_2);
	     panel_2.setLayout(null);
	     
	     JLabel lblNewLabel = new JLabel("Ventas");
	     lblNewLabel.setIconTextGap(20);
	     lblNewLabel.setForeground(new Color(29, 53, 87));
	     lblNewLabel.setIcon(new ImageIcon(VentanaPrincipal.class.getResource("/images/mdi_cart.png")));
	     lblNewLabel.setBounds(27, 24, 286, 61);
	     lblNewLabel.setFont(new Font("Sentic", Font.BOLD, 42));
	     panel_2.add(lblNewLabel);
	     
	     JScrollPane scrollPane_formulario = new JScrollPane();
	     scrollPane_formulario.setBounds(27, 111, 907, 401);
	     panel_2.add(scrollPane_formulario);
	     
	     JPanel panel_1 = new JPanel();
	     panel_1.setBackground(new Color(215, 215, 215));
	     scrollPane_formulario.setViewportView(panel_1);
	     panel_1.setLayout(null);
	     
	     JLabel lblArticulo = new JLabel("Articulo");
	     lblArticulo.setForeground(new Color(29, 53, 87));
	     lblArticulo.setFont(new Font("Helvetica", Font.BOLD, 18));
	     lblArticulo.setBounds(21, 11, 107, 22);
	     panel_1.add(lblArticulo);
	     
	     JSpinner spinner = new JSpinner();
	     spinner.setRequestFocusEnabled(false);
	     spinner.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
	     spinner.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
	     spinner.setFont(new Font("Segoe UI", Font.PLAIN, 16));
	     spinner.setModel(new SpinnerNumberModel(Float.valueOf(1), Float.valueOf(1), null, Float.valueOf(1)));
	     spinner.setBounds(21, 104, 187, 32);
	     panel_1.add(spinner);
	     
	     JComboBox comboBox = new JComboBox();
	     comboBox.setFont(new Font("Segoe UI", Font.PLAIN, 16));
	     comboBox.setModel(new DefaultComboBoxModel(new String[] {"Articulo 1", "Articulo 2", "Articulo 3"}));
	     comboBox.setBounds(21, 33, 854, 32);
	     panel_1.add(comboBox);
	     
	     JLabel lblCantidad = new JLabel("Cantidad");
	     lblCantidad.setForeground(new Color(29, 53, 87));
	     lblCantidad.setFont(new Font("Helvetica", Font.BOLD, 18));
	     lblCantidad.setBounds(21, 82, 107, 22);
	     panel_1.add(lblCantidad);
	     
	     JLabel lblPrecio = new JLabel("Precio");
	     lblPrecio.setForeground(new Color(29, 53, 87));
	     lblPrecio.setFont(new Font("Helvetica", Font.BOLD, 18));
	     lblPrecio.setBounds(274, 82, 107, 22);
	     panel_1.add(lblPrecio);
	     
	     textField = new JTextField();
	     textField.setText("$");
	     textField.setBounds(274, 104, 193, 32);
	     panel_1.add(textField);
	     textField.setColumns(10);
	     
	     JLabel lblDescuento = new JLabel("% Descuento");
	     lblDescuento.setForeground(new Color(29, 53, 87));
	     lblDescuento.setFont(new Font("Helvetica", Font.BOLD, 18));
	     lblDescuento.setBounds(505, 82, 157, 22);
	     panel_1.add(lblDescuento);
	     
	     textField_1 = new JTextField();
	     textField_1.setColumns(10);
	     textField_1.setBounds(505, 104, 193, 32);
	     panel_1.add(textField_1);
	     
	     textField_2 = new JTextField();
	     textField_2.setEnabled(false);
	     textField_2.setText("18%");
	     textField_2.setColumns(10);
	     textField_2.setBounds(15, 177, 193, 32);
	     panel_1.add(textField_2);
	     
	     JLabel lblPrecio_1 = new JLabel("% ITBIS");
	     lblPrecio_1.setForeground(new Color(29, 53, 87));
	     lblPrecio_1.setFont(new Font("Helvetica", Font.BOLD, 18));
	     lblPrecio_1.setBounds(15, 155, 107, 22);
	     panel_1.add(lblPrecio_1);
	     
	     textField_3 = new JTextField();
	     textField_3.setEnabled(false);
	     textField_3.setText("0");
	     textField_3.setColumns(10);
	     textField_3.setBounds(274, 177, 193, 32);
	     panel_1.add(textField_3);
	     
	     JLabel lblPrecio_2 = new JLabel("Existencia");
	     lblPrecio_2.setForeground(new Color(29, 53, 87));
	     lblPrecio_2.setFont(new Font("Helvetica", Font.BOLD, 18));
	     lblPrecio_2.setBounds(274, 155, 107, 22);
	     panel_1.add(lblPrecio_2);
	     
	     JButton btnNewButton = new JButton("Añadir");
	     btnNewButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
	     btnNewButton.setFont(new Font("Sentic", Font.BOLD, 14));
	     btnNewButton.setForeground(new Color(255, 255, 255));
	     btnNewButton.setBorderPainted(false);
	     btnNewButton.setBackground(new Color(70, 130, 180));
	     btnNewButton.setBounds(505, 174, 99, 35);
	     panel_1.add(btnNewButton);
	     
	     JButton btnActualizar = new JButton("Actualizar");
	     btnActualizar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
	     btnActualizar.setFont(new Font("Sentic", Font.BOLD, 14));
	     btnActualizar.setForeground(Color.WHITE);
	     btnActualizar.setBorderPainted(false);
	     btnActualizar.setBackground(new Color(32, 178, 170));
	     btnActualizar.setBounds(631, 172, 114, 35);
	     panel_1.add(btnActualizar);
	     
	     JButton btnNewButton_2 = new JButton("");
	     btnNewButton_2.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
	     btnNewButton_2.setBorderPainted(false);
	     btnNewButton_2.setBackground(new Color(220, 20, 60));
	     btnNewButton_2.setIcon(new ImageIcon(VentanaPrincipal.class.getResource("/images/fluent_delete-16-filled.png")));
	     btnNewButton_2.setBounds(782, 174, 54, 35);
	     panel_1.add(btnNewButton_2);
	     
	     JScrollPane scrollPane_1 = new JScrollPane();
	     scrollPane_1.setBounds(21, 238, 854, 112);
	     panel_1.add(scrollPane_1);
	     
	     table = new JTable();
	     scrollPane_1.setViewportView(table);
	     table.setModel(new DefaultTableModel(
	     	new Object[][] {
	     		{null, null, null, null, null, null, null, null},
	     		
	     	},
	     	new String[] {
	     		"Articulo", "New column", "New column", "New column", "New column", "New column", "New column", "New column"
	     	}
	     ));
	     table.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
	     
	     JLabel lblCantidad_1 = new JLabel("Total de articulos:");
	     lblCantidad_1.setForeground(new Color(29, 53, 87));
	     lblCantidad_1.setFont(new Font("Helvetica", Font.BOLD, 18));
	     lblCantidad_1.setBounds(21, 361, 162, 22);
	     panel_1.add(lblCantidad_1);
	     
	     JLabel lblCantidadVariable = new JLabel("X");
	     lblCantidadVariable.setForeground(new Color(29, 53, 87));
	     lblCantidadVariable.setFont(new Font("Helvetica", Font.BOLD, 18));
	     lblCantidadVariable.setBounds(193, 361, 72, 22);
	     panel_1.add(lblCantidadVariable);
	     
	     JLabel lblCantidad_1_1 = new JLabel("Comentario:");
	     lblCantidad_1_1.setForeground(new Color(29, 53, 87));
	     lblCantidad_1_1.setFont(new Font("Helvetica", Font.BOLD, 18));
	     lblCantidad_1_1.setBounds(50, 536, 162, 22);
	     panel_2.add(lblCantidad_1_1);
	     
	     JTextPane textPane = new JTextPane();
	     textPane.setBounds(50, 569, 445, 90);
	     panel_2.add(textPane);
	     
	     JLabel lblCantidad_1_2 = new JLabel("Sub total: $");
	     lblCantidad_1_2.setHorizontalAlignment(SwingConstants.TRAILING);
	     lblCantidad_1_2.setForeground(new Color(29, 53, 87));
	     lblCantidad_1_2.setFont(new Font("Sentic", Font.PLAIN, 18));
	     lblCantidad_1_2.setBounds(672, 534, 240, 22);
	     panel_2.add(lblCantidad_1_2);
	     
	     JLabel lblCantidad_1_2_1 = new JLabel("Sub total: $");
	     lblCantidad_1_2_1.setHorizontalAlignment(SwingConstants.TRAILING);
	     lblCantidad_1_2_1.setForeground(new Color(29, 53, 87));
	     lblCantidad_1_2_1.setFont(new Font("Sentic", Font.PLAIN, 18));
	     lblCantidad_1_2_1.setBounds(682, 555, 230, 22);
	     panel_2.add(lblCantidad_1_2_1);
	     
	     JLabel lblCantidad_1_2_1_1 = new JLabel("Sub total: $");
	     lblCantidad_1_2_1_1.setHorizontalAlignment(SwingConstants.TRAILING);
	     lblCantidad_1_2_1_1.setForeground(new Color(29, 53, 87));
	     lblCantidad_1_2_1_1.setFont(new Font("Sentic", Font.PLAIN, 18));
	     lblCantidad_1_2_1_1.setBounds(682, 578, 230, 22);
	     panel_2.add(lblCantidad_1_2_1_1);
	     
	     JLabel lblCantidad_1_2_1_2 = new JLabel("Sub total: $");
	     lblCantidad_1_2_1_2.setHorizontalAlignment(SwingConstants.TRAILING);
	     lblCantidad_1_2_1_2.setForeground(new Color(29, 53, 87));
	     lblCantidad_1_2_1_2.setFont(new Font("Sentic", Font.PLAIN, 18));
	     lblCantidad_1_2_1_2.setBounds(682, 623, 230, 22);
	     panel_2.add(lblCantidad_1_2_1_2);
	     
	     JButton btnFormaDePago = new JButton("Forma de pago");
	     btnFormaDePago.setForeground(Color.WHITE);
	     btnFormaDePago.setFont(new Font("Segoe UI", Font.BOLD, 14));
	     btnFormaDePago.setBorderPainted(false);
	     btnFormaDePago.setBackground(new Color(32, 178, 170));
	     btnFormaDePago.setBounds(687, 694, 148, 35);
	     panel_2.add(btnFormaDePago);
	     
	     JButton btnEliminarFacturafinal = new JButton("");
	     btnEliminarFacturafinal.addActionListener(new ActionListener() {
	     	public void actionPerformed(ActionEvent e) {
	     	}
	     });
	     btnEliminarFacturafinal.setBorder(new LineBorder(new Color(220, 20, 60), 2, true));
	     btnEliminarFacturafinal.setIcon(new ImageIcon(VentanaPrincipal.class.getResource("/images/fluent_delete-16-filledrojo.png")));
	     btnEliminarFacturafinal.setBounds(864, 694, 39, 35);
	     panel_2.add(btnEliminarFacturafinal);
	}
}
package GUI;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.ComponentOrientation;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

import javax.swing.AbstractButton;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSpinner;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.ListSelectionModel;
import javax.swing.SpinnerNumberModel;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableModel;
import java.awt.SystemColor;

public class Ventas extends JPanel{
	private JTextField txtPrecio;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTable tablaVentas;
	private JTextField txtNombreCliente;
	private JTextField txtDireccionCliente;
	private JTextField txtSubTotal;
	private JTextField txtITBIS;
	private JTextField txtTotal;
	public Ventas() {
		setLayout(new BorderLayout(0, 0));
		setSize(960, 761);
		
		JPanel PanelVentas = new JPanel();
		PanelVentas.setBackground(Color.WHITE);
	     PanelVentas.setSize (960, 761);
	     add(PanelVentas, BorderLayout.CENTER);
	     PanelVentas.setLayout(null);
	     

	     
	     JLabel lblNewLabel = new JLabel("Ventas");
	     lblNewLabel.setIconTextGap(20);
	     lblNewLabel.setForeground(new Color(29, 53, 87));
	     lblNewLabel.setIcon(new ImageIcon(VentanaPrincipal.class.getResource("/images/mdi_cart.png")));
	     lblNewLabel.setBounds(27, 24, 286, 61);
	     lblNewLabel.setFont(new Font("Sentic", Font.BOLD, 42));
	     PanelVentas.add(lblNewLabel);
	     
	     JScrollPane scrollPane_formulario = new JScrollPane();
	     scrollPane_formulario.setBounds(27, 111, 907, 401);
	     PanelVentas.add(scrollPane_formulario);
	     
	     JPanel panelFormulario = new JPanel();
	     panelFormulario.setBackground(new Color(215, 215, 215));
	     scrollPane_formulario.setViewportView(panelFormulario);
	     panelFormulario.setLayout(null);
	     
	     JLabel lblArticulo = new JLabel("Articulo");
	     lblArticulo.setForeground(new Color(29, 53, 87));
	     lblArticulo.setFont(new Font("Helvetica", Font.BOLD, 18));
	     lblArticulo.setBounds(21, 11, 107, 22);
	     panelFormulario.add(lblArticulo);
	     
	     JSpinner spinnerCantidad = new JSpinner();
	     spinnerCantidad.setRequestFocusEnabled(false);
	     spinnerCantidad.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
	     spinnerCantidad.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
	     spinnerCantidad.setFont(new Font("Segoe UI", Font.PLAIN, 16));
	     spinnerCantidad.setModel(new SpinnerNumberModel(1, 1, 999, 1));
	     spinnerCantidad.setBounds(21, 104, 187, 32);
	     panelFormulario.add(spinnerCantidad);
	     
	     JComboBox comboProductos = new JComboBox();
	     comboProductos.setFont(new Font("Segoe UI", Font.PLAIN, 16));
	     comboProductos.setModel(new DefaultComboBoxModel(new String[] {"Consola PlayStation 5", "Consola Xbox Series X", "Nintendo Switch", "Controlador inalámbrico DualSense para PlayStation 5", "Controlador inalámbrico Xbox Elite Series 2", "Joy-Con para Nintendo Switch", "Juego \"The Legend of Zelda: Breath of the Wild\" para Nintendo Switch", "Juego \"Cyberpunk 2077\" para PlayStation 4", "Juego \"Halo Infinite\" para Xbox Series X", "Auriculares con cancelación de ruido para gaming", "Teclado mecánico RGB para gaming", "Ratón gaming con sensor óptico de alta precisión", "Alfombrilla de ratón extragrande para gaming", "Silla gaming ergonómica", "Mesa gaming con soporte para varios monitores", "Monitor gaming de alta frecuencia de actualización (Hz)", "Tarjeta gráfica NVIDIA GeForce RTX 3080", "Tarjeta gráfica AMD Radeon RX 6800 XT", "Memoria RAM DDR4 de alta velocidad para gaming", "SSD NVMe de gran capacidad para almacenamiento de juegos", "Disco duro externo para almacenamiento adicional", "Cámara web Full HD para streaming de juegos", "Micrófono USB con cancelación de ruido para streaming", "Capturadora de video para grabar partidas de juego", "Mando arcade para juegos retro", "Figuras de acción de personajes de videojuegos", "Pósters y lienzos decorativos de videojuegos", "Guías y libros de arte de videojuegos populares", "Tarjetas de regalo para plataformas de juegos en línea", "Suscripciones a servicios de juegos en streaming como Xbox Game Pass o PlayStation Plus."}));
	     comboProductos.setBounds(21, 33, 854, 32);
	     panelFormulario.add(comboProductos);
	     
	     JLabel lblCantidad = new JLabel("Cantidad");
	     lblCantidad.setForeground(new Color(29, 53, 87));
	     lblCantidad.setFont(new Font("Helvetica", Font.BOLD, 18));
	     lblCantidad.setBounds(21, 82, 107, 22);
	     panelFormulario.add(lblCantidad);
	     
	     JLabel lblPrecio = new JLabel("Precio");
	     lblPrecio.setForeground(new Color(29, 53, 87));
	     lblPrecio.setFont(new Font("Helvetica", Font.BOLD, 18));
	     lblPrecio.setBounds(274, 82, 107, 22);
	     panelFormulario.add(lblPrecio);
	     
	     txtPrecio = new JTextField();
	     txtPrecio.setBounds(274, 104, 193, 32);
	     panelFormulario.add(txtPrecio);
	     txtPrecio.setColumns(10);
	     
	     textField_2 = new JTextField();
	     textField_2.setEnabled(false);
	     textField_2.setText("18%");
	     textField_2.setColumns(10);
	     textField_2.setBounds(15, 177, 193, 32);
	     panelFormulario.add(textField_2);

	     JLabel lblPrecio_1 = new JLabel("% ITBIS");
	     lblPrecio_1.setForeground(new Color(29, 53, 87));
	     lblPrecio_1.setFont(new Font("Helvetica", Font.BOLD, 18));
	     lblPrecio_1.setBounds(15, 155, 107, 22);
	     panelFormulario.add(lblPrecio_1);
	     
	     textField_3 = new JTextField();
	     textField_3.setEnabled(false);
	     textField_3.setText("0");
	     textField_3.setColumns(10);
	     textField_3.setBounds(274, 177, 193, 32);
	     panelFormulario.add(textField_3);

	     JLabel lblPrecio_2 = new JLabel("Existencia");
	     lblPrecio_2.setForeground(new Color(29, 53, 87));
	     lblPrecio_2.setFont(new Font("Helvetica", Font.BOLD, 18));
	     lblPrecio_2.setBounds(274, 155, 107, 22);
	     panelFormulario.add(lblPrecio_2);
	     
	     JButton btnNewButton = new JButton("Añadir");
	     btnNewButton.addActionListener(new ActionListener() {
	     	public void actionPerformed(ActionEvent e) {
	            DefaultTableModel model = (DefaultTableModel) tablaVentas.getModel();
	            
	            double precioProducto = Double.parseDouble(txtPrecio.getText());
	            int cantidadProducto = (int) spinnerCantidad.getValue();
	            String nombreProducto = (String) comboProductos.getSelectedItem();
	            
	            Object[] filaTabla = {cantidadProducto, nombreProducto, precioProducto};
	            
	            model.addRow(filaTabla);
	     	}
	     });
	     btnNewButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
	     btnNewButton.setFont(new Font("Sentic", Font.BOLD, 14));
	     btnNewButton.setForeground(new Color(255, 255, 255));
	     btnNewButton.setBorderPainted(false);
	     btnNewButton.setBackground(new Color(70, 130, 180));
	     btnNewButton.setBounds(654, 173, 99, 35);
	     panelFormulario.add(btnNewButton);
	     
	     JButton btnNewButton_2 = new JButton("");
	     btnNewButton_2.addActionListener(new ActionListener() {
	     	public void actionPerformed(ActionEvent e) {
	 
	            int filaSeleccionada = tablaVentas.getSelectedRow();
	            
	            if (filaSeleccionada != -1) {
	                DefaultTableModel model = (DefaultTableModel) tablaVentas.getModel();
	                model.removeRow(filaSeleccionada);
	            } else {
	                JOptionPane.showMessageDialog(null, "No hay una fila seleccionada, haz click en una para hacerlo.");
	            }
	     	}
	     });
	     btnNewButton_2.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
	     btnNewButton_2.setBorderPainted(false);
	     btnNewButton_2.setBackground(new Color(220, 20, 60));
	     btnNewButton_2.setIcon(new ImageIcon(VentanaPrincipal.class.getResource("/images/fluent_delete-16-filled.png")));
	     btnNewButton_2.setBounds(782, 174, 54, 35);
	     panelFormulario.add(btnNewButton_2);
	     
	     JLabel lblCantidad_1 = new JLabel("Total de articulos:");
	     lblCantidad_1.setForeground(new Color(29, 53, 87));
	     lblCantidad_1.setFont(new Font("Helvetica", Font.BOLD, 18));
	     lblCantidad_1.setBounds(21, 361, 162, 22);
	     panelFormulario.add(lblCantidad_1);
	     
	     JLabel lblCantidadVariable = new JLabel("X");
	     lblCantidadVariable.setForeground(new Color(29, 53, 87));
	     lblCantidadVariable.setFont(new Font("Helvetica", Font.BOLD, 18));
	     lblCantidadVariable.setBounds(193, 361, 72, 22);
	     panelFormulario.add(lblCantidadVariable);
	     
	     JScrollPane tablaVentasV = new JScrollPane();
	     tablaVentasV.setFont(new Font("Tahoma", Font.BOLD, 15));
	     tablaVentasV.setBounds(21, 216, 854, 116);
	     panelFormulario.add(tablaVentasV);
	     
	     tablaVentas = new JTable();
	     tablaVentas.setFont(new Font("Tahoma", Font.BOLD, 14));
	     tablaVentasV.setViewportView(tablaVentas);
	     tablaVentas.setModel(new DefaultTableModel(
	     	new Object[][] {
	     	},
	     	new String[] {
	     		"Cantidad", "Articulo", "Precio"
	     	}
	     ));

	     JLabel lblCantidad_1_1 = new JLabel("Datos cliente:");
	     lblCantidad_1_1.setForeground(new Color(29, 53, 87));
	     lblCantidad_1_1.setFont(new Font("Helvetica", Font.BOLD, 18));
	     lblCantidad_1_1.setBounds(50, 536, 162, 22);
	     PanelVentas.add(lblCantidad_1_1);
	     
	     JButton btnFormaDePago = new JButton("Forma de pago");
	     btnFormaDePago.setForeground(Color.WHITE);
	     btnFormaDePago.setFont(new Font("Segoe UI", Font.BOLD, 14));
	     btnFormaDePago.setBorderPainted(false);
	     btnFormaDePago.setBackground(new Color(32, 178, 170));
	     btnFormaDePago.setBounds(687, 681, 148, 48);
	     PanelVentas.add(btnFormaDePago);
	     
	     JButton btnEliminarFacturafinal = new JButton("");
	     btnEliminarFacturafinal.addActionListener(new ActionListener() {
	     	public void actionPerformed(ActionEvent e) {
	     	}
	     });
	     
	     //______________________________
	     txtPrecio.setText("$");

	     txtPrecio.addFocusListener(new FocusListener() {
	         public void focusGained(FocusEvent e) {
	             if (txtPrecio.getText().equals("$")) {
	                 txtPrecio.setText("");
	             }
	         }
	         
	         public void focusLost(FocusEvent e) {
	         }
	     });

	     //______________________________

	     
	     btnEliminarFacturafinal.setBorder(new LineBorder(new Color(220, 20, 60), 2, true));
	     btnEliminarFacturafinal.setIcon(new ImageIcon(VentanaPrincipal.class.getResource("/images/fluent_delete-16-filledrojo.png")));
	     btnEliminarFacturafinal.setBounds(864, 694, 39, 35);
	     PanelVentas.add(btnEliminarFacturafinal);
	     
	     JLabel lblNewLabel_1 = new JLabel("Nombre:");
	     lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 13));
	     lblNewLabel_1.setBounds(60, 568, 70, 13);
	     PanelVentas.add(lblNewLabel_1);
	     
	     txtNombreCliente = new JTextField();
	     txtNombreCliente.setBounds(126, 568, 178, 19);
	     PanelVentas.add(txtNombreCliente);
	     txtNombreCliente.setColumns(10);
	     
	     txtDireccionCliente = new JTextField();
	     txtDireccionCliente.setColumns(10);
	     txtDireccionCliente.setBounds(136, 597, 168, 19);
	     PanelVentas.add(txtDireccionCliente);
	     
	     JLabel lblCantidad_1_1_1 = new JLabel("SubTotal:");
	     lblCantidad_1_1_1.setForeground(new Color(29, 53, 87));
	     lblCantidad_1_1_1.setFont(new Font("Dialog", Font.BOLD, 18));
	     lblCantidad_1_1_1.setBounds(723, 541, 86, 22);
	     PanelVentas.add(lblCantidad_1_1_1);
	     
	     JLabel lblCantidad_1_1_1_1 = new JLabel("ITBIS: ");
	     lblCantidad_1_1_1_1.setForeground(new Color(29, 53, 87));
	     lblCantidad_1_1_1_1.setFont(new Font("Dialog", Font.BOLD, 18));
	     lblCantidad_1_1_1_1.setBounds(723, 573, 56, 22);
	     PanelVentas.add(lblCantidad_1_1_1_1);
	     
	     JLabel lblCantidad_1_1_1_1_1 = new JLabel("Total:");
	     lblCantidad_1_1_1_1_1.setForeground(new Color(29, 53, 87));
	     lblCantidad_1_1_1_1_1.setFont(new Font("Dialog", Font.BOLD, 18));
	     lblCantidad_1_1_1_1_1.setBounds(723, 605, 56, 22);
	     PanelVentas.add(lblCantidad_1_1_1_1_1);
	     
	     txtSubTotal = new JTextField();
	     txtSubTotal.setBackground(SystemColor.info);
	     txtSubTotal.setEditable(false);
	     txtSubTotal.setBounds(819, 541, 84, 19);
	     PanelVentas.add(txtSubTotal);
	     txtSubTotal.setColumns(10);
	     
	     txtITBIS = new JTextField();
	     txtITBIS.setEditable(false);
	     txtITBIS.setColumns(10);
	     txtITBIS.setBackground(SystemColor.info);
	     txtITBIS.setBounds(819, 578, 84, 19);
	     PanelVentas.add(txtITBIS);
	     
	     txtTotal = new JTextField();
	     txtTotal.setEditable(false);
	     txtTotal.setColumns(10);
	     txtTotal.setBackground(SystemColor.info);
	     txtTotal.setBounds(819, 610, 84, 19);
	     PanelVentas.add(txtTotal);
	     
	     JLabel lblNewLabel_1_1 = new JLabel("Cédula:");
	     lblNewLabel_1_1.setFont(new Font("Tahoma", Font.BOLD, 13));
	     lblNewLabel_1_1.setBounds(60, 600, 70, 13);
	     PanelVentas.add(lblNewLabel_1_1);
	}
}
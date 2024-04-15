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
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

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

import Class.Clientes;
import Class.DetalleFacturas;
import Class.Facturas;
import Class.Producto;
import DataBase.ClientesCRUD;
import DataBase.ConexionMySQL;
import DataBase.DetalleFacturasCRUD;
import DataBase.FacturaCRUD;
import DataBase.ProductoCRUD;

import java.awt.SystemColor;

public class Ventas extends JPanel{
	private JTextField textPrecio;
	private JTextField textITBIS;
	private JTextField textExistencia;
	private JTable tablaVentas;
	private JTextField textNombreCliente;
	private JTextField textDocumento;
	private JTextField txtSubTotal;
	private JTextField txtITBIS;
	private JTextField txtTotal;
	private JTextField textField_Fecha;
	private JTextField textProducto;
	private JTextField textIdProducto;
	
	private List<Producto> listaProductos = new ArrayList<>();
    private List<DetalleFacturas> detallesFactura = new ArrayList<>();
    private double subtotal = 0.0;
    private double total = 0.0;
    
	public Ventas() {
		setLayout(new BorderLayout(0, 0));
		setSize(960, 761);
		
		JPanel PanelVentas = new JPanel();
		PanelVentas.setBackground(Color.WHITE);
	    PanelVentas.setSize (960, 761);
	    add(PanelVentas, BorderLayout.CENTER);
	    PanelVentas.setLayout(null);
     
	    JLabel lblNewLabel = new JLabel("Factura");
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
	    lblArticulo.setBounds(173, 11, 107, 22);
	    panelFormulario.add(lblArticulo);
	     
	    JSpinner spinnerCantidad = new JSpinner();
	    spinnerCantidad.setRequestFocusEnabled(false);
	    spinnerCantidad.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
	    spinnerCantidad.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
	    spinnerCantidad.setFont(new Font("Segoe UI", Font.PLAIN, 16));
	    spinnerCantidad.setModel(new SpinnerNumberModel(1, 1, 999, 1));
	    spinnerCantidad.setBounds(21, 104, 187, 32);
	    panelFormulario.add(spinnerCantidad);
	     
	    JLabel lblCantidad = new JLabel("Cantidad");
	    lblCantidad.setForeground(new Color(29, 53, 87));
	    lblCantidad.setFont(new Font("Helvetica", Font.BOLD, 18));
	    lblCantidad.setBounds(21, 82, 107, 22);
	    panelFormulario.add(lblCantidad);
	     
	    JLabel lblPrecio = new JLabel("Precio");
	    lblPrecio.setForeground(new Color(29, 53, 87));
	    lblPrecio.setFont(new Font("Helvetica", Font.BOLD, 18));
	    lblPrecio.setBounds(238, 82, 107, 22);
	    panelFormulario.add(lblPrecio);
	     
	    textPrecio = new JTextField();
	    textPrecio.setEditable(false);
	    textPrecio.setBounds(238, 104, 193, 32);
	    panelFormulario.add(textPrecio);
	    textPrecio.setColumns(10);
	     
	    textITBIS = new JTextField();
	    textITBIS.setEnabled(false);
	    textITBIS.setText("18%");
	    textITBIS.setColumns(10);
	    textITBIS.setBounds(453, 104, 106, 32);
	    panelFormulario.add(textITBIS);

	    JLabel lblPrecio_1 = new JLabel("% ITBIS");
	    lblPrecio_1.setForeground(new Color(29, 53, 87));
	    lblPrecio_1.setFont(new Font("Helvetica", Font.BOLD, 18));
	    lblPrecio_1.setBounds(453, 82, 106, 22);
	    panelFormulario.add(lblPrecio_1);
	     
	    textExistencia = new JTextField();
	    textExistencia.setEnabled(false);
	    textExistencia.setText("0");
	    textExistencia.setColumns(10);
	    textExistencia.setBounds(592, 104, 193, 32);
	    panelFormulario.add(textExistencia);

	    JLabel lblPrecio_2 = new JLabel("Existencia");
	    lblPrecio_2.setForeground(new Color(29, 53, 87));
	    lblPrecio_2.setFont(new Font("Helvetica", Font.BOLD, 18));
	    lblPrecio_2.setBounds(592, 82, 107, 22);
	    panelFormulario.add(lblPrecio_2);
	     
	    JButton btnNewButton = new JButton("Añadir");
	    btnNewButton.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {
	            DefaultTableModel modelo = (DefaultTableModel) tablaVentas.getModel();
	            
	            double precioProducto = Double.parseDouble(textPrecio.getText());
	            int cantidadProducto = (int) spinnerCantidad.getValue();
	            String nombreProducto = (String) textProducto.getText();
	            int idProducto = Integer.parseInt(textIdProducto.getText());
	            
	            boolean productoExistente = false;
	            for (int i = 0; i < modelo.getRowCount(); i++) {
	                String nombre = (String) modelo.getValueAt(i, 1);
	                if (nombre.equals(nombreProducto)) {
	                    productoExistente = true;
	                    break;
	                }
	            }
	            
	            if (!productoExistente) {
	                Object[] filaTabla = {cantidadProducto, nombreProducto, precioProducto, idProducto};
	                modelo.addRow(filaTabla);
	                
	                double subtotal = 0.0;
	                for (int i = 0; i < modelo.getRowCount(); i++) {
	                    double precio = (double) modelo.getValueAt(i, 2);
	                    int cantidad = (int) modelo.getValueAt(i, 0);
	                    subtotal += precio * cantidad;
	                }
	                txtSubTotal.setText(String.format("%.2f", subtotal));

	                // Calcular ITBIS (18% del subtotal)
	                double itbis = subtotal * 0.18;
	                txtITBIS.setText(String.format("%.2f", itbis));

	                // Calcular total (subtotal + ITBIS)
	                double total = subtotal + itbis;
	                txtTotal.setText(String.format("%.2f", total));
	            } else {
	                JOptionPane.showMessageDialog(null, "El producto ya está en la tabla.");
	            }
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
	     			"Cantidad", "Articulo", "Precio", "id"
	     	}
	     ));
	     
	     JButton btnGuardar = new JButton("Guardar");
	     btnGuardar.setForeground(Color.WHITE);
	     btnGuardar.setFont(new Font("Segoe UI", Font.BOLD, 14));
	     btnGuardar.setBorderPainted(false);
	     btnGuardar.setBackground(new Color(32, 178, 170));
	     btnGuardar.setBounds(788, 697, 98, 35);
	     PanelVentas.add(btnGuardar);
	     
	     //______________________________
	     textPrecio.setText("$");
	     
	     textProducto = new JTextField();
	     textProducto.setColumns(10);
	     textProducto.setBounds(173, 39, 702, 32);
	     panelFormulario.add(textProducto);
	     
	     JLabel lblIdProducto = new JLabel("Id Producto");
	     lblIdProducto.setForeground(new Color(29, 53, 87));
	     lblIdProducto.setFont(new Font("Dialog", Font.BOLD, 18));
	     lblIdProducto.setBounds(21, 11, 107, 22);
	     panelFormulario.add(lblIdProducto);
	     
	     textIdProducto = new JTextField();
	     textIdProducto.setColumns(10);
	     textIdProducto.setBounds(21, 39, 107, 32);
	     panelFormulario.add(textIdProducto);

	     textPrecio.addFocusListener(new FocusListener() {
	         public void focusGained(FocusEvent e) {
	             if (textPrecio.getText().equals("$")) {
	                 textPrecio.setText("");
	             }
	         }
	         
	         public void focusLost(FocusEvent e) {
	         }
	     });
	     
	     JLabel lblCantidad_1_1_1 = new JLabel("SubTotal:");
	     lblCantidad_1_1_1.setForeground(new Color(29, 53, 87));
	     lblCantidad_1_1_1.setFont(new Font("Dialog", Font.BOLD, 18));
	     lblCantidad_1_1_1.setBounds(708, 543, 86, 22);
	     PanelVentas.add(lblCantidad_1_1_1);
	     
	     JLabel lblCantidad_1_1_1_1 = new JLabel("ITBIS: ");
	     lblCantidad_1_1_1_1.setHorizontalAlignment(SwingConstants.TRAILING);
	     lblCantidad_1_1_1_1.setForeground(new Color(29, 53, 87));
	     lblCantidad_1_1_1_1.setFont(new Font("Dialog", Font.BOLD, 18));
	     lblCantidad_1_1_1_1.setBounds(708, 575, 86, 22);
	     PanelVentas.add(lblCantidad_1_1_1_1);
	     
	     JLabel lblCantidad_1_1_1_1_1 = new JLabel("Total:");
	     lblCantidad_1_1_1_1_1.setHorizontalAlignment(SwingConstants.TRAILING);
	     lblCantidad_1_1_1_1_1.setForeground(new Color(29, 53, 87));
	     lblCantidad_1_1_1_1_1.setFont(new Font("Dialog", Font.BOLD, 18));
	     lblCantidad_1_1_1_1_1.setBounds(708, 607, 86, 22);
	     PanelVentas.add(lblCantidad_1_1_1_1_1);
	     
	     txtSubTotal = new JTextField();
	     txtSubTotal.setBackground(SystemColor.info);
	     txtSubTotal.setEditable(false);
	     txtSubTotal.setBounds(804, 541, 99, 19);
	     PanelVentas.add(txtSubTotal);
	     txtSubTotal.setColumns(10);
	     
	     txtITBIS = new JTextField();
	     txtITBIS.setEditable(false);
	     txtITBIS.setColumns(10);
	     txtITBIS.setBackground(SystemColor.info);
	     txtITBIS.setBounds(804, 578, 99, 19);
	     PanelVentas.add(txtITBIS);
	     
	     txtTotal = new JTextField();
	     txtTotal.setEditable(false);
	     txtTotal.setColumns(10);
	     txtTotal.setBackground(SystemColor.info);
	     txtTotal.setBounds(804, 610, 99, 19);
	     PanelVentas.add(txtTotal);
	     
	     JComboBox comboBox = new JComboBox();
	     comboBox.setModel(new DefaultComboBoxModel(new String[] {"Efectivo", "Tarjeta", "Transferencia", "Nota de credito"}));
	     comboBox.setBounds(756, 650, 147, 22);
	     PanelVentas.add(comboBox);
	     
	     JPanel panelDatosCliente = new JPanel();
	     panelDatosCliente.setBackground(Color.WHITE);
	     panelDatosCliente.setBounds(27, 523, 344, 154);
	     PanelVentas.add(panelDatosCliente);
	     panelDatosCliente.setLayout(null);
	     
 	     JLabel lblCantidad_1_1 = new JLabel("Datos cliente:");
 	     lblCantidad_1_1.setBounds(26, 21, 162, 22);
 	     panelDatosCliente.add(lblCantidad_1_1);
 	     lblCantidad_1_1.setForeground(new Color(29, 53, 87));
 	     lblCantidad_1_1.setFont(new Font("Helvetica", Font.BOLD, 18));
 	     
 	     JLabel lblNewLabel_1 = new JLabel("Nombre:");
 	     lblNewLabel_1.setBounds(50, 54, 70, 13);
 	     panelDatosCliente.add(lblNewLabel_1);
 	     lblNewLabel_1.setHorizontalAlignment(SwingConstants.TRAILING);
 	     lblNewLabel_1.setFont(new Font("Segoe UI", Font.BOLD, 16));
 	     
 	     textNombreCliente = new JTextField();
 	     textNombreCliente.setBounds(130, 54, 168, 19);
 	     panelDatosCliente.add(textNombreCliente);
 	     textNombreCliente.setFont(new Font("Segoe UI", Font.PLAIN, 12));
 	     textNombreCliente.setColumns(10);
 	     
 	     textDocumento = new JTextField();
 	     textDocumento.setBounds(131, 82, 168, 19);
 	     panelDatosCliente.add(textDocumento);
 	     textDocumento.setFont(new Font("Segoe UI", Font.PLAIN, 12));
 	     textDocumento.setColumns(10);
 	     
 	     JLabel lblNewLabel_1_1 = new JLabel("Documento:");
 	     lblNewLabel_1_1.setBounds(26, 85, 94, 13);
 	     panelDatosCliente.add(lblNewLabel_1_1);
 	     lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.TRAILING);
 	     lblNewLabel_1_1.setFont(new Font("Segoe UI", Font.BOLD, 16));
 	     
 	     JLabel lblNewLabel_1_1_1_1 = new JLabel("Fecha");
 	     lblNewLabel_1_1_1_1.setBounds(50, 115, 70, 13);
 	     panelDatosCliente.add(lblNewLabel_1_1_1_1);
 	     lblNewLabel_1_1_1_1.setHorizontalAlignment(SwingConstants.TRAILING);
 	     lblNewLabel_1_1_1_1.setFont(new Font("Segoe UI", Font.BOLD, 16));
 	     
 	     textField_Fecha = new JTextField();
 	     textField_Fecha.setBounds(130, 112, 168, 19);
 	     panelDatosCliente.add(textField_Fecha);
 	     textField_Fecha.setFont(new Font("Segoe UI", Font.PLAIN, 12));
 	     textField_Fecha.setColumns(10);
 	     
 	     btnGuardar.addActionListener(new ActionListener() {
 	    	 public void actionPerformed(ActionEvent e) {
 	    		 String nombreCliente = textNombreCliente.getText();
 	    		 String documentoCliente = textDocumento.getText();
 	    		 String fechaGeneracion = textField_Fecha.getText();
 	    		 String tipoPago = comboBox.getSelectedItem().toString();
 	    		 double totalFactura = Double.parseDouble(txtTotal.getText());

 	    		 int idFactura = FacturaCRUD.insertarFactura(nombreCliente, documentoCliente, fechaGeneracion, tipoPago, totalFactura);

 	    		 if (idFactura != -1) {
 	    			 DefaultTableModel modelo = (DefaultTableModel) tablaVentas.getModel();
 	    			 for (int i = 0; i < modelo.getRowCount(); i++) {
 	    				 int cantidad = (int) modelo.getValueAt(i, 0);
 	    				 String nombreProducto = (String) modelo.getValueAt(i, 1);
 	    				 double precio = (double) modelo.getValueAt(i, 2);
 	    				 int idProducto = (int) modelo.getValueAt(i, 3);

 	    				 DetalleFacturasCRUD.insertarDetalleFactura(idFactura, idProducto, nombreProducto, cantidad, precio);
 	    			 }

 	    			 JOptionPane.showMessageDialog(null, "Factura guardada exitosamente.");
 	    		 } else {
 	              	JOptionPane.showMessageDialog(null, "Error al guardar la factura.");
 	    		 }

 	           JOptionPane.showMessageDialog(null, "Factura guardada exitosamente.");
 	    	 }
 	     });
 	    
 	   textIdProducto.addActionListener(new ActionListener() {
 		    public void actionPerformed(ActionEvent e) {
 		        int idProducto = Integer.parseInt(textIdProducto.getText());
 		        
 		        Producto producto = ProductoCRUD.obtenerProductoPorId(idProducto);
 		        
 		        if (producto != null) {
 		        	textIdProducto.setText(String.valueOf(producto.getId()));
 		            textProducto.setText(producto.getNombre());
 		            textPrecio.setText(String.valueOf(producto.getPrecio()));
 		            textExistencia.setText(String.valueOf(producto.getCantidad()));
 		        } else {
 		            textProducto.setText("");
 		            textPrecio.setText("");
 		            textExistencia.setText("");
 		            JOptionPane.showMessageDialog(null, "Producto no encontrado");
 		        }
 		    }
 		});
 	   
 	  textDocumento.addActionListener(new ActionListener() {
 		    public void actionPerformed(ActionEvent e) {
 		        String documentoCliente = textDocumento.getText();
 		        
 		        Clientes cliente = ClientesCRUD.obtenerClientePorDocumento(documentoCliente);
 		        
 		        if (cliente != null) {
 		            textNombreCliente.setText(cliente.getNombre());
 		        } else {
 		            textNombreCliente.setText("");

 		            JOptionPane.showMessageDialog(null, "Cliente no encontrado");
 		        }
 		    }
 		});
	}
}
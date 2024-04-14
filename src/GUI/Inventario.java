package GUI;

import javax.swing.*;
import java.awt.Font;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.BorderLayout;
import javax.swing.border.LineBorder;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

import java.awt.ComponentOrientation;
import java.awt.SystemColor;
import javax.swing.table.DefaultTableModel;

import Class.Clientes;
import Class.Producto;
import DataBase.ClientesCRUD;
import DataBase.ProductoCRUD;

import javax.swing.border.BevelBorder;
import java.awt.event.ActionListener;
import java.util.List;
import java.awt.event.ActionEvent;


public class Inventario extends JPanel{
	private JTable table;
	private JTextField txtIdProducto;
	private JTextField txtNombreProducto;
	private JTextField txtReferenciaProducto;
	private JTextField txtExistencia;
	private JTextField txtPrecioProducto;
	private JTextField textField_4;
	private JTable table_1;
	
	public Inventario() {
		setLayout(new BorderLayout(0, 0));
		setSize(960, 761);

		JPanel panelInventario = new JPanel();
		panelInventario.setBackground(Color.WHITE);
		add(panelInventario, BorderLayout.CENTER);
		panelInventario.setLayout(null);

		JLabel lblInventario = new JLabel("Inventario");
		lblInventario.setIcon(new ImageIcon(Inventario.class.getResource("/images/material-symbols_inventory-rounded.png")));
		lblInventario.setIconTextGap(20);
		lblInventario.setForeground(new Color(29, 53, 87));
		lblInventario.setFont(new Font("Sentic", Font.BOLD, 42));
		lblInventario.setBounds(27, 24, 357, 61);
		panelInventario.add(lblInventario);
		
		JPanel panelFormulario = new JPanel();
		panelFormulario.setLayout(null);
		panelFormulario.setBackground(new Color(215, 215, 215));
		panelFormulario.setBounds(27, 96, 905, 256);
		panelInventario.add(panelFormulario);
		
		JLabel lblId = new JLabel("Id");
		lblId.setForeground(new Color(29, 53, 87));
		lblId.setFont(new Font("Helvetica", Font.BOLD, 18));
		lblId.setBounds(21, 17, 107, 22);
		panelFormulario.add(lblId);
		
		txtIdProducto = new JTextField();
		txtIdProducto.setFont(new Font("Segoe UI", Font.PLAIN, 14));
		txtIdProducto.setColumns(10);
		txtIdProducto.setBounds(20, 41, 235, 32);
		panelFormulario.add(txtIdProducto);
		
		txtNombreProducto = new JTextField();
		txtNombreProducto.setFont(new Font("Segoe UI", Font.PLAIN, 14));
		txtNombreProducto.setColumns(10);
		txtNombreProducto.setBounds(20, 116, 235, 32);
		panelFormulario.add(txtNombreProducto);
		
		JLabel lblNombre = new JLabel("Nombre");
		lblNombre.setForeground(new Color(29, 53, 87));
		lblNombre.setFont(new Font("Helvetica", Font.BOLD, 18));
		lblNombre.setBounds(21, 92, 107, 22);
		panelFormulario.add(lblNombre);
		
		txtReferenciaProducto = new JTextField();
		txtReferenciaProducto.setFont(new Font("Segoe UI", Font.PLAIN, 14));
		txtReferenciaProducto.setColumns(10);
		txtReferenciaProducto.setBounds(21, 191, 234, 32);
		panelFormulario.add(txtReferenciaProducto);
		
		JLabel lblReferencia = new JLabel("Referencia");
		lblReferencia.setForeground(new Color(29, 53, 87));
		lblReferencia.setFont(new Font("Helvetica", Font.BOLD, 18));
		lblReferencia.setBounds(22, 167, 107, 22);
		panelFormulario.add(lblReferencia);
		
		JLabel lblTipo = new JLabel("Tipo");
		lblTipo.setForeground(new Color(29, 53, 87));
		lblTipo.setFont(new Font("Helvetica", Font.BOLD, 18));
		lblTipo.setBounds(297, 17, 107, 22);
		panelFormulario.add(lblTipo);
		
		JLabel lblNombre_1 = new JLabel("Marca");
		lblNombre_1.setForeground(new Color(29, 53, 87));
		lblNombre_1.setFont(new Font("Helvetica", Font.BOLD, 18));
		lblNombre_1.setBounds(297, 92, 107, 22);
		panelFormulario.add(lblNombre_1);
		
		txtExistencia = new JTextField();
		txtExistencia.setFont(new Font("Segoe UI", Font.PLAIN, 14));
		txtExistencia.setColumns(10);
		txtExistencia.setBounds(297, 191, 235, 32);
		panelFormulario.add(txtExistencia);
		
		JLabel lblReferencia_1 = new JLabel("Existencia");
		lblReferencia_1.setForeground(new Color(29, 53, 87));
		lblReferencia_1.setFont(new Font("Helvetica", Font.BOLD, 18));
		lblReferencia_1.setBounds(298, 167, 107, 22);
		panelFormulario.add(lblReferencia_1);
		
		JComboBox comboTipoProducto = new JComboBox();
		comboTipoProducto.setFont(new Font("Segoe UI", Font.PLAIN, 14));
		comboTipoProducto.setModel(new DefaultComboBoxModel(new String[] {"Consola", "Video Juego", "Accesorio", "Tarjeta de regalo"}));
		comboTipoProducto.setBounds(297, 41, 235, 32);
		panelFormulario.add(comboTipoProducto);
		
		JComboBox comboMarcaProducto = new JComboBox();
		comboMarcaProducto.setFont(new Font("Segoe UI", Font.PLAIN, 14));
		comboMarcaProducto.setModel(new DefaultComboBoxModel(new String[] {"Sony", "Apple", "Samsung", "Nintendo"}));
		comboMarcaProducto.setSelectedIndex(1);
		comboMarcaProducto.setBounds(297, 121, 235, 32);
		panelFormulario.add(comboMarcaProducto);
		
		JButton btnNewButton = new JButton("Añadir");
		btnNewButton.setForeground(Color.WHITE);
		btnNewButton.setFont(new Font("Sentic", Font.BOLD, 14));
		btnNewButton.setBorderPainted(false);
		btnNewButton.setBackground(new Color(70, 130, 180));
		btnNewButton.setBounds(558, 188, 99, 35);
		panelFormulario.add(btnNewButton);
		
		JButton btnActualizar = new JButton("Actualizar");
		btnActualizar.setForeground(Color.WHITE);
		btnActualizar.setFont(new Font("Sentic", Font.BOLD, 14));
		btnActualizar.setBorderPainted(false);
		btnActualizar.setBackground(new Color(32, 178, 170));
		btnActualizar.setBounds(684, 186, 114, 35);
		panelFormulario.add(btnActualizar);
		
		JButton btnNewButton_2 = new JButton("");
		btnNewButton_2.setIcon(new ImageIcon(Inventario.class.getResource("/images/fluent_delete-16-filled.png")));
		btnNewButton_2.setBorderPainted(false);
		btnNewButton_2.setBackground(new Color(220, 20, 60));
		btnNewButton_2.setBounds(819, 186, 43, 35);
		panelFormulario.add(btnNewButton_2);
		
		txtPrecioProducto = new JTextField();
		txtPrecioProducto.setFont(new Font("Segoe UI", Font.PLAIN, 14));
		txtPrecioProducto.setColumns(10);
		txtPrecioProducto.setBounds(558, 41, 235, 32);
		panelFormulario.add(txtPrecioProducto);
		
		JLabel lblReferencia_1_1 = new JLabel("Precio");
		lblReferencia_1_1.setForeground(new Color(29, 53, 87));
		lblReferencia_1_1.setFont(new Font("Helvetica", Font.BOLD, 18));
		lblReferencia_1_1.setBounds(559, 17, 107, 22);
		panelFormulario.add(lblReferencia_1_1);
		
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(235, 235, 235)));
		panel.setBackground(new Color(245, 245, 245));
		panel.setBounds(27, 380, 905, 370);
		panelInventario.add(panel);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(215, 215, 215));
		panel_1.setBounds(0, 0, 905, 52);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		textField_4 = new JTextField();
		textField_4.setBounds(29, 11, 221, 30);
		panel_1.add(textField_4);
		textField_4.setColumns(10);
		
		JScrollPane tablaInventario = new JScrollPane();
		tablaInventario.setBounds(0, 72, 905, 235);
		panel.add(tablaInventario);
		
		table_1 = new JTable();
		tablaInventario.setViewportView(table_1);
		table_1.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Id", "Nombre", "Referencia", "Tipo", "Marca", "Existencia", "Precio"
			}
		));
		
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
	            
	            int idProducto = Integer.parseInt(txtIdProducto.getText());
	            String nombreProducto = txtNombreProducto.getText();
	            String referenciaProducto = txtReferenciaProducto.getText();
	            int existenciaProducto = Integer.parseInt(txtExistencia.getText());
	            String tipoProducto = (String) comboTipoProducto.getSelectedItem();
	            String marcaProducto = (String) comboMarcaProducto.getSelectedItem();
	            double precioProducto = Double.parseDouble(txtPrecioProducto.getText());
	            
	            Producto producto = new Producto(idProducto, nombreProducto, referenciaProducto, tipoProducto, marcaProducto, existenciaProducto, precioProducto);
		        ProductoCRUD.insertarProducto(producto);
	            
	            DefaultTableModel modelo = (DefaultTableModel) table_1.getModel();
	            Object[] filasTabla = {idProducto, nombreProducto, referenciaProducto, existenciaProducto, tipoProducto, marcaProducto, precioProducto};
	            modelo.addRow(filasTabla);
			}
		});
		
		btnActualizar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int selectedRow = table_1.getSelectedRow();
		        if (selectedRow != -1) {
		            DefaultTableModel modelo = (DefaultTableModel) table_1.getModel();
		            int idProducto = Integer.parseInt(txtIdProducto.getText());
					String nombreProducto = txtNombreProducto.getText();
					String referenciaProducto = txtReferenciaProducto.getText();
					String tipoProducto = (String) comboTipoProducto.getSelectedItem();
					String marcaProducto = (String) comboMarcaProducto.getSelectedItem();
					int cantidadProducto = Integer.parseInt(txtExistencia.getText());
					double precioProducto = Double.parseDouble(txtPrecioProducto.getText());

		            modelo.setValueAt(idProducto, selectedRow, 0);
		            modelo.setValueAt(nombreProducto, selectedRow, 1);
		            modelo.setValueAt(referenciaProducto, selectedRow, 2);
		            modelo.setValueAt(tipoProducto, selectedRow, 3);
		            modelo.setValueAt(marcaProducto, selectedRow, 4);
		            modelo.setValueAt(cantidadProducto, selectedRow, 5);
		            modelo.setValueAt(precioProducto, selectedRow, 6);

		            Producto producto = new Producto(idProducto, nombreProducto, referenciaProducto, tipoProducto, marcaProducto, cantidadProducto, precioProducto);
		            ProductoCRUD.actualizarProducto(producto);

		            JOptionPane.showMessageDialog(null, "Producto actualizado correctamente.", "Actualización exitosa", JOptionPane.INFORMATION_MESSAGE);
		        } else {
		            JOptionPane.showMessageDialog(null, "Por favor, seleccione una fila para actualizar.", "Error", JOptionPane.ERROR_MESSAGE);
		        }
			}
		});
		
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int selectedRow = table_1.getSelectedRow();
		        
		        if (selectedRow != -1) {
		            DefaultTableModel modelo = (DefaultTableModel) table_1.getModel();
		            
		            int idProducto = (int) modelo.getValueAt(selectedRow, 0);
		            
		            modelo.removeRow(selectedRow);
		            
		            ProductoCRUD.eliminarProducto(idProducto);
		        } else {
		            JOptionPane.showMessageDialog(null, "Por favor, seleccione una fila para eliminar.", "Error", JOptionPane.ERROR_MESSAGE);
		        }
			}
		});
		
		table_1.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
		    @Override
		    public void valueChanged(ListSelectionEvent e) {
		        if (!e.getValueIsAdjusting()) {
		            int selectedRow = table_1.getSelectedRow();
		            if (selectedRow != -1) {
		                DefaultTableModel modelo = (DefaultTableModel) table_1.getModel();
		                Object idObject = modelo.getValueAt(selectedRow, 0);
		                Object cantidadObject = modelo.getValueAt(selectedRow, 5);
		                Object precioObject = modelo.getValueAt(selectedRow, 6);

		                if (idObject instanceof Integer && cantidadObject instanceof Integer && precioObject instanceof Double) {
		                    int idProducto = (int) idObject;
		                    String nombreProducto = (String) modelo.getValueAt(selectedRow, 1);
		                    String referenciaProducto = (String) modelo.getValueAt(selectedRow, 2);
		                    String tipoProducto = (String) modelo.getValueAt(selectedRow, 3);
		                    String marcaProducto = (String) modelo.getValueAt(selectedRow, 4);
		                    int cantidadProducto = (int) cantidadObject;
		                    double precioProducto = (double) precioObject;

		                    txtIdProducto.setText(String.valueOf(idProducto));
		                    txtNombreProducto.setText(nombreProducto);
		                    txtReferenciaProducto.setText(referenciaProducto);
		                    comboTipoProducto.setSelectedItem(tipoProducto);
		                    comboMarcaProducto.setSelectedItem(marcaProducto);
		                    txtExistencia.setText(String.valueOf(cantidadProducto));
		                    txtPrecioProducto.setText(String.valueOf(precioProducto));
		                } else {
		                    JOptionPane.showMessageDialog(null, "Error al obtener datos de la tabla. Tipo de dato no esperado.", "Error", JOptionPane.ERROR_MESSAGE);
		                }
		            }
		        }
		    }
		});
		
		agregarTablaProducto();
	}
	
	private void agregarTablaProducto() {
        DefaultTableModel modelo = (DefaultTableModel) table_1.getModel();
        modelo.setRowCount(0);
        
        List<Producto> producto = ProductoCRUD.mostrarProducto();
        
        for (Producto productos : producto) {
            Object[] fila = {productos.getId(), productos.getNombre(), productos.getReferencia(), productos.getTipo(), productos.getMarca(), 
            		productos.getCantidad(), productos.getPrecio()};
            modelo.addRow(fila);
        }
	}
}
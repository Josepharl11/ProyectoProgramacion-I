package GUI;

import javax.swing.*;
import java.awt.Font;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.BorderLayout;
import javax.swing.border.LineBorder;
import java.awt.ComponentOrientation;
import java.awt.SystemColor;
import javax.swing.table.DefaultTableModel;
import javax.swing.border.BevelBorder;
import java.awt.event.ActionListener;
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
		txtIdProducto.setColumns(10);
		txtIdProducto.setBounds(20, 41, 235, 32);
		panelFormulario.add(txtIdProducto);
		
		txtNombreProducto = new JTextField();
		txtNombreProducto.setColumns(10);
		txtNombreProducto.setBounds(20, 116, 235, 32);
		panelFormulario.add(txtNombreProducto);
		
		JLabel lblNombre = new JLabel("Nombre");
		lblNombre.setForeground(new Color(29, 53, 87));
		lblNombre.setFont(new Font("Helvetica", Font.BOLD, 18));
		lblNombre.setBounds(21, 92, 107, 22);
		panelFormulario.add(lblNombre);
		
		txtReferenciaProducto = new JTextField();
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
		txtExistencia.setColumns(10);
		txtExistencia.setBounds(297, 191, 235, 32);
		panelFormulario.add(txtExistencia);
		
		JLabel lblReferencia_1 = new JLabel("Existencia");
		lblReferencia_1.setForeground(new Color(29, 53, 87));
		lblReferencia_1.setFont(new Font("Helvetica", Font.BOLD, 18));
		lblReferencia_1.setBounds(298, 167, 107, 22);
		panelFormulario.add(lblReferencia_1);
		
		JComboBox comboTipoProducto = new JComboBox();
		comboTipoProducto.setModel(new DefaultComboBoxModel(new String[] {"Consola", "Video Juego", "Accesorio", "Tarjeta de regalo"}));
		comboTipoProducto.setBounds(297, 41, 235, 32);
		panelFormulario.add(comboTipoProducto);
		
		JComboBox comboMarcaProducto = new JComboBox();
		comboMarcaProducto.setModel(new DefaultComboBoxModel(new String[] {"Sony", "Apple", "Samsung", "Nintendo"}));
		comboMarcaProducto.setSelectedIndex(1);
		comboMarcaProducto.setBounds(297, 121, 235, 32);
		panelFormulario.add(comboMarcaProducto);
		
		JButton btnNewButton = new JButton("Añadir");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
	            DefaultTableModel model = (DefaultTableModel) table_1.getModel();
	            
	            String nombreProducto = txtNombreProducto.getText();
	            int IdProducto = Integer.parseInt(txtIdProducto.getText());
	            String referenciaProducto = txtReferenciaProducto.getText();
	            String existenciaProducto = txtExistencia.getText();
	            String tipoProducto = (String) comboTipoProducto.getSelectedItem();
	            String marcaProducto = (String) comboMarcaProducto.getSelectedItem();
	            double precioProducto = Double.parseDouble(txtPrecioProducto.getText());
	           

	            
	           Object[] filasTabla = {nombreProducto, IdProducto, referenciaProducto, existenciaProducto, tipoProducto, marcaProducto, precioProducto};

	           model.addRow(filasTabla);
			}
		});
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
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int selectedRow = table_1.getSelectedRow();
		        
		        if (selectedRow != -1) {
		            DefaultTableModel model = (DefaultTableModel) table_1.getModel();
		            
		            model.removeRow(selectedRow);
		        } else {
		            JOptionPane.showMessageDialog(null, "Por favor, seleccione una fila para eliminar.", "Error", JOptionPane.ERROR_MESSAGE);
		        }
			}
		});
		btnNewButton_2.setIcon(new ImageIcon(Inventario.class.getResource("/images/fluent_delete-16-filled.png")));
		btnNewButton_2.setBorderPainted(false);
		btnNewButton_2.setBackground(new Color(220, 20, 60));
		btnNewButton_2.setBounds(819, 186, 43, 35);
		panelFormulario.add(btnNewButton_2);
		
		txtPrecioProducto = new JTextField();
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
	}
}
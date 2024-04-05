package GUI;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.ComponentOrientation;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableModel;

public class Inventario extends JPanel{
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTable table;
	public Inventario() {
		setLayout(null);
		
		JPanel panel_2 = new JPanel();
		panel_2.setLayout(null);
		panel_2.setBounds(222, -65, 956, 820);
		add(panel_2);
		
		JLabel lblNewLabel = new JLabel("Ventas");
		lblNewLabel.setIconTextGap(20);
		lblNewLabel.setForeground(new Color(29, 53, 87));
		lblNewLabel.setFont(new Font("Sentic", Font.BOLD, 42));
		lblNewLabel.setBounds(27, 24, 286, 61);
		panel_2.add(lblNewLabel);
		
		JScrollPane scrollPane_formulario = new JScrollPane();
		scrollPane_formulario.setBounds(27, 111, 907, 401);
		panel_2.add(scrollPane_formulario);
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBackground(new Color(215, 215, 215));
		scrollPane_formulario.setViewportView(panel_1);
		
		JLabel lblArticulo = new JLabel("Articulo");
		lblArticulo.setForeground(new Color(29, 53, 87));
		lblArticulo.setFont(new Font("Helvetica", Font.BOLD, 18));
		lblArticulo.setBounds(21, 11, 107, 22);
		panel_1.add(lblArticulo);
		
		JSpinner spinner = new JSpinner();
		spinner.setRequestFocusEnabled(false);
		spinner.setFont(new Font("Segoe UI", Font.PLAIN, 16));
		spinner.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
		spinner.setBounds(21, 104, 187, 32);
		panel_1.add(spinner);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setFont(new Font("Segoe UI", Font.PLAIN, 16));
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
		textField.setColumns(10);
		textField.setBounds(274, 104, 193, 32);
		panel_1.add(textField);
		
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
		textField_2.setText("18%");
		textField_2.setEnabled(false);
		textField_2.setColumns(10);
		textField_2.setBounds(15, 177, 193, 32);
		panel_1.add(textField_2);
		
		JLabel lblPrecio_1 = new JLabel("% ITBIS");
		lblPrecio_1.setForeground(new Color(29, 53, 87));
		lblPrecio_1.setFont(new Font("Helvetica", Font.BOLD, 18));
		lblPrecio_1.setBounds(15, 155, 107, 22);
		panel_1.add(lblPrecio_1);
		
		textField_3 = new JTextField();
		textField_3.setText("0");
		textField_3.setEnabled(false);
		textField_3.setColumns(10);
		textField_3.setBounds(274, 177, 193, 32);
		panel_1.add(textField_3);
		
		JLabel lblPrecio_2 = new JLabel("Existencia");
		lblPrecio_2.setForeground(new Color(29, 53, 87));
		lblPrecio_2.setFont(new Font("Helvetica", Font.BOLD, 18));
		lblPrecio_2.setBounds(274, 155, 107, 22);
		panel_1.add(lblPrecio_2);
		
		JButton btnNewButton = new JButton("Añadir");
		btnNewButton.setForeground(Color.WHITE);
		btnNewButton.setFont(new Font("Sentic", Font.BOLD, 14));
		btnNewButton.setBorderPainted(false);
		btnNewButton.setBackground(new Color(70, 130, 180));
		btnNewButton.setBounds(505, 174, 99, 35);
		panel_1.add(btnNewButton);
		
		JButton btnActualizar = new JButton("Actualizar");
		btnActualizar.setForeground(Color.WHITE);
		btnActualizar.setFont(new Font("Sentic", Font.BOLD, 14));
		btnActualizar.setBorderPainted(false);
		btnActualizar.setBackground(new Color(32, 178, 170));
		btnActualizar.setBounds(631, 172, 114, 35);
		panel_1.add(btnActualizar);
		
		JButton btnNewButton_2 = new JButton("");
		btnNewButton_2.setBorderPainted(false);
		btnNewButton_2.setBackground(new Color(220, 20, 60));
		btnNewButton_2.setBounds(782, 174, 54, 35);
		panel_1.add(btnNewButton_2);
		
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
		
		table = new JTable();
		table.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		table.setBounds(40, 237, 835, 132);
		panel_1.add(table);
		
		table = new JTable();
	     table.setVisible(true);
	     table.setModel(new DefaultTableModel(
	     	new Object[][] {
	     		{null, null, null, null, null, null, null, null},
	     		
	     	},
	     	new String[] {
	     		"Articulo", "New column", "New column", "New column", "New column", "New column", "New column", "New column"
	     	}
	     ));
	     table.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		
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
		btnEliminarFacturafinal.setBorder(new LineBorder(new Color(220, 20, 60), 2, true));
		btnEliminarFacturafinal.setBounds(864, 694, 39, 35);
		panel_2.add(btnEliminarFacturafinal);
		
		
		
	}
}

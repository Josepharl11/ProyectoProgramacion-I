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
	private JTextField textField_1;
	private JTextField textField;
	private JTextField textField_2;
	private JTextField textField_5;
	private JTextField textField_3;
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
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(20, 41, 235, 32);
		panelFormulario.add(textField_1);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(20, 116, 235, 32);
		panelFormulario.add(textField);
		
		JLabel lblNombre = new JLabel("Nombre");
		lblNombre.setForeground(new Color(29, 53, 87));
		lblNombre.setFont(new Font("Helvetica", Font.BOLD, 18));
		lblNombre.setBounds(21, 92, 107, 22);
		panelFormulario.add(lblNombre);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(21, 191, 234, 32);
		panelFormulario.add(textField_2);
		
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
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(297, 191, 235, 32);
		panelFormulario.add(textField_5);
		
		JLabel lblReferencia_1 = new JLabel("Existencia");
		lblReferencia_1.setForeground(new Color(29, 53, 87));
		lblReferencia_1.setFont(new Font("Helvetica", Font.BOLD, 18));
		lblReferencia_1.setBounds(298, 167, 107, 22);
		panelFormulario.add(lblReferencia_1);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Consola", "Video Juego", "Accesorio", "Tarjeta de regalo"}));
		comboBox.setBounds(297, 41, 235, 32);
		panelFormulario.add(comboBox);
		
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
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"Sony", "Microsoft", "PlayStation", "Xbox", "Nintendo"}));
		comboBox_1.setBounds(297, 116, 235, 32);
		panelFormulario.add(comboBox_1);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(558, 41, 235, 32);
		panelFormulario.add(textField_3);
		
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
		
		JButton btnImprimirFactura = new JButton("Imprimir Factura");
		btnImprimirFactura.setForeground(Color.WHITE);
		btnImprimirFactura.setFont(new Font("Dialog", Font.BOLD, 14));
		btnImprimirFactura.setBorderPainted(false);
		btnImprimirFactura.setBackground(new Color(70, 130, 180));
		btnImprimirFactura.setBounds(730, 10, 147, 36);
		panel_1.add(btnImprimirFactura);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(35, 63, 846, 281);
		panel.add(scrollPane);
		
		table_1 = new JTable();
		table_1.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Id", "Nombre", "Referencia", "Tipo", "Marca", "Existencia", "Precio"
			}
		));
		table_1.getColumnModel().getColumn(2).setResizable(false);
		scrollPane.setViewportView(table_1);
	}
}
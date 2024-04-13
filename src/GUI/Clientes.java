package GUI;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.*;
import java.awt.Font;
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableModel;

public class Clientes extends JPanel {
	private JTextField textField;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTable tablaClientes;
	private JTextField textField_1;
	private JTextField textFieldFecha;

	public Clientes(){
		setLayout(new BorderLayout(0, 0));
		setSize(960, 761);
		
		JPanel panelClientes = new JPanel();
		panelClientes.setBackground(Color.WHITE);
		add(panelClientes, BorderLayout.CENTER);
		panelClientes.setLayout(null);
		
		JLabel lblClientes = new JLabel("Clientes");
		lblClientes.setIcon(new ImageIcon(Clientes.class.getResource("/images/fa-solid_ClientesPrincipal.png")));
		lblClientes.setIconTextGap(20);
		lblClientes.setForeground(new Color(29, 53, 87));
		lblClientes.setFont(new Font("Sentic", Font.BOLD, 42));
		lblClientes.setBounds(21, 22, 357, 61);
		panelClientes.add(lblClientes);
		
		JPanel panelFormulario = new JPanel();
		panelFormulario.setLayout(null);
		panelFormulario.setBackground(new Color(215, 215, 215));
		panelFormulario.setBounds(23, 102, 910, 302);
		panelClientes.add(panelFormulario);
		
		JLabel lblNombre = new JLabel("Nombre");
		lblNombre.setForeground(new Color(29, 53, 87));
		lblNombre.setFont(new Font("Dialog", Font.BOLD, 18));
		lblNombre.setBounds(21, 17, 107, 22);
		panelFormulario.add(lblNombre);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(20, 41, 235, 32);
		panelFormulario.add(textField);
		
		JLabel lblTipoCliente = new JLabel("Tipo de cleinte");
		lblTipoCliente.setForeground(new Color(29, 53, 87));
		lblTipoCliente.setFont(new Font("Dialog", Font.BOLD, 18));
		lblTipoCliente.setBounds(298, 159, 153, 22);
		panelFormulario.add(lblTipoCliente);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(21, 259, 512, 32);
		panelFormulario.add(textField_2);
		
		JLabel lblReferencia = new JLabel("Dirección");
		lblReferencia.setForeground(new Color(29, 53, 87));
		lblReferencia.setFont(new Font("Dialog", Font.BOLD, 18));
		lblReferencia.setBounds(22, 235, 107, 22);
		panelFormulario.add(lblReferencia);
		
		JButton btnNewButton = new JButton("Añadir");
		btnNewButton.setForeground(Color.WHITE);
		btnNewButton.setFont(new Font("Dialog", Font.BOLD, 14));
		btnNewButton.setBorderPainted(false);
		btnNewButton.setBackground(new Color(70, 130, 180));
		btnNewButton.setBounds(559, 256, 99, 35);
		panelFormulario.add(btnNewButton);
		
		JButton btnActualizar = new JButton("Actualizar");
		btnActualizar.setForeground(Color.WHITE);
		btnActualizar.setFont(new Font("Dialog", Font.BOLD, 14));
		btnActualizar.setBorderPainted(false);
		btnActualizar.setBackground(new Color(32, 178, 170));
		btnActualizar.setBounds(685, 254, 114, 35);
		panelFormulario.add(btnActualizar);
		
		JButton btnNewButton_2 = new JButton("");
		btnNewButton_2.setIcon(new ImageIcon(Clientes.class.getResource("/images/fluent_delete-16-filled.png")));
		btnNewButton_2.setBorderPainted(false);
		btnNewButton_2.setBackground(new Color(220, 20, 60));
		btnNewButton_2.setBounds(820, 254, 43, 35);
		panelFormulario.add(btnNewButton_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(298, 117, 235, 31);
		panelFormulario.add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(298, 41, 235, 32);
		panelFormulario.add(textField_4);
		
		JLabel lblEmail = new JLabel("Email");
		lblEmail.setForeground(new Color(29, 53, 87));
		lblEmail.setFont(new Font("Dialog", Font.BOLD, 18));
		lblEmail.setBounds(299, 92, 107, 22);
		panelFormulario.add(lblEmail);
		
		JLabel lblTelfono = new JLabel("Teléfono");
		lblTelfono.setForeground(new Color(29, 53, 87));
		lblTelfono.setFont(new Font("Dialog", Font.BOLD, 18));
		lblTelfono.setBounds(299, 17, 107, 22);
		panelFormulario.add(lblTelfono);
		
		JLabel lblVendedor = new JLabel("Vendedor");
		lblVendedor.setForeground(new Color(29, 53, 87));
		lblVendedor.setFont(new Font("Dialog", Font.BOLD, 18));
		lblVendedor.setBounds(581, 19, 175, 22);
		panelFormulario.add(lblVendedor);
		
		JComboBox comboBoxTipoCliente = new JComboBox();
		comboBoxTipoCliente.setModel(new DefaultComboBoxModel(new String[] {"Personal", "Empresarial", "Gubernamental", "Regimen especial", "Empleado"}));
		comboBoxTipoCliente.setBounds(298, 185, 234, 29);
		panelFormulario.add(comboBoxTipoCliente);
		
		JComboBox comboTipoDocumento = new JComboBox();
		comboTipoDocumento.setModel(new DefaultComboBoxModel(new String[] {"RNC", "Cedula", "Pasaporte"}));
		comboTipoDocumento.setBounds(21, 117, 231, 29);
		panelFormulario.add(comboTipoDocumento);
		
		JLabel lblTipoDeDocumento = new JLabel("Tipo de documento");
		lblTipoDeDocumento.setForeground(new Color(29, 53, 87));
		lblTipoDeDocumento.setFont(new Font("Helvetica", Font.BOLD, 18));
		lblTipoDeDocumento.setBounds(21, 92, 182, 22);
		panelFormulario.add(lblTipoDeDocumento);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(21, 185, 231, 29);
		panelFormulario.add(textField_1);
		
		JLabel lblDocumento = new JLabel("Documento");
		lblDocumento.setForeground(new Color(29, 53, 87));
		lblDocumento.setFont(new Font("Helvetica", Font.BOLD, 18));
		lblDocumento.setBounds(21, 159, 182, 22);
		panelFormulario.add(lblDocumento);
		
		JComboBox comboBox_Vendedor = new JComboBox();
		comboBox_Vendedor.setBounds(581, 42, 234, 30);
		panelFormulario.add(comboBox_Vendedor);
		
		JComboBox comboBoxEstado = new JComboBox();
		comboBoxEstado.setModel(new DefaultComboBoxModel(new String[] {"Activo", "Inactivo"}));
		comboBoxEstado.setBounds(581, 118, 234, 30);
		panelFormulario.add(comboBoxEstado);
		
		JLabel lblEstado = new JLabel("Estado");
		lblEstado.setForeground(new Color(29, 53, 87));
		lblEstado.setFont(new Font("Dialog", Font.BOLD, 18));
		lblEstado.setBounds(581, 95, 175, 22);
		panelFormulario.add(lblEstado);
		
		JLabel lblFechaDeIngreso = new JLabel("Fecha de ingreso");
		lblFechaDeIngreso.setForeground(new Color(29, 53, 87));
		lblFechaDeIngreso.setFont(new Font("Dialog", Font.BOLD, 18));
		lblFechaDeIngreso.setBounds(581, 161, 175, 22);
		panelFormulario.add(lblFechaDeIngreso);
		
		textFieldFecha = new JTextField();
		textFieldFecha.setColumns(10);
		textFieldFecha.setBounds(581, 184, 235, 31);
		panelFormulario.add(textFieldFecha);
		
		JPanel panelTabla = new JPanel();
		panelTabla.setLayout(null);
		panelTabla.setBorder(new LineBorder(new Color(235, 235, 235)));
		panelTabla.setBackground(new Color(245, 245, 245));
		panelTabla.setBounds(23, 425, 911, 325);
		panelClientes.add(panelTabla);
		
		JPanel TopBar = new JPanel();
		TopBar.setLayout(null);
		TopBar.setBackground(new Color(215, 215, 215));
		TopBar.setBounds(0, 0, 911, 52);
		panelTabla.add(TopBar);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(27, 63, 860, 251);
		panelTabla.add(scrollPane);
		
		tablaClientes = new JTable();
		tablaClientes.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"New column", "New column", "New column", "New column", "New column", "New column", "New column", "New column"
			}
		));
		scrollPane.setViewportView(tablaClientes);
		tablaClientes.setAlignmentX(0.0f);
	}
}

package GUI;

import javax.swing.*;
import java.awt.Font;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.BorderLayout;
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableModel;


public class Usuarios extends JPanel{
	private JTable table;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTable table_1;
	public Usuarios() {
		setLayout(new BorderLayout(0, 0));
		setSize(960, 761);
		
		JPanel panelUsuarios = new JPanel();
		panelUsuarios.setBackground(Color.WHITE);
		add(panelUsuarios, BorderLayout.CENTER);
		panelUsuarios.setLayout(null);
		
		JLabel lblUsuarios = new JLabel("Usuarios");
		lblUsuarios.setIcon(new ImageIcon(Usuarios.class.getResource("/images/mdi_user.png")));
		lblUsuarios.setIconTextGap(20);
		lblUsuarios.setForeground(new Color(29, 53, 87));
		lblUsuarios.setFont(new Font("Sentic", Font.BOLD, 42));
		lblUsuarios.setBounds(26, 26, 357, 45);
		panelUsuarios.add(lblUsuarios);
		
		JPanel panelFormularioUsuarios = new JPanel();
		panelFormularioUsuarios.setBounds(26, 99, 911, 250);
		panelUsuarios.add(panelFormularioUsuarios);
		panelFormularioUsuarios.setLayout(null);
		
		JLabel lblNombre = new JLabel("Nombre");
		lblNombre.setForeground(new Color(29, 53, 87));
		lblNombre.setFont(new Font("Helvetica", Font.BOLD, 18));
		lblNombre.setBounds(10, 11, 107, 22);
		panelFormularioUsuarios.add(lblNombre);
		
		textField = new JTextField();
		textField.setBounds(10, 33, 231, 29);
		panelFormularioUsuarios.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(10, 106, 231, 29);
		panelFormularioUsuarios.add(textField_1);
		
		JLabel lblContrasea = new JLabel("Contraseña");
		lblContrasea.setForeground(new Color(29, 53, 87));
		lblContrasea.setFont(new Font("Helvetica", Font.BOLD, 18));
		lblContrasea.setBounds(10, 84, 107, 22);
		panelFormularioUsuarios.add(lblContrasea);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(10, 178, 231, 29);
		panelFormularioUsuarios.add(textField_2);
		
		JLabel lblNombre_1_1 = new JLabel("Puesto");
		lblNombre_1_1.setForeground(new Color(29, 53, 87));
		lblNombre_1_1.setFont(new Font("Helvetica", Font.BOLD, 18));
		lblNombre_1_1.setBounds(10, 156, 107, 22);
		panelFormularioUsuarios.add(lblNombre_1_1);
		
		JLabel lblTipoDeDocumento = new JLabel("Tipo de documento");
		lblTipoDeDocumento.setForeground(new Color(29, 53, 87));
		lblTipoDeDocumento.setFont(new Font("Helvetica", Font.BOLD, 18));
		lblTipoDeDocumento.setBounds(268, 11, 182, 22);
		panelFormularioUsuarios.add(lblTipoDeDocumento);
		
		JLabel lblNombre_1_2 = new JLabel("Nombre de acceso");
		lblNombre_1_2.setForeground(new Color(29, 53, 87));
		lblNombre_1_2.setFont(new Font("Helvetica", Font.BOLD, 18));
		lblNombre_1_2.setBounds(268, 84, 182, 22);
		panelFormularioUsuarios.add(lblNombre_1_2);
		
		JLabel lblNombre_1_1_1 = new JLabel("Puesto");
		lblNombre_1_1_1.setForeground(new Color(29, 53, 87));
		lblNombre_1_1_1.setFont(new Font("Helvetica", Font.BOLD, 18));
		lblNombre_1_1_1.setBounds(268, 156, 107, 22);
		panelFormularioUsuarios.add(lblNombre_1_1_1);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Cedula", "Pasaporte"}));
		comboBox.setBounds(268, 36, 231, 29);
		panelFormularioUsuarios.add(comboBox);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"Empleado", "Administrador"}));
		comboBox_1.setBounds(268, 106, 231, 29);
		panelFormularioUsuarios.add(comboBox_1);
		
		textField_3 = new JTextField();
		textField_3.setBounds(268, 178, 231, 29);
		panelFormularioUsuarios.add(textField_3);
		textField_3.setColumns(10);
		
		JLabel lblDocumento = new JLabel("Documento");
		lblDocumento.setForeground(new Color(29, 53, 87));
		lblDocumento.setFont(new Font("Helvetica", Font.BOLD, 18));
		lblDocumento.setBounds(539, 11, 182, 22);
		panelFormularioUsuarios.add(lblDocumento);
		
		JLabel lblTelefono = new JLabel("Telefono");
		lblTelefono.setForeground(new Color(29, 53, 87));
		lblTelefono.setFont(new Font("Helvetica", Font.BOLD, 18));
		lblTelefono.setBounds(539, 89, 182, 22);
		panelFormularioUsuarios.add(lblTelefono);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(539, 37, 231, 29);
		panelFormularioUsuarios.add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(539, 110, 231, 29);
		panelFormularioUsuarios.add(textField_5);
		
		JButton btnNewButton = new JButton("Añadir");
		btnNewButton.setForeground(Color.WHITE);
		btnNewButton.setFont(new Font("Sentic", Font.BOLD, 14));
		btnNewButton.setBorderPainted(false);
		btnNewButton.setBackground(new Color(70, 130, 180));
		btnNewButton.setBounds(539, 176, 99, 35);
		panelFormularioUsuarios.add(btnNewButton);
		
		JButton btnActualizar = new JButton("Actualizar");
		btnActualizar.setForeground(Color.WHITE);
		btnActualizar.setFont(new Font("Sentic", Font.BOLD, 14));
		btnActualizar.setBorderPainted(false);
		btnActualizar.setBackground(new Color(32, 178, 170));
		btnActualizar.setBounds(665, 174, 114, 35);
		panelFormularioUsuarios.add(btnActualizar);
		
		JButton btnNewButton_2 = new JButton("");
		btnNewButton_2.setIcon(new ImageIcon(Usuarios.class.getResource("/images/fluent_delete-16-filled.png")));
		btnNewButton_2.setBorderPainted(false);
		btnNewButton_2.setBackground(new Color(220, 20, 60));
		btnNewButton_2.setBounds(800, 174, 43, 35);
		panelFormularioUsuarios.add(btnNewButton_2);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBorder(new LineBorder(new Color(235, 235, 235)));
		panel.setBackground(new Color(245, 245, 245));
		panel.setBounds(26, 380, 911, 370);
		panelUsuarios.add(panel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBackground(new Color(215, 215, 215));
		panel_1.setBounds(0, 0, 911, 52);
		panel.add(panel_1);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(29, 11, 221, 30);
		panel_1.add(textField_6);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(35, 63, 852, 281);
		panel.add(scrollPane);
		
		table_1 = new JTable();
		table_1.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Nombre", "Puesto", "Acceso", "Email", "Telefono", "Salario"
			}
		));
		scrollPane.setViewportView(table_1);
		
		
		
		
	}
}

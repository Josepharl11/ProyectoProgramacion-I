package GUI;

import javax.swing.*;
import java.awt.Font;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.BorderLayout;
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Usuarios extends JPanel{
	private JTable table;
	private JTextField txtEmpleadoNombre;
	private JTextField txtEmpleadoApellido;
	private JTextField txtEmpleadoPass;
	private JTextField txtEmpleadoDireccion;
	private JTextField txtEmpleadoDocumento;
	private JTextField txtEmpleadoTelefono;
	private JTable table_1;
	
	public Usuarios() {
		setLayout(new BorderLayout(0, 0));
		setSize(960, 761);
		
		JPanel panelUsuarios = new JPanel();
		panelUsuarios.setBackground(Color.WHITE);
		add(panelUsuarios, BorderLayout.CENTER);
		panelUsuarios.setLayout(null);
		
		JLabel lblUsuarios = new JLabel("Empleados");
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
		
		JLabel lblNombre = new JLabel("Nombres");
		lblNombre.setForeground(new Color(29, 53, 87));
		lblNombre.setFont(new Font("Helvetica", Font.BOLD, 18));
		lblNombre.setBounds(10, 11, 107, 22);
		panelFormularioUsuarios.add(lblNombre);
		
		txtEmpleadoNombre = new JTextField();
		txtEmpleadoNombre.setBounds(10, 33, 231, 29);
		panelFormularioUsuarios.add(txtEmpleadoNombre);
		txtEmpleadoNombre.setColumns(10);
		
		txtEmpleadoApellido = new JTextField();
		txtEmpleadoApellido.setColumns(10);
		txtEmpleadoApellido.setBounds(10, 106, 231, 29);
		panelFormularioUsuarios.add(txtEmpleadoApellido);
		
		JLabel lblContrasea = new JLabel("Apellidos");
		lblContrasea.setForeground(new Color(29, 53, 87));
		lblContrasea.setFont(new Font("Helvetica", Font.BOLD, 18));
		lblContrasea.setBounds(10, 84, 107, 22);
		panelFormularioUsuarios.add(lblContrasea);
		
		txtEmpleadoPass = new JTextField();
		txtEmpleadoPass.setColumns(10);
		txtEmpleadoPass.setBounds(10, 178, 231, 29);
		panelFormularioUsuarios.add(txtEmpleadoPass);
		
		JLabel lblNombre_1_1 = new JLabel("Contraseña");
		lblNombre_1_1.setForeground(new Color(29, 53, 87));
		lblNombre_1_1.setFont(new Font("Helvetica", Font.BOLD, 18));
		lblNombre_1_1.setBounds(10, 156, 107, 22);
		panelFormularioUsuarios.add(lblNombre_1_1);
		
		JLabel lblTipoDeDocumento = new JLabel("Tipo de documento");
		lblTipoDeDocumento.setForeground(new Color(29, 53, 87));
		lblTipoDeDocumento.setFont(new Font("Helvetica", Font.BOLD, 18));
		lblTipoDeDocumento.setBounds(268, 11, 182, 22);
		panelFormularioUsuarios.add(lblTipoDeDocumento);
		
		JLabel lblNombre_1_2 = new JLabel("Cargo");
		lblNombre_1_2.setForeground(new Color(29, 53, 87));
		lblNombre_1_2.setFont(new Font("Helvetica", Font.BOLD, 18));
		lblNombre_1_2.setBounds(268, 84, 182, 22);
		panelFormularioUsuarios.add(lblNombre_1_2);
		
		JLabel lblNombre_1_1_1 = new JLabel("Dirección");
		lblNombre_1_1_1.setForeground(new Color(29, 53, 87));
		lblNombre_1_1_1.setFont(new Font("Helvetica", Font.BOLD, 18));
		lblNombre_1_1_1.setBounds(268, 156, 107, 22);
		panelFormularioUsuarios.add(lblNombre_1_1_1);
		
		JComboBox comboTipoDocumento = new JComboBox();
		comboTipoDocumento.setModel(new DefaultComboBoxModel(new String[] {"Cedula", "Pasaporte"}));
		comboTipoDocumento.setBounds(268, 36, 231, 29);
		panelFormularioUsuarios.add(comboTipoDocumento);
		
		JComboBox comboCargoEmpleado = new JComboBox();
		comboCargoEmpleado.setModel(new DefaultComboBoxModel(new String[] {"Empleado", "Administrador"}));
		comboCargoEmpleado.setBounds(268, 106, 231, 29);
		panelFormularioUsuarios.add(comboCargoEmpleado);
		
		txtEmpleadoDireccion = new JTextField();
		txtEmpleadoDireccion.setBounds(268, 178, 231, 29);
		panelFormularioUsuarios.add(txtEmpleadoDireccion);
		txtEmpleadoDireccion.setColumns(10);
		
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
		
		txtEmpleadoDocumento = new JTextField();
		txtEmpleadoDocumento.setColumns(10);
		txtEmpleadoDocumento.setBounds(539, 37, 231, 29);
		panelFormularioUsuarios.add(txtEmpleadoDocumento);
		
		txtEmpleadoTelefono = new JTextField();
		txtEmpleadoTelefono.setColumns(10);
		txtEmpleadoTelefono.setBounds(539, 110, 231, 29);
		panelFormularioUsuarios.add(txtEmpleadoTelefono);
		
		JButton btnNewButton = new JButton("Añadir");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String nombreEmpleado = txtEmpleadoNombre.getText();
				String apellidoEmpleado = txtEmpleadoApellido.getText();
				String passwordEmpleado = txtEmpleadoPass.getText();
				String tipoDocumento = (String) comboTipoDocumento.getSelectedItem();
				String cargoEmpleado = (String) comboCargoEmpleado.getSelectedItem();
				String direccionEmpleado = txtEmpleadoDireccion.getText();
				String numeroDocumento = txtEmpleadoDocumento.getText();
				String telefonoEmpleado = txtEmpleadoTelefono.getText();
				
				DefaultTableModel modelo = (DefaultTableModel) table_1.getModel();
		        
		        Object[] filasTabla = {nombreEmpleado, apellidoEmpleado, passwordEmpleado, tipoDocumento, numeroDocumento, cargoEmpleado, direccionEmpleado, telefonoEmpleado};
		        
		        modelo.addRow(filasTabla);
				
			}
		});
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
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(35, 63, 852, 281);
		panel.add(scrollPane);
		
		table_1 = new JTable();
		table_1.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Nombres", "Apellidos", "Contraseña", "Tipo de documento", "Número de documento", "Cargo", "Dirección", "Teléfono"
			}
		));
		scrollPane.setViewportView(table_1);
	}
}

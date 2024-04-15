package GUI;

import javax.swing.*;
import java.awt.Font;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.BorderLayout;
import javax.swing.border.LineBorder;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;

import Class.Empleado;
import DataBase.EmpleadoCRUD;

import java.awt.event.ActionListener;
import java.util.List;
import java.awt.event.ActionEvent;

public class Usuarios extends JPanel{
	private JTable table;
	private JTextField txtEmpleadoNombre;
	private JTextField txtEmpleadoApellido;
	private JTextField txtEmpleadoPass;
	private JTextField txtEmpleadoDireccion;
	private JTextField txtEmpleadoDocumento;
	private JTextField txtEmpleadoTelefono;
	private JTable tablaUsuarios;
	
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
				
				Empleado empleado = new Empleado(nombreEmpleado, apellidoEmpleado, numeroDocumento, tipoDocumento, passwordEmpleado, direccionEmpleado, telefonoEmpleado, "", cargoEmpleado);
		        EmpleadoCRUD.insertarEmpleado(empleado);
				
				DefaultTableModel modelo = (DefaultTableModel) tablaUsuarios.getModel();
		        Object[] filasTabla = {numeroDocumento, nombreEmpleado, apellidoEmpleado, passwordEmpleado, tipoDocumento, cargoEmpleado, direccionEmpleado, telefonoEmpleado};
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
		
		btnActualizar.addActionListener(new ActionListener() {
		    @Override
		    public void actionPerformed(ActionEvent e) {
		        int selectedRow = tablaUsuarios.getSelectedRow();
		        if (selectedRow != -1) {
		            DefaultTableModel model = (DefaultTableModel) tablaUsuarios.getModel();
		            String documento = txtEmpleadoDocumento.getText();
		            String tipoDocumento = (String) comboTipoDocumento.getSelectedItem();
		            String nombre = txtEmpleadoNombre.getText();
		            String apellido = txtEmpleadoApellido.getText();
		            String contraseña = txtEmpleadoPass.getText();
		            String cargo = (String) comboCargoEmpleado.getSelectedItem();
		            String direccion = txtEmpleadoDireccion.getText();
		            String telefono = txtEmpleadoTelefono.getText();

		            model.setValueAt(documento, selectedRow, 0);
		            model.setValueAt(tipoDocumento, selectedRow, 1);
		            model.setValueAt(nombre, selectedRow, 2);
		            model.setValueAt(apellido, selectedRow, 3);
		            model.setValueAt(contraseña, selectedRow, 4);
		            model.setValueAt(cargo, selectedRow, 5);
		            model.setValueAt(direccion, selectedRow, 6);
		            model.setValueAt(telefono, selectedRow, 7);

		            Empleado empleado = new Empleado(nombre, apellido, documento, tipoDocumento, contraseña, direccion, telefono, "", cargo);
		            EmpleadoCRUD.actualizarEmpleado(empleado);

		            JOptionPane.showMessageDialog(null, "Empleado actualizado correctamente.", "Actualización exitosa", JOptionPane.INFORMATION_MESSAGE);
		        } else {
		            JOptionPane.showMessageDialog(null, "Por favor, seleccione una fila para actualizar.", "Error", JOptionPane.ERROR_MESSAGE);
		        }
		    }
		});
		
		JButton btnEliminar = new JButton("");
		btnEliminar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int selectedRow = tablaUsuarios.getSelectedRow();
		        
		        if (selectedRow != -1) {
		            DefaultTableModel model = (DefaultTableModel) tablaUsuarios.getModel();
		            
		            String numeroDocumento = (String) model.getValueAt(selectedRow, 0);
		            
		            model.removeRow(selectedRow);
		            
		            EmpleadoCRUD.eliminarEmpleado(numeroDocumento);
		        } else {
		            JOptionPane.showMessageDialog(null, "Por favor, seleccione una fila para eliminar.", "Error", JOptionPane.ERROR_MESSAGE);
		        }
			}
		});
		btnEliminar.setIcon(new ImageIcon(Usuarios.class.getResource("/images/fluent_delete-16-filled.png")));
		btnEliminar.setBorderPainted(false);
		btnEliminar.setBackground(new Color(220, 20, 60));
		btnEliminar.setBounds(800, 174, 43, 35);
		panelFormularioUsuarios.add(btnEliminar);
		
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
		
		tablaUsuarios = new JTable();
		tablaUsuarios.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Número de documento", "Nombre", "Apellido", "Contraseña", "Tipo de documento", "Cargo", "Dirección", "Teléfono"
			}
		));
		scrollPane.setViewportView(tablaUsuarios);
		
		tablaUsuarios.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
		    @Override
		    public void valueChanged(ListSelectionEvent e) {
		        if (!e.getValueIsAdjusting()) {
		            int selectedRow = tablaUsuarios.getSelectedRow();
		            if (selectedRow != -1) {
		                DefaultTableModel model = (DefaultTableModel) tablaUsuarios.getModel();
		                String documento = (String) model.getValueAt(selectedRow, 0);
		                String tipoDocumento = (String) model.getValueAt(selectedRow, 1);
		                String nombre = (String) model.getValueAt(selectedRow, 2);
		                String apellido = (String) model.getValueAt(selectedRow, 3);
		                String contraseña = (String) model.getValueAt(selectedRow, 4);
		                String cargo = (String) model.getValueAt(selectedRow, 5);
		                String direccion = (String) model.getValueAt(selectedRow, 6);
		                String telefono = (String) model.getValueAt(selectedRow, 7);
		                
		                txtEmpleadoNombre.setText(nombre);
		                txtEmpleadoApellido.setText(apellido);
		                txtEmpleadoPass.setText(contraseña);
		                txtEmpleadoDocumento.setText(documento);
		                comboTipoDocumento.setSelectedItem(tipoDocumento);
		                comboCargoEmpleado.setSelectedItem(cargo);
		                txtEmpleadoDireccion.setText(direccion);
		                txtEmpleadoTelefono.setText(telefono);
		            }
		        }
		    }
		});
		
		agregarTablaEmpleado();
	}
	
	private void agregarTablaEmpleado() {
        DefaultTableModel modelo = (DefaultTableModel) tablaUsuarios.getModel();
        modelo.setRowCount(0); // Clear existing rows
        
        // Retrieve employees from the database
        List<Empleado> empleados = EmpleadoCRUD.mostrarEmpleado();
        
        // Add employees to the table
        for (Empleado empleado : empleados) {
            Object[] fila = {empleado.getDocumento(), empleado.getNombre(), empleado.getApellido(), empleado.getContraseña(), empleado.getTipoDocumento(), empleado.getCargo(), empleado.getDireccion(), empleado.getTelefono()};
            modelo.addRow(fila);
        }
    }
}
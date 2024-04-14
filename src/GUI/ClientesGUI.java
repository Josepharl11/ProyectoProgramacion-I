package GUI;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.*;
import java.awt.Font;
import javax.swing.border.LineBorder;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;

import Class.Clientes;
import Class.Empleado;
import DataBase.ClientesCRUD;
import DataBase.EmpleadoCRUD;

import java.awt.event.ActionListener;
import java.util.List;
import java.awt.event.ActionEvent;

public class ClientesGUI extends JPanel {
	private JTextField textField;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTable tablaClientes;
	private JTextField textField_1;
	private JTextField textFieldFecha;

	public ClientesGUI(){
		setLayout(new BorderLayout(0, 0));
		setSize(960, 761);
		
		JPanel panelClientes = new JPanel();
		panelClientes.setBackground(Color.WHITE);
		add(panelClientes, BorderLayout.CENTER);
		panelClientes.setLayout(null);
		
		JLabel lblClientes = new JLabel("Clientes");
		lblClientes.setIcon(new ImageIcon(ClientesGUI.class.getResource("/images/fa-solid_ClientesPrincipal.png")));
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
		btnNewButton_2.setIcon(new ImageIcon(ClientesGUI.class.getResource("/images/fluent_delete-16-filled.png")));
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
				"Documento", "Nombre", "Tipo Documento", "Direccion", "Telefono", "Email", "Tipo Cliente", "Vendedor", "Estado", "Fecha Ingreso"
			}
		));
		scrollPane.setViewportView(tablaClientes);
		tablaClientes.setAlignmentX(0.0f);
		
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String nombreCliente = textField.getText();
				String tipoDocumento = (String) comboTipoDocumento.getSelectedItem();
				String direccionCliente = textField_2.getText();
				String numeroDocumento = textField_1.getText();
				String telefonoCliente = textField_4.getText();
				String emailCliente = textField_3.getText();
				String tipoCliente = (String) comboBoxTipoCliente.getSelectedItem();
				String vendedorCliente = (String) comboBox_Vendedor.getSelectedItem();
				String estadoCliente = (String) comboBoxEstado.getSelectedItem();
				String fechaIngresoCliente =  textFieldFecha.getText();
				
				Clientes cliente = new Clientes(nombreCliente, numeroDocumento, tipoDocumento, direccionCliente, telefonoCliente, emailCliente, tipoCliente, vendedorCliente, estadoCliente, fechaIngresoCliente);
		        ClientesCRUD.insertarCliente(cliente);
				
				DefaultTableModel modelo = (DefaultTableModel) tablaClientes.getModel();
		        Object[] filasTabla = {numeroDocumento, nombreCliente, tipoDocumento, direccionCliente, telefonoCliente, emailCliente, tipoCliente, vendedorCliente, estadoCliente, fechaIngresoCliente};
		        modelo.addRow(filasTabla);
			}
		});
		
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int selectedRow = tablaClientes.getSelectedRow();
		        
		        if (selectedRow != -1) {
		            DefaultTableModel model = (DefaultTableModel) tablaClientes.getModel();
		            
		            String numeroDocumento = (String) model.getValueAt(selectedRow, 0);
		            
		            model.removeRow(selectedRow);
		            
		            ClientesCRUD.eliminarCliente(numeroDocumento);
		        } else {
		            JOptionPane.showMessageDialog(null, "Por favor, seleccione una fila para eliminar.", "Error", JOptionPane.ERROR_MESSAGE);
		        }
			}
		});
		
		btnActualizar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int selectedRow = tablaClientes.getSelectedRow();
		        if (selectedRow != -1) {
		            DefaultTableModel model = (DefaultTableModel) tablaClientes.getModel();
		            String nombreCliente = textField.getText();
					String tipoDocumento = (String) comboTipoDocumento.getSelectedItem();
					String direccionCliente = textField_2.getText();
					String numeroDocumento = textField_1.getText();
					String telefonoCliente = textField_4.getText();
					String emailCliente = textField_3.getText();
					String tipoCliente = (String) comboBoxTipoCliente.getSelectedItem();
					String vendedorCliente = (String) comboBox_Vendedor.getSelectedItem();
					String estadoCliente = (String) comboBoxEstado.getSelectedItem();
					String fechaIngresoCliente =  textFieldFecha.getText();

		            model.setValueAt(numeroDocumento, selectedRow, 0);
		            model.setValueAt(nombreCliente, selectedRow, 1);
		            model.setValueAt(tipoDocumento, selectedRow, 2);
		            model.setValueAt(direccionCliente, selectedRow, 3);
		            model.setValueAt(telefonoCliente, selectedRow, 4);
		            model.setValueAt(emailCliente, selectedRow, 5);
		            model.setValueAt(tipoCliente, selectedRow, 6);
		            model.setValueAt(vendedorCliente, selectedRow, 7);
		            model.setValueAt(estadoCliente, selectedRow, 8);
		            model.setValueAt(fechaIngresoCliente, selectedRow, 9);

		            Clientes cliente = new Clientes(nombreCliente, numeroDocumento, tipoDocumento, direccionCliente, telefonoCliente, emailCliente, tipoCliente, vendedorCliente, estadoCliente, fechaIngresoCliente);
		            ClientesCRUD.actualizarCliente(cliente);

		            JOptionPane.showMessageDialog(null, "Cliente actualizado correctamente.", "Actualización exitosa", JOptionPane.INFORMATION_MESSAGE);
		        } else {
		            JOptionPane.showMessageDialog(null, "Por favor, seleccione una fila para actualizar.", "Error", JOptionPane.ERROR_MESSAGE);
		        }

			}
		});
		
		tablaClientes.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
		    @Override
		    public void valueChanged(ListSelectionEvent e) {
		        if (!e.getValueIsAdjusting()) {
		            int selectedRow = tablaClientes.getSelectedRow();
		            if (selectedRow != -1) {
		                DefaultTableModel model = (DefaultTableModel) tablaClientes.getModel();
		                String documento = (String) model.getValueAt(selectedRow, 0);
		                String nombre = (String) model.getValueAt(selectedRow, 1);
		                String tipoDocumento = (String) model.getValueAt(selectedRow, 2);
		                String direccion = (String) model.getValueAt(selectedRow, 3);
		                String telefono = (String) model.getValueAt(selectedRow, 4);
		                String email = (String) model.getValueAt(selectedRow, 5);
		                String tipoCliente = (String) model.getValueAt(selectedRow, 6);
		                String vendedor = (String) model.getValueAt(selectedRow, 7);
		                String estado = (String) model.getValueAt(selectedRow, 8);
		                String fechaIngreso = (String) model.getValueAt(selectedRow, 9);
		                
		                textField_1.setText(documento);
		                textField.setText(nombre);
		                comboTipoDocumento.setSelectedItem(tipoDocumento);
		                textField_2.setText(direccion);
		                textField_4.setText(telefono);
		                textField_3.setText(email);
		                comboBoxTipoCliente.setSelectedItem(tipoCliente);
		                comboBox_Vendedor.setSelectedItem(vendedor);
		                comboBoxEstado.setSelectedItem(estado);
		                textFieldFecha.setText(fechaIngreso);
		            }
		        }
		    }
		});
		
		agregarTablaCliente();
	}
	
	private void agregarTablaCliente() {
        DefaultTableModel modelo = (DefaultTableModel) tablaClientes.getModel();
        modelo.setRowCount(0);
        
        List<Clientes> clientes = ClientesCRUD.mostrarCliente();
        
        for (Clientes cliente : clientes) {
            Object[] fila = {cliente.getDocumento(), cliente.getNombre(), cliente.getTipoDocumento(), cliente.getDireccion(), cliente.getTelefono(), cliente.getEmail(), 
            		cliente.getTipoCliente(), cliente.getVendedor(), cliente.getEstado(), cliente.getFechaIngreso()};
            modelo.addRow(fila);
        }
	}
}
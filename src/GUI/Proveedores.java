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

import Class.Producto;
import Class.Proveedor;
import DataBase.ProductoCRUD;
import DataBase.ProveedorCRUD;

import java.awt.event.ActionListener;
import java.util.List;
import java.awt.event.ActionEvent;
import java.awt.Component;

public class Proveedores extends JPanel{
	private JTable table;
	private JTextField txtProveedorId;
	private JTextField txtProveedorNombre;
	private JTextField txtProveedorDireccion;
	private JTextField txtProveedorEmail;
	private JTextField txtProveedorTelefono;
	private JTable table_proveedores;
	public Proveedores() {
		setLayout(new BorderLayout(0, 0));
		setSize(960, 761);
		
		JPanel panelProveedores = new JPanel();
		panelProveedores.setBackground(Color.WHITE);
		add(panelProveedores, BorderLayout.CENTER);
		panelProveedores.setLayout(null);
		
		JLabel lblProveedores = new JLabel("Proveedores");
		lblProveedores.setIcon(new ImageIcon(Proveedores.class.getResource("/images/iconamoon_delivery-fast-fill.png")));
		lblProveedores.setIconTextGap(20);
		lblProveedores.setForeground(new Color(29, 53, 87));
		lblProveedores.setFont(new Font("Sentic", Font.BOLD, 42));
		lblProveedores.setBounds(23, 21, 357, 61);
		panelProveedores.add(lblProveedores);
		
		JPanel panelFormulario = new JPanel();
		panelFormulario.setLayout(null);
		panelFormulario.setBackground(new Color(215, 215, 215));
		panelFormulario.setBounds(23, 114, 910, 256);
		panelProveedores.add(panelFormulario);
		
		JLabel lblRNC = new JLabel("RNC");
		lblRNC.setForeground(new Color(29, 53, 87));
		lblRNC.setFont(new Font("Dialog", Font.BOLD, 18));
		lblRNC.setBounds(21, 17, 107, 22);
		panelFormulario.add(lblRNC);
		
		txtProveedorId = new JTextField();
		txtProveedorId.setFont(new Font("Segoe UI", Font.PLAIN, 14));
		txtProveedorId.setColumns(10);
		txtProveedorId.setBounds(20, 41, 235, 32);
		panelFormulario.add(txtProveedorId);
		
		txtProveedorNombre = new JTextField();
		txtProveedorNombre.setFont(new Font("Segoe UI", Font.PLAIN, 14));
		txtProveedorNombre.setColumns(10);
		txtProveedorNombre.setBounds(20, 116, 235, 32);
		panelFormulario.add(txtProveedorNombre);
		
		JLabel lblNombre = new JLabel("Nombre");
		lblNombre.setForeground(new Color(29, 53, 87));
		lblNombre.setFont(new Font("Dialog", Font.BOLD, 18));
		lblNombre.setBounds(21, 92, 107, 22);
		panelFormulario.add(lblNombre);
		
		txtProveedorDireccion = new JTextField();
		txtProveedorDireccion.setFont(new Font("Segoe UI", Font.PLAIN, 14));
		txtProveedorDireccion.setColumns(10);
		txtProveedorDireccion.setBounds(21, 191, 512, 32);
		panelFormulario.add(txtProveedorDireccion);
		
		JLabel lblReferencia = new JLabel("Dirección");
		lblReferencia.setForeground(new Color(29, 53, 87));
		lblReferencia.setFont(new Font("Dialog", Font.BOLD, 18));
		lblReferencia.setBounds(22, 167, 107, 22);
		panelFormulario.add(lblReferencia);
		
		JButton btnNewButton = new JButton("Añadir");
		btnNewButton.setForeground(Color.WHITE);
		btnNewButton.setFont(new Font("Dialog", Font.BOLD, 14));
		btnNewButton.setBorderPainted(false);
		btnNewButton.setBackground(new Color(70, 130, 180));
		btnNewButton.setBounds(558, 188, 99, 35);
		panelFormulario.add(btnNewButton);
		
		JButton btnActualizar = new JButton("Actualizar");
		btnActualizar.setForeground(Color.WHITE);
		btnActualizar.setFont(new Font("Dialog", Font.BOLD, 14));
		btnActualizar.setBorderPainted(false);
		btnActualizar.setBackground(new Color(32, 178, 170));
		btnActualizar.setBounds(684, 186, 114, 35);
		panelFormulario.add(btnActualizar);
		
		JButton btnNewButton_2 = new JButton("");
		btnNewButton_2.setIcon(new ImageIcon(Proveedores.class.getResource("/images/fluent_delete-16-filled.png")));
		btnNewButton_2.setBorderPainted(false);
		btnNewButton_2.setBackground(new Color(220, 20, 60));
		btnNewButton_2.setBounds(819, 186, 43, 35);
		panelFormulario.add(btnNewButton_2);
		
		txtProveedorEmail = new JTextField();
		txtProveedorEmail.setFont(new Font("Segoe UI", Font.PLAIN, 14));
		txtProveedorEmail.setColumns(10);
		txtProveedorEmail.setBounds(298, 116, 235, 32);
		panelFormulario.add(txtProveedorEmail);
		
		txtProveedorTelefono = new JTextField();
		txtProveedorTelefono.setFont(new Font("Segoe UI", Font.PLAIN, 14));
		txtProveedorTelefono.setColumns(10);
		txtProveedorTelefono.setBounds(298, 41, 235, 32);
		panelFormulario.add(txtProveedorTelefono);
		
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
		
		JLabel lblTipoDeProveedor = new JLabel("Tipo de proveedor");
		lblTipoDeProveedor.setForeground(new Color(29, 53, 87));
		lblTipoDeProveedor.setFont(new Font("Dialog", Font.BOLD, 18));
		lblTipoDeProveedor.setBounds(553, 17, 192, 22);
		panelFormulario.add(lblTipoDeProveedor);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setFont(new Font("Segoe UI", Font.PLAIN, 14));
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Local", "Exterior"}));
		comboBox.setBounds(558, 41, 235, 32);
		panelFormulario.add(comboBox);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBorder(new LineBorder(new Color(235, 235, 235)));
		panel.setBackground(new Color(245, 245, 245));
		panel.setBounds(33, 380, 910, 370);
		panelProveedores.add(panel);
		
		JScrollPane scrollPaneProveedores = new JScrollPane();
		scrollPaneProveedores.setBounds(10, 11, 890, 296);
		panel.add(scrollPaneProveedores);
		
		table_proveedores = new JTable();
		table_proveedores.setAlignmentX(Component.LEFT_ALIGNMENT);
		scrollPaneProveedores.setViewportView(table_proveedores);
		table_proveedores.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				 "RNC", "Nombre", "Direccion", "Telefono", "Email", "Tipo"
			}
		) {
			boolean[] columnEditables = new boolean[] {
				true, false, false, false, false, false
			};
			public boolean isCellEditable(int row, int column) {
				return columnEditables[column];
			}
		});
		
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int rncProveedor = Integer.parseInt(txtProveedorId.getText());
                String nombreProveedor = txtProveedorNombre.getText();
                String direccionProveedor = txtProveedorDireccion.getText();
                String telefonoProveedor = txtProveedorTelefono.getText();
                String emailProveedor = txtProveedorEmail.getText();
                String tipoProveedor = (String) comboBox.getSelectedItem();
                
                Proveedor proveedor = new Proveedor(rncProveedor, nombreProveedor, direccionProveedor, telefonoProveedor, emailProveedor, tipoProveedor);
                ProveedorCRUD.insertarProveedor(proveedor);
                
                DefaultTableModel modelo = (DefaultTableModel) table_proveedores.getModel();
	            Object[] filasTabla = {rncProveedor, nombreProveedor, direccionProveedor, telefonoProveedor, emailProveedor, tipoProveedor};
	            modelo.addRow(filasTabla);
			}
		});
		
		btnActualizar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int selectedRow = table_proveedores.getSelectedRow();
		        if (selectedRow != -1) {
		            DefaultTableModel modelo = (DefaultTableModel) table_proveedores.getModel();
		            int rncProveedor = Integer.parseInt(txtProveedorId.getText());
					String nombreProveedor = txtProveedorNombre.getText();
					String direccionProveedor = txtProveedorDireccion.getText();
					String telefonoProveedor = txtProveedorTelefono.getText();
					String emailProveedor = txtProveedorEmail.getText();
					String tipoProveedor = (String) comboBox.getSelectedItem();

		            modelo.setValueAt(rncProveedor, selectedRow, 0);
		            modelo.setValueAt(nombreProveedor, selectedRow, 1);
		            modelo.setValueAt(direccionProveedor, selectedRow, 2);
		            modelo.setValueAt(telefonoProveedor, selectedRow, 3);
		            modelo.setValueAt(emailProveedor, selectedRow, 4);
		            modelo.setValueAt(tipoProveedor, selectedRow, 5);

		            Proveedor proveedor = new Proveedor(rncProveedor, nombreProveedor, direccionProveedor, telefonoProveedor, emailProveedor, tipoProveedor);
		            ProveedorCRUD.actualizarProveedor(proveedor);

		            JOptionPane.showMessageDialog(null, "Proveedor actualizado correctamente.", "Actualización exitosa", JOptionPane.INFORMATION_MESSAGE);
		        } else {
		            JOptionPane.showMessageDialog(null, "Por favor, seleccione una fila para actualizar.", "Error", JOptionPane.ERROR_MESSAGE);
		        }
			}
		});
		
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int selectedRow = table_proveedores.getSelectedRow();
		        
		        if (selectedRow != -1) {
		            DefaultTableModel modelo = (DefaultTableModel) table_proveedores.getModel();
		            
		            int rncProveedor = (int) modelo.getValueAt(selectedRow, 0);
		            
		            modelo.removeRow(selectedRow);
		            
		            ProveedorCRUD.eliminarProveedor(rncProveedor);
		        } else {
		            JOptionPane.showMessageDialog(null, "Por favor, seleccione una fila para eliminar.", "Error", JOptionPane.ERROR_MESSAGE);
		        }
			}
		});
		
		table_proveedores.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
		    @Override
		    public void valueChanged(ListSelectionEvent e) {
		        if (!e.getValueIsAdjusting()) {
		            int selectedRow = table_proveedores.getSelectedRow();
		            if (selectedRow != -1) {
		                DefaultTableModel modelo = (DefaultTableModel) table_proveedores.getModel();
		                Object idObject = modelo.getValueAt(selectedRow, 0);

		                if (idObject instanceof Integer) {
		                    int rncProveedor = (int) idObject;
		                    String nombreProveedor = (String) modelo.getValueAt(selectedRow, 1);
		                    String direccionProveedor = (String) modelo.getValueAt(selectedRow, 2);
		                    String telefonoProveedor = (String) modelo.getValueAt(selectedRow, 3);
		                    String emailProveedor = (String) modelo.getValueAt(selectedRow, 4);
		                    String tipoProveedor = (String) modelo.getValueAt(selectedRow, 5);

		                    txtProveedorId.setText(String.valueOf(rncProveedor));
		                    txtProveedorNombre.setText(nombreProveedor);
		                    txtProveedorDireccion.setText(direccionProveedor);
		                    txtProveedorTelefono.setText(telefonoProveedor);
		                    txtProveedorEmail.setText(String.valueOf(emailProveedor));
		                    comboBox.setSelectedItem(tipoProveedor);
		                } else {
		                    JOptionPane.showMessageDialog(null, "Error al obtener datos de la tabla. Tipo de dato no esperado.", "Error", JOptionPane.ERROR_MESSAGE);
		                }
		            }
		        }
		    }
		});
		
		agregarTablaProveedor();
	}
	
	private void agregarTablaProveedor() {
        DefaultTableModel modelo = (DefaultTableModel) table_proveedores.getModel();
        modelo.setRowCount(0);
        List<Proveedor> proveedores = ProveedorCRUD.mostrarProveedores();
        for (Proveedor proveedor : proveedores) {
            Object[] fila = {proveedor.getRnc(), proveedor.getNombre(), proveedor.getDireccion(), proveedor.getTelefono(), proveedor.getEmail()};
            modelo.addRow(fila);
        }
    }
}
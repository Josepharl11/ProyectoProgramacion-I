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
import java.awt.Component;

public class Proveedores extends JPanel{
	private JTable table;
	private JTextField txtProveedorId;
	private JTextField txtProveedorNombre;
	private JTextField txtProveedorDireccion;
	private JTextField txtProveedorEmail;
	private JTextField txtProveedorTelefono;
	private JTable table_1;
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
		
		JLabel lblId = new JLabel("Id");
		lblId.setForeground(new Color(29, 53, 87));
		lblId.setFont(new Font("Dialog", Font.BOLD, 18));
		lblId.setBounds(21, 17, 107, 22);
		panelFormulario.add(lblId);
		
		txtProveedorId = new JTextField();
		txtProveedorId.setColumns(10);
		txtProveedorId.setBounds(20, 41, 235, 32);
		panelFormulario.add(txtProveedorId);
		
		txtProveedorNombre = new JTextField();
		txtProveedorNombre.setColumns(10);
		txtProveedorNombre.setBounds(20, 116, 235, 32);
		panelFormulario.add(txtProveedorNombre);
		
		JLabel lblNombre = new JLabel("Nombre");
		lblNombre.setForeground(new Color(29, 53, 87));
		lblNombre.setFont(new Font("Dialog", Font.BOLD, 18));
		lblNombre.setBounds(21, 92, 107, 22);
		panelFormulario.add(lblNombre);
		
		txtProveedorDireccion = new JTextField();
		txtProveedorDireccion.setColumns(10);
		txtProveedorDireccion.setBounds(21, 191, 234, 32);
		panelFormulario.add(txtProveedorDireccion);
		
		JLabel lblReferencia = new JLabel("Dirección");
		lblReferencia.setForeground(new Color(29, 53, 87));
		lblReferencia.setFont(new Font("Dialog", Font.BOLD, 18));
		lblReferencia.setBounds(22, 167, 107, 22);
		panelFormulario.add(lblReferencia);
		
		JButton btnNewButton = new JButton("Añadir");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
		        DefaultTableModel model = (DefaultTableModel) table_1.getModel();

				int idProveedor = Integer.parseInt(txtProveedorId.getText());
				String nombreProveedor = txtProveedorNombre.getText();
				String direccionProveedor = txtProveedorDireccion.getText();
				String telefonoProveedor = txtProveedorTelefono.getText();
				String emailProveedor = txtProveedorEmail.getText();
				
				Object[] fila = {idProveedor, nombreProveedor, direccionProveedor, telefonoProveedor, emailProveedor};

		        model.addRow(fila);
			}
		});
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
		btnNewButton_2.setIcon(new ImageIcon(Proveedores.class.getResource("/images/fluent_delete-16-filledrojo.png")));
		btnNewButton_2.setBorderPainted(false);
		btnNewButton_2.setBackground(new Color(220, 20, 60));
		btnNewButton_2.setBounds(819, 186, 43, 35);
		panelFormulario.add(btnNewButton_2);
		
		txtProveedorEmail = new JTextField();
		txtProveedorEmail.setColumns(10);
		txtProveedorEmail.setBounds(298, 116, 235, 32);
		panelFormulario.add(txtProveedorEmail);
		
		txtProveedorTelefono = new JTextField();
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
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBorder(new LineBorder(new Color(235, 235, 235)));
		panel.setBackground(new Color(245, 245, 245));
		panel.setBounds(33, 380, 910, 370);
		panelProveedores.add(panel);
		
		JScrollPane scrollPaneProveedores = new JScrollPane();
		scrollPaneProveedores.setBounds(10, 10, 890, 296);
		panel.add(scrollPaneProveedores);
		
		table_1 = new JTable();
		table_1.setAlignmentX(Component.LEFT_ALIGNMENT);
		scrollPaneProveedores.setViewportView(table_1);
		table_1.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"New 1111", "New 2222", "New 333", "New 44444", "New 5555"
			}
		) {
			boolean[] columnEditables = new boolean[] {
				false, false, false, false, false
			};
			public boolean isCellEditable(int row, int column) {
				return columnEditables[column];
			}
		});
	}
}
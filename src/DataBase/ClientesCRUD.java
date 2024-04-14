package DataBase;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import Class.Clientes;

public class ClientesCRUD {
	
	public static void insertarCliente(Clientes cliente) {
        Connection con = ConexionMySQL.getConnection();
        String query = "INSERT INTO clientes (documento, tipoDocumento, nombre, direccion, telefono, email, tipoCliente, vendedor, estado, fechaIngreso) "
        		+ "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
        try {
            PreparedStatement stmt = con.prepareStatement(query);
            stmt.setString(1, cliente.getDocumento());
            stmt.setString(2, cliente.getTipoDocumento());
            stmt.setString(3, cliente.getNombre());
            stmt.setString(4, cliente.getDireccion());
            stmt.setString(5, cliente.getTelefono());
            stmt.setString(6, cliente.getEmail());
            stmt.setString(7, cliente.getTipoCliente());
            stmt.setString(8, cliente.getVendedor());
            stmt.setString(9, cliente.getEstado());
            stmt.setString(10, cliente.getFechaIngreso());
            stmt.executeUpdate();
            System.out.println("Cliente agregado a la base de datos.");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    public static void eliminarCliente(String numeroDocumento) {
        Connection con = ConexionMySQL.getConnection();
        String query = "DELETE FROM clientes WHERE documento = ?";
        try {
            PreparedStatement stmt = con.prepareStatement(query);
            stmt.setString(1, numeroDocumento);
            stmt.executeUpdate();
            System.out.println("Cliente eliminado de la base de datos.");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    public static void actualizarCliente(Clientes cliente) {
        Connection con = ConexionMySQL.getConnection();
        String query = "UPDATE clientes SET nombre = ?, tipoDocumento = ?, direccion = ?, telefono = ?, email = ?, tipoCliente = ?, vendedor = ?, estado = ?, fechaIngreso = ? WHERE documento = ?";
        try {
            PreparedStatement stmt = con.prepareStatement(query);
            stmt.setString(1, cliente.getNombre());
            stmt.setString(2, cliente.getTipoDocumento());
            stmt.setString(3, cliente.getDireccion());
            stmt.setString(4, cliente.getTelefono());
            stmt.setString(5, cliente.getEmail());
            stmt.setString(6, cliente.getTipoCliente());
            stmt.setString(7, cliente.getVendedor());
            stmt.setString(8, cliente.getEstado());
            stmt.setString(9, cliente.getFechaIngreso());
            stmt.setString(10, cliente.getDocumento());
            stmt.executeUpdate();
            System.out.println("Cliente actualizado en la base de datos.");
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
    
    public static List<Clientes> mostrarCliente() {
        List<Clientes> clientes = new ArrayList<>();
        Connection con = ConexionMySQL.getConnection();
        String query = "SELECT * FROM clientes";
        try {
            PreparedStatement stmt = con.prepareStatement(query);
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                String nombre = rs.getString("nombre");
                String documento = rs.getString("documento");
                String tipoDocumento = rs.getString("tipoDocumento");
                String direccion = rs.getString("direccion");
                String telefono = rs.getString("telefono");
                String email = rs.getString("email");
                String tipoCliente = rs.getString("tipoCliente");
                String vendedor = rs.getString("vendedor");
                String estado = rs.getString("estado");
                String fechaIngreso = rs.getString("fechaIngreso");
                
                Clientes cliente = new Clientes(nombre, documento, tipoDocumento, direccion, telefono, email, tipoCliente, vendedor, estado, fechaIngreso);
                clientes.add(cliente);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return clientes;
    }
}
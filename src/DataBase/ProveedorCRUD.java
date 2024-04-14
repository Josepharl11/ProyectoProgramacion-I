package DataBase;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import Class.Proveedor;

public class ProveedorCRUD {
    
    public static void insertarProveedor(Proveedor proveedor) {
        try {
            Connection con = ConexionMySQL.getConnection();
            String query = "INSERT INTO proveedores (rnc, nombre, direccion, telefono, email, tipoProveedor) VALUES (?, ?, ?, ?, ?, ?)";
            PreparedStatement stmt = con.prepareStatement(query);
            stmt.setInt(1, proveedor.getRnc());
            stmt.setString(2, proveedor.getNombre());
            stmt.setString(3, proveedor.getDireccion());
            stmt.setString(4, proveedor.getTelefono());
            stmt.setString(5, proveedor.getEmail());
            stmt.setString(6, proveedor.getTipoProveedor());
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void actualizarProveedor(Proveedor proveedor) {
        Connection con = ConexionMySQL.getConnection();
        String query = "UPDATE proveedores SET nombre = ?, direccion = ?, telefono = ?, email = ?, tipoProveedor = ? WHERE rnc = ?";
        try {
            PreparedStatement stmt = con.prepareStatement(query);
            stmt.setString(1, proveedor.getNombre());
            stmt.setString(2, proveedor.getDireccion());
            stmt.setString(3, proveedor.getTelefono());
            stmt.setString(4, proveedor.getEmail());
            stmt.setString(5, proveedor.getTipoProveedor());
            stmt.setInt(6, proveedor.getRnc());
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void eliminarProveedor(int rncProveedor) {
        try {
            Connection con = ConexionMySQL.getConnection();
            String query = "DELETE FROM proveedores WHERE rnc = ?";
            PreparedStatement stmt = con.prepareStatement(query);
            stmt.setInt(1, rncProveedor);
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    public static List<Proveedor> mostrarProveedores() {
        List<Proveedor> proveedores = new ArrayList<>();
        try {
            Connection con = ConexionMySQL.getConnection();
            String query = "SELECT * FROM proveedores";
            PreparedStatement stmt = con.prepareStatement(query);
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                String nombre = rs.getString("nombre");
                String direccion = rs.getString("direccion");
                String telefono = rs.getString("telefono");
                String email = rs.getString("email");
                int rnc = rs.getInt("rnc");
                String tipoProveedor = rs.getString("tipoProveedor");
                Proveedor proveedor = new Proveedor(rnc, nombre, direccion, telefono, email, tipoProveedor);
                proveedores.add(proveedor);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return proveedores;
    }
}
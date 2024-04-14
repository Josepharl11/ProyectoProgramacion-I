package DataBase;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import Class.Producto;

public class ProductoCRUD {
	
	public static void insertarProducto(Producto producto) {
        try {
            Connection con = ConexionMySQL.getConnection();
            String query = "INSERT INTO productos (id, nombre, referencia, tipo, marca, cantidad, precio) VALUES (?, ?, ?, ?, ?, ?, ?)";
            PreparedStatement stmt = con.prepareStatement(query);
            stmt.setInt(1, producto.getId());
            stmt.setString(2, producto.getNombre());
            stmt.setString(3, producto.getReferencia());
            stmt.setString(4, producto.getTipo());
            stmt.setString(5, producto.getMarca());
            stmt.setInt(6, producto.getCantidad());
            stmt.setDouble(7, producto.getPrecio());
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void actualizarProducto(Producto producto) {
    	Connection con = ConexionMySQL.getConnection();
    	String query = "UPDATE productos SET nombre = ?, referencia = ?, tipo = ?, marca = ?, cantidad = ?, precio = ? WHERE id = ?";
    	try {
            PreparedStatement stmt = con.prepareStatement(query);
            stmt.setInt(7, producto.getId());
            stmt.setString(1, producto.getNombre());
            stmt.setString(2, producto.getReferencia());
            stmt.setString(3, producto.getTipo());
            stmt.setString(4, producto.getMarca());
            stmt.setInt(5, producto.getCantidad());
            stmt.setDouble(6, producto.getPrecio());
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void eliminarProducto(int idProducto) {
        try {
            Connection con = ConexionMySQL.getConnection();
            String query = "DELETE FROM productos WHERE id = ?";
            PreparedStatement stmt = con.prepareStatement(query);
            stmt.setInt(1, idProducto);
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    public static List<Producto> mostrarProducto() {
        List<Producto> productos = new ArrayList<>();
        try {
            Connection con = ConexionMySQL.getConnection();
            String query = "SELECT * FROM productos";
            PreparedStatement stmt = con.prepareStatement(query);
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
            	int id = rs.getInt("Id");
                String nombre = rs.getString("nombre");
                String referencia = rs.getString("referencia");
                String tipo = rs.getString("tipo");
                String marca = rs.getString("marca");
                int cantidad = rs.getInt("cantidad");
                double precio = rs.getDouble("precio");
                Producto producto = new Producto(id, nombre, referencia, tipo, marca, cantidad, precio);
                productos.add(producto);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return productos;
    }
}
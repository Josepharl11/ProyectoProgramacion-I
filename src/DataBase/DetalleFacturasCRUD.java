package DataBase;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import Class.DetalleFacturas;

public class DetalleFacturasCRUD {
    public static void insertarDetalleFactura(int id_factura, int id_producto, String nombre_producto, int cantidad, double precio) {
        try {
        	Connection conn = ConexionMySQL.getConnection();
        	String query = "INSERT INTO detalle_factura (id_factura, id_producto, nombre_producto, cantidad, precio) VALUES (?, ?, ?, ?, ?)";
            PreparedStatement pstmt = conn.prepareStatement(query);
            pstmt.setInt(1, id_factura);
            pstmt.setInt(2, id_producto);
            pstmt.setString(3, nombre_producto);
            pstmt.setInt(4, cantidad);
            pstmt.setDouble(5, precio);

            pstmt.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
}
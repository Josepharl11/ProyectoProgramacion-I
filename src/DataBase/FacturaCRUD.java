package DataBase;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import Class.DetalleFacturas;
import Class.Facturas;
import DataBase.ConexionMySQL;

public class FacturaCRUD {
	
	public static int insertarFactura(String nombreCliente, String documentoCliente, String fechaGeneracion, String tipoPago, double totalFactura) {
        String query = "INSERT INTO facturas (cliente_nombre, cliente_documento, fecha_generacion, tipo_pago, total) VALUES (?, ?, ?, ?, ?)";
        int idFactura = -1;

        try {
        	Connection conn = ConexionMySQL.getConnection();
            PreparedStatement pstmt = conn.prepareStatement(query, PreparedStatement.RETURN_GENERATED_KEYS);
            pstmt.setString(1, nombreCliente);
            pstmt.setString(2, documentoCliente);
            pstmt.setString(3, fechaGeneracion);
            pstmt.setString(4, tipoPago);
            pstmt.setDouble(5, totalFactura);

            int filasAfectadas = pstmt.executeUpdate();
            if (filasAfectadas > 0) {
                ResultSet rs = pstmt.getGeneratedKeys();
                if (rs.next()) {
                    idFactura = rs.getInt(1);
                }
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }

        return idFactura;
    }

    public static List<Facturas> obtenerTodasLasFacturas() {
        List<Facturas> facturas = new ArrayList<>();
        try {
            Connection con = ConexionMySQL.getConnection();
            String query = "SELECT * FROM facturas";
            PreparedStatement stmt = con.prepareStatement(query);
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                int id_factura = rs.getInt("id_factura");
                String clienteDocumento = rs.getString("cliente_documento");
                String clienteNombre = rs.getString("cliente_nombre");
                Date fechaGeneracion = rs.getDate("fecha_generacion");
                String tipoPago = rs.getString("tipo_pago");
                double total = rs.getDouble("total");
                Facturas factura = new Facturas(id_factura, clienteDocumento, clienteNombre, fechaGeneracion, tipoPago, total);
                facturas.add(factura);
            }
            con.close();
        } catch (SQLException e) {
            e.printStackTrace();
            throw new RuntimeException("Error al obtener las facturas", e);
        }
        return facturas;
    }

    public static List<DetalleFacturas> obtenerDetallesDeFactura(int id_factura) {
        List<DetalleFacturas> detalles = new ArrayList<>();
        try {
            Connection con = ConexionMySQL.getConnection();
            String query = "SELECT * FROM detalle_factura WHERE id_factura = ?";
            PreparedStatement stmt = con.prepareStatement(query);
            stmt.setInt(1, id_factura);
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                int id = rs.getInt("id");
                int idProducto = rs.getInt("id_producto");
                String nombreProducto = rs.getString("nombre_producto");
                int cantidad = rs.getInt("cantidad");
                double precio = rs.getDouble("precio");
                DetalleFacturas detalle = new DetalleFacturas(id, id_factura, idProducto, nombreProducto, cantidad, precio);
                detalles.add(detalle);
            }
            con.close();
        } catch (SQLException e) {
            e.printStackTrace();
            throw new RuntimeException("Error al obtener los detalles de la factura", e);
        }
        return detalles;
    }
    
    public static String obtenerNombreClientePorDocumento(String documento) {
        String nombreCliente = null;
        try {
            Connection con = ConexionMySQL.getConnection();
            String query = "SELECT nombre FROM clientes WHERE documento = ?";
            PreparedStatement stmt = con.prepareStatement(query);
            stmt.setString(1, documento);
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                nombreCliente = rs.getString("nombre");
            }
            con.close();
        } catch (SQLException e) {
            e.printStackTrace();
            throw new RuntimeException("Error al obtener el nombre del cliente por documento", e);
        }
        return nombreCliente;
    }
}
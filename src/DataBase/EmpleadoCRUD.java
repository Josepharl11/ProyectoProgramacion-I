package DataBase;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import Class.Empleado;

public class EmpleadoCRUD {
	
    public static void insertarEmpleado(Empleado empleado) {
        Connection con = ConexionMySQL.getConnection();
        String query = "INSERT INTO empleados (documento, tipodocumento, nombre, apellido, contraseña, cargo, direccion, telefono) VALUES (?, ?, ?, ?, ?, ?, ?)";
        try {
            PreparedStatement stmt = con.prepareStatement(query);
            stmt.setString(1, empleado.getDocumento());
            stmt.setString(2, empleado.getTipoDocumento());
            stmt.setString(3, empleado.getNombre());
            stmt.setString(4, empleado.getApellido());
            stmt.setString(5, empleado.getContraseña());
            stmt.setString(6, empleado.getCargo());
            stmt.setString(7, empleado.getDireccion());
            stmt.setString(8, empleado.getTelefono());
            stmt.executeUpdate();
            System.out.println("Empleado agregado a la base de datos.");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    public static void eliminarEmpleado(String numeroDocumento) {
        Connection con = ConexionMySQL.getConnection();
        String query = "DELETE FROM empleados WHERE documento = ?";
        try {
            PreparedStatement stmt = con.prepareStatement(query);
            stmt.setString(1, numeroDocumento);
            stmt.executeUpdate();
            System.out.println("Empleado eliminado de la base de datos.");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    public static void actualizarEmpleado(Empleado empleado) {
        Connection con = ConexionMySQL.getConnection();
        String query = "UPDATE empleados SET nombre = ?, apellido = ?, contraseña = ?, cargo = ?, direccion = ?, telefono = ? WHERE documento = ?";
        try {
            PreparedStatement stmt = con.prepareStatement(query);
            stmt.setString(1, empleado.getNombre());
            stmt.setString(2, empleado.getApellido());
            stmt.setString(3, empleado.getContraseña());
            stmt.setString(4, empleado.getCargo());
            stmt.setString(5, empleado.getDireccion());
            stmt.setString(6, empleado.getTelefono());
            stmt.setString(7, empleado.getDocumento());
            stmt.executeUpdate();
            System.out.println("Empleado actualizado en la base de datos.");
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
    
    public static List<Empleado> mostrarEmpleado() {
        List<Empleado> empleados = new ArrayList<>();
        Connection con = ConexionMySQL.getConnection();
        String query = "SELECT * FROM empleados";
        try {
            PreparedStatement stmt = con.prepareStatement(query);
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                String nombre = rs.getString("nombre");
                String apellido = rs.getString("apellido");
                String documento = rs.getString("documento");
                String tipoDocumento = rs.getString("tipoDocumento");
                String contraseña = rs.getString("contraseña");
                String cargo = rs.getString("cargo");
                String direccion = rs.getString("direccion");
                String telefono = rs.getString("telefono");
                
                Empleado empleado = new Empleado(nombre, apellido, documento, tipoDocumento, contraseña, direccion, telefono, "", cargo);
                empleados.add(empleado);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return empleados;
    }
}
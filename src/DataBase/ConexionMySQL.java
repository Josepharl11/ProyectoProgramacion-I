package DataBase;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import Class.Empleado;

public class ConexionMySQL {
	public static Connection connection;
	
	public static Connection getConnection() {
		try {
			if (connection == null) {
				Runtime.getRuntime().addShutdownHook(new getClose());
				Class.forName("com.mysql.cj.jdbc.Driver");
				connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/SistemaVentas", "root", "klkconklk23");
				System.out.println("Entro al DB");
			}
			return connection;
		} catch (ClassNotFoundException | SQLException e) {
			throw new RuntimeException("Conexion Fallida", e);
		}
	}
	
	public static String validarCredenciales(String usuario, String contraseña) {
	    try {
	        Connection con = getConnection();
	        String query = "SELECT nombre FROM empleados WHERE nombre = ? AND contraseña = ?";
	        PreparedStatement stmt = con.prepareStatement(query);
	        stmt.setString(1, usuario);
	        stmt.setString(2, contraseña);
	        ResultSet rs = stmt.executeQuery();
	        if (rs.next()) {
	            return rs.getString("nombre");
	        }
	    } catch (SQLException e) {
	        e.printStackTrace();
	    }
	    return null;
	}
	
	public static String obtenerCargoEmpleado(String usuario) {
	    try {
	        Connection con = getConnection();
	        String query = "SELECT cargo FROM empleados WHERE nombre = ?";
	        PreparedStatement stmt = con.prepareStatement(query);
	        stmt.setString(1, usuario);
	        ResultSet rs = stmt.executeQuery();
	        if (rs.next()) {
	            return rs.getString("cargo");
	        }
	    } catch (SQLException e) {
	        e.printStackTrace();
	    }
	    return null;
	}
	
	static class getClose extends Thread {
		@Override
		public void run() {
			try {
				Connection conn = ConexionMySQL.getConnection();
				conn.close();
			} catch (SQLException ex) {
				throw new RuntimeException(ex);
			}
		}
	}
}
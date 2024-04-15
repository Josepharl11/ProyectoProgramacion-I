package Class;

import java.util.Date;

/**
 * @author Cristian Ledesma
 */

public class Empleado  extends Persona{

    private String cargo;
    private String contraseña;

    public Empleado(String nombre, String apellido, String documento, String tipoDocumento, String contraseña, String direccion, String telefono, String email, String cargo) {
        super(nombre, apellido, documento, tipoDocumento, direccion, telefono, email);
        this.cargo = cargo;
        this.contraseña = contraseña;
    }

	public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
    
    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }
}
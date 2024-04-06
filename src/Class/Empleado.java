package Class;

import java.util.Date;

/**
 * @author Cristian Ledesma
 */
public class Empleado  extends Persona{

    private String cargo;
    private double salario;
    private String contraseña;

    public Empleado(String id, String nombre, String apellido, String contraseña, String direccion, String telefono, String email,
                     Date fechaNacimiento, String cargo, double salario) {
        super(nombre, apellido, direccion, telefono, email, id);
        this.cargo = cargo;
        this.salario = salario;
        this.contraseña = contraseña;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}

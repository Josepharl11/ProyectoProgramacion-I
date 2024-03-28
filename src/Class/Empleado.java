
package Class;

import java.util.Date;

/**
 * @author Cristian Ledesma
 */
public class Empleado  extends Persona{

    private String cargo;
    private double salario;
    private String departamento;

    public Empleado(String nombre, String apellido, String direccion, String telefono, String email,
                    String id, Date fechaNacimiento, String cargo, double salario, String departamento) {
        super(nombre, apellido, direccion, telefono, email, id);
        this.cargo = cargo;
        this.salario = salario;
        this.departamento = departamento;
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

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }
}

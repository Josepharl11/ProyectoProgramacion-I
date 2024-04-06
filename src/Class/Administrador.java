package Class;

import java.util.Date;

/**
 * @author Cristian Ledesma
 */
public class Administrador extends Persona {

    private String nivelAcceso;

    public Administrador(String nombre, String apellido, String direccion, String telefono, String email,
                         String id, String nivelAcceso) {
        super(nombre, apellido, direccion, telefono, email, id);
        this.nivelAcceso = nivelAcceso;
    }

    public String getNivelAcceso() {
        return nivelAcceso;
    }

    public void setNivelAcceso(String nivelAcceso) {
        this.nivelAcceso = nivelAcceso;
    }
}
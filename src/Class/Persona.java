package Class;

/**
 * @author Cristian Ledesma
 */
public abstract class Persona {

    private String nombre;
    private String apellido;
    private String documento;
    private String tipoDocumento;
    private String direccion;
    private String telefono;
    private String email;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    
    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }
    
    public String getTipoDocumento() {
        return tipoDocumento;
    }

    public void setTipoDocumento(String tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Persona(){
        
    }

    public Persona(String nombre, String apellido, String documento, String tipoDocumento, String direccion, String telefono, String email) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.documento = documento;
        this.tipoDocumento = tipoDocumento;
        this.direccion = direccion;
        this.telefono = telefono;
        this.email = email;
    }
}
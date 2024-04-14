package Class;

/**
 * @author Cristian Ledesma
 */
public class Proveedor extends Persona {

	int rnc;
	String tipoProveedor;
	
    public Proveedor(int rnc, String nombre, String direccion, String telefono, String email, String tipoProveedor) {
    	super(nombre, "", "", "", direccion, telefono, email);
        this.rnc = rnc;
        this.tipoProveedor = tipoProveedor;
    }

	public int getRnc() {
        return rnc;
    }

    public void setRnc(int rnc) {
        this.rnc = rnc;
    }
    
    public String getTipoProveedor() {
    	return tipoProveedor;
    }
    
    public void setTipoProveedor(String tipoProveedor) {
    	this.tipoProveedor = tipoProveedor;
    }
}
package Class;

public class Clientes extends Persona{
	
	 String tipoCliente;
	 String vendedor;
	 String estado;
	 String fechaIngreso;

	 public Clientes(String nombre, String documento, String tipoDocumento, String direccion, String telefono, String email
			 , String tipoCliente, String vendedor, String estado, String fechaIngreso) {
		 super(nombre, "", documento, tipoDocumento, direccion, telefono, email);
		 
		 this.tipoCliente = tipoCliente;
	     this.vendedor = vendedor;
	     this.estado = estado;
	     this.fechaIngreso = fechaIngreso;
	}
	 
	 public String getTipoCliente() {
     	return tipoCliente;
     }
     
     public void setTipoCliente(String tipoCliente) {
     	this.tipoCliente = tipoCliente;
     }
     
     public String getVendedor() {
    	 return vendedor;
     }
     
     public void setVendedor(String vendedor) {
    	 this.vendedor = vendedor;
     }
     
     public String getEstado() {
    	 return estado;
     }
     
     public void setEstado(String estado) {
    	 this.estado = estado;
     }
     
     public String getFechaIngreso() {
    	 return fechaIngreso;
     }
     
     public void setFechaIngreso(String fechaIngreso) {
    	 this.fechaIngreso = fechaIngreso;
     }
}
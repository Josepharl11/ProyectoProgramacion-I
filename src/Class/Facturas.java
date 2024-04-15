package Class;

import java.util.Date;

public class Facturas {
    private int idFactura;
    private String clienteDocumento;
    private String clienteNombre;
    private Date fechaGeneracion;
    private String tipoPago;
    private double total;

    public Facturas(int idFactura, String clienteDocumento, String clienteNombre, Date fechaGeneracion, String tipoPago, double total) {
        this.idFactura = idFactura;
        this.clienteDocumento = clienteDocumento;
        this.clienteNombre = clienteNombre;
        this.fechaGeneracion = fechaGeneracion;
        this.tipoPago = tipoPago;
        this.total = total;
    }

    public int getId() {
        return idFactura;
    }

    public void setId(int idFactura) {
        this.idFactura = idFactura;
    }

    public String getClienteDocumento() {
        return clienteDocumento;
    }

    public void setClienteDocumento(String clienteDocumento) {
        this.clienteDocumento = clienteDocumento;
    }

    public String getClienteNombre() {
        return clienteNombre;
    }

    public void setClienteNombre(String clienteNombre) {
        this.clienteNombre = clienteNombre;
    }

    public Date getFechaGeneracion() {
        return fechaGeneracion;
    }

    public void setFechaGeneracion(Date fechaGeneracion) {
        this.fechaGeneracion = fechaGeneracion;
    }

    public String getTipoPago() {
        return tipoPago;
    }

    public void setTipoPago(String tipoPago) {
        this.tipoPago = tipoPago;
    }
    
    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }
}
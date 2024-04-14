package Class;

import java.util.Date;

public abstract class Cuenta {
    private String id;
    private Date fechaCreacion;
    private double saldo;

    public Cuenta(String id, Date fechaCreacion, double saldo) {
        this.id = id;
        this.fechaCreacion = fechaCreacion;
        this.saldo = saldo;
    }

    public abstract void agregarTransaccion(double monto);
    public abstract void realizarPago(double monto);

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Date getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(Date fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}
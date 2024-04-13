package Class;

import java.util.Date;

public class CuentaPorPagar extends Cuenta {
    private String proveedor;

    public CuentaPorPagar(String id, Date fechaCreacion, double saldo, String proveedor) {
        super(id, fechaCreacion, saldo);
        this.proveedor = proveedor;
    }

    @Override
    public void agregarTransaccion(double monto) {
        setSaldo(getSaldo() + monto); // Agregar dinero al saldo
    }

    @Override
    public void realizarPago(double monto) {
        setSaldo(getSaldo() - monto); // Descontar al saldo al realizar un pago
    }

    public String getProveedor() {
        return proveedor;
    }

    public void setProveedor(String proveedor) {
        this.proveedor = proveedor;
    }
}

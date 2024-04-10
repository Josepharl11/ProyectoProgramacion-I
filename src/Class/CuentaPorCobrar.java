package Class;

import java.util.Date;

public class CuentaPorCobrar extends Cuenta {
    private String cliente;

    public CuentaPorCobrar(String id, Date fechaCreacion, double saldo, String cliente) {
        super(id, fechaCreacion, saldo);
        this.cliente = cliente;
    }

    @Override
    public void agregarTransaccion(double monto) {
        setSaldo(getSaldo() - monto); // Reducir el saldo al agregar una transacción
    }

    @Override
    public void realizarPago(double monto) {
        setSaldo(getSaldo() + monto); // Incrementar el saldo al recibir un pago
    }

    // Getters y setters específicos para CuentaPorCobrar
    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }
}

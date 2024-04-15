package Class;

public class DetalleFacturas {
    private int idDetalle;
    private int idFactura;
    private int idProducto;
    private String nombreProducto;
    private int cantidad;
    private double precio;

    public DetalleFacturas(int idDetalle, int idFactura, int idProducto, String nombreProducto, int cantidad, double precio) {
        this.idDetalle = idDetalle;
        this.idFactura = idFactura;
        this.idProducto = idProducto;
        this.nombreProducto = nombreProducto;
        this.cantidad = cantidad;
        this.precio = precio;
    }

    public DetalleFacturas(int i, int idProducto2, String nombreProducto2, int cantidadProducto, double precio2) {
		// TODO Auto-generated constructor stub
	}

	public DetalleFacturas(int idFactura2, int idProducto2, int cantidad2, double precio2) {
		// TODO Auto-generated constructor stub
	}

	public int getId() {
        return idDetalle;
    }

    public void setId(int idDetalle) {
        this.idDetalle = idDetalle;
    }

    public int getIdFactura() {
        return idFactura;
    }

    public void setIdFactura(int idFactura) {
        this.idFactura = idFactura;
    }

    public int getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
}
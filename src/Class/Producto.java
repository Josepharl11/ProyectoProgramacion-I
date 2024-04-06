package Class;

public class Producto implements IProducto {
    // Atributos
    private String nombre;
    private double precio;
    private int cantidadDisponible;
    private String descripcion;

    // Constructor
    public Producto(String nombre, double precio, int cantidadDisponible, String descripcion) {
        this.nombre = nombre;
        this.precio = precio;
        this.cantidadDisponible = cantidadDisponible;
        this.descripcion = descripcion;
    }

    // Métodos de la interfaz ProductoInterface
    @Override
    public String getNombre() {
        return nombre;
    }

    @Override
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public double getPrecio() {
        return precio;
    }

    @Override
    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public int getCantidadDisponible() {
        return cantidadDisponible;
    }

    @Override
    public void setCantidadDisponible(int cantidadDisponible) {
        this.cantidadDisponible = cantidadDisponible;
    }

    @Override
    public String getDescripcion() {
        return descripcion;
    }

    @Override
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}

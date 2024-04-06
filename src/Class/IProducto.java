/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Class;

/**
 *
 * @author Cristian Ledesma
 */
public interface IProducto {

    String getNombre();

    void setNombre(String nombre);

    double getPrecio();

    void setPrecio(double precio);

    int getCantidadDisponible();

    void setCantidadDisponible(int cantidadDisponible);

    String getDescripcion();

    void setDescripcion(String descripcion);
}

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

	int getId();
    void setId(int id);
    
    String getNombre();
    void setNombre(String nombre);
    
    String getReferencia();
    void setReferencia(String referencia);
    
    String getTipo();
    void setTipo(String tipo);
    
    String getMarca();
    void setMarca(String marca);

    double getPrecio();
    void setPrecio(double precio);

    int getCantidad();
    void setCantidad(int cantidadDisponible);
}
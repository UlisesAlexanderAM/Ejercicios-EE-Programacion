package VentaProducto;

import static Ejercicios.Imprimir.imprimir;
import static Ejercicios.Leer.*;

public class Producto {
    private int idProducto, cantidadProducto=0;
    private String nombreProducto;

    Producto(){
        imprimir("%nBienvenido a continuacion podra crear un nuevo producto" +
                "%nEl formato de los producto es: ID del producto, Nombre del producto y cantidad");
        idProducto=leerEntero("%nIngrese el ID del producto: ");
        nombreProducto=leerCadena("Ingrese el nombre del producto: ");
    }

    Producto (int id, String nombre){
        idProducto=id;
        nombreProducto=nombre;
    }

    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public void setCantidadProducto(int cantidadProducto) {
        this.cantidadProducto = cantidadProducto;
    }

    public int getIdProducto() {
        return idProducto;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public int getCantidadProducto() {
        return cantidadProducto;
    }
}

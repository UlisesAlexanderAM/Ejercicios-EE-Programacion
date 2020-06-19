package VentaProducto;

import java.util.ArrayList;

import static Ejercicios.Imprimir.imprimir;
import static Ejercicios.Leer.leerEntero;

public class Inventario {
    private ArrayList <Producto> productos = new ArrayList<>();

    Inventario(){
    }

    void agregarProducto(Producto producto){
        productos.add(producto);
    }
    void eliminarProducto(Producto producto){
        productos.remove(producto);
    }
    boolean buscarProducto(String nombre){
        for (Producto producto : productos) {
            if (producto.getNombreProducto().equals(nombre)) {
                return true;
            }
        }
        return false;
    }
    int buscarIndiceProducto(String nombre){
        int indice = 0;
        for (Producto producto : productos) {
            if (producto.getNombreProducto().equals(nombre)) {
                 indice=productos.indexOf(producto);
            }else {
                indice=0;
            }
        }
        return indice;
    }
    void modificarCantidadProducto(Producto producto){
        int cantidad;
        imprimir("La cantidad actual de "+producto.getNombreProducto()+
                "es de:"+producto.getCantidadProducto());
        cantidad=leerEntero("Ingrese la nueva cantidad del producto: ");
        producto.setCantidadProducto(cantidad);
    }
    void modificarCantidadPorVenta(int indice,int cantidad){
        int cantidadActual,nuevaCantidad;
        cantidadActual=productos.get(indice).getCantidadProducto();
        nuevaCantidad=cantidadActual-cantidad;
        productos.get(indice).setCantidadProducto(nuevaCantidad);
    }

    public ArrayList<Producto> getProductos() {
        return productos;
    }
    public void imprimirInventario(){
        for (Producto producto : productos){
            imprimir(producto.getNombreProducto()+"%n");
        }
    }
}

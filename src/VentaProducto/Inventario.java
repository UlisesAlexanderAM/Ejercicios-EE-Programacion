package VentaProducto;

import java.util.ArrayList;

import static Ejercicios.Imprimir.imprimir;
import static Ejercicios.Leer.leerCadena;
import static Ejercicios.Leer.leerEntero;

public class Inventario {
    private final ArrayList <Producto> productos = new ArrayList<>();

    Inventario(){
    }

    public void agregarProducto(Producto producto){
        if (buscarProducto(producto.getNombreProducto())){
            String nombre=leerCadena(producto.getNombreProducto()+" ya existe, ingrese" +
                    "un nuevo nombre para el producto: ");
            producto.setNombreProducto(nombre);
            agregarProducto(producto);
        }else if(buscarProductoPorId(producto.getIdProducto())){
            int id = leerEntero("Ya existe un producto con el ID "+producto.getIdProducto()+
                    " ingrese un nuevo ID: ");
            producto.setIdProducto(id);
            agregarProducto(producto);
        }else {
            productos.add(producto);
        }
    }
    public void eliminarProducto(Producto producto){
        productos.remove(producto);
    }
    public boolean buscarProducto(String nombre){
        for (Producto producto : productos) {
            if (producto.getNombreProducto().equals(nombre)) {
                return true;
            }
        }
        return false;
    }
    public boolean buscarProductoPorId(int id){
        for (Producto producto : productos){
            if (producto.getIdProducto()==id){
                return true;
            }
        }
        return false;
    }
    public int buscarIndiceProducto(String nombre){
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
    public void modificarCantidadProducto(Producto producto){
        int cantidad;
        imprimir("%n%nLa cantidad actual de "+producto.getNombreProducto()+
                " es de:"+producto.getCantidadProducto());
        cantidad=leerEntero("%nIngrese la nueva cantidad del producto: ");
        producto.setCantidadProducto(cantidad);
        imprimir("La nueva cantidad de "+producto.getNombreProducto()+
                " es de: "+producto.getCantidadProducto());
    }
    public void modificarCantidadPorVenta(int indice,int cantidad){
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
            imprimir("%n"+producto.getNombreProducto()+": "+producto.getCantidadProducto()+"%n");
        }
    }
}

package VentaProductoArreglos;

import static Ejercicios.Imprimir.imprimir;
import static Ejercicios.Leer.leerEntero;

public class Inventario {
    private final Producto [] productos = new Producto[10];
    private int ultima=0;

    Inventario(){
        for (int i = 0; i < 10; i++) {
            productos[i]=null;
        }
    }

    public void agregarProducto(Producto producto){
        productos[ultima]=producto;
        ultima+=1;
    }
    public void eliminarProducto(Producto producto){
        for (int i = 0; i < ultima; i++) {
            if (productos[i]==producto){
                for (int j = i; j < ultima-1; j++) {
                    productos[j]=productos[j+1];
                }
                productos[ultima]=null;
            }
        }
    }
    public boolean buscarProducto(String nombre){
        for (int i = 0; i < ultima; i++) {
            if (productos[i].getNombreProducto().equals(nombre)) {
                return true;
            }
        }
        return false;
    }
    public int buscarIndiceProducto(String nombre){
        int indice = 0;
        for (int i = 0; i < ultima; i++) {
            if (productos[i].getNombreProducto().equals(nombre)) {
                 indice=i;
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
        cantidadActual=productos[indice].getCantidadProducto();
        nuevaCantidad=cantidadActual-cantidad;
        productos[indice].setCantidadProducto(nuevaCantidad);
    }

    public Producto[] getProductos() {
        return productos;
    }

    public void imprimirInventario(){
        for (int i = 0; i < ultima; i++){
            imprimir(productos[i].getNombreProducto()+"%n");
        }
    }

    public int getUltima() {
        return ultima;
    }
}

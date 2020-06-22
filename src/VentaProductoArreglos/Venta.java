package VentaProductoArreglos;

import java.util.ArrayList;

import static Ejercicios.Imprimir.imprimir;
import static Ejercicios.Leer.leerCadena;
import static Ejercicios.Leer.leerEntero;

public class Venta {
    private int idVenta, flag=0;
    private Inventario productos;
    private final Producto [] productosVenta = new Producto[10];
    private int[] cantidadVendida = new int[10];

    Venta(Inventario productos){
        this.productos = productos;
    }
    Venta(int id, Inventario productos){
        idVenta=id;
        this.productos = productos;
    }
    public void agregarProducto(){
        String nombre;
        imprimir("Los productos en inventario son los siguientes: ");
        for (int i = 0; i < productos.getProductos().size(); i++) {
            imprimir("%n"+productos.getProductos().get(i).getNombreProducto());
        }
        while (flag==0){
            nombre=leerCadena("%nIngrese el nombre producto a agregar: ");
            if (productos.buscarProducto(nombre)){
                int indice,cantidad;
                Producto producto;
                indice=productos.buscarIndiceProducto(nombre);
                producto=productos.getProductos().get(indice);
                productosVenta.add(producto);
                cantidad=leerEntero("%nIngrese la cantidad vendida de "+producto.getNombreProducto()+
                        ": ");
                cantidadVendida.add(cantidad);
            }else {
                imprimir("%nNombre no valido");
                flag=1;
            }
        }
    }

    public void setIdVenta(int idVenta) {
        this.idVenta = idVenta;
    }

    public int getIdVenta() {
        return idVenta;
    }

    public void imprimirProductosVenta(){
        for (Producto producto : productosVenta){
            imprimir("%n"+producto.getNombreProducto()+
                    ": "+producto.getCantidadProducto());
        }
    }
}

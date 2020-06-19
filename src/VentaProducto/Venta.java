package VentaProducto;

import java.util.ArrayList;

import static Ejercicios.Imprimir.imprimir;
import static Ejercicios.Leer.leerCadena;

public class Venta {
    private int idVenta,cantidadVendida, flag=0;
    private Inventario productos;
    private ArrayList <Producto> productosVentas = new ArrayList<>();

    Venta(){
    }
    Venta(int id){
        idVenta=id;
    }
    void agregarProducto(){
        String nombre;
        imprimir("Los productos en inventario son los siguientes: ");
        for (int i = 0; i < productos.getProductos().size(); i++) {
            imprimir(productos.getProductos().get(i).getNombreProducto());
        }
        while (flag!=0){
            nombre=leerCadena("Ingrese el nombre producto a agregar: ");
            if (productos.buscarProducto(nombre)){
                productosVentas.add(productos.getProductos().get(productos.buscarIndiceProducto(nombre)));
            }else {
                imprimir("Nombre no valido");
                flag=1;
            }
        }
    }

    public void setCantidadVendida(int cantidadVendida) {
        this.cantidadVendida = cantidadVendida;
    }

    public void setIdVenta(int idVenta) {
        this.idVenta = idVenta;
    }

    public void setProductos(Inventario productos) {
        this.productos = productos;
    }

    public int getCantidadVendida() {
        return cantidadVendida;
    }

    public int getIdVenta() {
        return idVenta;
    }

    public Inventario getProductos() {
        return productos;
    }
}

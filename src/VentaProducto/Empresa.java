package VentaProducto;

import java.util.ArrayList;

import static Ejercicios.Imprimir.imprimir;

public class Empresa {
    private ArrayList <Venta> ventas = new ArrayList<>();
    private Inventario inventario;

    Empresa(){
        inventario = new Inventario();
        Venta venta1 = new Venta(1);
        Venta venta2 = new Venta(2);
        ventas.add(venta1);
    }

    void agregarVenta(Venta venta){
        ventas.add(venta);
    }

    void buscarVenta(Venta venta){
        if (ventas.contains(venta)){
            imprimir("Existe la venta");
        } else {
            imprimir("No existe la venta");
        }
    }
    void eliminarVenta(Venta venta){
        ventas.remove(venta);
    }

    void modificarVenta(){
        int opcion;
        imprimir("¿Que desea modificar?+" +
                "%n1.- ID%n2.-Agregar productos%n3.-");
    }

    public ArrayList<Venta> getVentas() {
        return ventas;
    }

    public Inventario getInventario() {
        return inventario;
    }
    public void agregarProductoAInventario(Producto producto){
        inventario.agregarProducto(producto);
    }
    public void imprimirInventario(){
        inventario.imprimirInventario();
    }
    public void buscarProducto(String nombre){
        if (inventario.buscarProducto(nombre)){
            imprimir("El producto "+nombre+" existe");
        }else {
            imprimir("El producto "+nombre+" no existe");
        }
    }
}
package VentaProducto;

import java.util.ArrayList;

import static Ejercicios.Imprimir.imprimir;
import static Ejercicios.Leer.*;

public class Empresa {
    private final ArrayList <Venta> ventas = new ArrayList<>();
    private final Inventario inventario;

    Empresa(){
        inventario = new Inventario();
        Venta venta1 = new Venta(1,inventario);
        ventas.add(venta1);
    }

    public void agregarVenta(Venta venta){
        ventas.add(venta);
    }

    public void buscarVenta(Venta venta){
        if (ventas.contains(venta)){
            imprimir("%nExiste la venta");
        } else {
            imprimir("%nNo existe la venta");
        }
    }
    public Venta buscarVentaPorID(int id){
        for (Venta venta : ventas){
            if (venta.getIdVenta()==id){
                return venta;
            }
        }
        return null;
    }
    public void eliminarVenta(Venta venta){
        ventas.remove(venta);
    }

    public void modificarVenta(Venta venta){
        int opcion;
        opcion=leerEntero("¿Que desea modificar?+" +
                "%n1.- ID%n2.-Agregar productos%n3.-");
        switch (opcion){
            case 1: venta.setIdVenta(leerEntero("Ingrese el nuevo ID de la venta: "));
            case 2: venta.agregarProducto();
            default:
                throw new IllegalStateException("Opción no valida: " + opcion);
        }
    }

    public void agregarProductoAInventario(Producto producto){
        inventario.agregarProducto(producto);
    }
    public void imprimirInventario(){
        inventario.imprimirInventario();
    }
    public void buscarProductoPorNombre(String nombre){
        if (inventario.buscarProducto(nombre)){
            imprimir("%nEl producto "+nombre+" existe");
        }else {
            imprimir("%nEl producto "+nombre+" no existe");
        }
    }
    public void modificarCantidadProducto(Producto producto){
        inventario.modificarCantidadProducto(producto);
    }

    public Venta crearVenta(int id){
        return new Venta(id,inventario);
    }

    public void imprimirVentas(){
        for (Venta venta :ventas){
            imprimir("%nVenta ID: "+venta.getIdVenta());
            venta.imprimirProductosVenta();
        }
    }
    public void agregarProductosAVentasGenaral(){
        for (Venta venta : ventas){
            int n;
            n=leerEntero("%n%n¿Cuantos productos desea agregar a la venta "+venta.getIdVenta()+"?: ");
            for (int i = 0; i < n; i++) {
                venta.agregarProducto();
            }
        }
    }
    public void agregarProductoAVentaEspecifica(){
        imprimirVentas();
        int n = leerEntero("%nIngrese el ID de la venta a la cual quiere agregar productos");
        if (buscarVentaPorID(n)==null) {
            do {
                imprimir("%nID invalido");
                n = leerEntero("%nIngrese el ID de la venta a la cual quiere agregar productos");
            } while (buscarVentaPorID(n) == null);
        } else {
            int m;
            m=leerEntero("%n%n¿Cuantos productos desea agregar a la venta "+buscarVentaPorID(n).getIdVenta()+"?: ");
            for (int i = 0; i < m; i++) {
                buscarVentaPorID(n).agregarProducto();
            }
        }
    }
}
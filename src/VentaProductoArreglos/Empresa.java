package VentaProductoArreglos;

import static Ejercicios.Imprimir.imprimir;
import static Ejercicios.Leer.leerEntero;

public class Empresa {
    private final Venta [] ventas = new Venta[10];
    private final Inventario inventario;
    private int ulimaVentas=0;

    Empresa(){
        inventario = new Inventario();
        Venta venta1 = new Venta(1,inventario);
        ventas[ulimaVentas]=venta1;
        ulimaVentas+=1;
    }

    public void agregarVenta(Venta venta){
        ventas[ulimaVentas]=venta;
        ulimaVentas+=1;
    }

    public void buscarVenta(Venta venta){
        for (int i = 0; i < 10; i++) {
            if (ventas[i]==venta) {
                imprimir("Existe la venta");
            } else {
                imprimir("No existe la venta");
            }
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
        for (int i = 0; i < ulimaVentas; i++) {
            if (ventas[i]==venta){
                for (int j = i; j < ulimaVentas-1; j++) {
                    ventas[j]=ventas[j+1];
                }
                ventas[ulimaVentas]=null;
            }
        }
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
            imprimir("El producto "+nombre+" existe");
        }else {
            imprimir("El producto "+nombre+" no existe");
        }
    }
    public void modificarCantidadProducto(Producto producto){
        inventario.modificarCantidadProducto(producto);
    }

    public Venta crearVenta(int id){
        return new Venta(id,inventario);
    }

    public void imprimirVentas(){
        for (int i = 0; i < ulimaVentas; i++){
            imprimir("%nVenta ID: "+ventas[i].getIdVenta());
            ventas[i].imprimirProductosVenta();
        }
        imprimir("%n");
    }
    public void agregarProductosAVentasGenaral(){
        for (int i = 0; i < ulimaVentas; i++) {
            int n;
            n=leerEntero("%n¿Cuantos producto desea agregar a la venta "+ventas[i].getIdVenta()+"?: ");
            ventas[i].agregarProducto(n);
        }
    }
    public void agregarProductoAVentaEspecifica(){
        imprimirVentas();
        int n = leerEntero("%nIngrese el ID de la venta a la cual quiere agregar productos: ");
        if (buscarVentaPorID(n)==null) {
            do {
                imprimir("ID invalido");
                n = leerEntero("%nIngrese el ID de la venta a la cual quiere agregar productos: ");
            } while (buscarVentaPorID(n) == null);
        } else {
            buscarVentaPorID(n).agregarProducto();
        }
    }

}
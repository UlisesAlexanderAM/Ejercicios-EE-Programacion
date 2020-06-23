package VentaProductoArreglos;

import static Ejercicios.Imprimir.imprimir;
import static Ejercicios.Leer.leerCadena;
import static Ejercicios.Leer.leerEntero;

public class Venta {
    private int idVenta, flag=0, ultimaProductosVenta=0,ultimaCantidadVendida=0;
    private Inventario productos;
    private Producto [] productosVenta = new Producto[10];
    private int[] cantidadVendida = new int[10];

    Venta(Inventario productos){
        this.productos = productos;
    }
    Venta(int id, Inventario productos){
        idVenta=id;
        this.productos = productos;
        for (int i = 0; i < 10; i++) {
            productosVenta[i]=null;
            cantidadVendida[i]=0;
        }
    }
    public void agregarProducto(int n){
        String nombre;
        int flag2=0;
        imprimir("Los productos en inventario son los siguientes: ");
        for (int i = 0; i < productos.getUltima(); i++) {
            imprimir("%n"+productos.getProductos()[i].getNombreProducto());
        }
        while (flag2<n){
            nombre=leerCadena("%nIngrese el nombre producto a agregar: ");
            if (productos.buscarProducto(nombre)){
                int indice,cantidad;
                Producto producto;
                indice=productos.buscarIndiceProducto(nombre);
                producto=productos.getProductos()[indice];
                productosVenta[ultimaProductosVenta]=producto;
                ultimaProductosVenta+=1;
                cantidad=leerEntero("%nIngrese la cantidad vendida de "+producto.getNombreProducto()+
                        ": ");
                cantidadVendida[ultimaCantidadVendida]=cantidad;
                ultimaCantidadVendida+=1;
                flag2+=1;
            }else {
                imprimir("%nNombre no valido");
            }
        }
    }
    public void agregarProducto(){
        String nombre;
        int n;
        imprimir("Los productos en inventario son los siguientes: ");
        for (int i = 0; i < productos.getUltima(); i++) {
            imprimir("%n"+productos.getProductos()[i].getNombreProducto());
        }
        n=leerEntero("%n¿Cuantos producto desea agregar a la venta?: ");
        for (int i = 0; i < n; i++) {
            while (flag == 0) {
                nombre = leerCadena("%nIngrese el nombre producto a agregar: ");
                if (productos.buscarProducto(nombre)) {
                    int indice, cantidad;
                    Producto producto;
                    indice = productos.buscarIndiceProducto(nombre);
                    producto = productos.getProductos()[indice];
                    productosVenta[ultimaProductosVenta] = producto;
                    ultimaProductosVenta += 1;
                    cantidad = leerEntero("%nIngrese la cantidad vendida de " + producto.getNombreProducto() +
                            ": ");
                    cantidadVendida[ultimaCantidadVendida] = cantidad;
                    ultimaCantidadVendida += 1;
                    flag+=1;
                } else {
                    imprimir("%nNombre no valido");
                }
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
        for (int i = 0; i < ultimaProductosVenta; i++) {
            imprimir("%n"+productosVenta[i].getNombreProducto()+
                    ": "+productosVenta[i].getCantidadProducto());
        }
    }
}

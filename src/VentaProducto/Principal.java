package VentaProducto;

public class Principal {
    public static void main(String[] args) {
        Empresa empresa1 = new Empresa();
        Producto lapices =new Producto(1,"lapices");
        Producto gomas = new Producto(2,"gomas");
        empresa1.agregarProductoAInventario(lapices);
        empresa1.agregarProductoAInventario(gomas);
        Producto x1 = new Producto();
        empresa1.agregarProductoAInventario(x1);
        Producto x2 = new Producto();
        empresa1.agregarProductoAInventario(x2);
        empresa1.imprimirInventario();
        empresa1.buscarProductoPorNombre("hola");
        empresa1.modificarCantidadProducto(lapices);
        empresa1.modificarCantidadProducto(gomas);
        empresa1.modificarCantidadProducto(x1);
        empresa1.modificarCantidadProducto(x2);
        Venta venta2 = empresa1.crearVenta(2);
        empresa1.agregarVenta(venta2);
        empresa1.agregarProductosAVentasGenaral();
        Venta venta3 = empresa1.crearVenta(3);
        empresa1.agregarVenta(venta3);
        empresa1.agregarProductoAVentaEspecifica();
        empresa1.imprimirVentas();
        empresa1.eliminarVenta(venta2);
        empresa1.imprimirVentas();
        empresa1.modificarVenta(venta3);
        empresa1.imprimirVentas();
        empresa1.imprimirInventario();
    }
}

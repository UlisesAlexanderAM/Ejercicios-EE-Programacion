package VentaProducto;

public class Principal {
    public static void main(String[] args) {
        Empresa empresa1 = new Empresa();
        Producto lapices =new Producto(1,"lapices");
        Producto x1 = new Producto();
        Producto x2 = new Producto();

        empresa1.agregarProductoAInventario(lapices);
        empresa1.agregarProductoAInventario(x1);
        empresa1.agregarProductoAInventario(x2);
        empresa1.imprimirInventario();
        empresa1.buscarProducto("hola");
    }
}

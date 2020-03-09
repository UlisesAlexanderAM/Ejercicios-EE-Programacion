package CtaBancaria;
public class Principal
{
  public static void main(String[] args)
  {
       CCuenta arreglocta[]=new CCuenta[2];
    CCuenta cuenta02 = new CCuenta();
    CCuenta cuenta01 = new CCuenta("Adolfo Rodriguez Parada", "Debito", 6000, 3.5);
      //Cliente arregloc[]= new Cliente[2];
      
     
//      CCuenta cuenta01= new CCuenta();
//      CCuenta cuenta02= new CCuenta();
//    CCuenta cuenta02 = new CCuenta("Juan", "Debito",
//                                    10000, 3.5);
//    Cliente c=new Cliente();
    System.out.println("Dar nombre del Cliente:");
    cuenta02.setNombre(Leer.datoString()); 
//    cuenta02.nombre=Leer.datoString();
//    cuenta02.nombre=Leer.datoString();
//    cuenta02.asignarCliente(c);
     
//    //arregloc[0]=c;
//    
    System.out.println("Dar cuenta del cliente:");
    cuenta02.asignarCuenta(Leer.datoString());
    
    System.out.println("Dar tipo de interes de la cuenta:");
    cuenta02.asignarTipoDeInteres(Leer.datoFloat());
    System.out.println("Cantidad a Depositar:");
    cuenta02.ingreso(Leer.datoDouble());
//    
    arreglocta[0]=cuenta01;
    arreglocta[1]=cuenta02;
    
//    System.out.println(cuenta01.obtenerNombre());
//    System.out.println(cuenta01.obtenerCuenta());
//    System.out.println(cuenta01.estado());
//    System.out.println(cuenta01.obtenerTipoDeInteres());
//    System.out.println();

   // Cliente aux= cuenta01.obtenerCliente();
   
    
    //System.out.println( aux.obtenerNombre());
    
  //  System.out.println(cuenta01.obtenerCliente().obtenerNombre());
//    System.out.println(cuenta01.getNombre());
//    System.out.println(cuenta01.obtenerCuenta());
//    System.out.println("-> " + cuenta01.estado());
//    System.out.println(cuenta01.obtenerTipoDeInteres());
//    System.out.println("Cantidad a retirar:");
//    cuenta01.reintegro(Leer.datoDouble());
System.out.println("Arreglo [0]:" + arreglocta[0].getNombre());
System.out.println("Arreglo [1]:" + arreglocta[1].getNombre());
//     System.out.println(cuenta01.estado());
//   
  }
}
package CtaBancaria;
public class CCuenta
{
  // Atributos
  //private Cliente cliente;
  private String nombre;
  private String cuenta;
  private double saldo;
  private double tipoDeInteres;
  
  // M�todos constructores
public CCuenta() {
    System.out.println("Bienvenido!!!!");
}

public CCuenta(double saldo){
  this.saldo=saldo;
}
  
public CCuenta(String nombre, String cue, double sal, double tipo)
  {
    //setNombre(nombre);
    this.nombre=nombre;
    asignarCuenta(cue);
    ingreso(sal);
    asignarTipoDeInteres(tipo);
  }
        
//  public void asignarCliente(Cliente cliente)
//  {
////    if (nom.length() == 0)
////    {
////      System.out.println("Error: cadena vac�a");
////      return;
////    }
////    nombre = nom;
//      this.cliente=cliente;
//  }
  
//  public Cliente obtenerCliente()
//  {
//    return cliente;
//  }
  
  public void setNombre(String nombre)
  {    
    if (nombre.length() == 0)
    {
      System.out.println("Error: nombre no v�lida");
      return;
    }
    this.nombre = nombre;
  }
  
  public String getNombre()
  {
      return nombre;
  }
  
  public void asignarCuenta(String cuenta)
  {
    if (cuenta.length() == 0)
    {
      System.out.println("Error: cuenta no v�lida");
      return;
    }
    this.cuenta = cuenta;
  }
  
  public String obtenerCuenta()
  {
    return cuenta;
  }
  
   
  public void ingreso(double cantidad)
  {
    if (cantidad < 0)
    {
      System.out.println("Error: cantidad negativa");
      return;
    }
    saldo = saldo + cantidad;
  }
  
  public void reintegro(double cantidad)
  {
    if (saldo - cantidad < 0)
    {
      System.out.println("Error: no dispone de saldo");
      return;
    }
    saldo = saldo - cantidad;
  }

  public void asignarTipoDeInteres(double tipo)
  {
    if (tipo < 0)
    {
      System.out.println("Error: tipo no v�lido");
      return;
    }
    tipoDeInteres = tipo;
  }
  
  public double obtenerTipoDeInteres()
  {
    return tipoDeInteres;
  }

  public double estado()
  {
    return saldo;
  }

  public double getSaldo() {
    return saldo;
  }
}

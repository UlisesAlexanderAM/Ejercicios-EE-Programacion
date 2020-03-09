/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CCuenta;

/**
 *
 * @author Investigación 1
 */
public class PCliente {
 public static void main(String[] args)
  {
     Cliente c1=new Cliente();
     Cliente c2=new Cliente();
     System.out.println("Dar nombre del Cliente1:");
     c1.asignarNombre(Leer.datoString());
     System.out.println("Dar nombre del Cliente2:");
     c2.asignarNombre(Leer.datoString());
     System.out.println("El nombre es:" + c1.obtenerNombre());
     System.out.println("El nombre es:" + c2.obtenerNombre());
  }
}

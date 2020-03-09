/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CtaBancaria;

/**
 *
 * @author Investigación 1
 */
public class Cliente {
    private String nombre;
    
     public void asignarNombre(String nom)
  {
    if (nom.length() == 0)
    {
      System.out.println("Error: cadena vac�a");
      return;
    }
    nombre = nom;
  }
  
  public String obtenerNombre()
  {
    return nombre;
  }
  
}

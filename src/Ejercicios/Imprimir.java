package Ejercicios;

import java.io.Console;

public class Imprimir {
    static Console c = System.console();
    public static void Imprimir(String mensaje){
        if (c==null){
            System.out.println(mensaje);
        } else {
            c.printf(mensaje);
        }
    }
}

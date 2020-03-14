package NumerosDecimalesANumerosRomanos;


import java.util.ArrayList;

import static Ejercicios.Imprimir.Imprimir;
import static NumerosDecimalesANumerosRomanos.DecimalesARomanos.*;

public class PrincipalDecARom {
    public static void main(String[] args) {
        ArrayList numeros;
        String[] numerosRomanos;
        int[] indices;
        Imprimir("Bienvenido %nEste programa convierte una serie de numeros enteros positivos%n" +
                "en su equivalente en numeros romanos%n");
        numeros=listaNumeros();
        numerosRomanos=conversion(numeros);
        indices=getIndices();
        for (int i = 0; i < numeros.size(); i++) {
            Imprimir("Numero entero positivo: %d Numero Romano: %s%n", numeros.get(i), numerosRomanos[i]);
        }
    }
}

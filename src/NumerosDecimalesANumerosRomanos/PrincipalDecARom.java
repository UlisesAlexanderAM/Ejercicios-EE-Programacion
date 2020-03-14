package NumerosDecimalesANumerosRomanos;

import java.util.ArrayList;

import static Ejercicios.Imprimir.imprimir;
import static NumerosDecimalesANumerosRomanos.DecimalesARomanos.*;

/**
 *
 * @author Ulises Alexander Argüelles Monjaraz
 */
public class PrincipalDecARom {
    public static void main(String[] args) {
        ArrayList<Integer> numeros;
        String[] numerosRomanos;
        imprimir("Bienvenido %nEste programa convierte una serie de numeros enteros positivos%n" +
                "en su equivalente en numeros romanos%n");
        numeros=listaNumeros();
        numerosRomanos=conversion(numeros);
        for (int i = 0; i < numeros.size(); i++) {
            imprimir("Numero entero positivo: %d Numero Romano: %s%n", numeros.get(i), numerosRomanos[i]);
        }
    }
}

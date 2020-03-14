package NumerosDecimalesANumerosRomanos;

import java.util.ArrayList;

import static Ejercicios.Imprimir.imprimir;
import static Ejercicios.Leer.leerEntero;

/**
 * Clase que tiene todos los metodos necesarios para la conversion de numeros arabigos en romanos
 * @author Ulises Alexander Argüelles Monjaraz
 */
public class DecimalesARomanos {
    /**
     * Constante con los principales valores en el sistema de numeracion romana
     */
    private static final int[] VN={1000,900,500,400,100,90,50,40,10,9,5,4,1};
    /**
     * Constante con los principales simbolos del sistema de numeracion romana
     */
    private static final String[] VC={"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};

    /**
     * Metodo que pide y crea un ArrayList (Arreglo dinamico) para los numeros que queremos convertir a numeros romanos.
     * El metodo verifica que el numero dado este entre 0 y 3500; y cuando encuentra un 0 deja de almacenar numeros.
     * @return Arreglo dinamico con la lista de numeros
     */
    public static ArrayList<Integer> listaNumeros(){
        ArrayList<Integer> lista=new ArrayList<>();
        imprimir("Escribe una serie de numeros a convertir a numeros romanos" +
                "%nUno en cada linea y escribe 0 cuando ya no quieras ingresar numeros." +
                "%nEl numero no puede ser mayor a 3500%n");
        while (true){
            int num=leerEntero();
            if (num>3500 || num<0){
              imprimir("Numero no valido escriba otro:");
            }else if (num==0){
                break;
            }else {
                lista.add(num);
            }
        }
        return lista;
    }

    /**
     * Metodo que crea una copia del ArrayList y lo convierte en un arreglo de enteros
     * @param numeros - ArrayList con una serie de numeros
     * @return Arreglo de numeros enteros
     */
    private static int[] copiaListaNumeros(ArrayList<Integer> numeros){
        int[] copia=new int[numeros.size()];
        for (int i = 0; i < numeros.size(); i++) {
            copia[i]= numeros.get(i);
        }
        return copia;
    }

    /**
     * Método que crea una copia del arreglo dinámico y lo convierte a un arreglo de cadena
     * @param romanos - arreglo con los valores en el sistema de numeración romana
     * @param num - arreglo con los indices en el arreglo dinámico donde termina cada representación en números romanos
     * @return regresa un arreglo de tipo cadena donde en cada compartimiento del arreglo está la cadena que
     * corresponde a cada representación en números romanos de su equivalente en el arreglo num
     */
    private static String[] copiaNumerosRomanos(ArrayList<String> romanos, int[] num){
        String[] copia = new String[num.length];
        int j=0;
        for (int i = 0; i < copia.length; i++) {
            copia[i]="";
            while (j<=num[i]){
                copia[i]+=romanos.get(j);
                j++;
            }
        }
        return copia;
    }

    /**
     * Metodo que convierte una lista de numeros arabigos en numeros romanos
     * @param numeros - Arreglo dinamico con una lista de numeros enteros positivos
     * @return Un arreglo de cadena con la represantacion de los numeros arabigos en el sistema romano
     */
    public static String[] conversion(ArrayList<Integer> numeros){
        ArrayList<String> numerosRomanos = new ArrayList<>();
        int[] numerosTemp=copiaListaNumeros(numeros);
        int k=0;
        int[] indices = new int[numeros.size()];
        for (int i = 0; i < numeros.size(); i++) {
            int j=0;
            while (numerosTemp[i] >0){
                if (numerosTemp[i] >=VN[j]){
                    numerosRomanos.add(VC[j]);
                    numerosTemp[i]-=VN[j];
                    k++;
                } else {
                    j++;
                }
            }
            indices[i]=k-1;
        }
        return copiaNumerosRomanos(numerosRomanos, indices);
    }
}

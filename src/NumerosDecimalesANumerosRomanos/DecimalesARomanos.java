package NumerosDecimalesANumerosRomanos;

import java.util.ArrayList;

import static Ejercicios.Imprimir.Imprimir;
import static Ejercicios.Leer.leerEntero;

public class DecimalesARomanos {
    private static final int[] VN={1000,900,500,400,100,90,50,40,10,9,5,4,1};
    private static final String[] VC={"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
    private static int[] indices;

    public static ArrayList listaNumeros(){
        ArrayList lista=new ArrayList();
        int i=0;
        Imprimir("Escribe una serie de numeros a convertir a numeros romanos" +
                "%nUno en cada linea y escribe 0 cuando ya no quieras ingresar numeros." +
                "%nEl numero no puede ser mayor a 3500%n");
        while (true){
            int num=leerEntero();
            if (num>3500 || num<0){
              Imprimir("Numero no valido escriba otro:");
            }else if (num==0){
                break;
            }else {
                lista.add(num);
                i++;
            }
        }
        return lista;
    }
    private static int[] copiaListaNumeros(ArrayList numeros){
        int[] copia=new int[numeros.size()];
        for (int i = 0; i < numeros.size(); i++) {
            copia[i]=(int) numeros.get(i);
        }
        return copia;
    }

    private static String[] copiaNumerosRomanos(ArrayList romanos, int[] num){
        String[] copia = new String[num.length];
        int j=0;
        for (int i = 0; i < copia.length; i++) {
            copia[i]="";
            while (j<=num[i]){
                copia[i]+=(String) romanos.get(j);
                j++;
            }
        }
        return copia;
    }

    public static String[] conversion(ArrayList numeros){
        ArrayList numerosRomanos = new ArrayList();
        int[] numerosTemp=copiaListaNumeros(numeros);
        int k=0;
        indices=new int[numeros.size()];
        for (int i = 0; i < numeros.size(); i++) {
            int j=0;
            while ((int) numerosTemp[i] >0){
                if ((int) numerosTemp[i] >=VN[j]){
                    numerosRomanos.add(VC[j]);
                    numerosTemp[i]-=VN[j];
                    k++;
                } else {
                    j++;
                }
            }
            indices[i]=k-1;
        }
        return copiaNumerosRomanos(numerosRomanos,indices);
    }

    public static int[] getIndices() {
        return indices;
    }
}

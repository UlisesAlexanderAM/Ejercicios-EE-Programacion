package Arregl3Dimensiones;

import CtaBancaria.CCuenta;
import Ejercicios.Imprimir;
import Ejercicios.Leer;

import static Arregl3Dimensiones.Arreglo3D.*;

public class PrincipalA3D {
    public static void main(String[] args) {
        double dinero;
        String[][] matrix = getReferencias();
        CCuenta[] ventasTotales = new CCuenta[8];
        int i=0;
        for (int j = 0; j < 2; j++) {
            for (int k = 0; k < 2; k++) {
                for (int l = 0; l < 2; l++) {
                    dinero = Leer.leerDouble("Ingrese las ventas totales de %s del %s de la %s: ", matrix[0][l], matrix[1][k], matrix[2][j]);
                    ventasTotales[i] = new CCuenta(dinero);
                    i++;
                }
            }
        }
        i=0;
        Imprimir.Imprimir("%n");
        for (int j = 0; j < 2; j++) {
            for (int k = 0; k < 2; k++) {
                for (int l = 0; l < 2; l++) {
                    Imprimir.Imprimir("Las ventas totales de %s del %s de la %s son: %f %n",matrix[0][l], matrix[1][k], matrix[2][j], ventasTotales[i].getSaldo());
                    i++;
                }
            }
        }
    }
}

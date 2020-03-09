package Arreglo3Dimensiones;

import CtaBancaria.CCuenta;
import Ejercicios.Imprimir;
import Ejercicios.Leer;

import static Arreglo3Dimensiones.Arreglo3D.*;

public class PrincipalA3D {
    public static void main(String[] args) {
        double dinero;
        String[][] matrix = getReferencias();
        CCuenta[][][] ventasTotales = new CCuenta[2][2][2];
        for (int k = 0; k < 2; k++) {
            for (int j = 0; j < 2; j++) {
                for (int i = 0; i < 2; i++) {
                    dinero = Leer.leerDouble("Ingrese las ventas totales de %s del %s de la %s: ", matrix[0][i], matrix[1][j], matrix[2][k]);
                    ventasTotales[i][j][k] = new CCuenta(dinero);
                }
            }
        }
        Imprimir.Imprimir("%n");
        for (int k = 0; k < 2; k++) {
            for (int j = 0; j < 2; j++) {
                for (int i = 0; i < 2; i++) {
                    Imprimir.Imprimir("Las ventas totales de %s del %s de la %s son: %f %n",matrix[0][i], matrix[1][j], matrix[2][k], ventasTotales[i][j][k].getSaldo());
                }
            }
        }
    }
}

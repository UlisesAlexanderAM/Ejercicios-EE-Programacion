package Arregl3Dimensiones;

import CtaBancaria.CCuenta;
import Ejercicios.Imprimir;
import Ejercicios.Leer;

import static Arregl3Dimensiones.Arreglo3D.*;

public class main {
    public static void main(String[] args) {
        double dinero;
        String[][] matrix = getReferencias();
        CCuenta[] ventasTotales = new CCuenta[8];
        for (int i = 0; i < 8;i++){
            if (i<4){
                for (int j = 0; j < 2; j++) {
                    dinero=Leer.leerDouble("Ingrese las ventas totales de %s del %s de la %s",matrix[0][j],matrix[1][0],matrix[2][0]);
                    ventasTotales[i]=new CCuenta(dinero);
                    Imprimir.Imprimir("%f",ventasTotales[i].getSaldo());
                }
            }
        }
    }
}

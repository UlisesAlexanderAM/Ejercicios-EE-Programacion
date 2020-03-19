package Arreglo3Dimensiones;

import CtaBancaria.CCuenta;

import static Ejercicios.Imprimir.imprimir;
import static Ejercicios.Leer.*;

public class PrincipalA3D {
    public static void main(String[] args) {
        double dinero;
        MesesYearsSucursales mys = new MesesYearsSucursales();
        mys.setYears(mys.generarYears(leerEntero("Ingrese el numero de años a ingresar: "),leerEntero("Ingrese el primer año a ingresar: ")));
        mys.rangoMeses(leerEntero("Ingrese el intervalo de los meses: "));
        mys.setSucursales(mys.pedirSucursales());
        String[][] matrix = mys.getReferencias();
        int m=mys.getRangoMeses().length,a=mys.getYears().length,s=mys.getSucursales().length;
        CCuenta[][][] ventasTotales = new CCuenta[m][a][s];
        for (int k = 0; k < s; k++) {
            for (int j = 0; j < a; j++) {
                for (int i = 0; i < m; i++) {
                    dinero = leerDouble("Ingrese las ventas totales de %s del %s de la %s: ", matrix[0][i], matrix[1][j], matrix[2][k]);
                    ventasTotales[i][j][k] = new CCuenta(dinero);
                }
            }
        }
        imprimir("%n");
        for (int k = 0; k < s; k++) {
            for (int j = 0; j < a; j++) {
                for (int i = 0; i < m; i++) {
                    imprimir("Las ventas totales de %s del %s de la %s son: %f %n",matrix[0][i], matrix[1][j], matrix[2][k], ventasTotales[i][j][k].getSaldo());
                }
            }
        }
    }
}

package Arreglo3Dimensiones;

import Ejercicios.Leer;

public class Arreglo3D {
    public static String[] meses = new String[]{"Enero", "Febrero","Marzo","Abril","Mayo","Junio","Agosto","Septiembre",
            "Octubre","Noviembre","Diciembre"};
    private static String[] rangoMeses = new String[]{""};
    private static String[] years = new String[]{""};
    private static String[] sucursales = new String[]{""};
    private static String[][] referencias = new  String[][]{meses,years,sucursales};

    public static  String[] rangoMeses(String mesInicial, int intervalo){
        int j=0;
        for (int i = 0; i < 12; i+=intervalo) {
            rangoMeses[j]=meses[i];
            j++;
        }
        return rangoMeses;
    }

    public static String[] generarYears(int nYears,int limiteInferior){
        int year=limiteInferior;
        for (int i = 0; i < nYears; i++) {
            years[i]=Integer.toString(year);
            year++;
        }
        return years;
    }

    public static String[] pedirSucursales(){
        String suc;
        int i=0;
        while (true){
            suc=Leer.leerCadena("Ingrese el nombre de la sucursal o%nfin o FIN para dejar de ingresar sucursales");
            if (suc=="fin"||suc=="FIN"){
                break;
            }else {
                sucursales[i]=suc;
                i++;
            }
        }
        return sucursales;
    }

    public static String[][] getReferencias() {
        return referencias;
    }

    public static String[] getMeses() {
        return meses;
    }

    public static String[] getYears() {
        return years;
    }

    public static String[] getSucursales() {
        return sucursales;
    }
}

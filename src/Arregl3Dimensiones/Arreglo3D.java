package Arregl3Dimensiones;

public class Arreglo3D {
    static String[] meses = new String[]{"Enero", "Febrero"};
    static String[] years = new String[]{"2018","2019"};
    static String[][] fecha = new  String[][]{meses,years};
    static String[] sucursales = new String[]{"Sucursal Copilco","Sucursal Insurgentes"};
    static String[][] referencias = new  String[][]{meses,years,sucursales};

    public static String[][] getReferencias() {
        return referencias;
    }
}

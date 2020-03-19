package Arreglo3Dimensiones;

import Ejercicios.Leer;

import java.util.ArrayList;

public class MesesYearsSucursales {
    public final String[] MESES = new String[]{"Enero", "Febrero","Marzo","Abril","Mayo","Junio","Julio","Agosto","Septiembre",
            "Octubre","Noviembre","Diciembre"};
    private  String[] rangoMeses;
    private  String[] years;
    private  String[] sucursales;
    private  String[][] referencias;

    private void setReferencias() {
        referencias = new String[][]{rangoMeses,years,sucursales};
    }

    /**
     * Metodo que modifica el atributo rangoMeses para que ingrese los meses deseados basados en un intervalo.
     * Si el intervalo es 1 copia la constante MESES a rangoMeses.
     * Si el intervalo es diferente va accediendo a MESES de manera directa. Por ejemplo:
     * si intervalo tuviera valor de 6 el metodo imprimiria Enero (Posicion 0 en meses), y Julio (Posicion 6 en meses),
     * es decir, 6 meses después de Enero esta Julio
     * @param intervalo intervalo de meses a desear
     */
    public void rangoMeses(int intervalo){
        int j=0;
        if (intervalo==1) {
            rangoMeses = MESES;
        }else {
            rangoMeses=new String[12/intervalo];
            for (int i = 0; i < 12; i += intervalo) {
                rangoMeses[j] = MESES[i];
                j++;
            }
        }
    }

    public String[] generarYears(int nYears,int limiteInferior){
        int year=limiteInferior;
        years= new String[nYears];
        for (int i = 0; i < nYears; i++) {
            years[i]=Integer.toString(year);
            year++;
        }
        return years;
    }

    private String[] conversion(ArrayList<String> sucs){
        sucursales=new String[sucs.size()];
        for (int i = 0; i < sucs.size(); i++) {
            sucursales[i]=sucs.get(i);
        }
        return sucursales;
    }
    public String[] pedirSucursales(){
        String suc;
        int i=0;
        ArrayList<String> sucs=new ArrayList<>();
        while (true){
            suc=Leer.leerCadena("Ingrese el nombre de la sucursal, fin o FIN para dejar de ingresar sucursales:%n");
            if (suc.equals("fin") || suc.equals("FIN")){
                break;
            }else {
                sucs.add(suc);
                i++;
            }
        }
        sucursales=conversion(sucs);
        return sucursales;
    }

    public void setYears(String[] years) {
        this.years = years;
    }

    public void setSucursales(String[] sucursales) {
        this.sucursales = sucursales;
    }
    public String[][] getReferencias() {
        setReferencias();
        return referencias;
    }

    public String[] getSucursales() {
        return sucursales;
    }

    public String[] getYears() {
        return years;
    }

    public String[] getRangoMeses() {
        return rangoMeses;
    }
}

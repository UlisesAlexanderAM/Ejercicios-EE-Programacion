package Ejercicios;

import java.io.*;

import static java.lang.Float.parseFloat;
import static java.lang.Integer.parseInt;

public class Leer {
    static Console c = System.console();
    public static String dato ()
    {
        String x = "";
        try
        {
            InputStreamReader isr = new InputStreamReader (System.in);
            BufferedReader in = new BufferedReader (isr);
            x = in.readLine ();
        }
        catch (IOException e)
        {
            System.err.print ("Error: " + e.getMessage ());
        }
        return x;
    }
    public static int datoInt ()
    {
        try
        {
            return Integer.parseInt (dato ());
        }
        catch (NumberFormatException e)
        {
            return 0;
        }
    }
    public static float datoFloat ()
    {
        try
        {
            return parseFloat(dato());
        }
        catch (Exception e)
        {
            return Float.NaN;
        }
    }
    public static double datoDouble ()
    {
        try
        {
            return Double.parseDouble(dato());
        }
        catch (Exception e)
        {
            return Double.NaN;
        }
    }

    public static String datoString ()
    {
        return(dato());
    }
    public static int leerEntero(String mensaje,Object... args){
        if (c==null) {
            System.out.printf(mensaje,args);
            return datoInt();
        } else {
            return parseInt(c.readLine(mensaje,args));
        }
    }
    public static float leerFlotante(String mensaje,Object... args){
        if (c==null) {
            System.out.printf(mensaje,args);
            return datoFloat();
        } else {
            return parseFloat(c.readLine(mensaje,args));
        }
    }
    public static String leerCadena(String mensaje,Object... args){
        if (c==null) {
            System.out.printf(mensaje,args);
            return datoString();
        } else {
            return c.readLine(mensaje,args);
        }
    }
    public static double leerDouble(String mensaje,Object... args){
        if (c==null) {
            System.out.printf(mensaje,args);
            double variable=datoDouble();
            return variable;
        } else {
            return Double.parseDouble(c.readLine(mensaje,args));
        }
    }
}

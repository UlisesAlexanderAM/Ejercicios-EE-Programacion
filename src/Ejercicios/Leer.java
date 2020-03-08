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

    public static String datoString ()
    {
        return(dato());
    }
    public static int leerEntero(String mensaje, int variable){
        if (c==null) {
            System.out.println(mensaje);
            variable=datoInt();
        } else {
            variable = parseInt(c.readLine(mensaje));
        }
        return variable;
    }
    public static float leerFlotante(String mensaje, float variable){
        if (c==null) {
            System.out.println(mensaje);
            variable=datoFloat();
        } else {
            variable = parseFloat(c.readLine(mensaje));
        }
        return variable;
    }
    public static String leerCadena(String mensaje, String variable){
        if (c==null) {
            System.out.println(mensaje);
            variable=datoString();
        } else {
            variable = c.readLine(mensaje);
        }
        return variable;
    }
}

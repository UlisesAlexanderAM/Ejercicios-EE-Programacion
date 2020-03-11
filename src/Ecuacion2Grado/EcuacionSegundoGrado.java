package Ecuacion2Grado;

import org.jetbrains.annotations.NotNull;
import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

public class EcuacionSegundoGrado {
    private double[] coeficientes;
    private double discriminante;
    private double[] soluciones;

    public double[] resolver(double[]coeficientes, double discriminante){
        if (discriminante==0){
            soluciones[0]=-(coeficientes[1]/(2*coeficientes[0]));
        } else {
            soluciones[0]=(-coeficientes[1]+sqrt(discriminante))/(2*coeficientes[0]);
            soluciones[1]=(-coeficientes[1]-sqrt(discriminante))/(2*coeficientes[0]);
        }
        return soluciones;
    }
    public void discriminante(@NotNull double[] coeficientes){
        discriminante=pow(coeficientes[1],2)-(4*coeficientes[0]*coeficientes[2]);
    }

    public EcuacionSegundoGrado(@NotNull double[] coeficientes){
        this.coeficientes=coeficientes;
        discriminante=pow(coeficientes[1],2)-(4*coeficientes[0]*coeficientes[2]);
    }
    public void setCoeficientes(double[] coeficientes) {
        this.coeficientes = coeficientes;
    }
    public double[] getCoeficientes() {
        return coeficientes;
    }
    public double getDiscriminante(){
        return discriminante;
    }
    public double[] getSoluciones() {
        return soluciones;
    }
}

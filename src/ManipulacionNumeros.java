import java.io.Console;

public class ManipulacionNumeros {
    public static void main(String[] args) {
        int opcion
        Console c =System.console();
        c.printf("Menu%n1.-Operaciones Basicas%n2.-Contar Positivos" +
                "negativos½n3.-Contar Rangos%n4.-Contar Pares Impares%n");
        do {
            opcion =Integer.parseInt(c.readLine("Ingrese el numero con la opcion elegida: "));
            if (opcion<=0 || opcion>=5){
                c.printf("Opcion invalida");
            }else if (opcion==1){
                do {
                    c.printf("Menu%n1.-Suma%n2.- Resta%n3.-Multiplicacion%n4.-Division");
                    opcion = Integer.parseInt(c.readLine("Ingrese el numero con la opcion elegida: "));
                }while (opcion<1 || opcion>4)
            }else if (opcion==2){

            }else if (opcion==3){

            }else if (opcion==4){

            }
        }while (opcion<1 || opcion>4);
    }
}

import java.io.Console;

public class ManipulacionNumeros extends Numeros {
    public static void main(String[] args) {
        int opcion,num1,num2;
        Numeros nums = new Numeros();
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
                    if (opcion<=0 || opcion>=5){
                        c.printf("Opcion invalida");
                    }else if (opcion==1){
                        nums.setN1(Integer.parseInt(c.readLine("Ingrese el primer numero: ")));
                        nums.setN2(Integer.parseInt(c.readLine("Ingrese el segundo numero: ")));
                        num1=nums.getN1();
                        num2=nums.getN2();
                        int suma= nums.suma(num1,num2);
                        c.printf("La suma de %d + %d es: %d",num1,num2,suma);
                    }else if (opcion==2){
                        nums.setN1(Integer.parseInt(c.readLine("Ingrese el primer numero: ")));
                        nums.setN2(Integer.parseInt(c.readLine("Ingrese el segundo numero: ")));
                        num1=nums.getN1();
                        num2=nums.getN2();
                        int resta= nums.resta(num1,num2);
                        c.printf("La resta de %d - %d es: %d",num1,num2,resta);
                    }else if (opcion==3){
                        nums.setN1(Integer.parseInt(c.readLine("Ingrese el primer numero: ")));
                        nums.setN2(Integer.parseInt(c.readLine("Ingrese el segundo numero: ")));
                        num1=nums.getN1();
                        num2=nums.getN2();
                        int multiplicacion= nums.multiplicacion(num1,num2);
                        c.printf("La multiplicaion de %d x %d es: %d",num1,num2,multiplicacion);
                    }else {
                        fnum1=Float.parseFloat(c.readLine("Ingrese el primer numero: "));
                        do {
                            fnum2=Float.parseFloat(c.readLine("Ingrese el segundo numero: "));
                            if (fnum2==0){
                                c.printf("Valor invalido, division entre 0");
                            }
                        }while (fnum2==0);
                        float division= nums.division(fnum1,fnum2);
                        c.printf("La division de %d / %d es: %d",fnum1,fnum2,division);
                    }
                }while (opcion<1 || opcion>4);
            }else if (opcion==2){
                for (int i = 0; i <= 5; i++) {
                    int pos,neg;
                    num1=Integer.parseInt(c.readLine("Escribe el numero #%d",i));
                }
            }else if (opcion==3){

            }else {

            }
        }while (opcion<1 || opcion>4);
    }
}

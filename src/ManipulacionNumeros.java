import java.io.Console;

public class ManipulacionNumeros extends Numeros {
    public static void main(String[] args) {
        int opcion,num1,num2;
        Numeros nums = new Numeros();
        Console c =System.console();
        c.printf("Menu%n1.-Operaciones Basicas%n2.-Contar Positivos" +
                "negativos%n3.-Contar Rangos%n4.-Contar Pares Impares%n");
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
                        c.printf("La suma de %d + %d es: %dn",num1,num2,suma);
                    }else if (opcion==2){
                        nums.setN1(Integer.parseInt(c.readLine("Ingrese el primer numero: ")));
                        nums.setN2(Integer.parseInt(c.readLine("Ingrese el segundo numero: ")));
                        num1=nums.getN1();
                        num2=nums.getN2();
                        int resta= nums.resta(num1,num2);
                        c.printf("La resta de %d - %d es: %dn",num1,num2,resta);
                    }else if (opcion==3){
                        nums.setN1(Integer.parseInt(c.readLine("Ingrese el primer numero: ")));
                        nums.setN2(Integer.parseInt(c.readLine("Ingrese el segundo numero: ")));
                        num1=nums.getN1();
                        num2=nums.getN2();
                        int multiplicacion= nums.multiplicacion(num1,num2);
                        c.printf("La multiplicaion de %d x %d es: %dn",num1,num2,multiplicacion);
                    }else {
                        nums.setNum1(Float.parseFloat(c.readLine("Ingrese el primer numero: ")));
                        float fnum1=nums.getNum1();
                        float fnum2;
                        do {
                            nums.setNum2(Float.parseFloat(c.readLine("Ingrese el segundo numero: ")));
                            fnum2=nums.getNum2();
                            if (fnum2==0){
                                c.printf("Valor invalido, division entre 0");
                            }
                        }while (fnum2==0);
                        float division= nums.division(fnum1,fnum2);
                        c.printf("La division de %f / %f es: %fn",fnum1,fnum2,division);
                    }
                }while (opcion<1 || opcion>4);
            }else if (opcion==2){
                int pos=0,neg=0;
                for (int i = 0; i <= 5; i++) {
                    num1=Integer.parseInt(c.readLine("Escribe el numero #%dn",i));
                    nums.validarPosNeg(num1,pos,neg);
                }
                c.printf("Positivos: %d, Negativos: %dn",pos,neg);
            }else if (opcion==3){
                int rango10=0,rango100=0,rangoMayor100=0;
                for (int i = 0; i <= 10; i++) {
                    do {
                        num1=Integer.parseInt(c.readLine("Escribe un numero: "));
                    }while (num1<=0);
                    rango10+=nums.validarRango(num1,1,10);
                    rango100+=nums.validarRango(num1,11,100);
                    rangoMayor100+=nums.validarRango(num1,101);
                }
                c.printf("Numeros entre 1-10: %dnNumeros entre 11-100: %dnNumeros mayores a 100:%dn",rango10,rango100,rangoMayor100);
            }else {
                int pares=0,impares=0;
                for (int i = 0; i <= 5; i++) {
                    do {
                        num1=Integer.parseInt(c.readLine("Escribe un numero: "));
                    }while (num1<=0);
                    nums.validarParesImpares(num1,pares,impares);
                }
                c.printf("Pares: %d, Impares: %dn",pares,impares);
            }
        }while (opcion<1 || opcion>4);
    }
}

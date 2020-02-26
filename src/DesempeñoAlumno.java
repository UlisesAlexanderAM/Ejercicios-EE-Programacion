import java.io.Console;

class DesempeñoAlumno extends Alumno {

    public static void main(String[] args) {
        int suma=0, calif;
        Console c = System.console();
        String nombre = c.readLine("Ingrese el nombre del alumno: ");
        Alumno alumno = new Alumno(nombre);
        for (int i = 0; i <= 5; i++) {
            do {
                String s= c.readLine("Ingrese la calificacion %d: ", i+1);
                calif = Integer.parseInt(s);
            }while (calif<0 || calif>10);
            suma+=calif;
        }
        alumno.calcularPromedio(suma,5);
        float prom=alumno.getPromedio();
        if (prom>=9.5 && prom<=10){
            c.printf("%s: Excelente%n",nombre);
        } else if (prom>=8.4 && prom<=9.4){
            c.printf("%s: Muy bien%n",nombre);
        } else if (prom>=7.5 && prom<=8.4){
            c.printf("%s: Bien%n",nombre);
        } else if (prom>=7.0 && prom<=7.4){
            c.printf("%s: Regular%n",nombre);
        } else {
            c.printf("%s: Mejor suerte para la proxima%n",nombre);
        }
    }
}

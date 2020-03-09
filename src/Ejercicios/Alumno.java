package Ejercicios;

class Alumno {
  private String nombre;
  private float promedio;

  public void calcularPromedio(int suma, int n) {
    promedio= (float) suma / (float) n;
  }
  public float getPromedio(){
    return promedio;
  }
  public Alumno (String nom){
    nombre=nom;
  }

  public String getNombre() {
    return nombre;
  }

  public void Desempenio(float promedio) {
    if (promedio >= 9.5 && promedio <= 10) {
      Imprimir.Imprimir("%s: Excelente%n", Alumno.getNombre());
    } else if (promedio >= 8.4 && promedio <= 9.4) {
      //c.printf("%s: Muy bien%n", alumno.getNombre());
    } else if (promedio >= 7.5 && promedio <= 8.4) {
      //c.printf("%s: Bien%n", alumno.getNombre());
    } else if (promedio >= 7.0 && promedio <= 7.4) {
      //c.printf("%s: Regular%n", alumno.getNombre());
    } else {
      //c.printf("%s: Mejor suerte para la proxima%n", alumno.getNombre());
    }
  }
}

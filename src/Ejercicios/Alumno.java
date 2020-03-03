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

}

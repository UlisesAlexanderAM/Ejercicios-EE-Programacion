class Alumno {
  @SuppressWarnings("CanBeFinal")
  private String nombre;
  private float promedio;

  public void calcularPromedio(int suma, int n) {
    //noinspection IntegerDivisionInFloatingPointContext
    promedio=suma/n;
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

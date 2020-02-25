class Alumno implements ModificarAlumno {
  private int calificacion;
  private String nombre;
  private float promedio;

  float calcularPromedio(int suma, int n) {
    promedio=suma/n;
  }
  public int getCalificacion(){
    return calificacion;
  }
  public String getNombre(){
    return nombre;
  }
  public void setCalificacion(int calif){
    this.calificacion=calif;
  }
  public void setNombre(String nom){
    this.nombre=nom;
  }

}

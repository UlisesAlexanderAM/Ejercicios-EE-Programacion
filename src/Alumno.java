class Alumno implements ModificarAlumno {
  private int calificacion;
  private String nombre;
  private float promedio;

  void calcularPromedio(int suma, int n) {
    promedio=suma/n;
  }
  public float getPromedio(){
    return promedio;
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
  public Alumno (String nom){
    nombre=nom;
  }
  public Alumno (){
  }

}

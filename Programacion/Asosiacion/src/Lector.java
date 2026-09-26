public class Lector {
 private String nombre;
 private String cedula;
 private Libro libroActual;

 public Lector(){

 }
 public Lector(String nombre, String cedula){
     this.nombre= nombre;
     this.cedula= cedula;
 }
  public String getNombre() {
        return nombre;
    }

    public String getCedula() {
        return cedula;
    }
 public void setNombre(String nombre) {
    this.nombre = nombre;
 }
 public void setCedula(String cedula) {
    this.cedula = cedula;
 }
 public void tomarPrestado(Libro libro) {
    if (libroActual != null) {
        System.out.println("El lector ya tiene un libro prestado: " + libroActual.getTitulo() + "devolverlo primero");
    } else {
        if (libro.prestar()) {
            libroActual= libro;
            System.out.println("El lector " + nombre + " ha tomado prestado el libro: " + libro.getTitulo());
        }
    }
    }
    public void devolverLibro() {
        if (libroActual == null) {
            System.out.println("El lector " + nombre + " no tiene ningún libro prestado.");
        } else {
           libroActual.devolver();
           libroActual = null;
        }
    }
    public void mostrarEstado(){
        String estado = (libroActual != null) ? "Tiene un libro prestado: " + libroActual.getTitulo() : "Sin libro prestado";
        System.out.println("Lector: " + nombre + " Libro: " + estado);
    }
}


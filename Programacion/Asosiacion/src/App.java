public class App {
    public static void main(String[] args) throws Exception {
        Libro libro1 = new Libro("Cien Años de Soledad", "Gabriel García Márquez");
        Libro libro2 = new Libro("El Principito", "Antoine de Saint-Exupéry");
        Lector lector1 = new Lector("Juan Pérez", "123456789");
        Lector lector2 = new Lector("María López", "987654321");

        lector1.tomarPrestado(libro1);
        lector2.tomarPrestado(libro2);

        System.out.println();
        lector1.mostrarEstado();
        lector2.mostrarEstado();
   System.out.println();
   lector1.tomarPrestado(libro2);

   System.out.println();
   lector1.devolverLibro();
   lector1.tomarPrestado(libro2);

   System.out.println();
    lector1.mostrarEstado();
    lector2.mostrarEstado();

    }
}

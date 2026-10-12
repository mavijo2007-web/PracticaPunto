public class App {
    public static void main(String[] args) throws Exception {
        Libro libro1 = new Libro("El Quijote", "Miguel de Cervantes");
        Libro libro2 = new Libro("Cien años de soledad", "Gabriel García Márquez");
        Libro libro3 = new Libro("1984", "George Orwell"); 
        
        Biblioteca1 biblioteca = new Biblioteca1("Biblioteca Central");
        biblioteca.agregarLibro(libro1);
        biblioteca.agregarLibro(libro2);
        biblioteca.agregarLibro(libro3);

        System.out.println("Catálogo de la biblioteca:");
        biblioteca.mostrarCatalogo();

        biblioteca.buscarPorAutor("Gabriel García Márquez");
        System.out.println();
        biblioteca.buscarPorAutor("J.K. Rowling");

    }
}

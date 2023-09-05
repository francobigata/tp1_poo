package ar.edu.unlu.prog1.punto6;

import ar.edu.unlu.prog1.punto6.Biblioteca;
import ar.edu.unlu.prog1.punto6.Libro;

public class MainBiblioteca {
    public static void main(String[] args) {
        // Crear algunos libros
        Libro libro1 = new Libro("El Señor de los Anillos", "J.R.R. Tolkien", "978-84-450-7559-2", 1000, 5, 1954);
        Libro libro2 = new Libro("Cien años de soledad", "Gabriel García Márquez", "978-84-8306-674-7", 432, 3, 1967);

        // Crear una biblioteca y agregar los libros
        Libro[] libros = new Libro[10]; // Puedes ajustar el tamaño según sea necesario
        Biblioteca biblioteca = new Biblioteca(libros);
        biblioteca.agregarLibro(libro1);
        biblioteca.agregarLibro(libro2);

        // Mostrar información de los libros
        System.out.println("Información de los libros en la biblioteca:");
        for (int i = 0; i < biblioteca.getCantidadLibros(); i++) {
            Libro libro = biblioteca.getLibro(i);
            libro.mostrarDatosLibro();
            System.out.println();
        }

        // Realizar préstamo y devolución de libros
        System.out.println("Realizando préstamo y devolución de libros:");
        Libro libroPrestamo = biblioteca.getLibro(0);
        if (libroPrestamo.prestar()) {
            System.out.println("Se prestó un ejemplar de " + libroPrestamo.getTitulo());
        } else {
            System.out.println("No quedan ejemplares disponibles de " + libroPrestamo.getTitulo());
        }

        Libro libroDevolucion = biblioteca.getLibro(1);
        libroDevolucion.devolver();
        System.out.println("Se devolvió un ejemplar de " + libroDevolucion.getTitulo());

        // Mostrar información actualizada de los libros
        System.out.println("\nInformación de los libros en la biblioteca después de las operaciones:");
        for (int i = 0; i < biblioteca.getCantidadLibros(); i++) {
            Libro libro = biblioteca.getLibro(i);
            libro.mostrarDatosLibro();
            System.out.println();
        }
    }
}

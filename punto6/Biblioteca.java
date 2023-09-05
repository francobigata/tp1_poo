package ar.edu.unlu.prog1.punto6;

public class Biblioteca {
    private Libro[] libros;
    private int cantidadLibros;

    public Biblioteca(Libro[] libros) {
        this.libros = libros;
        cantidadLibros = 0;
    }

    public void agregarLibro(Libro libro) {
        this.libros[cantidadLibros] = libro;
        this.cantidadLibros += 1;
    }

    public int getCantidadLibros() {
        return cantidadLibros;
    }

    public Libro getLibro(int index) {
        if (index >= 0 && index < cantidadLibros) {
            return libros[index];
        }
        return null;
    }
}

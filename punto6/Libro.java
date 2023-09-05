package ar.edu.unlu.prog1.punto6;

public class Libro {
    private String titulo;
    private String autor;
    private String isbn;
    private int paginas;
    private int cantEjemplares;
    private int anio;
    private int cantEjemplaresPrestados;


    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public int getPaginas() {
        return paginas;
    }

    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }

    public int getCantEjemplares() {
        return cantEjemplares;
    }

    public void setCantEjemplares(int cantEjemplares) {
        this.cantEjemplares = cantEjemplares;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public int getCantEjemplaresPrestados() {
        return cantEjemplaresPrestados;
    }

    public void setCantEjemplaresPrestados(int cantEjemplaresPrestados) {
        this.cantEjemplaresPrestados = cantEjemplaresPrestados;
    }

    public Libro (String titulo, String autor, String isbn, int paginas, int cantEjemplares, int anio){
        this.titulo = titulo;
        this.autor = autor;
        this.isbn = isbn;
        this.paginas = paginas;
        this.cantEjemplares = cantEjemplares;
        this.anio = anio;
        this.cantEjemplaresPrestados = 0;
    }

    public void mostrarDatosLibro(){
        System.out.println("El libro " + this.titulo + " creado por el autor " + this.autor +
                " en el año " + this.anio + ", tiene " + this.paginas + " páginas, quedan " +
                (this.cantEjemplares - this.cantEjemplaresPrestados) + " ejemplares disponibles y se prestaron " +
                this.cantEjemplaresPrestados + " ejemplares.");
    }



    public boolean prestar(){
        if (cantEjemplares > cantEjemplaresPrestados){
            cantEjemplaresPrestados++;
            return true;
        }else {
            return false;
        }
    }


    public void devolver(){
        if (this.cantEjemplaresPrestados > 0){
            cantEjemplaresPrestados--;
        }
    }

}

public class libro {
    // Atributos
    private String titulo;
    private String autor;
    private int numeroEjemplares;
    private int prestados;

    // Constructor por defecto
    public libro() {
        this.titulo = "";
        this.autor = "";
        this.numeroEjemplares= 0;
        this.prestados = 0;
    }

    // Constructor con parámetros
    public libro(String titulo, String autor, int numeroEjemplares, int prestados) {
        this.titulo = titulo;
        this.autor = autor;
        this.numeroEjemplares = numeroEjemplares;
        this.prestados = prestados;
    }

    // Getters y setters
    public String getTitulo() { return titulo; }
    public void setTitulo(String titulo) { this.titulo = titulo; }

    public String getAutor() { return autor; }
    public void setAutor(String autor) { this.autor = autor; }

    public int getNumeroEjemplares() { return numeroEjemplares; }
    public void setNumeroEjemplares(int numeroEjemplares) { this.numeroEjemplares = numeroEjemplares; }

    public int getPrestados() { return prestados; }
    public void setPrestados(int prestados) { this.prestados = prestados; }

    // Método préstamo
    public boolean prestar() {
        if (prestados < numeroEjemplares) {
            prestados++;
            return true;
        } else {
            return false;
        }
    }

    // Método devolución
    public boolean devolver() {
        if (prestados > 0) {
            prestados--;
            return true;
        } else {
            return false;
        }
    }

    // Método toString
    @Override
    public String toString() {
        return "Libro: " + titulo + " | Autor: " + autor + 
               " | Ejemplares: " + numeroEjemplares + 
               " | Prestados: " + prestados;
    }
}


package Ejer2;

public class Publicacion {
    private int codigo;
    private String titulo;
    private int anioPublicacion;
    
    public Publicacion(int codigo, String titulo, int anioPublicacion) {
        this.codigo = codigo;
        this.titulo = titulo;
        this.anioPublicacion = anioPublicacion;
    }
    
    public int getCodigo() {
        return codigo;
    }
    
    public String getTitulo() {
        return titulo;
    }
    
    public int getAnioPublicacion() {
        return anioPublicacion;
    }
    
    @Override
    public String toString() {
        return "Código: " + codigo + ", Título: " + titulo + ", Año: " + anioPublicacion;
    }
}
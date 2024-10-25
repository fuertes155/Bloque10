package Ejer2;

public class Libro extends Publicacion implements IPrestable {
    private boolean prestado;
    
    public Libro(int codigo, String titulo, int anioPublicacion) {
        super(codigo, titulo, anioPublicacion);
        this.prestado = false;
    }
    
    @Override
    public void prestar() {
        if (!prestado) {
            prestado = true;
        }
    }
    
    @Override
    public void devolver() {
        if (prestado) {
            prestado = false;
        }
    }
    
    @Override
    public boolean prestado() {
        return prestado;
    }
    
    @Override
    public String toString() {
        return super.toString() + ", Prestado: " + (prestado ? "Sí" : "No");
    }
}
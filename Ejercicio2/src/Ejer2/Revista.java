package Ejer2;

public class Revista extends Publicacion {
    private int numero;
    
    public Revista(int codigo, String titulo, int anioPublicacion, int numero) {
        super(codigo, titulo, anioPublicacion);
        this.numero = numero;
    }
    
    public int getNumero() {
        return numero;
    }
    
    @Override
    public String toString() {
        return super.toString() + ", Número: " + numero;
    }
}

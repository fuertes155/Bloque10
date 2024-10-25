package Ejer2;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Libro> libros = new ArrayList<>();
        ArrayList<Revista> revistas = new ArrayList<>();

        // Agregando algunos libros
        libros.add(new Libro(1, "Don Quijote", 1605));
        libros.add(new Libro(2, "Cien años de soledad", 1967));
        libros.add(new Libro(3, "El principito", 1943));
        libros.add(new Libro(4, "1984", 1949));
        libros.add(new Libro(5, "Harry Potter", 1997));

        // Agregando algunas revistas
        revistas.add(new Revista(101, "National Geographic", 2023, 1));
        revistas.add(new Revista(102, "Scientific American", 2023, 2));
        revistas.add(new Revista(103, "Time", 2023, 3));

        while (true) {
            System.out.println("\n=== SISTEMA DE BIBLIOTECA ===");
            System.out.println("1. Ver todos los libros");
            System.out.println("2. Ver todas las revistas");
            System.out.println("3. Prestar libro");
            System.out.println("4. Devolver libro");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opción: ");

            int opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    mostrarLibros(libros);
                    break;
                case 2:
                    mostrarRevistas(revistas);
                    break;
                case 3:
                    prestarLibro(libros, scanner);
                    break;
                case 4:
                    devolverLibro(libros, scanner);
                    break;
                case 5:
                    System.out.println("¡Hasta luego!");
                    scanner.close();
                    return;
                default:
                    System.out.println("Opción no válida");
            }
        }
    }

    private static void mostrarLibros(ArrayList<Libro> libros) {
        System.out.println("\n=== LISTADO DE LIBROS ===");
        System.out.println("----------------------------------------------------");
        System.out.printf("%-5s | %-25s | %-6s | %-10s%n", 
                         "COD", "TÍTULO", "AÑO", "ESTADO");
        System.out.println("----------------------------------------------------");
        
        for (Libro libro : libros) {
            System.out.printf("%-5d | %-25s | %-6d | %-10s%n",
                            libro.getCodigo(),
                            libro.getTitulo(),
                            libro.getAnioPublicacion(),
                            libro.prestado() ? "Prestado" : "Disponible");
        }
        System.out.println("----------------------------------------------------");
    }

    private static void mostrarRevistas(ArrayList<Revista> revistas) {
        System.out.println("\n=== LISTADO DE REVISTAS ===");
        System.out.println("----------------------------------------------------");
        System.out.printf("%-5s | %-25s | %-6s | %-8s%n", 
                         "COD", "TÍTULO", "AÑO", "NÚMERO");
        System.out.println("----------------------------------------------------");
        
        for (Revista revista : revistas) {
            System.out.printf("%-5d | %-25s | %-6d | %-8d%n",
                            revista.getCodigo(),
                            revista.getTitulo(),
                            revista.getAnioPublicacion(),
                            revista.getNumero());
        }
        System.out.println("----------------------------------------------------");
    }

    private static void prestarLibro(ArrayList<Libro> libros, Scanner scanner) {
        mostrarLibros(libros);
        System.out.print("\nIngrese el código del libro a prestar: ");
        int codigo = scanner.nextInt();

        for (Libro libro : libros) {
            if (libro.getCodigo() == codigo) {
                if (!libro.prestado()) {
                    libro.prestar();
                    System.out.println("Libro prestado exitosamente");
                } else {
                    System.out.println("El libro ya está prestado");
                }
                return;
            }
        }
        System.out.println("Libro no encontrado");
    }

    private static void devolverLibro(ArrayList<Libro> libros, Scanner scanner) {
        mostrarLibros(libros);
        System.out.print("\nIngrese el código del libro a devolver: ");
        int codigo = scanner.nextInt();

        for (Libro libro : libros) {
            if (libro.getCodigo() == codigo) {
                if (libro.prestado()) {
                    libro.devolver();
                    System.out.println("Libro devuelto exitosamente");
                } else {
                    System.out.println("El libro no está prestado");
                }
                return;
            }
        }
        System.out.println("Libro no encontrado");
    }
}
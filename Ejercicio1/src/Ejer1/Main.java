package Ejer1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        try {           
            Auto miAuto = new Auto(0);
            System.out.println("Ingrese la cantidad de gasolina para tanquear el auto:");
            int cantidadGasolina = scanner.nextInt();
            miAuto.retanquear(cantidadGasolina);
            miAuto.conducir();
         
            Motocicleta miMoto = new Motocicleta(0);
            System.out.println("\nIngrese la cantidad de gasolina para tanquear la motocicleta:");
            cantidadGasolina = scanner.nextInt();
            miMoto.retanquear(cantidadGasolina);
            miMoto.conducir();

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
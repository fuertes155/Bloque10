package Ejer1;

public class Motocicleta implements iVehiculo {
    private int gasolina;

    public Motocicleta(int gasolinaInicial) {
        this.gasolina = gasolinaInicial;
    }

    @Override
    public void conducir() {
        if (gasolina > 0) {
            System.out.println("La motocicleta está Conduciendo");
            gasolina--;
        } else {
            System.out.println("La motocicleta no tiene gasolina suficiente para conducir");
        }
    }

    @Override
    public boolean retanquear(int cantidad) {
        gasolina += cantidad;
        return true;
    }
}
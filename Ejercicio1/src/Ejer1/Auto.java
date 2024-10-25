package Ejer1;

public class Auto implements iVehiculo {
    private int gasolina;

    public Auto(int gasolinaInicial) {
        this.gasolina = gasolinaInicial;
    }

    @Override
    public void conducir() {
        if (gasolina > 0) {
            System.out.println("El auto está Conduciendo");
            gasolina--;
        } else {
            System.out.println("El auto no tiene gasolina suficiente para conducir");
        }
    }

    @Override
    public boolean retanquear(int cantidad) {
        gasolina += cantidad;
        return true;
    }
}
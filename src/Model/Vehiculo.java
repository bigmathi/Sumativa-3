
package Model;

public class Vehiculo implements Registrable {
    private String patente;
    private int capacidadPasajeros;
    private String tipo;

    public Vehiculo() {
    }

    public Vehiculo(String patente, int capacidadPasajeros, String tipo) {
        this.patente = patente;
        this.capacidadPasajeros = capacidadPasajeros;
        this.tipo = tipo;
    }

    @Override
    public String mostrarResumen() {
        return "Vehículo: " + tipo + " | Patente: " + patente + " | Capacidad: " + capacidadPasajeros + " pasajeros";
    }
}

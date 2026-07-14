
package Model;

public abstract class Persona implements Registrable {
    protected String nombre;
    protected String rut;

    public Persona(String nombre, String rut) {
        this.nombre = nombre;
        this.rut = rut;
    }
    public String getNombre() {
        return nombre;
    }
    public String getRut() {
        return rut;
    }
}

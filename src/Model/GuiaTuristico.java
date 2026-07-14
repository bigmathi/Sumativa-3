package Model;

public class GuiaTuristico extends Persona {
    private String idiomas;
    private int Experiencia;

    public GuiaTuristico(String nombre, String rut, String idiomas, int Experiencia) {
        super(nombre, rut);
        this.idiomas = idiomas;
        this.Experiencia = Experiencia;
    }

    @Override
    public String mostrarResumen() {
        return "Guía Turístico: " + nombre + " | RUT: " + rut + " | Idiomas: " + idiomas + " | Experiencia: " + Experiencia + " años";
    }
}

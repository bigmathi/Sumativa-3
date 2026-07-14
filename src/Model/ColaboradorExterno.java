package Model;

public class ColaboradorExterno extends Persona {
    private String empresaOrigen;
    private String servicioOfrecido;



    public ColaboradorExterno(String nombre, String rut, String empresaOrigen, String servicioOfrecido) {
        super(nombre, rut);
        this.empresaOrigen = empresaOrigen;
        this.servicioOfrecido = servicioOfrecido;
    }

    @Override
    public String mostrarResumen() {
        return "Colaborador: " + nombre + " (" + empresaOrigen + ") | Servicio: " + servicioOfrecido;
    }
}



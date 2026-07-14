package Data;

import Model.Registrable;
import Model.GuiaTuristico;
import Model.Vehiculo;
import Model.ColaboradorExterno;
import java.util.ArrayList;

public class GestorEntidades {
    private ArrayList<Registrable> entidades;

    public GestorEntidades() {
        this.entidades = new ArrayList<>();
    }
    public void agregarEntidad(Registrable entidad) {
        entidades.add(entidad);
    }
    public String generarReporte() {
        if (entidades.isEmpty()) {
            return "No hay entidades registradas en el sistema.";
        }
        StringBuilder reporte = new StringBuilder("=== Resumen de Entidades ===\n\n");
        int countGuias = 0;
        int countVehiculos = 0;
        int countColaboradores = 0;

        for (Registrable entidad : entidades) {
            reporte.append("- ").append(entidad.mostrarResumen()).append("\n");

            if (entidad instanceof GuiaTuristico) {
                countGuias++;
                reporte.append("  [Tipo: Guía de Planta]\n");
            } else if (entidad instanceof Vehiculo) {
                countVehiculos++;
                reporte.append("  [Tipo: Vehículo de Flota]\n");
            } else if (entidad instanceof ColaboradorExterno) {
                countColaboradores++;
                reporte.append("  [Tipo: Colaborador Externo]\n");
            }
        }
        reporte.append("\n=== Totalizaciones ===\n")
                .append("Guías: ").append(countGuias).append("\n")
                .append("Vehículos: ").append(countVehiculos).append("\n")
                .append("Colaboradores: ").append(countColaboradores);

        return reporte.toString();
    }
}

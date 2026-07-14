package UI;

import javax.swing.JOptionPane;
import Model.*;
import Data.GestorEntidades;

public class main {
    public static void main(String[] args) {
        GestorEntidades gestor = new GestorEntidades();

        String menu = " LLANQUIHUE TOURS \n" +
                "1. Registrar Guia\n" +
                "2. Registrar Colaborador\n" +
                "3. Registrar Vehiculo\n" +
                "4. Ver Reporte\n" +
                "5. Salir";

        while (true) {
            String op = JOptionPane.showInputDialog(null, menu, "Menú Principal", JOptionPane.QUESTION_MESSAGE);

            if (op == null || op.equals("5")) {
                break;
            }

            switch (op) {
                case "1":
                    String nomG = JOptionPane.showInputDialog("Nombre del Guía:");
                    String rutG = JOptionPane.showInputDialog("RUT del Guía:");
                    String idiomas = JOptionPane.showInputDialog("Idiomas que domina (ej: Español, Inglés):");

                    int exp = 0;
                    try {
                        String expStr = JOptionPane.showInputDialog("Años de experiencia:");
                        if (expStr != null) {
                            exp = Integer.parseInt(expStr);
                        }
                    } catch (NumberFormatException e) {
                        JOptionPane.showMessageDialog(null, "Valor inválido para experiencia. Se guardará como 0.");
                    }


                    gestor.agregarEntidad(new GuiaTuristico(nomG, rutG, idiomas, exp));
                    JOptionPane.showMessageDialog(null, "Guía turístico registrado con éxito.");
                    break;

                case "2":
                    String nomC = JOptionPane.showInputDialog("Nombre del Colaborador:");
                    String rutC = JOptionPane.showInputDialog("RUT del Colaborador:");
                    String empresa = JOptionPane.showInputDialog("Empresa de origen:");
                    String servicio = JOptionPane.showInputDialog("Servicio ofrecido (ej: Traslado, Catering, Guiados):");


                    gestor.agregarEntidad(new ColaboradorExterno(nomC, rutC, empresa, servicio));
                    JOptionPane.showMessageDialog(null, "Colaborador externo registrado con éxito.");
                    break;

                case "3":
                    String patente = JOptionPane.showInputDialog("Patente del Vehículo:");

                    int cap = 0;
                    try {
                        String capStr = JOptionPane.showInputDialog("Capacidad de pasajeros:");
                        if (capStr != null) {
                            cap = Integer.parseInt(capStr);
                        }
                    } catch (NumberFormatException e) {
                        JOptionPane.showMessageDialog(null, "Valor de capacidad no válido. Se asignará 0.");
                    }

                    String tipo = JOptionPane.showInputDialog("Tipo de Vehículo (ej: Minibús, Van, SUV):");
                    gestor.agregarEntidad(new Vehiculo(patente, cap, tipo));
                    JOptionPane.showMessageDialog(null, "Vehículo registrado con éxito.");
                    break;

                case "4":

                    String reporteFinal = gestor.generarReporte();
                    JOptionPane.showMessageDialog(null, reporteFinal, "Regsitro de Llanquihue Tours", JOptionPane.INFORMATION_MESSAGE);
                    break;

                default:
                    JOptionPane.showMessageDialog(null, "Opción no válida. Intenta de nuevo.");
                    break;
            }
        }
    }
}
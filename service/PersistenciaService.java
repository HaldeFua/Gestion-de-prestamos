package service;

import model.*;
import java.io.*;
import java.util.*;

public class PersistenciaService {

    // Ruta de archivos
    private static final String RUTA_ESTUDIANTES_ING = "Persistencia/estudiantes_ingenieria.txt";
    private static final String RUTA_ESTUDIANTES_DSG = "Persistencia/estudiantes_disenio.txt";
    private static final String RUTA_EQUIPOS_COMPUTO = "Persistencia/equipos_computo.txt";
    private static final String RUTA_EQUIPOS_TABLET = "Persistencia/equipos_tablet.txt";

    // Guardar estudiantes
    public static void guardarEstudiantes(List<Estudiante> estudiantes, boolean esIngenieria) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(esIngenieria ? RUTA_ESTUDIANTES_ING : RUTA_ESTUDIANTES_DSG))) {
            for (Estudiante estudiante : estudiantes) {
                writer.write(estudianteToString(estudiante));
                writer.newLine();
            }
        } catch (IOException e) {
            System.err.println("Error al guardar los estudiantes: " + e.getMessage());
        }
    }

    // Convertir un estudiante a string para escribir en el archivo
    private static String estudianteToString(Estudiante estudiante) {
        if (estudiante instanceof EstudianteIng) {
            EstudianteIng ing = (EstudianteIng) estudiante;
            return String.join(";", estudiante.getCedula(), estudiante.getNombre(), estudiante.getApellido(), estudiante.getTelefono(),
                               String.valueOf(estudiante.getSerial()), String.valueOf(ing.getNumeroSemestre()), String.valueOf(ing.getPromedioAcumulado()));
        } else if (estudiante instanceof EstudianteDsg) {
            EstudianteDsg dsg = (EstudianteDsg) estudiante;
            return String.join(";", estudiante.getCedula(), estudiante.getNombre(), estudiante.getApellido(), estudiante.getTelefono(),
                               String.valueOf(estudiante.getSerial()), dsg.getModalidadEstudio(), String.valueOf(dsg.getCantidadAsignaturas()));
        }
        return "";
    }

    // Cargar estudiantes desde archivo
    public static List<Estudiante> cargarEstudiantes(boolean esIngenieria) {
        List<Estudiante> estudiantes = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(esIngenieria ? RUTA_ESTUDIANTES_ING : RUTA_ESTUDIANTES_DSG))) {
            String line;
            while ((line = reader.readLine()) != null) {
                Estudiante estudiante = stringToEstudiante(line, esIngenieria);
                estudiantes.add(estudiante);
            }
        } catch (IOException e) {
            System.err.println("Error al cargar los estudiantes: " + e.getMessage());
        }
        return estudiantes;
    }

    // Convertir una línea de string a un objeto Estudiante
    private static Estudiante stringToEstudiante(String data, boolean esIngenieria) {
        String[] campos = data.split(";");
        if (esIngenieria) {
            return new EstudianteIng(campos[0], campos[1], campos[2], campos[3], Integer.parseInt(campos[4]),
                                     Integer.parseInt(campos[5]), Double.parseDouble(campos[6]));
        } else {
            return new EstudianteDsg(campos[0], campos[1], campos[2], campos[3], Integer.parseInt(campos[4]),
                                     campos[5], Integer.parseInt(campos[6]));
        }
    }

    // Guardar equipos
    public static void guardarEquipos(List<Equipo> equipos, boolean esComputo) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(esComputo ? RUTA_EQUIPOS_COMPUTO : RUTA_EQUIPOS_TABLET))) {
            for (Equipo equipo : equipos) {
                writer.write(equipoToString(equipo));
                writer.newLine();
            }
        } catch (IOException e) {
            System.err.println("Error al guardar los equipos: " + e.getMessage());
        }
    }

    // Convertir un equipo a string para escribir en el archivo
    private static String equipoToString(Equipo equipo) {
        if (equipo instanceof EquipoComputo) {
            EquipoComputo computo = (EquipoComputo) equipo;
            return String.join(";", equipo.getSerial(), equipo.getMarca(), equipo.getTamanio(), String.valueOf(equipo.getPrecio()),
                               computo.getSistemaOperativo(), computo.getProcesador());
        } else if (equipo instanceof EquipoTablet) {
            EquipoTablet tablet = (EquipoTablet) equipo;
            return String.join(";", equipo.getSerial(), equipo.getMarca(), equipo.getTamanio(), String.valueOf(equipo.getPrecio()),
                               tablet.getAlmacenamiento(), String.valueOf(tablet.getPeso()));
        }
        return "";
    }

    // Cargar equipos desde archivo
    public static List<Equipo> cargarEquipos(boolean esComputo) {
        List<Equipo> equipos = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(esComputo ? RUTA_EQUIPOS_COMPUTO : RUTA_EQUIPOS_TABLET))) {
            String line;
            while ((line = reader.readLine()) != null) {
                Equipo equipo = stringToEquipo(line, esComputo);
                equipos.add(equipo);
            }
        } catch (IOException e) {
            System.err.println("Error al cargar los equipos: " + e.getMessage());
        }
        return equipos;
    }

    // Convertir una línea de string a un objeto Equipo
    private static Equipo stringToEquipo(String data, boolean esComputo) {
        String[] campos = data.split(";");
        if (esComputo) {
            return new EquipoComputo(campos[0], campos[1], campos[2], Integer.parseInt(campos[3]), campos[4], campos[5]);
        } else {
            return new EquipoTablet(campos[0], campos[1], campos[2], Integer.parseInt(campos[3]), campos[4], Integer.parseInt(campos[5]));
        }
    }
}

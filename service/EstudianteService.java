package service;
import java.util.ArrayList;
import java.util.List;

import model.Estudiante;

public class EstudianteService {

    //Atributo de la clase
    private List<Estudiante> estudiantes;

    //Constructur que genera un nuevo arraylist para el paquete
    public EstudianteService() {
        this.estudiantes = new ArrayList<>();
    }

    //Metodo para agregar estudiantes a la lista del servicio
    public void agregarEstudiante(Estudiante estudiante) {
        estudiantes.add(estudiante);
    }

    //buscar estudiante por cedulo
    public Estudiante buscarEstudiante(String cedula) {
        for (Estudiante estudiante : estudiantes) {
            if (estudiante.getCedula().equals(cedula)) {
                return estudiante;
            }
        }
        return null;
    }

    // buscar estudiante por serial
    public Estudiante buscarEstudiante(int serial) {
        for (Estudiante estudiante : estudiantes) {
            if (estudiante.getSerial() == serial) {
                return estudiante;
            }
        }
        return null;
    }

    //verificar si existe estudiante por cedulo
    public boolean estaRegistrado(String cedula) {
        return buscarEstudiante(cedula) != null;
    }

    
    //verificar ssi existe estudiante por serial
    public boolean estaRegistrado(int serial) {
        return buscarEstudiante(serial) != null;
    }

    public List<Estudiante> getEstudiantes() {
        return estudiantes;
    }
    
}

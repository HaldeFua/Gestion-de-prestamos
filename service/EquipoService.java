package service;
import java.util.ArrayList;
import java.util.List;
import model.Equipo;

public class EquipoService {

    //Atributo de la clase
    private List<Equipo> equipos;

    //Constructur que genera un nuevo arraylist para el paquete o acepta una lista ya creada
    public EquipoService(List<Equipo> equipos) {
        if (equipos == null) {
            this.equipos = new ArrayList<>();
        } else {
            this.equipos = equipos;
        }
    }

    //Metodo para agregar equipos a la lista del servicio
    public void agregarEquipo(Equipo equipo){
        equipos.add(equipo);
    }

    //disponibilidad por serial dele quipo 
    public boolean estaDisponible(String serial) {
        for (Equipo equipo : equipos) {
            if (equipo.getSerial().equals(serial) && equipo.isDisponible()) {
                return true;
            }
        }
        return false;
    }

    //conseguir un equipo por serial
    public Equipo obtenerEquipoPorSerial(String serial) {
        for (Equipo equipo : equipos) {
            if (equipo.getSerial().equals(serial)) {
                return equipo;
            }
        }
        return null;
    }
}

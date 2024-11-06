package model;

public class Prestamo {

    private Estudiante estudiante;
    private Equipo equipo;

    public Prestamo(Estudiante estudiante, Equipo equipo) {
        this.estudiante = estudiante;
        this.equipo = equipo;
        estudiante.setPrestamo(false);
        equipo.setDisponible(false);
    }

    public Estudiante getEstudiante() {
        return estudiante;
    }

    public void setEstudiante(Estudiante estudiante) {
        this.estudiante = estudiante;
    }

    public Equipo getEquipo() {
        return equipo;
    }

    public void setEquipo(Equipo equipo) {
        this.equipo = equipo;
    }

    @Override
    public String toString() {
        return "Prestamo [estudiante=" + estudiante + ", equipo=" + equipo + "]";
    }

}

package model;

public class EstudianteDsg extends Estudiante {
    
    private String modalidadEstudio;
    private int cantidadAsignaturas;

    // Constructor
    public EstudianteDsg(String cedula, String nombre, String apellido, String telefono, int serial, String modalidadEstudio, int cantidadAsignaturas) {
        super(cedula, nombre, apellido, telefono, serial);
        this.modalidadEstudio = modalidadEstudio;
        this.cantidadAsignaturas = cantidadAsignaturas;
    }

    public String getModalidadEstudio() {
        return modalidadEstudio;
    }

    public int getCantidadAsignaturas() {
        return cantidadAsignaturas;
    }

    @Override
    public String toString() {
        return "EstudianteDiseno{" +
                "modalidadEstudio='" + modalidadEstudio + '\'' +
                ", cantidadAsignaturas=" + cantidadAsignaturas +
                ", cedula='" + cedula + '\'' +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", telefono='" + telefono + '\'' +
                ", serial=" + serial +
                '}';
    }

}

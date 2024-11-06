package model;

public class EstudianteIng extends Estudiante {

    private int numeroSemestre;
    private double promedioAcumulado;

    // Constructor

    public EstudianteIng(String cedula, String nombre, String apellido, String telefono, int serial, int numeroSemestre, double promedioAcumulado) {
        super(cedula, nombre, apellido, telefono, serial);
        this.numeroSemestre = numeroSemestre;
        this.promedioAcumulado = promedioAcumulado;
    }

    public int getNumeroSemestre() {
        return numeroSemestre;
    }

    public double getPromedioAcumulado() {
        return promedioAcumulado;
    }

    @Override
    public String toString() {
        return "EstudianteIngenieria{" +
                "numeroSemestre=" + numeroSemestre +
                ", promedioAcumulado=" + promedioAcumulado +
                ", cedula='" + cedula + '\'' +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", telefono='" + telefono + '\'' +
                ", serial=" + serial +
                '}';
    }
    
}

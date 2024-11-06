package model;

public abstract class Estudiante {
    
    protected String cedula;
    protected String nombre;
    protected String apellido;
    protected String telefono;
    protected int serial;
    protected boolean prestamo;

    // Constructor
    public Estudiante(String cedula, String nombre, String apellido, String telefono, int serial) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.serial = serial;
        this.prestamo = true;
    }

    // Getters
    public String getCedula() {
        return cedula;
    }
    public String getNombre() {
        return nombre;
    }
    public String getApellido() {
        return apellido;
    }
    public String getTelefono() {
        return telefono;
    }
    public int getSerial() {
        return serial;
    }
    
    public void setPrestamo(boolean prestamo) {
        this.prestamo = prestamo;
    }

    @Override
    public String toString() {
        return "Estudiante{" +
                "cedula='" + cedula + '\'' +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", telefono='" + telefono + '\'' +
                ", serial=" + serial +
                '}';
    }

}

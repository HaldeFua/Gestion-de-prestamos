package model;

public class EquipoTablet extends Equipo {

    private String almacenamiento;
    private int peso;

    public EquipoTablet(String serial, String marca, String tamanio, int precio, String almacenamiento, int peso) {
        super(serial, marca, tamanio, precio);
        this.almacenamiento = almacenamiento;
        this.peso = peso;
    }

    // getters and setters
    public String getAlmacenamiento() {
        return almacenamiento;
    }
    public void setAlmacenamiento(String almacenamiento) {
        this.almacenamiento = almacenamiento;
    }
    public int getPeso() {
        return peso;
    }
    public void setPeso(int peso) {
        this.peso = peso;
    }

    //toString
    @Override
    public String toString() {
        return "TabletaGrafica{" +
                "almacenamiento='" + almacenamiento + '\'' +
                ", peso=" + peso +
                ", serial='" + serial + '\'' +
                ", marca='" + marca + '\'' +
                ", tamanio='" + tamanio + '\'' +
                ", precio=" + precio +
                '}';
    }

}

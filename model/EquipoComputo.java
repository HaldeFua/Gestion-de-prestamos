package model;

public class EquipoComputo extends Equipo {

    private String sistemaOperativo;
    private String procesador;

    public EquipoComputo(String serial, String marca, String tamanio, int precio, String sistemaOperativo, String procesador) {
        super(serial, marca, tamanio, precio);
        this.sistemaOperativo = sistemaOperativo;
        this.procesador = procesador;
    }

    public String getSistemaOperativo() {
        return sistemaOperativo;
    }

    public String getProcesador() {
        return procesador;
    }

    @Override
    public String toString() {
        return "SistemaOperativo = '" + sistemaOperativo + '\'' +
                " , Procesador = '" + procesador + '\'' +
                " , serial = '" + serial + '\'' +
                " , marca = '" + marca + '\'' +
                " , tamanio = '" + tamanio + '\'' +
                " , precio = " + precio;
    }

}

package view;

public class Vista {

    public String menuPrincipal(){
        return "BIENVENIDO, SELECCIONE UNA OPCIÓN:" +
                "\n1. Estudiante de ingeniería" +
                "\n2. Estudiante de diseño" +
                "\n3. Imprimir inventario total" +
                "\n4. Salir del programa";
    }

    public String inicio(){
        return "Seleccionar una opción:\n"
                +"1 Registrarse\n" +
                "2 Iniciar sesión\n" +
                "3 Volver";
    }

    public String menuEstudiante(String tipoEstudiante){
        return "\n---- BIENVENIDO " + tipoEstudiante + " ----\n" +
                "1. Registrar préstamo de equipo\n" +
                "2. Modificar préstamo de equipo (por serial o cédula)\n" +
                "3. Devolución de equipo (por serial o cédula)\n" +
                "4. Buscar equipo (por serial o cédula)\n" +
                "5. Cerrar sesión";
    }

    public String registrarPrestamo(){
        return "1. Registrar Estudiante" 
                +"\n2. Registrar Equipo"
                +"\n3. Salir";
    }
    
    

}

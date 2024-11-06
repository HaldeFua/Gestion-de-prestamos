package controller;
import service.Validaciones;
import view.Vista;

public abstract class MainController {
    
    static Validaciones val = new Validaciones();
    static Vista vista = new Vista();
    static boolean running = true;
    static int controller = 0;
    static EstudianteController estudianteController = new EstudianteController(val);

    public static void runApp(){ 
        while(running){
            controller = val.capturarInt(vista.menuPrincipal());

            switch (controller) {
                case 1 -> estudianteController.menuEstudiante(vista.menuEstudiante("INGENIERO/A"));
                case 2 -> estudianteController.menuEstudiante(vista.menuEstudiante("DISEÑADOR/A"));
                case 3 -> System.out.println("Aquí se va a imprimir todo el inventario");
                case 4 -> {
                    System.out.println("Saliendo del programa...");
                    running = false; }
                default -> System.out.println("Valor no valido");
            }
        }
    }

}

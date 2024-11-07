package controller;

import service.EstudianteService;
import service.PersistenciaService;
import service.PrestamoService;
import service.Validaciones;

public class EstudianteController {
 
    Validaciones val;
    PrestamoService prestamoService;
    PersistenciaService persistenciaService = new PersistenciaService();
    EstudianteService estudianteService = new EstudianteService();


    public EstudianteController(Validaciones val) {
        this.val = val;
    }

    int controller = 0;

    public void menuEstudiante(int tipoEstudiante, String mensaje){
        controller = val.capturarInt(mensaje);

        switch (controller) {
            case 1 -> System.out.println("registrarPrestamo");
            case 2 -> System.out.println("Modificar préstamo de equipo (por serial o cédula)");
            case 3 -> System.out.println("Devolución de equipo (por serial o cédula)");
            case 4 -> System.out.println("Buscar equipo (por serial o cédula)");
            case 5 -> {break;}
            default -> System.out.println("Valor no valido");
        }
    }
    
    public void registrarPrestamo(){
  
        
    }

}

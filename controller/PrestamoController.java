package controller;
import java.util.List;
import model.Prestamo;
import service.EquipoService;
import service.EstudianteService;
import service.PrestamoService;

public class PrestamoController {
    
    private EstudianteService estudianteService;
    private PrestamoService prestamoService;
    private EquipoService equipoService;
    
    public PrestamoController(EstudianteService estudianteService, EquipoService equipoService) {
        this.estudianteService = estudianteService;
        this.equipoService = equipoService;
        this.prestamoService = new PrestamoService(estudianteService, equipoService);
    }
    
    public void registrarPrestamo(String cedulaEstudiante, String serialEquipo) {
        
        Prestamo prestamo = prestamoService.registrarPrestamo(cedulaEstudiante, serialEquipo);


        if (prestamo != null) {
            System.out.println("Préstamo registrado con éxito.");
        } else {
            System.out.println("No se pudo registrar el préstamo. Verifique los datos.");
        }
    }

    public void mostrarTodosLosPrestamos() {
    
        List<Prestamo> prestamos = prestamoService.obtenerPrestamos();

        if (prestamos.isEmpty()) {
            System.out.println("No hay préstamos registrados.");
        } else {
            System.out.println("Lista de préstamos registrados:");
            for (Prestamo prestamo : prestamos) {
                System.out.println(prestamo);
            }
    }
}
    

}

package service;
import controller.EstudianteController;
import model.Equipo;
import model.Estudiante;
import model.Prestamo;

public class PrestamoService {

    private EstudianteService estudianteService;
    private EquipoService equipoService;

    public PrestamoService(EstudianteService estudianteService, EquipoService equipoService) {
        this.estudianteService = estudianteService;
        this.equipoService = equipoService;
    }

    // Método para registrar un préstamo
    public Prestamo registrarPrestamo(String cedulaEstudiante, String serialEquipo) {
        
        // Verificar si el estudiante está registrado para evitar registros nulos
        if (!estudianteService.estaRegistrado(cedulaEstudiante)) {
            System.out.println("El estudiante no está registrado.");
            return null;
        }

        // Verificar si el equipo está disponible para evitar registros nulos
        if (!equipoService.estaDisponible(serialEquipo)) {
            System.out.println("El equipo no está disponible.");
            return null;
        }

        // Obtener el estudiante y el equipo
        Estudiante estudiante = estudianteService.buscarEstudiante(cedulaEstudiante);
        Equipo equipo = equipoService.obtenerEquipoPorSerial(serialEquipo);

        // Crear un nuevo préstamo
        Prestamo prestamo = new Prestamo(estudiante, equipo);

        return prestamo; // Devuelve el préstamo creado
    }
 
}

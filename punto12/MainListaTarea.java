package ar.edu.unlu.prog1.punto12;

import java.time.LocalDate;
import java.util.List;

public class MainListaTarea {
    public static void main(String[] args) {
        AdministradorDeTareas administrador = new AdministradorDeTareas();

        // Agregar tareas
        Tareas tarea1 = new Tareas("Hacer la tarea 1", 2, LocalDate.of(2023, 9, 15));
        Tareas tarea2 = new Tareas("Comprar víveres", 1, LocalDate.of(2023, 9, 10));
        Tareas tarea3 = new Tareas("Ir al gimnasio", 3, LocalDate.of(2023, 9, 20));
        administrador.agregarTarea(tarea1);
        administrador.agregarTarea(tarea2);
        administrador.agregarTarea(tarea3);

        // Marcar tarea como realizada
        administrador.marcarTareaComoRealizada("Comprar víveres");

        // Obtener y mostrar tareas no vencidas ordenadas
        List<Tareas> tareasNoVencidasOrdenadas = administrador.obtenerTareasNoVencidasOrdenadas();
        for (Tareas tarea : tareasNoVencidasOrdenadas) {
            tarea.mostrarMensaje();
        }

        // Buscar tareas por título
        List<Tareas> tareasEncontradas = administrador.buscarTareasPorTitulo("gimnasio");
        System.out.println("Tareas encontradas por título:");
        for (Tareas tarea : tareasEncontradas) {
            tarea.mostrarMensaje();
        }
    }
}

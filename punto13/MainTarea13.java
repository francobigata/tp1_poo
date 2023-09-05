// Archivo: Main.java
package ar.edu.unlu.prog1.punto13;

import java.time.LocalDate;
import java.util.List;

public class MainTarea13 {
    public static void main(String[] args) {
        AdminTareas13 administrador = new AdminTareas13();

        // Agregar tareas
        Tarea13 tarea1 = new Tarea13("Hacer la tarea 1", 2, LocalDate.of(2023, 9, 15));
        Tarea13 tarea2 = new Tarea13("Comprar víveres", 1, LocalDate.of(2023, 9, 10));
        Tarea13 tarea3 = new Tarea13("Ir al gimnasio", 3, LocalDate.of(2023, 9, 20));
        administrador.agregarTarea(tarea1);
        administrador.agregarTarea(tarea2);
        administrador.agregarTarea(tarea3);

        // Marcar tarea como realizada por colaborador
        administrador.marcarTareaComoRealizada("Comprar víveres", "Juan");
        administrador.marcarTareaComoRealizada("Hacer la tarea 1", "María");

        // Obtener y mostrar tareas no vencidas ordenadas
        List<Tarea13> tareasNoVencidasOrdenadas = administrador.obtenerTareasNoVencidasOrdenadas();
        System.out.println("Tareas no vencidas ordenadas:");
        for (Tarea13 tarea : tareasNoVencidasOrdenadas) {
            tarea.mostrarMensaje();
        }

        // Buscar tareas por título
        List<Tarea13> tareasEncontradas = administrador.buscarTareasPorTitulo("gimnasio");
        System.out.println("Tareas encontradas por título:");
        for (Tarea13 tarea : tareasEncontradas) {
            tarea.mostrarMensaje();
        }

        // Obtener tareas realizadas por colaborador
        List<Tarea13> tareasRealizadasPorJuan = administrador.obtenerTareasRealizadasPorColaborador("Juan");
        System.out.println("Tareas realizadas por Juan:");
        for (Tarea13 tarea : tareasRealizadasPorJuan) {
            tarea.mostrarMensaje();
        }
    }
}

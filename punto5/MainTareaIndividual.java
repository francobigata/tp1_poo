package ar.edu.unlu.prog1.punto5;
import ar.edu.unlu.prog1.punto5.Tareas;

import java.time.LocalDate;


public class MainTareaIndividual {
    public static void main(String[] args) {
        LocalDate fechaManana = LocalDate.now().plusDays(1);
        LocalDate fechaAyer = LocalDate.now().minusDays(1);

        Tareas tarea1 = new Tareas("Ir al supermercado mañana", 2, fechaManana);
        Tareas tarea2 = new Tareas("Consultar repuesto del auto", 1, fechaAyer);
        tarea2.setCompleta(true);
        Tareas tarea3 = new Tareas("Ir al cine a ver la nueva película de Marvel", 3, fechaAyer);

        System.out.println("Tarea 1: ");
        tarea1.mostrarMensaje();

        System.out.println("\nTarea 2: ");
        tarea2.mostrarMensaje();

        System.out.println("\nTarea 3: ");
        tarea3.mostrarMensaje();
    }
}

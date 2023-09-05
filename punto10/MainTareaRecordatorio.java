package ar.edu.unlu.prog1.punto10;

import java.time.LocalDate;

public class MainTareaRecordatorio {
    public static void main(String[] args) {
        LocalDate fechaManana = LocalDate.now().plusDays(1);
        LocalDate fechaAyer = LocalDate.now().minusDays(1);
        LocalDate fechaHoy = LocalDate.now();

        TareaRecordatorio tarea1 = new TareaRecordatorio("Ir al supermercado mañana", 1, fechaManana, fechaHoy.plusDays(1));
        TareaRecordatorio tarea2 = new TareaRecordatorio("Consultar repuesto del auto", 2, fechaAyer, fechaHoy.minusDays(2));
        TareaRecordatorio tarea3 = new TareaRecordatorio("Ir al cine a ver la nueva película de Marvel", 3, fechaAyer, fechaHoy.plusDays(2));

        tarea1.mostrarMensaje();
        tarea2.mostrarMensaje();
        tarea3.mostrarMensaje();
    }
}

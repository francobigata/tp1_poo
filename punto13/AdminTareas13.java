// Archivo: AdministradorTareas.java
package ar.edu.unlu.prog1.punto13;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class AdminTareas13 {
    private List<Tarea13> listaTareas;

    public AdminTareas13() {
        listaTareas = new ArrayList<>();
    }

    public void agregarTarea(Tarea13 tarea) {
        listaTareas.add(tarea);
    }

    public List<Tarea13> obtenerTareasNoVencidasOrdenadas() {
        LocalDate fechaActual = LocalDate.now();
        List<Tarea13> tareasNoVencidas = listaTareas.stream()
                .filter(tarea -> !tarea.estaVencida() || tarea.isCompleta())
                .collect(Collectors.toList());

        Collections.sort(tareasNoVencidas, (t1, t2) -> {
            if (t1.getPrioridad() != t2.getPrioridad()) {
                return t1.getPrioridad() - t2.getPrioridad();
            } else {
                return t1.getFechaLimite().compareTo(t2.getFechaLimite());
            }
        });

        return tareasNoVencidas;
    }

    public void marcarTareaComoRealizada(String descripcion, String colaborador) {
        for (Tarea13 tarea : listaTareas) {
            if (tarea.getDescripcion().equals(descripcion)) {
                tarea.setCompleta(true);
                tarea.agregarColaborador(colaborador);
                break;
            }
        }
    }

    public List<Tarea13> buscarTareasPorTitulo(String titulo) {
        return listaTareas.stream()
                .filter(tarea -> tarea.getDescripcion().contains(titulo))
                .collect(Collectors.toList());
    }

    public List<Tarea13> obtenerTareasRealizadasPorColaborador(String colaborador) {
        return listaTareas.stream()
                .filter(tarea -> tarea.isCompleta() && tarea.getColaboradores().contains(colaborador))
                .collect(Collectors.toList());
    }
}

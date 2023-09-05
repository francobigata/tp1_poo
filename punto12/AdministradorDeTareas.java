package ar.edu.unlu.prog1.punto12;


import ar.edu.unlu.prog1.punto12.Tareas;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class AdministradorDeTareas {
    private List<Tareas> listaTareas;

    public AdministradorDeTareas() {
        listaTareas = new ArrayList<>();
    }

    public void agregarTarea(Tareas tarea) {
        listaTareas.add(tarea);
    }

    public List<Tareas> obtenerTareasNoVencidasOrdenadas() {
        LocalDate fechaActual = LocalDate.now();
        List<Tareas> tareasNoVencidas = listaTareas.stream()
                .filter(tarea -> !tarea.estaVencida() || tarea.isCompleta())
                .collect(Collectors.toList());

        Collections.sort(tareasNoVencidas, (t1, t2) -> {
            if (t1.getPrioridad() != t2.getPrioridad()) {
                return t2.getPrioridad() - t1.getPrioridad();
            } else {
                return t1.getFechaLimite().compareTo(t2.getFechaLimite());
            }
        });

        return tareasNoVencidas;
    }

    public void marcarTareaComoRealizada(String descripcion) {
        for (Tareas tarea : listaTareas) {
            if (tarea.getDescripcion().equals(descripcion)) {
                tarea.setCompleta(true);
                break;
            }
        }
    }

    public List<Tareas> buscarTareasPorTitulo(String titulo) {
        return listaTareas.stream()
                .filter(tarea -> tarea.getDescripcion().contains(titulo))
                .collect(Collectors.toList());
    }
}

// Archivo: Tarea13.java
package ar.edu.unlu.prog1.punto13;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Tarea13 {
    private int prioridad;
    private String descripcion;
    private boolean completa;
    private LocalDate fechaLimite;
    private LocalDate fechaFinalizacion; // Nueva variable para la fecha de finalización
    private List<String> colaboradores; // Lista de colaboradores

    public Tarea13(String descripcion, int prioridad, LocalDate fechaLimite) {
        this.descripcion = descripcion;
        this.prioridad = prioridad;
        this.completa = false;
        this.fechaLimite = fechaLimite;
        this.fechaFinalizacion = null;
        this.colaboradores = new ArrayList<>();
    }

    public int getPrioridad() {
        return prioridad;
    }

    public void setPrioridad(int prioridad) {
        this.prioridad = prioridad;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public boolean isCompleta() {
        return completa;
    }

    public void setCompleta(boolean completa) {
        this.completa = completa;
        if (completa) {
            fechaFinalizacion = LocalDate.now(); // Registrar la fecha de finalización al marcar como completa
        }
    }

    public LocalDate getFechaLimite() {
        return fechaLimite;
    }

    public void setFechaLimite(LocalDate fechaLimite) {
        this.fechaLimite = fechaLimite;
    }

    public LocalDate getFechaFinalizacion() {
        return fechaFinalizacion;
    }

    public List<String> getColaboradores() {
        return colaboradores;
    }

    public void agregarColaborador(String colaborador) {
        colaboradores.add(colaborador);
    }

    public void mostrarMensaje() {
        if (completa && estaVencida()) {
            System.out.println("(Completa) " + descripcion + " - Realizada por: " + colaboradores + " - Fecha de finalización: " + fechaFinalizacion);
        } else if (completa) {
            System.out.println("(Completa) " + descripcion + " - Realizada por: " + colaboradores + " - Fecha de finalización: " + fechaFinalizacion);
        } else if (estaVencida()) {
            System.out.println("(Vencida) " + descripcion + " - Realizada por: " + colaboradores);
        } else {
            System.out.println(descripcion + " - Realizada por: " + colaboradores);
        }
    }

    public boolean estaVencida() {
        return !completa && LocalDate.now().isAfter(fechaLimite);
    }
}

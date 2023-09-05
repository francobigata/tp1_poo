package ar.edu.unlu.prog1.punto5;
import java.time.LocalDate;
public class Tareas {
    private int prioridad;
    private String descripcion;
    private boolean completa;
    private LocalDate fechaLimite;

    public Tareas(String descripcion, int prioridad, LocalDate fechaLimite) {
        this.descripcion = descripcion;
        this.prioridad = prioridad;
        this.completa = false;
        this.fechaLimite = fechaLimite;
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
    }

    public LocalDate getFechaLimite() {
        return fechaLimite;
    }

    public void setFechaLimite(LocalDate fechaLimite) {
        this.fechaLimite = fechaLimite;
    }

    public boolean estaVencida() {
        return !completa && LocalDate.now().isAfter(fechaLimite);
    }


    public void mostrarMensaje() {
        if (completa && estaVencida()) {
            System.out.println("(Completa)... " + descripcion);
        } else if (completa) {
            System.out.println("(Completa) " + descripcion);
        } else if (estaVencida()) {
            System.out.println("(Vencida)... " + descripcion);
        } else {
            System.out.println(descripcion);
        }
    }
}

package ar.edu.unlu.prog1.punto10;
import java.time.LocalDate;
public class TareaRecordatorio {
    private String descripcion;
    private int prioridad;
    private boolean completa;
    private LocalDate fechaLimite;
    private LocalDate fechaRecordatorio;

    public TareaRecordatorio(String descripcion, int prioridad, LocalDate fechaLimite, LocalDate fechaRecordatorio) {
        this.descripcion = descripcion;
        this.prioridad = prioridad;
        this.completa = false;
        this.fechaLimite = fechaLimite;
        this.fechaRecordatorio = fechaRecordatorio;
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

    public LocalDate getFechaRecordatorio() {
        return fechaRecordatorio;
    }

    public void establecerFechaRecordatorio(LocalDate fechaRecordatorio) {
        this.fechaRecordatorio = fechaRecordatorio;
    }

    public boolean estaVencida() {
        return !completa && LocalDate.now().isAfter(fechaLimite);
    }

    public boolean estaPorVencer() {
        return !completa && LocalDate.now().isAfter(fechaRecordatorio) || LocalDate.now().isEqual(fechaRecordatorio);
    }


    public void mostrarMensaje() {
        if (estaPorVencer()) {
            System.out.println("(por vencer) " + descripcion);
        } else if (completa) {
            System.out.println("(Completa) " + descripcion);
        } else if (estaVencida()) {
            System.out.println("(Vencida)... " + descripcion);
        } else {
            System.out.println(descripcion);
        }
    }

}
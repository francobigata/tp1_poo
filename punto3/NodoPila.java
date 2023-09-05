package ar.edu.unlu.prog1.punto3;

public class NodoPila {
    private Object dato;
    private NodoPila siguiente;

    public Object getDato() {
        return dato;
    }

    public void setDato(Object dato) {
        this.dato = dato;
    }

    public NodoPila getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoPila siguiente) {
        this.siguiente = siguiente;
    }
}


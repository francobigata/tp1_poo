package ar.edu.unlu.prog1.punto2;

public class NodoEnlazadoDoble{
    private Object dato;
    private NodoEnlazadoDoble proximo = null;
    private NodoEnlazadoDoble anterior = null; // Nuevo atributo para el nodo anterior

    public void setDato(Object dato){
        this.dato = dato;
    }

    public Object getDato(){
        return dato;
    }

    public void setProximo(NodoEnlazadoDoble nodo) {
        this.proximo = nodo;
    }

    public NodoEnlazadoDoble getProximo() {
        return proximo;
    }


    public void setAnterior(NodoEnlazadoDoble nodo) {
        this.anterior = nodo;
    }

    public NodoEnlazadoDoble getAnterior() {
        return anterior;
    }
}


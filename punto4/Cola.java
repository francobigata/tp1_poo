package ar.edu.unlu.prog1.punto4;

import ar.edu.unlu.prog1.punto4.NodoCola;

public class Cola {
    private NodoCola frente = null;
    private NodoCola fin = null;
    private int tamanio=0;


    public boolean estaVacia(){
        return frente == null;
    }
    public void encolar(Object dato){
        NodoCola nodo = new NodoCola();
        nodo.setDato(dato);
        if (estaVacia()){
            frente = nodo;
            fin = nodo;
        } else {
            fin.setSiguiente(nodo);
            fin = nodo;
        }
        tamanio++;
    }

    public Object desencolar(){
        if (estaVacia()){
            System.out.println("La cola esta vacia");
        }
        Object elementoDesencolado = frente.getDato();
        frente = frente.getSiguiente();
        tamanio--;
        if ( frente == null){
            fin = null;
        }
        return elementoDesencolado;
    }

    public int tamanio(){
        return tamanio;
    }
}

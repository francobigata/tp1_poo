package ar.edu.unlu.prog1.punto2;

import ar.edu.unlu.prog1.punto2.NodoEnlazadoDoble;

public class ListaEnlazadaDoble {
    private NodoEnlazadoDoble primero = null;

    public void agregar(Object dato){
        NodoEnlazadoDoble nuevoNodo = new NodoEnlazadoDoble();
        nuevoNodo.setDato(dato);
        if (primero == null){
            primero = nuevoNodo;
        }else{
            NodoEnlazadoDoble nodoAux = primero;
            while ( nodoAux.getProximo() != null){
                nodoAux = nodoAux.getProximo();
            }
            nodoAux.setProximo(nuevoNodo);
            nuevoNodo.setAnterior(nodoAux);
        }


    }

    public String toString(){
        String acumulador="";
        Integer i=1;
        NodoEnlazadoDoble nodoAux = primero;
        if(primero == null){
            acumulador = "Lista vacia";
        }
        else {
            while ( nodoAux != null){
                acumulador += "Nodo " + i + "  " + nodoAux.getDato() + "\n";
                i++;
                nodoAux = nodoAux.getProximo();
            }
        }
        return acumulador;
    }

    public boolean listaVacia(){
        if (primero == null){
            return true;
        }
        else {
            return false;
        }
    }


    public boolean eliminar(Object dato) {
        if (primero == null) {
            return false; // Lista vacía, no hay nada que eliminar
        }

        if (primero.getDato().equals(dato)) {
            primero = primero.getProximo();
            return true; // Elemento eliminado
        }

        NodoEnlazadoDoble nodoAnterior = primero;
        NodoEnlazadoDoble nodoActual = primero.getProximo();

        while (nodoActual != null) {
            if (nodoActual.getDato().equals(dato)) {
                if (nodoAnterior == null) {
                    // Si es el primer nodo, ajusta 'primero'
                    primero = nodoActual.getProximo();
                } else {
                    nodoAnterior.setProximo(nodoActual.getProximo());
                    if (nodoActual.getProximo() != null) {
                        nodoActual.getProximo().setAnterior(nodoAnterior);
                    }
                }
                return true; // Elemento eliminado
            }
            nodoAnterior = nodoActual;
            nodoActual = nodoActual.getProximo();
        }

        return false; // Elemento no encontrado en la lista
    }


    public Object recuperarNodo(int posicion){
        if (posicion < 0){
            System.out.println("No existe esta posicion");
        }

        NodoEnlazadoDoble nodoActual = primero;
        int indice = 0;

        while ( nodoActual != null){
            if ( indice == posicion){
                return  nodoActual.getDato();
            }
            indice++;
            nodoActual = nodoActual.getProximo();
        }

        System.out.println("La posicion esta fuera de rango");
        return null;
    }

    public void insertarPosicion(Object dato, int posicion){
        NodoEnlazadoDoble nuevoNodo = new NodoEnlazadoDoble();
        nuevoNodo.setDato(dato);

        if (posicion < 0){
            System.out.println("No existe esta posicion");
        }

        NodoEnlazadoDoble nodoActual = primero;
        int indice = 0;

        while ( nodoActual != null){
            if ( indice + 1 == posicion){
                nuevoNodo.setProximo(nodoActual.getProximo());
                nodoActual.setProximo(nuevoNodo);
                return;
            }
            indice++;
            nodoActual = nodoActual.getProximo();
        }
        System.out.println("La posicion esta fuera del rango de la lista");
    }

    public int Longitud() {
        int longitud = 0;
        if (primero == null) {
            longitud = 0;
        } else {
            NodoEnlazadoDoble nodoAux = primero;
            while (nodoAux.getProximo() != null) {
                nodoAux = nodoAux.getProximo();
                longitud++;
            }

        }
        return longitud;
    }
}

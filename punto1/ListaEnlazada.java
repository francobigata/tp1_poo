package ar.edu.unlu.prog1.punto1;

public class ListaEnlazada {
    private Nodo primero = null;

    public void agregar(Object dato){
        Nodo nuevoNodo = new Nodo();
        nuevoNodo.setDato(dato);
        if (primero == null){
            primero = nuevoNodo;
        }else{
            Nodo nodoAux = primero;
            while ( nodoAux.getProximo() != null){
                nodoAux = nodoAux.getProximo();
            }
            nodoAux.setProximo(nuevoNodo);
        }


    }

    public String toString(){
        String acumulador="";
        Integer i=1;
        Nodo nodoAux = primero;
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

        Nodo nodoAnterior = primero;
        Nodo nodoActual = primero.getProximo();

        while (nodoActual != null) {
            if (nodoActual.getDato().equals(dato)) {
                nodoAnterior.setProximo(nodoActual.getProximo());
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

        Nodo nodoActual = primero;
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
        Nodo nuevoNodo = new Nodo();
        nuevoNodo.setDato(dato);

        if (posicion < 0){
            System.out.println("No existe esta posicion");
        }

        Nodo nodoActual = primero;
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
            Nodo nodoAux = primero;
            while (nodoAux.getProximo() != null) {
                nodoAux = nodoAux.getProximo();
                longitud++;
            }

        }
        return longitud;
    }
}



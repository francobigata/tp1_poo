package ar.edu.unlu.prog1.punto3;

public class Pila {
    private NodoPila cima = null;
    private int tamanio = 0;

    public void apilar(Object dato){
        NodoPila nuevoNodo= new NodoPila();
        nuevoNodo.setDato(dato);
        nuevoNodo.setSiguiente(cima);
        cima=nuevoNodo;
        tamanio++;
    }

    public Object desapilar(){
        if ( cima == null ){
            System.out.println("La pila está vacía");
            return null;
        }

        Object datoDesapilado = cima.getDato();
        cima = cima.getSiguiente();
        tamanio--;
        return datoDesapilado;
    }

    public Object cima(){
        if ( cima == null ){
            System.out.println("La pila está vacía");
            return null;
        }
        return cima.getDato();
    }

    public boolean estaVacia(){
        return cima == null;
    }

    public int tamanio(){
        return tamanio;
    }
}

package ar.edu.unlu.prog1.punto1;

import ar.edu.unlu.prog1.punto1.ListaEnlazada;

public class MainListaEnlazada {
    public static void main(String[] args) {
        ListaEnlazada lista = new ListaEnlazada();

        System.out.println("¿La lista está vacía? " + lista.listaVacia());


        // Agregar elementos a la lista
        lista.agregar("Elemento 1");
        lista.agregar("Elemento 2");
        lista.agregar("Elemento 3");

        // Mostrar estado de la lista
        System.out.println("Estado de la lista:");
        System.out.println(lista);

        // Eliminar un elemento
        lista.eliminar("Elemento 2");

        // Mostrar estado de la lista después de eliminar
        System.out.println("Estado de la lista después de eliminar 'Elemento 2':");
        System.out.println(lista);

        // Comprobar si la lista está vacía
        System.out.println("¿La lista está vacía? " + lista.listaVacia());

        // Recuperar un nodo en una posición
        Object nodoRecuperado = lista.recuperarNodo(1);
        System.out.println("Nodo recuperado en la posición 1: " + nodoRecuperado);

        // Insertar un nuevo elemento en una posición
        lista.insertarPosicion("Elemento Nuevo", 1);

        // Mostrar estado de la lista después de la inserción
        System.out.println("Estado de la lista después de insertar 'Elemento Nuevo' en posición 1:");
        System.out.println(lista);

        // Obtener la longitud de la lista
        int longitud = lista.Longitud();
        System.out.println("Longitud de la lista: " + longitud);
    }
}
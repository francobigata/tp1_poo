package ar.edu.unlu.prog1.punto2;

public class MainListaEnlazadaDoble {
    public static void main(String[] args) {
        ListaEnlazadaDoble lista = new ListaEnlazadaDoble();

        System.out.println("¿La lista está vacía? " + lista.listaVacia());

        lista.agregar(5);
        lista.agregar(10);
        lista.agregar(15);
        lista.agregar(20);

        System.out.println("Contenido de la lista:");
        System.out.println(lista);

        System.out.println("¿La lista está vacía? " + lista.listaVacia());

        System.out.println("Elemento en la posición 2: " + lista.recuperarNodo(2));

        lista.insertarPosicion(12, 1);
        System.out.println("Contenido de la lista después de insertar 12 en posición 1:");
        System.out.println(lista);

        boolean elementoEliminado = lista.eliminar(15);
        System.out.println("¿Se eliminó el elemento 15? " + elementoEliminado);
        System.out.println("Contenido de la lista después de eliminar 15:");
        System.out.println(lista);

        System.out.println("Longitud de la lista: " + lista.Longitud());
    }
}

package ar.edu.unlu.prog1.punto4;

public class MainCola {
    public static void main(String[] args) {
        Cola cola = new Cola();

        System.out.println("¿La cola está vacía? " + cola.estaVacia());

        cola.encolar(5);
        cola.encolar(10);
        cola.encolar(15);

        System.out.println("Tamaño de la cola: " + cola.tamanio());

        System.out.println("Elemento desencolado: " + cola.desencolar());
        System.out.println("Elemento desencolado: " + cola.desencolar());

        System.out.println("Tamaño de la cola después de desencolar: " + cola.tamanio());
        System.out.println("¿La cola está vacía? " + cola.estaVacia());
    }
}

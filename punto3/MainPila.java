package ar.edu.unlu.prog1.punto3;

public class MainPila {
    public static void main(String[] args) {
        Pila pila = new Pila();

        System.out.println("¿La pila está vacía? " + pila.estaVacia());

        pila.apilar(5);
        pila.apilar(10);
        pila.apilar(15);

        System.out.println("Tamaño de la pila: " + pila.tamanio());
        System.out.println("Elemento en la cima: " + pila.cima());

        Object elementoDesapilado = pila.desapilar();
        System.out.println("Elemento desapilado: " + elementoDesapilado);
        System.out.println("¿La pila está vacía? " + pila.estaVacia());
    }
}

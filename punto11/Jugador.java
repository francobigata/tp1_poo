package ar.edu.unlu.prog1.punto11;

public class Jugador {
    private String nombre;
    private int puntaje;
    private String[] palabras;
    private int palabrasCont;


    public Jugador(String nombre, int maxPalabras) {
        this.nombre = nombre;
        this.palabras = new String[maxPalabras];
        this.puntaje = 0;
        this.palabrasCont = 0;
    }

    public void agregarPalabra(String palabra, Diccionario diccionario) {
        if (palabrasCont < palabras.length) {
            if (diccionario.verificarPalabra(palabra)) {
                palabras[palabrasCont] = palabra;
                palabrasCont++;
                puntaje += palabra.length() + contraLetrasEspeciales(palabra);
            } else {
                System.out.println("La palabra " + palabra + " no es válida.");
            }
        } else {
            System.out.println("El jugador ha alcanzado el limite de palabras.");
        }
    }

    private int contraLetrasEspeciales(String palabra) {
        String letrasEspeciales = "kzxwqy";
        int contador = 0;
        for (char letra : palabra.toCharArray()) {
            if (letrasEspeciales.contains(String.valueOf(letra))) {
                contador++;
            }
        }
        return contador;
    }


    private int contarLetrasEspeciales(String palabra) {
        String letrasEspeciales = "kzxwqy";
        int contador = 0;
        for (char letra : palabra.toCharArray()) {
            if (letrasEspeciales.contains(String.valueOf(letra))) {
                contador++;
            }
        }
        return contador;
    }



    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPuntaje() {
        return puntaje;
    }

    public void setPuntaje(int puntaje) {
        this.puntaje = puntaje;
    }

    public String[] getPalabras() {
        return palabras;
    }

    public void setPalabras(String[] palabras) {
        this.palabras = palabras;
    }
}

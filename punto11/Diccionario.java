package ar.edu.unlu.prog1.punto11;

public class Diccionario {
    private String[] palabrasValidas;
    private int palabrasCont;

    public Diccionario(int maxPalabras){
        this.palabrasValidas = new String[maxPalabras];
        this.palabrasCont = 0;
    }

    public void agregarPalabra(String palabra){
        if (palabrasCont < palabrasValidas.length){
            palabrasValidas[palabrasCont] = palabra;
            palabrasCont++;
        } else {
            System.out.println("El diccionario ha alcanzado el limite de palabras");
        }
    }

    public boolean verificarPalabra (String palabra) {
        for (int i = 0; i < palabrasCont; i++){
            if ( palabrasValidas[i].equals(palabra)){
                return true;
            }
        }
        return false;
    }


}

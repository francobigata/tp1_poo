package ar.edu.unlu.prog1.punto11;

public class JuegoPalabra {
    private Jugador jugador1;
    private Jugador jugador2;

    public JuegoPalabra (Jugador jugador1, Jugador jugador2){
        this.jugador1 = jugador1;
        this.jugador2 = jugador2;
    }

    public void asignarPalabras (String[] palabrasJugador1, String[] palabrasJugador2, Diccionario diccionario){
        for ( String palabra : palabrasJugador1){
            jugador1.agregarPalabra(palabra, diccionario);
        }
        for (String palabra : palabrasJugador2){
            jugador2.agregarPalabra(palabra, diccionario);
        }
    }

    public Jugador determinarGanador(){
        int puntajeJugador1 = jugador1.getPuntaje();
        int puntajeJugado2 = jugador2.getPuntaje();

        if (puntajeJugador1 > puntajeJugado2) {
            return jugador1;
        } else if (puntajeJugado2 > puntajeJugador1) {
            return jugador2;
        }
        else {
            return null;
        }
    }
}

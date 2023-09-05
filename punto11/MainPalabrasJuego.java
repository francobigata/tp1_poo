package ar.edu.unlu.prog1.punto11;

import ar.edu.unlu.prog1.punto11.Diccionario;
import ar.edu.unlu.prog1.punto11.JuegoPalabra;
import ar.edu.unlu.prog1.punto11.Jugador;

public class MainPalabrasJuego {
    public static void main(String[] args){
        Diccionario diccionario = new Diccionario(100);

        diccionario.agregarPalabra("hola");
        diccionario.agregarPalabra("juego");
        diccionario.agregarPalabra("palabra");
        diccionario.agregarPalabra("python");

        Jugador jugador1 = new Jugador("Jugador1", 10);
        Jugador jugador2 = new Jugador("Jugador 2", 10);

        JuegoPalabra juego = new JuegoPalabra(jugador1, jugador2);
        juego.asignarPalabras(new String[]{"hola", "juego"}, new String[]{"palabra", "python"},diccionario);

        Jugador ganador = juego.determinarGanador();

        if (ganador != null){
            System.out.println("El ganador es " + ganador.getNombre() + " con un puntaje de " + ganador.getPuntaje() + " puntos.");
        }else {
            System.out.println("El juego termino en empate.");
        }
    }
}

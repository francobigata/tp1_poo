package ar.edu.unlu.prog1.punto12;

import ar.edu.unlu.prog1.punto5.Tareas;

import java.util.ArrayList;
public class ListaDeTareas {

    private ArrayList<Tareas> tareas;

    public ListaDeTareas(){
        tareas=new ArrayList<>();
    }

    public void agregarTarea(Tareas tarea){
        tareas.add(tarea);
    }

    public void mostrarTareas(){
        for (Tareas tarea : tareas){
            tarea.mostrarMensaje();
        }
    }

}


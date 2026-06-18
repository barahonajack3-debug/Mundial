/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package selecciones;

import jugadores.Jugador;



public class Seleccion extends Jugador {

    private String nombre;
    private String grupo;
    private String entrenador;
    private String[] jugadores;

    public String getNombre() {
        return nombre;
    }

    public String getGrupo() {
        return grupo;
    }

    public void setGrupo(String grupo) {
        this.grupo = grupo;
    }

    public String getEntrenador() {
        return entrenador;
    }

    public void setEntrenador(String entrenador) {
        this.entrenador = entrenador;
    }

    public String[] getJugadores() {
        return jugadores;
    }
    
     public Seleccion(String nombre, String grupo) {
        this.nombre = nombre;
        this.grupo = grupo;
        this.jugadores = new String[23];
        
    }
     public void agregarJugador(jugador jugador) {
    
}

public void eliminarJugador(jugador jugador) {
    
}
